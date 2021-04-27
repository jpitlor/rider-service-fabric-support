package dev.pitlor.rider_service_fabric_support.program_runners;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.executors.DefaultRunExecutor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.execution.ui.RunContentDescriptor;
import dev.pitlor.rider_service_fabric_support.Bundle;
import dev.pitlor.rider_service_fabric_support.run_configuration.ServiceFabricRunConfiguration;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ServiceFabricProgramRunner extends GenericProgramRunner {
	@Override
	public @NotNull @NonNls String getRunnerId() {
		return Bundle.string("program_runner.run.id");
	}

	@Override
	public boolean canRun(@NotNull String executorId, @NotNull RunProfile runProfile) {
		return DefaultRunExecutor.EXECUTOR_ID.equals(executorId) && runProfile instanceof ServiceFabricRunConfiguration;
	}

	@Nullable
	@Override
	protected RunContentDescriptor doExecute(@NotNull RunProfileState state, @NotNull ExecutionEnvironment environment) throws ExecutionException {
		return super.doExecute(state, environment);
	}
}
