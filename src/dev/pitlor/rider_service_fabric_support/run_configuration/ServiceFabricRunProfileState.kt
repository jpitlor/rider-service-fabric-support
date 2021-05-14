package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.DefaultExecutionResult
import com.intellij.execution.ExecutionException
import com.intellij.execution.ExecutionResult
import com.intellij.execution.Executor
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.process.KillableColoredProcessHandler
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ProgramRunner
import com.intellij.openapi.application.ex.ApplicationManagerEx
import com.intellij.openapi.ui.Messages
import com.intellij.terminal.TerminalExecutionConsole
import com.intellij.util.io.SuperUserStatus.isSuperUser
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.utils.ExecutionType
import dev.pitlor.rider_service_fabric_support.utils.Utils
import java.util.*

class ServiceFabricRunProfileState(private val configuration: ServiceFabricRunConfiguration) : RunProfileState {
    override fun execute(executor: Executor, programRunner: ProgramRunner<*>): ExecutionResult? {
        if (!isSuperUser) {
            val shouldRestart = Messages.showYesNoDialog(
                Bundle.string("dialog.needs_sudo.content"),
                Bundle.string("dialog.needs_sudo.title"),
                null
            )
            if (shouldRestart == Messages.YES) {
                ApplicationManagerEx.getApplicationEx().restart(false, true)
            }
            return null
        }

        return when (ExecutionType.from(executor)) {
            ExecutionType.RUN -> run()
            ExecutionType.DEBUG -> debug()
        }
    }

    private fun run(): ExecutionResult {
        val processHandler = process
        val consoleView = TerminalExecutionConsole(configuration.project, processHandler)
        return DefaultExecutionResult(consoleView, processHandler)
    }

    private fun debug(): ExecutionResult {
        val processHandler = process
        val consoleView = TerminalExecutionConsole(configuration.project, processHandler)
        return DefaultExecutionResult(consoleView, processHandler)
    }

    private val process: OSProcessHandler
        get() {
            val scriptsFolder = Utils.getFile(configuration.settings!!.sfProjFolder, "Scripts")
            val deployScriptPath = Utils.getFile(scriptsFolder, "Deploy-FabricApplication.ps1")!!
                .path
            val publishProfilePath = configuration.settings!!.publishProfile!!.path
            val applicationPackagePath = Utils.getFile(
                Utils.getFile(
                    configuration.settings!!.sfProjFolder, "pkg"
                ), "debug"
            )!!.path
            val command = StringJoiner(" ")
                .add(String.format("'%s'", deployScriptPath))
                .add(String.format("-PublishProfileFile '%s'", publishProfilePath))
                .add(String.format("-ApplicationPackagePath '%s'", applicationPackagePath))
                .add("-DeployOnly:\$false")
                .add("-UnregisterUnusedApplicationVersionsAfterUpgrade \$false")
                .add("-OverrideUpgradeBehavior 'None'")
                .add("-OverwriteBehavior 'Always'")
                .add("-SkipPackageValidation:\$true")
                .add("-ErrorAction Stop")
                .toString()
            val commandLine = GeneralCommandLine(
                "powershell",
                "-NonInteractive",
                "-NoProfile",
                "-WindowStyle", "Hidden",
                "-ExecutionPolicy", "Bypass",
                "-Command", String.format(". %s", command)
            )
            val processHandler: OSProcessHandler = KillableColoredProcessHandler.Silent(commandLine)
            ProcessTerminatedListener.attach(processHandler)
            return processHandler
        }
}