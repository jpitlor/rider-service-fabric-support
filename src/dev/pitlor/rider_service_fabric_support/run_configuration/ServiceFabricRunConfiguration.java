package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import dev.pitlor.rider_service_fabric_support.Bundle;
import dev.pitlor.rider_service_fabric_support.utils.Xml;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ServiceFabricRunConfiguration extends RunConfigurationBase<ServiceFabricRunProfileState> {
	public ServiceFabricRunConfigurationSettings settings;

	protected ServiceFabricRunConfiguration(Project project, ConfigurationFactory factory) {
		super(project, factory, Bundle.string("run_config.display_name"));
	}

	@NotNull
	@Override
	public SettingsEditor<ServiceFabricRunConfiguration> getConfigurationEditor() {
		return new ServiceFabricRunConfigurationEditor(getProject());
	}

	@Nullable
	@Override
	public ServiceFabricRunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) {
		return new ServiceFabricRunProfileState(this);
	}

	@Override
	public void readExternal(@NotNull Element element) throws InvalidDataException {
		this.settings = Xml.read(element);
	}

	@Override
	public void writeExternal(@NotNull Element element) {
		Xml.write(element, settings);
	}
}
