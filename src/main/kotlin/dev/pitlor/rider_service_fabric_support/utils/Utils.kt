package dev.pitlor.rider_service_fabric_support.utils

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.util.ExecUtil
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.VirtualFileManager
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.File

object Utils {
    fun <T> Array<T>.findIndex(finder: (T) -> Boolean): Int {
        for (i in indices) {
            if (finder(this[i])) {
                return i
            }
        }
        return 0
    }

    fun VirtualFile?.getTildePath(): String {
        if (this == null) return ""
        val longPath = FileUtil.toSystemDependentName(path)
        return FileUtil.getLocationRelativeToUserHome(longPath, false)
    }

    fun findFile(path: String?): VirtualFile? {
        if (path == null) return null

        val nioPath = File(FileUtil.expandUserHome(path)).toPath()
        return VirtualFileManager.getInstance().findFileByNioPath(nioPath)
    }

    inline fun <reified T> executeScript(script: String, vararg args: Any): T? {
        val command = javaClass.getResource("/powershell-scripts/$script")!!.path
        val parameters = args.joinToString(" ")
        val cli = GeneralCommandLine(
            "powershell",
            "-NonInteractive",
            "-NoProfile",
            "-WindowStyle", "Hidden",
            "-ExecutionPolicy", "Bypass",
            "-OutputFormat", "Xml",
            "-Command", "{$command $parameters}"
        )

        return try {
            var output = ""
            ProgressManager.getInstance().runProcessWithProgressSynchronously({
                val out = ExecUtil.execAndGetOutput(cli).stdout

                // For some reason when computing PS results this way, there is
                // some sort of prologue on the first line - let's throw it out
                output = out.substringAfter("\n")
            }, "Refreshing cluster", false, null)
            Json.decodeFromString<T>(output)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}