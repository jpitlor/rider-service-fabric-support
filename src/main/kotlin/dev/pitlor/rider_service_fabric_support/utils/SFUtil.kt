package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.ProjectScope
import dev.pitlor.rider_service_fabric_support.file_types.ServiceFabricFileType
import dev.pitlor.rider_service_fabric_support.models.ApplicationType
import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.models.ClusterConnectionProfile
import dev.pitlor.rider_service_fabric_support.models.PSObject
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterTreeLeaf
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterTreeNode
import dev.pitlor.rider_service_fabric_support.swing_components.TreeNode

object SFUtil {
    fun Project.getSFFolders(): List<VirtualFile> {
        val scope = ProjectScope
            .getContentScope(this)
            .intersectWith(GlobalSearchScope.notScope(ProjectScope.getLibrariesScope(this)))
        return FileTypeIndex.getFiles(ServiceFabricFileType(), scope)
            .toList()
            .filter { file: VirtualFile? -> file != null && file.isValid }
            .map { obj: VirtualFile -> obj.parent }
    }

    fun getPublishProfiles(sfFolder: VirtualFile): Array<VirtualFile> {
        return sfFolder.findChild("PublishProfiles")?.children ?: arrayOf()
    }

    fun getCluster(profile: ClusterConnectionProfile): Cluster {
        val clusterName = SFPSUtil.connectToCluster(profile)
            ?.properties
            ?.filterIsInstance<PSObject>()
            ?.find { it.name == "GatewayInformation" }
            ?.properties
            ?.get<String>("NodeAddress")
            ?: "Unknown Cluster"
        val applicationTypes = SFPSUtil.getApplicationTypes()
            .map {
                val name = it.properties.get<String>("ApplicationTypeName")
                val version = it.properties.get<String>("ApplicationTypeVersion")
                ApplicationType("$name@$version", listOf())
            }
        return Cluster(clusterName, applicationTypes, listOf(), listOf())
    }

    fun getInfrastructure(cluster: Cluster): List<TreeNode> {
        return listOf()
    }

    fun getApplications(cluster: Cluster): List<TreeNode> {
        return cluster.applicationsTypes.map { t ->
            val applications = t.applications.map { a ->
                val services = a.services.map { s ->
                    val partitions = s.partitions.map { p ->
                        val nodes = p.nodes.map { n ->
                            ClusterTreeLeaf("${n.name} (${n.type})")
                        }
                        ClusterTreeNode(p.name, nodes)
                    }
                    ClusterTreeNode(s.name, partitions)
                }
                ClusterTreeNode(a.name, services)
            }
            ClusterTreeNode(t.name, applications)
        }
    }

    fun getServices(cluster: Cluster): List<TreeNode> {
        val project = ProjectManager.getInstance().openProjects[0]
        val services = cluster
            .applicationsTypes
            .firstOrNull { type -> type.name.contains(project.name) }
            ?.applications
            ?.firstOrNull()
            ?.services
        return services?.map { s ->
            val partitions = s.partitions.map { p ->
                val nodes = p.nodes.map { n ->
                    ClusterTreeLeaf("${n.name} (${n.type})")
                }
                ClusterTreeNode(p.name, nodes)
            }
            ClusterTreeNode(s.name, partitions)
        } ?: listOf()
    }
}
