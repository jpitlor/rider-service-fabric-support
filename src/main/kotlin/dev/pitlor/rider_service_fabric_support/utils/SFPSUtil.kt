package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.util.ExecUtil
import com.intellij.openapi.vfs.VirtualFile
import java.util.*

object SFPSUtil {
    fun String.toPsCli(): GeneralCommandLine {
        return GeneralCommandLine(
            "powershell",
            "-NonInteractive",
            "-NoProfile",
            "-WindowStyle", "Hidden",
            "-ExecutionPolicy", "Bypass",
            "-Command", String.format(". {%s}", this)
        )
    }

    fun GeneralCommandLine.execute(): List<Pair<String, String>> {
        return ExecUtil
            .execAndGetOutput(this)
            .stdout
            .split("\n")
            .map { Pair(it.substringBefore(":").trim(), it.substringAfter(":").trim()) }
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

    fun connectToCluster(): String {
        return "Connect-ServiceFabricCluster"
    }

    fun getApplicationTypes(): String {
        return "Get-ServiceFabricApplicationType"
    }
}