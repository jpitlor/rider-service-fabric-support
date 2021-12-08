package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.util.ExecUtil
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.vfs.VirtualFile
import dev.pitlor.rider_service_fabric_support.models.*
import dev.pitlor.rider_service_fabric_support.utils.SFPSUtil.execute
import jakarta.xml.bind.Unmarshaller
import org.eclipse.persistence.jaxb.JAXBContextFactory
import org.eclipse.persistence.jaxb.MarshallerProperties.NAMESPACE_PREFIX_MAPPER
import java.io.StringReader
import java.util.*

private data class PSApi(val command: String, val resultName: String) {
    override fun toString(): String {
        return command
    }
}

private fun PSApi.toPsCli() = listOf(this).toPsCli()
private fun List<PSApi>.toPsCli(): GeneralCommandLine {
    val command = StringJoiner("; ")
        .add("Import-Module 'C:\\Program Files\\Microsoft SDKs\\Service Fabric\\Tools\\PSModule\\ServiceFabricSDK\\ServiceFabricSDK.psm1'")
        .also { j -> this.forEach { j.add(it.toString()) } }
        .toString()
    return GeneralCommandLine(
        "powershell",
        "-NonInteractive",
        "-NoProfile",
        "-WindowStyle", "Hidden",
        "-ExecutionPolicy", "Bypass",
        "-OutputFormat", "Xml",
        "-Command", String.format(". {%s}", command)
    )
}

private fun PSObjects.getResult(command: PSApi): PSObject? {
    return objects
        .filterIsInstance<PSObject>()
        .find { it.asString == command.resultName }
}

private fun PSObjects.getResults(command: PSApi): List<PSObject> {
    return objects
        .filterIsInstance<PSObject>()
        .filter { it.asString == command.resultName }
}

inline fun <reified T> List<PowershellElement>.get(property: String): T? {
    val primitiveResult = filterIsInstance<Primitive<T>>()
        .find { it.name == property }
        ?.value
    if (primitiveResult != null) return primitiveResult

    // I'm trusting that anyone using the code (me) knows when what they want
    // is a primitive or an object
    return null
}

private object SFPSCommands {
    val connectToCluster = PSApi(
        StringJoiner(" ")
            .add("Connect-ServiceFabricCluster")
            .add("-TimeoutSec 5")
            .add("-WarningAction:'SilentlyContinue'")
            .toString(),
        "Microsoft.ServiceFabric.Powershell.ClusterConnection"
    )
}

object SFPSUtil {
    private val unmarshaller: Unmarshaller = JAXBContextFactory
        .createContext(arrayOf(PSObjects::class.java), mapOf<Any, Any>())
        .createUnmarshaller()

    init {
        unmarshaller.setProperty(NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
    }

    private fun GeneralCommandLine.execute(): PSObjects {
        return try {
            var output = ""
            ProgressManager.getInstance().runProcessWithProgressSynchronously({
                val out = ExecUtil.execAndGetOutput(this).stdout

                // For some reason when computing PS results this way, there is
                // some sort of prologue on the first line - let's throw it out
                output = out.substringAfter("\n")
            }, "Refreshing cluster", false, null)
            unmarshaller.unmarshal(StringReader(output)) as PSObjects
        } catch (e: Exception) {
            e.printStackTrace()
            PSObjects()
        }
    }

    fun publishApplication(
        applicationType: String,
        deployScript: VirtualFile,
        publishProfile: VirtualFile,
        applicationPackage: VirtualFile
    ): GeneralCommandLine {
        val publishApplication = PSApi(
            StringJoiner(" ")
                .add(String.format("'%s'", deployScript.path))
                .add(String.format("-PublishProfileFile '%s'", publishProfile.path))
                .add(String.format("-ApplicationPackagePath '%s'", applicationPackage.path))
                .add("-DeployOnly:\$false")
                .add("-UnregisterUnusedApplicationVersionsAfterUpgrade \$false")
                .add("-OverrideUpgradeBehavior 'None'")
                .add("-OverwriteBehavior 'Always'")
                .add("-SkipPackageValidation:\$true")
                .add("-ErrorAction Stop")
                .toString(),
            ""
        )
        val getApplicationStatus = PSApi(
            StringJoiner(" ")
                .add("Get-ServiceFabricApplicationStatus")
                .add("-ApplicationName 'fabric:/$applicationType'")
                .add("-ErrorAction Stop")
                .toString(),
            ""
        )
        return listOf(publishApplication, getApplicationStatus).toPsCli()
    }

    fun connectToCluster(profile: ClusterConnectionProfile): PSObject? {
        val api = SFPSCommands.connectToCluster
        val result = api.toPsCli().execute()
        return result.getResult(api)
    }

    fun getApplicationTypes(): List<PSObject> {
        val api = PSApi(
            "Get-ServiceFabricApplicationType",
            "System.Fabric.Query.ApplicationType"
        )
        val result = api.toPsCli().execute()
        return result.getResults(api)
    }
}