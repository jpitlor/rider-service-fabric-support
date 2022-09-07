package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The run to completion execution policy, the service will perform its desired operation and complete successfully. If
 * the service encounters failure, it will restarted based on restart policy specified. If the service completes its
 * operation successfully, it will not be restarted again.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RunToCompletion")
@Fluent
public final class RunToCompletionExecutionPolicy extends ExecutionPolicy {
    /*
     * Enumerates the restart policy for RunToCompletionExecutionPolicy
     */
    @JsonProperty(value = "restart", required = true)
    private RestartPolicy restart;

    /**
     * Get the restart property: Enumerates the restart policy for RunToCompletionExecutionPolicy.
     *
     * @return the restart value.
     */
    public RestartPolicy getRestart() {
        return this.restart;
    }

    /**
     * Set the restart property: Enumerates the restart policy for RunToCompletionExecutionPolicy.
     *
     * @param restart the restart value to set.
     * @return the RunToCompletionExecutionPolicy object itself.
     */
    public RunToCompletionExecutionPolicy setRestart(RestartPolicy restart) {
        this.restart = restart;
        return this;
    }
}
