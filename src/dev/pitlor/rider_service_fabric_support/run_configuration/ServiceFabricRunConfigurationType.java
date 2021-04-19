package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import icons.PluginIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ServiceFabricRunConfigurationType implements ConfigurationType {
	@NotNull
	@Override
	public String getDisplayName() {
		return "Service Fabric";
	}

	@Override
	public String getConfigurationTypeDescription() {
		return "Deploy/Debug to a local Service Fabric cluster";
	}

	@Override
	public Icon getIcon() {
		return PluginIcons.ServiceFabricLogo;
	}

	@NotNull
	@Override
	public String getId() {
		return "dev.pitlor.ServiceFabric";
	}

	@Override
	public ConfigurationFactory[] getConfigurationFactories() {
		return new ConfigurationFactory[]{new ServiceFabricConfigurationFactory(this)};
	}
}
