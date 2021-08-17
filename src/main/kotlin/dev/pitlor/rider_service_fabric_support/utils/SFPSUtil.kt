package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.util.ExecUtil
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.vfs.VirtualFile
import org.eclipse.persistence.jaxb.JAXBContextFactory
import org.eclipse.persistence.jaxb.MarshallerProperties.NAMESPACE_PREFIX_MAPPER
import java.io.StringReader
import java.util.*
import javax.xml.bind.Unmarshaller

data class PSApi(val command: String, val resultName: String) {
    override fun toString(): String {
        return command
    }
}

fun StringJoiner.add(strings: List<String>) {
    strings.forEach { add(it) }
}

fun List<PSApi>.toPsCli(): GeneralCommandLine {
    val command = StringJoiner("; ")
        .add(SFPSUtil.connectToCluster().command)
        .add(SFPSUtil.importStdLib())
        .add(map { it.command })
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

fun PSObjects.getResult(command: PSApi): PSObject? {
    return objects
        .filterIsInstance<PSObject>()
        .find { it.asString == command.resultName }
}

fun PSObjects.getResults(command: PSApi): List<PSObject> {
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

object SFPSUtil {
    private val unmarshaller: Unmarshaller = JAXBContextFactory
        .createContext(arrayOf(PSObjects::class.java), mapOf<Any, Any>())
        .createUnmarshaller()

    init {
        unmarshaller.setProperty(NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
    }

    fun GeneralCommandLine.execute(): PSObjects {
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
        deployScript: VirtualFile,
        publishProfile: VirtualFile,
        applicationPackage: VirtualFile
    ): PSApi {
        return PSApi(
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
    }

    fun connectToCluster(): PSApi {
        return PSApi(
            StringJoiner(" ")
                .add("Connect-ServiceFabricCluster")
                .add("-TimeoutSec 5")
                .add("-WarningAction:'SilentlyContinue'")
                .toString(),
            "Microsoft.ServiceFabric.Powershell.ClusterConnection"
        )
    }

    fun importStdLib(): String {
        return "Import-Module 'C:\\Program Files\\Microsoft SDKs\\Service Fabric\\Tools\\PSModule\\ServiceFabricSDK\\ServiceFabricSDK.psm1'"
    }

    fun getApplicationTypes(): PSApi {
        return PSApi(
            "Get-ServiceFabricApplicationType",
            "System.Fabric.Query.ApplicationType"
        )
    }

    fun getApplicationStatus(applicationType: String): PSApi {
        return PSApi(
            StringJoiner(" ")
                .add("Get-ServiceFabricApplicationStatus")
                .add("-ApplicationName 'fabric:/$applicationType'")
                .add("-ErrorAction Stop")
                .toString(),
            ""
        )
    }
}