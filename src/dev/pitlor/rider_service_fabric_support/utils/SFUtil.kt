package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.ProjectScope
import dev.pitlor.rider_service_fabric_support.file_types.ServiceFabricFileType
import java.util.*

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
}

object SFPSUtil {
    fun String.toPsCli(): GeneralCommandLine {
        return GeneralCommandLine(
            "powershell",
            "-NonInteractive",
            "-NoProfile",
            "-WindowStyle", "Hidden",
            "-ExecutionPolicy", "Bypass",
            "-Command", String.format(". %s", this)
        )
    }

    fun publishApplication(deployScript: VirtualFile, publishProfile: VirtualFile, applicationPackage: VirtualFile): String {
        return StringJoiner(" ")
            .add(String.format("'%s'", deployScript.path))
            .add(String.format("-PublishProfileFile '%s'", publishProfile.path))
            .add(String.format("-ApplicationPackagePath '%s'", applicationPackage.path))
            .add("-DeployOnly:\$false")
            .add("-UnregisterUnusedApplicationVersionsAfterUpgrade \$false")
            .add("-OverrideUpgradeBehavior 'None'")
            .add("-OverwriteBehavior 'Always'")
            .add("-SkipPackageValidation:\$true")
            .add("-ErrorAction Stop")
            .toString()
    }
}