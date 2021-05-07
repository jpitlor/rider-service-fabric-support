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
import com.intellij.openapi.application.ex.ApplicationManagerEx;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.terminal.TerminalExecutionConsole;
import com.intellij.util.io.SuperUserStatus;
import dev.pitlor.rider_service_fabric_support.Bundle;
import dev.pitlor.rider_service_fabric_support.utils.ExecutionType;
import dev.pitlor.rider_service_fabric_support.utils.Utils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class ServiceFabricRunProfileState implements RunProfileState {
	private final ServiceFabricRunConfiguration configuration;

	public ServiceFabricRunProfileState(ServiceFabricRunConfiguration configuration) {
		this.configuration = configuration;
	}

	@Override
	public @Nullable ExecutionResult execute(Executor executor, @NotNull ProgramRunner<?> programRunner) throws ExecutionException {
		if (!SuperUserStatus.isSuperUser()) {
			int shouldRestart = Messages.showYesNoDialog(Bundle.string("dialog.needs_sudo.content"), Bundle.string("dialog.needs_sudo.title"), null);
			if (shouldRestart == Messages.YES) {
				ApplicationManagerEx.getApplicationEx().restart(false, true);
			}

			return null;
		}

		ExecutionType executionType = ExecutionType.from(executor);
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
		OSProcessHandler processHandler = getProcess();
		TerminalExecutionConsole consoleView = new TerminalExecutionConsole(configuration.getProject(), processHandler);

		return new DefaultExecutionResult(consoleView, processHandler);
	}

	private ExecutionResult debug() throws ExecutionException {
		OSProcessHandler processHandler = getProcess();
		TerminalExecutionConsole consoleView = new TerminalExecutionConsole(configuration.getProject(), processHandler);

		return new DefaultExecutionResult(consoleView, processHandler);
	}

	private OSProcessHandler getProcess() throws ExecutionException {
		VirtualFile scriptsFolder = Utils.getFile(configuration.settings.sfProjFolder, "Scripts");
		String deployScriptPath = Utils.getFile(scriptsFolder, "Deploy-FabricApplication.ps1").getPath();

		String publishProfilePath = configuration.settings.publishProfile.getPath();

		String command = String.format("& { %s -PublishProfileFile %s }", deployScriptPath, publishProfilePath);
		GeneralCommandLine commandLine = new GeneralCommandLine("powershell", "-Command", command);
		OSProcessHandler processHandler = new KillableColoredProcessHandler.Silent(commandLine);
		ProcessTerminatedListener.attach(processHandler);

		return processHandler;
	}
}
