package dev.pitlor.rider_service_fabric_support;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.net.URL;

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
		URL url = getClass().getResource("/azure-service-fabric-logo.png");
		return new ImageIcon(url);
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
