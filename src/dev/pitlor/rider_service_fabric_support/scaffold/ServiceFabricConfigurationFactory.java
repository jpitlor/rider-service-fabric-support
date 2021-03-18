package dev.pitlor.rider_service_fabric_support.scaffold;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ServiceFabricConfigurationFactory extends ConfigurationFactory {
	protected ServiceFabricConfigurationFactory(ConfigurationType type) {
		super(type);
	}

	@NotNull
	@Override
	public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
		return new ServiceFabricRunConfiguration(project, this, "Service Fabric");
	}

	@NotNull
	@Override
	public String getName() {
		return "Service Fabric";
	}

	@Override
	public @NotNull
	@NonNls String getId() {
		return "dev.pitlor.rider_service_fabric_support.scaffold.ServiceFabricConfigurationFactory";
	}
}
