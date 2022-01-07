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

    private fun executeScript(scriptName: String, argsJson: String): String {
        ensureScriptsInFs()
        val cli = GeneralCommandLine(
            "powershell",
            "-NonInteractive",
            "-NoProfile",
            "-WindowStyle", "Hidden",
            "-ExecutionPolicy", "Bypass",
            "-OutputFormat", "Text",
            "-Command",
            listOf(
                "\$xArgs = @{}",
                "(ConvertFrom-Json '$argsJson').psobject.properties | Foreach { \$xArgs[\$_.Name] = \$_.Value }",
                "& '${persistedScriptFolderPath + File.separator + scriptName}' @xArgs"
            ).joinToString("; ", "& { ", " }")
        )

        return ExecUtil.execAndGetOutput(cli).stdout
    }

    data class ReadClustersArgs(val profiles: List<ClusterProfile>)
    fun readClusters(profiles: List<ClusterProfile>): List<Cluster> {
        val argsJson = gson.toJson(ReadClustersArgs(profiles))
        val rawOutput = executeScript("ReadClusters.ps1", argsJson)
        return gson.fromJson(rawOutput, object : TypeToken<List<Cluster>>() {}.type) ?: listOf()
    }
}