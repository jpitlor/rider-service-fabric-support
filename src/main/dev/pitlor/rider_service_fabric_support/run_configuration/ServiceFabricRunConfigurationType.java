package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import dev.pitlor.rider_service_fabric_support.Bundle;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ServiceFabricRunConfigurationType implements ConfigurationType {
	@NotNull
	@Override
	public String getDisplayName() {
		return Bundle.string("run_config.display_name");
	}

	@Override
	public String getConfigurationTypeDescription() {
		return Bundle.string("run_config.description");
	}

	@Override
	public Icon getIcon() {
		return PluginIcons.ServiceFabricLogo;
	}

	@NotNull
	@Override
	public String getId() {
		return Bundle.string("run_config.id");
	}

	@Override
	public ConfigurationFactory[] getConfigurationFactories() {
		return new ConfigurationFactory[]{new ServiceFabricConfigurationFactory(this)};
	}
}
