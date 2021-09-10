package dev.pitlor.rider_service_fabric_support.models

import com.intellij.execution.Executor
import com.intellij.execution.executors.DefaultDebugExecutor

enum class ExecutionType {
    RUN, DEBUG;

    companion object {
        fun from(executor: Executor): ExecutionType {
            return if (executor == DefaultDebugExecutor.getDebugExecutorInstance()) {
                DEBUG
            } else {
                RUN
            }
        }
    }
}