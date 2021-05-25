package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.ProjectScope
import dev.pitlor.rider_service_fabric_support.file_types.ServiceFabricFileType
import dev.pitlor.rider_service_fabric_support.utils.SFPSUtil.execute
import dev.pitlor.rider_service_fabric_support.utils.SFPSUtil.toPsCli
import java.util.*

sealed class TreeNode(val name: String)
class ServiceFabricClusterTreeLeaf(name: String) : TreeNode(name)
class ServiceFabricClusterTreeNode(name: String, val children: List<TreeNode>) : TreeNode(name)

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

    fun getApplicationsOnCluster(): ServiceFabricClusterTreeNode {
        val cluster = String
            .format("%s; %s", SFPSUtil.connectToCluster(), SFPSUtil.getApplicationTypes())
            .toPsCli()
            .execute()
        return ServiceFabricClusterTreeNode("", listOf())
    }

    fun getServicesOnCluster(applicationName: String): ServiceFabricClusterTreeNode {
        TODO()
    }
}
