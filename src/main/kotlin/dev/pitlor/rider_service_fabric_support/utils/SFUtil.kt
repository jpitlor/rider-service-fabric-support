package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.ProjectScope
import com.microsoft.fabric.ServiceFabricClientAPIs
import com.microsoft.fabric.ServiceFabricClientAPIsBuilder
import com.microsoft.fabric.models.HostOptions
import com.microsoft.rest.RestClient
import com.microsoft.rest.ServiceResponseBuilder
import com.microsoft.rest.serializer.JacksonAdapter
import dev.pitlor.rider_service_fabric_support.file_types.ServiceFabricFileType
import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile


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
                .host(HostOptions.fromString(profile.clusterEndpoint))
                .buildClient()
            val applications = client
                .getApplicationInfoListAsync(0, "", false, null, 0, 5)
                .map { it.items.toList() }
                .block() ?: listOf()

            return Cluster(profile, applications)
        }
        catch (e: Exception) {
            TODO()
        }
    }

    fun deployApplication(deployScript: String, publishProfile: String, applicationPackage: String): GeneralCommandLine {
        TODO()
    }
}
