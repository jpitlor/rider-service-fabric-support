package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.testframework.TestConsoleProperties;
import com.intellij.execution.testframework.sm.runner.SMTRunnerConsoleProperties;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import dev.pitlor.rider_service_fabric_support.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ServiceFabricRunConfiguration extends RunConfigurationBase<ServiceFabricRunProfileState> {
	public String sfProjFolder = "";
	public String publishProfile = "";

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

	public SMTRunnerConsoleProperties createConsoleProperties(Executor executor) {
		return new SMTRunnerConsoleProperties(this, Bundle.string("program_runner.debug.id"), executor);
	}
}
