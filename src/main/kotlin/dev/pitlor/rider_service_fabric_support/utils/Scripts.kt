package dev.pitlor.rider_service_fabric_support.utils

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.util.ExecUtil
import com.intellij.util.io.isDirectory
import dev.pitlor.rider_service_fabric_support.models.Cluster
import dev.pitlor.rider_service_fabric_support.models.ClusterProfile
import net.harawata.appdirs.AppDirsFactory
import java.io.File
import java.nio.file.FileSystems
import java.nio.file.Files


object Scripts {
    private val gson = GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create()
    private val persistedScriptFolderPath = AppDirsFactory
        .getInstance()
        .getUserDataDir("Rider Service Fabric Plugin", null, "Jordan Pitlor")

    private fun ensureScriptsInFs() {
        val persistedScriptFolder = File(persistedScriptFolderPath)
        if (!persistedScriptFolder.exists()) persistedScriptFolder.mkdirs()

        val children = persistedScriptFolder.listFiles()
        if (children != null && children.isNotEmpty()) return

        val jarScriptRoot = FileSystems
            .newFileSystem(
                javaClass.getResource("/powershell-scripts")!!.toURI(),
                emptyMap<String, Any>()
            )
            .getPath("/powershell-scripts")
        for (script in Files.walk(jarScriptRoot)) {
            val subpathCount = script.toString().count { it == '/' }
            if (subpathCount == 1) continue
            val resolvedFile = persistedScriptFolder.resolve(script.subpath(1, subpathCount).toString())

            if (script!!.isDirectory()) resolvedFile.mkdirs()
            else Files.copy(script, resolvedFile.toPath())
        }
    }

    private fun getCli(scriptPath: String, argsMap: Map<String, String>): GeneralCommandLine {
        val args = argsMap.entries.fold("") { acc, (k, v) -> "$acc -$k $v" }
        return GeneralCommandLine(
            "powershell",
            "-NonInteractive",
            "-NoProfile",
            "-WindowStyle", "Hidden",
            "-ExecutionPolicy", "Bypass",
            "-OutputFormat", "Text",
            "-Command", ". '$scriptPath' $args"
        )
    }

    private fun executeScript(scriptPath: String, argsMap: Map<String, String>): String {
        ensureScriptsInFs()

        val cli = getCli(scriptPath, argsMap)
        return ExecUtil.execAndGetOutput(cli).stdout
    }

    fun readClusters(profiles: List<ClusterProfile>): List<Cluster> {
        val argsMap = mapOf("Profiles" to gson.toJson(profiles))
        val scriptPath = persistedScriptFolderPath + File.separator + "ReadClusters.ps1"
        val rawOutput = executeScript(scriptPath, argsMap)
        return gson.fromJson(rawOutput, object : TypeToken<List<Cluster>>() {}.type) ?: listOf()
    }

    fun deployApplication(
        scriptPath: String,
        publishProfileFile: String,
        applicationPackagePath: String
    ): GeneralCommandLine {
        val argsMap = mapOf(
            "PublishProfileFile" to publishProfileFile,
            "ApplicationPackagePath" to applicationPackagePath,
            "OverwriteBehavior" to "SameAppTypeAndVersion",
            "ErrorAction" to "Stop"
        )
        return getCli(scriptPath, argsMap)
    }
}