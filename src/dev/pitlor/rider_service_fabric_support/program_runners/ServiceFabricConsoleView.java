package dev.pitlor.rider_service_fabric_support.program_runners;

import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.testframework.TestConsoleProperties;
import com.intellij.execution.testframework.sm.runner.SMTRunnerConsoleProperties;
import com.intellij.execution.testframework.sm.runner.ui.SMTRunnerConsoleView;
import com.intellij.execution.ui.ExecutionConsole;
import com.intellij.execution.ui.RunnerLayoutUi;
import com.intellij.ui.content.Content;
import org.jetbrains.annotations.NotNull;

public class ServiceFabricConsoleView extends SMTRunnerConsoleView implements ExecutionConsole {
	public ServiceFabricConsoleView(SMTRunnerConsoleProperties consoleProperties, OSProcessHandler processHandler) {
		super(consoleProperties);
	}

	@Override
	public void initUI() {
		super.initUI();
	}


}
