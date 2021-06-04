package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.util.ExecUtil
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.vfs.VirtualFile
import org.eclipse.persistence.jaxb.JAXBContextFactory
import org.eclipse.persistence.jaxb.MarshallerProperties
import java.io.StringReader
import java.util.*

data class PSApi(val command: String, val resultName: String)

@Suppress("UNCHECKED_CAST")
fun PSObjects.getResult(command: PSApi): PSObject? {
    val result = objects.find { it is PSObject && it.asString == command.resultName }
    return result as PSObject?
}

@Suppress("UNCHECKED_CAST")
fun PSObjects.getResults(command: PSApi): List<PSObject> {
    val result = objects.filter { it is PSObject && it.asString == command.resultName }
    return result as List<PSObject>
}

inline fun <reified T> List<Primitive<*>>.get(property: String): T? {
    val result = find { it.name == property }?.value
    return if (result is T) result else null
}

object SFPSUtil {
    fun String.toPsCli(): GeneralCommandLine {
        return GeneralCommandLine(
            "powershell",
            "-NonInteractive",
            "-NoProfile",
            "-WindowStyle", "Hidden",
            "-ExecutionPolicy", "Bypass",
            "-OutputFormat", "Xml",
            "-Command", String.format(". {%s}", this)
        )
    }

    fun GeneralCommandLine.execute(): PSObjects {
        try {
            var output = ""
            ProgressManager
                .getInstance()
                .runProcessWithProgressSynchronously({
                    val out = ExecUtil.execAndGetOutput(this).stdout

                    // For some reason when computing PS results this way, there is
                    // some sort of prologue on the first line - let's throw it out
                    output = out.substringAfter("\n")
                }, "", false, null)
            val unmarshaller = JAXBContextFactory
                .createContext(xmlTypes, mapOf<Any, Any>())
                .createUnmarshaller()
            unmarshaller.setProperty(MarshallerProperties.NAMESPACE_PREFIX_MAPPER, SFNamespacePrefixMapper())
            return unmarshaller.unmarshal(StringReader(output)) as PSObjects
        } catch (e: Exception) {
            e.printStackTrace()
            return PSObjects()
        }
    }

    fun publishApplication(
        deployScript: VirtualFile,
        publishProfile: VirtualFile,
        applicationPackage: VirtualFile
    ): String {
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

    fun connectToCluster(): PSApi {
        return PSApi(
            "Connect-ServiceFabricCluster -TimeoutSec 1",
            "Microsoft.ServiceFabric.Powershell.ClusterConnection"
        )
    }

    fun getApplicationTypes(): PSApi {
        return PSApi(
            "Get-ServiceFabricApplicationType",
            "System.Fabric.Query.ApplicationType"
        )
    }
}