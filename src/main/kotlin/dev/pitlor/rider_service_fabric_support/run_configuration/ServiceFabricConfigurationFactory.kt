package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project
import dev.pitlor.rider_service_fabric_support.Bundle
import org.jetbrains.annotations.NonNls

class ServiceFabricConfigurationFactory(type: ConfigurationType) : ConfigurationFactory(type) {
    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return ServiceFabricRunConfiguration(project, this)
    }

    override fun getName(): String {
        return Bundle.string("run_config_factory.display_name")
    }

    override fun getId(): @NonNls String {
        return Bundle.string("run_config_factory.id")
    }
}