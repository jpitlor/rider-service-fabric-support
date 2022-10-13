package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.ProjectScope
import com.jetbrains.rd.util.printlnError
import com.microsoft.fabric.ServiceFabricClientAPIsBuilder
import com.microsoft.fabric.models.ApplicationInfo
import com.microsoft.fabric.models.HostOptions
import com.microsoft.fabric.models.ReplicaInfo
import com.microsoft.fabric.models.ServiceInfo
import com.microsoft.fabric.models.ServicePartitionInfo
import dev.pitlor.rider_service_fabric_support.file_types.ServiceFabricFileType
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import java.util.UUID

data class Cluster(
    val profile: ClusterProfile,
    val applications: List<ApplicationInfo> = listOf(),
    val services: Map<String, List<ServiceInfo>> = mapOf(),
    val partitions: Map<String, List<ServicePartitionInfo>> = mapOf(),
    val replicas: Map<UUID, List<ReplicaInfo>> = mapOf()
)

object SFUtil {
    fun Project.getSFFolders(): List<VirtualFile> {
        val scope = ProjectScope
            .getContentScope(this)
            .intersectWith(GlobalSearchScope.notScope(ProjectScope.getLibrariesScope(this)))
        return FileTypeIndex.getFiles(ServiceFabricFileType(), scope)
            .filter { it != null && it.isValid }
            .map { it.parent }
    }

    fun getPublishProfiles(sfFolder: VirtualFile): Array<VirtualFile> {
        return sfFolder.findChild("PublishProfiles")?.children ?: arrayOf()
    }

    fun readCluster(profile: ClusterProfile): Cluster {
        try {
            val client = ServiceFabricClientAPIsBuilder()
                .apiVersion("6.5")
                .host(HostOptions.fromString(profile.clusterEndpoint))
                .buildClient()
            val applications = client
                .getApplicationInfoListAsync(0, "", false, null, 0, 5)
                .map { it.items.toList() }
                .block() ?: listOf()
            val services = applications.associateBy(
                { it.id },
                { application ->
                    client
                        .getServiceInfoListAsync(application.id, "", "", 5)
                        .map { it.items.toList() }
                        .block() ?: listOf()
                }
            )
            val partitions = services.flatMap { it.value }.associateBy(
                { it.id },
                { service ->
                    client
                        .getPartitionInfoListAsync(service.id, "", 5)
                        .map { it.items.toList() }
                        .block() ?: listOf()
                }
            )
            val replicas = partitions.flatMap { it.value }.associateBy(
                { it.partitionInformation.id },
                { partition ->
                    client
                        .getReplicaInfoListAsync(partition.partitionInformation.id, "", 5)
                        .map { it.items.toList() }
                        .block() ?: listOf()
                }
            )

            return Cluster(profile, applications, services, partitions, replicas)
        }
        catch (e: Exception) {
            printlnError(e.message ?: "Couldn't fetch ${profile.clusterEndpoint}")
            return Cluster(profile)
        }
    }

    fun deployApplication(deployScript: String, publishProfile: String, applicationPackage: String): GeneralCommandLine {
        TODO()
    }
}
