package dev.pitlor.rider_service_fabric_support.program_runners;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.executors.DefaultDebugExecutor;
import com.intellij.execution.runners.AsyncProgramRunner;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ui.RunContentDescriptor;
import dev.pitlor.rider_service_fabric_support.Bundle;
import dev.pitlor.rider_service_fabric_support.run_configuration.ServiceFabricRunConfiguration;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.concurrency.Promise;

public class ServiceFabricProgramDebugger extends AsyncProgramRunner {
	@Override
	public @NotNull @NonNls String getRunnerId() {
		return Bundle.string("program_runner.debug.id");
	}

	@Override
	public boolean canRun(@NotNull String executorId, @NotNull RunProfile runProfile) {
		return DefaultDebugExecutor.EXECUTOR_ID.equals(executorId) && runProfile instanceof ServiceFabricRunConfiguration;
	}

	@NotNull
	@Override
	protected Promise<RunContentDescriptor> execute(@NotNull ExecutionEnvironment executionEnvironment, @NotNull RunProfileState runProfileState) throws ExecutionException {
		return null;
	}
}
