package dev.pitlor.rider_service_fabric_support;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ServiceFabricRunConfiguration extends RunConfigurationBase<RunProfileState> {

	public String sfProjFolder;
	public String publishProfile;

	protected ServiceFabricRunConfiguration(Project project, ConfigurationFactory factory, String name) {
		super(project, factory, name);
	}

	@NotNull
	@Override
	public SettingsEditor<ServiceFabricRunConfiguration> getConfigurationEditor() {
		return new ServiceFabricSettingsEditor(getProject());
	}

	@Override
	public void checkConfiguration() {

	}

	@Nullable
	@Override
	public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) {
		return null;
	}
}
