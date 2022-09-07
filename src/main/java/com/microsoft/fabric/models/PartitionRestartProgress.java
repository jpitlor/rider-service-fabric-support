package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a partition restart user-induced operation. */
@Fluent
public final class PartitionRestartProgress {
    /*
     * The state of the operation.
     */
    @JsonProperty(value = "State")
    private OperationState state;

    /*
     * Represents information about an operation in a terminal state (Completed
     * or Faulted).
     */
    @JsonProperty(value = "RestartPartitionResult")
    private RestartPartitionResult restartPartitionResult;

    /**
     * Get the state property: The state of the operation.
     *
     * @return the state value.
     */
    public OperationState getState() {
        return this.state;
    }

    /**
     * Set the state property: The state of the operation.
     *
     * @param state the state value to set.
     * @return the PartitionRestartProgress object itself.
     */
    public PartitionRestartProgress setState(OperationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the restartPartitionResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @return the restartPartitionResult value.
     */
    public RestartPartitionResult getRestartPartitionResult() {
        return this.restartPartitionResult;
    }

    /**
     * Set the restartPartitionResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @param restartPartitionResult the restartPartitionResult value to set.
     * @return the PartitionRestartProgress object itself.
     */
    public PartitionRestartProgress setRestartPartitionResult(RestartPartitionResult restartPartitionResult) {
        this.restartPartitionResult = restartPartitionResult;
        return this;
    }
}
