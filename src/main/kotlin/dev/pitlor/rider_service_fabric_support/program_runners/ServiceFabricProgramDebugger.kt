package dev.pitlor.rider_service_fabric_support.program_runners

import com.intellij.execution.configurations.RunProfile
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.configurations.RunnerSettings
import com.intellij.execution.executors.DefaultDebugExecutor
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.execution.runners.GenericProgramRunner
import com.intellij.execution.runners.RunContentBuilder
import com.intellij.execution.ui.RunContentDescriptor
import com.intellij.openapi.fileEditor.FileDocumentManager
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.run_configuration.ServiceFabricRunConfiguration
import org.jetbrains.annotations.NonNls

class ServiceFabricProgramDebugger : GenericProgramRunner<RunnerSettings>() {
    override fun getRunnerId(): @NonNls String {
        return Bundle.string("program_runner.debug.id")
    }

    override fun canRun(executorId: String, runProfile: RunProfile): Boolean {
        return DefaultDebugExecutor.EXECUTOR_ID == executorId && runProfile is ServiceFabricRunConfiguration
    }

    override fun doExecute(state: RunProfileState, environment: ExecutionEnvironment): RunContentDescriptor? {
        FileDocumentManager.getInstance().saveAllDocuments()
        val executionResult = state.execute(environment.executor, this) ?: return null
        return RunContentBuilder(executionResult, environment).showRunContent(environment.contentToReuse)
    }
}