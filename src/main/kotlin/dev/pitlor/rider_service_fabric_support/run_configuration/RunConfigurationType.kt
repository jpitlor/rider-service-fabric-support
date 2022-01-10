package dev.pitlor.rider_service_fabric_support.run_configuration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.ConfigurationType
import dev.pitlor.rider_service_fabric_support.Bundle
import icons.PluginIcons
import javax.swing.Icon

class RunConfigurationType : ConfigurationType {
    override fun getDisplayName(): String {
        return Bundle.string("run_config.display_name")
    }

    override fun getConfigurationTypeDescription(): String {
        return Bundle.string("run_config.description")
    }

    override fun getIcon(): Icon {
        return PluginIcons.ServiceFabricLogo
    }

    override fun getId(): String {
        return Bundle.string("run_config.id")
    }

    override fun getConfigurationFactories(): Array<ConfigurationFactory> {
        return arrayOf(RunConfigurationFactory(this))
    }
}