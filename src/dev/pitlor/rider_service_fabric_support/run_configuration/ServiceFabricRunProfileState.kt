package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.DefaultExecutionResult
import com.intellij.execution.ExecutionResult
import com.intellij.execution.Executor
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
import dev.pitlor.rider_service_fabric_support.utils.SFPSUtil
import dev.pitlor.rider_service_fabric_support.utils.SFPSUtil.toPsCli

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
            val publishProfile = configuration.settings.publishProfile
            val sfProjFolder = configuration.settings.sfProjFolder
            require(sfProjFolder != null && publishProfile != null) { "Run settings can not be null" }

            val deployScript = sfProjFolder.findFileByRelativePath("Scripts/Deploy-FabricApplication.ps1")
            val applicationPackage = sfProjFolder.findFileByRelativePath("pkg/debug")
            require(deployScript != null && applicationPackage != null) { "Build scripts are missing"}

            val commandLine = SFPSUtil.publishApplication(deployScript, publishProfile, applicationPackage).toPsCli()
            val processHandler = KillableColoredProcessHandler.Silent(commandLine)
            ProcessTerminatedListener.attach(processHandler)
            return processHandler
        }
}