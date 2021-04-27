package dev.pitlor.rider_service_fabric_support.utils;

import com.intellij.execution.Executor;
import com.intellij.execution.executors.DefaultDebugExecutor;

public enum ExecutionType {
	RUN, DEBUG;

	public static ExecutionType from(Executor executor) {
		if (executor.equals(DefaultDebugExecutor.getDebugExecutorInstance())) {
			return DEBUG;
		}

		return RUN;
	}
}
