package dev.pitlor.rider_service_fabric_support.scaffold;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import dev.pitlor.rider_service_fabric_support.models.PublishProfile;
import dev.pitlor.rider_service_fabric_support.models.SFProject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ServiceFabricRunConfiguration extends RunConfigurationBase {
	public SFProject sfProjFolder;
	public PublishProfile publishProfile;

	protected ServiceFabricRunConfiguration(Project project, ConfigurationFactory factory, String name) {
		super(project, factory, name);
	}

	@NotNull
	@Override
	public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
		return new ServiceFabricSettingsEditor();
	}

	@Override
	public void checkConfiguration() {

	}

	@Nullable
	@Override
	public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) {
		return (_executor, programRunner) -> {
			programRunner.execute(executionEnvironment);
			return null;
		};
	}
}
