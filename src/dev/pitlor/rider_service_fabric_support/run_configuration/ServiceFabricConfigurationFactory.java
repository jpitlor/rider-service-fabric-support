package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import dev.pitlor.rider_service_fabric_support.Bundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ServiceFabricConfigurationFactory extends ConfigurationFactory {
	protected ServiceFabricConfigurationFactory(ConfigurationType type) {
		super(type);
	}

	@NotNull
	@Override
	public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
		return new ServiceFabricRunConfiguration(project, this);
	}

	@NotNull
	@Override
	public String getName() {
		return Bundle.string("run_config_factory.display_name");
	}

	@Override
	public @NotNull
	@NonNls String getId() {
		return Bundle.string("run_config_factory.id");
	}
}
