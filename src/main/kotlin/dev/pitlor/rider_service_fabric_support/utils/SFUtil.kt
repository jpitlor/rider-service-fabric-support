package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.ProjectScope
import dev.pitlor.rider_service_fabric_support.file_types.ServiceFabricFileType
import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterTreeLeaf
import dev.pitlor.rider_service_fabric_support.swing_components.ClusterTreeNode
import dev.pitlor.rider_service_fabric_support.swing_components.TreeNode

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

    fun getInfrastructure(cluster: Cluster): List<TreeNode> {
        return listOf()
    }

    fun getApplications(cluster: Cluster): List<TreeNode> {
        return cluster.applicationTypes.map { a ->
            val services = a.serviceTypes.map { s ->
                val partitions = s.partitionTypes.map { p ->
                    val nodes = p.instances.map { i ->
                        ClusterTreeLeaf(i.nodeName)
                    }
                    ClusterTreeNode(p.partition.partitionId, nodes)
                }
                ClusterTreeNode(s.service.serviceName, partitions)
            }
            ClusterTreeNode(a.application.applicationName, services)
        }
    }

    fun getServices(cluster: Cluster): List<TreeNode> {
        val project = ProjectManager.getInstance().openProjects[0]
        val services = cluster
            .applicationTypes
            .firstOrNull { type -> type.application.applicationTypeName.contains(project.name) }
            ?.serviceTypes
        return services?.map { s ->
            val partitions = s.partitionTypes.map { p ->
                val nodes = p.instances.map { i ->
                    ClusterTreeLeaf(i.nodeName)
                }
                ClusterTreeNode(p.partition.partitionId, nodes)
            }
            ClusterTreeNode(s.service.serviceName, partitions)
        } ?: listOf()
    }
}
