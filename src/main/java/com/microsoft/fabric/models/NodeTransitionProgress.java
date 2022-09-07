package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an NodeTransition operation. This class contains an OperationState and a NodeTransitionResult. The
 * NodeTransitionResult is not valid until OperationState is Completed or Faulted.
 */
@Fluent
public final class NodeTransitionProgress {
    /*
     * The state of the operation.
     */
    @JsonProperty(value = "State")
    private OperationState state;

    /*
     * Represents information about an operation in a terminal state (Completed
     * or Faulted).
     */
    @JsonProperty(value = "NodeTransitionResult")
    private NodeTransitionResult nodeTransitionResult;

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
     * @return the NodeTransitionProgress object itself.
     */
    public NodeTransitionProgress setState(OperationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the nodeTransitionResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @return the nodeTransitionResult value.
     */
    public NodeTransitionResult getNodeTransitionResult() {
        return this.nodeTransitionResult;
    }

    /**
     * Set the nodeTransitionResult property: Represents information about an operation in a terminal state (Completed
     * or Faulted).
     *
     * @param nodeTransitionResult the nodeTransitionResult value to set.
     * @return the NodeTransitionProgress object itself.
     */
    public NodeTransitionProgress setNodeTransitionResult(NodeTransitionResult nodeTransitionResult) {
        this.nodeTransitionResult = nodeTransitionResult;
        return this;
    }
}
