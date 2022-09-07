package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a partition quorum loss user-induced operation. */
@Fluent
public final class PartitionQuorumLossProgress {
    /*
     * The state of the operation.
     */
    @JsonProperty(value = "State")
    private OperationState state;

    /*
     * Represents information about an operation in a terminal state (Completed
     * or Faulted).
     */
    @JsonProperty(value = "InvokeQuorumLossResult")
    private InvokeQuorumLossResult invokeQuorumLossResult;

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
     * @return the PartitionQuorumLossProgress object itself.
     */
    public PartitionQuorumLossProgress setState(OperationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the invokeQuorumLossResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @return the invokeQuorumLossResult value.
     */
    public InvokeQuorumLossResult getInvokeQuorumLossResult() {
        return this.invokeQuorumLossResult;
    }

    /**
     * Set the invokeQuorumLossResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @param invokeQuorumLossResult the invokeQuorumLossResult value to set.
     * @return the PartitionQuorumLossProgress object itself.
     */
    public PartitionQuorumLossProgress setInvokeQuorumLossResult(InvokeQuorumLossResult invokeQuorumLossResult) {
        this.invokeQuorumLossResult = invokeQuorumLossResult;
        return this;
    }
}
