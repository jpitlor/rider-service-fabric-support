package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.BeforeRunTask
import com.intellij.execution.Executor
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfigurationBase
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.rider.build.tasks.BuildSolutionBeforeRunTask
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.utils.Utils


class RunConfiguration(project: Project, factory: ConfigurationFactory) :
    RunConfigurationBase<SFRunConfigurationOptions>(project, factory, Bundle.string("run_config.display_name"))
{
    var sfProjFolder: VirtualFile?
        get() = Utils.findFile(options.getSfProjFolder())
        set(value) = options.setSfProjFolder(value?.path ?: "")
    var publishProfile: VirtualFile?
        get() = Utils.findFile(options.getPublishProfile())
        set(value) = options.setPublishProfile(value?.path ?: "")

    override fun getConfigurationEditor(): SettingsEditor<RunConfiguration> {
        return RunConfigurationEditor(project)
    }

    override fun getOptions(): SFRunConfigurationOptions {
        return super.getOptions() as SFRunConfigurationOptions
    }

    override fun checkConfiguration() {}

    override fun getState(executor: Executor, executionEnvironment: ExecutionEnvironment): RunProfileState {
        return SFRunProfileState(this)
    }

    init {
        val buildFirstTask: BeforeRunTask<BuildSolutionBeforeRunTask> = BuildSolutionBeforeRunTask()
        buildFirstTask.isEnabled = true
        beforeRunTasks = listOf(buildFirstTask)
    }
}