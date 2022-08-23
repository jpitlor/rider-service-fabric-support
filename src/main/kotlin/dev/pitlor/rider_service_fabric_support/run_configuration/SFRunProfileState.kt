package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.DefaultExecutionResult
import com.intellij.execution.ExecutionResult
import com.intellij.execution.Executor
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ProgramRunner
import com.intellij.openapi.application.ex.ApplicationManagerEx
import com.intellij.openapi.ui.Messages
import com.intellij.terminal.TerminalExecutionConsole
import com.intellij.util.io.SuperUserStatus.isSuperUser
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.models.ExecutionType
import dev.pitlor.rider_service_fabric_support.utils.Scripts

class SFRunProfileState(private val configuration: RunConfiguration) : RunProfileState {
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
            val publishProfile = configuration.publishProfile
            val sfProjFolder = configuration.sfProjFolder
            require(sfProjFolder != null && publishProfile != null) { "Run settings can not be null" }

            val deployScript = sfProjFolder.findFileByRelativePath("Scripts/Deploy-FabricApplication.ps1")
            val applicationPackage = sfProjFolder.findFileByRelativePath("pkg/debug")
            require(deployScript != null && applicationPackage != null) { "Build scripts are missing"}

            val commandLine = Scripts.deployApplication(deployScript.path, publishProfile.path, applicationPackage.path)
            return OSProcessHandler(commandLine).also(ProcessTerminatedListener::attach)
        }
}
