package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.ProjectScope
import dev.pitlor.rider_service_fabric_support.file_types.ServiceFabricFileType
import java.util.*

sealed class TreeNode
data class ServiceFabricClusterTreeLeaf(val name: String) : TreeNode()
data class ServiceFabricClusterTreeNode(val name: String, val children: List<TreeNode>) : TreeNode()

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

    fun Project.getApplicationName(): String {
        TODO()
    }

    fun getApplicationsOnCluster(): TreeNode {
        fun makeChildren(levels: Int): List<TreeNode> {
            return (1..(3..8).random())
                .map {
                    if (levels <= 0) ServiceFabricClusterTreeLeaf(UUID.randomUUID().toString())
                    else ServiceFabricClusterTreeNode(UUID.randomUUID().toString(), makeChildren(levels - 1))
                }
                .toList()
        }

        return ServiceFabricClusterTreeNode("root", makeChildren(4))
    }

    fun getServicesOnCluster(applicationName: String): TreeNode {
        TODO()
    }
}
