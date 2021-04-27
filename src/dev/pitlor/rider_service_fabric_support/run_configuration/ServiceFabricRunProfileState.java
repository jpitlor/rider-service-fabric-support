package dev.pitlor.rider_service_fabric_support.run_configuration;

import com.intellij.execution.DefaultExecutionResult;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.process.KillableColoredProcessHandler;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ProgramRunner;
import dev.pitlor.rider_service_fabric_support.utils.ExecutionType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ServiceFabricRunProfileState implements RunProfileState {
	private final ExecutionType executionType;
	private final ServiceFabricRunConfiguration configuration;

	public ServiceFabricRunProfileState(Executor executor, ServiceFabricRunConfiguration configuration) {
		this.executionType = ExecutionType.from(executor);
		this.configuration = configuration;
	}

	@Override
	public @Nullable ExecutionResult execute(Executor executor, @NotNull ProgramRunner<?> programRunner) throws ExecutionException {
		switch (executionType) {
			case RUN:
				return run();
			case DEBUG:
				return debug();
			default:
				return null;
		}
	}

	private ExecutionResult run() throws ExecutionException {
		GeneralCommandLine commandLine = new GeneralCommandLine("cmd", "/c", "echo run");
		OSProcessHandler processHandler = new KillableColoredProcessHandler.Silent(commandLine);
		ProcessTerminatedListener.attach(processHandler);

		return new DefaultExecutionResult(null, processHandler);
	}

	private ExecutionResult debug() throws ExecutionException {
		GeneralCommandLine commandLine = new GeneralCommandLine("cmd", "/c", "echo debug");
		OSProcessHandler processHandler = new KillableColoredProcessHandler.Silent(commandLine);
		ProcessTerminatedListener.attach(processHandler);

		return new DefaultExecutionResult(null, processHandler);
	}
}
