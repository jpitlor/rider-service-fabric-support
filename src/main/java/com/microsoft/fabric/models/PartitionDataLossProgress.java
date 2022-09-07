package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a partition data loss user-induced operation. */
@Fluent
public final class PartitionDataLossProgress {
    /*
     * The state of the operation.
     */
    @JsonProperty(value = "State")
    private OperationState state;

    /*
     * Represents information about an operation in a terminal state (Completed
     * or Faulted).
     */
    @JsonProperty(value = "InvokeDataLossResult")
    private InvokeDataLossResult invokeDataLossResult;

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
     * @return the PartitionDataLossProgress object itself.
     */
    public PartitionDataLossProgress setState(OperationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the invokeDataLossResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @return the invokeDataLossResult value.
     */
    public InvokeDataLossResult getInvokeDataLossResult() {
        return this.invokeDataLossResult;
    }

    /**
     * Set the invokeDataLossResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @param invokeDataLossResult the invokeDataLossResult value to set.
     * @return the PartitionDataLossProgress object itself.
     */
    public PartitionDataLossProgress setInvokeDataLossResult(InvokeDataLossResult invokeDataLossResult) {
        this.invokeDataLossResult = invokeDataLossResult;
        return this;
    }
}
