package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.BeforeRunTask
import com.intellij.execution.Executor
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfigurationBase
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.jetbrains.rider.build.tasks.BuildSolutionBeforeRunTask
import dev.pitlor.rider_service_fabric_support.Bundle
import dev.pitlor.rider_service_fabric_support.serialization.Xml
import org.jdom.Element

class ServiceFabricRunConfiguration(project: Project, factory: ConfigurationFactory) :
    RunConfigurationBase<ServiceFabricRunProfileState>(project, factory, Bundle.string("run_config.display_name"))
{
    var settings: ServiceFabricRunConfigurationSettings = ServiceFabricRunConfigurationSettings()

    override fun getConfigurationEditor(): SettingsEditor<ServiceFabricRunConfiguration> {
        return ServiceFabricRunConfigurationEditor(project)
    }

    override fun getState(executor: Executor, executionEnvironment: ExecutionEnvironment): ServiceFabricRunProfileState {
        return ServiceFabricRunProfileState(this)
    }

    override fun readExternal(element: Element) {
        settings = Xml.read(element)
    }

    override fun writeExternal(element: Element) {
        Xml.write(element, settings)
    }

    init {
        val buildFirstTask: BeforeRunTask<BuildSolutionBeforeRunTask> = BuildSolutionBeforeRunTask()
        buildFirstTask.isEnabled = true
        beforeRunTasks = listOf(buildFirstTask)
    }
}