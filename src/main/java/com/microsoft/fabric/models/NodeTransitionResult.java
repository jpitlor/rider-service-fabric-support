package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents information about an operation in a terminal state (Completed or Faulted). */
@Fluent
public final class NodeTransitionResult {
    /*
     * If OperationState is Completed, this is 0.  If OperationState is
     * Faulted, this is an error code indicating the reason.
     */
    @JsonProperty(value = "ErrorCode")
    private Integer errorCode;

    /*
     * Contains information about a node that was targeted by a user-induced
     * operation.
     */
    @JsonProperty(value = "NodeResult")
    private NodeResult nodeResult;

    /**
     * Get the errorCode property: If OperationState is Completed, this is 0. If OperationState is Faulted, this is an
     * error code indicating the reason.
     *
     * @return the errorCode value.
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: If OperationState is Completed, this is 0. If OperationState is Faulted, this is an
     * error code indicating the reason.
     *
     * @param errorCode the errorCode value to set.
     * @return the NodeTransitionResult object itself.
     */
    public NodeTransitionResult setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the nodeResult property: Contains information about a node that was targeted by a user-induced operation.
     *
     * @return the nodeResult value.
     */
    public NodeResult getNodeResult() {
        return this.nodeResult;
    }

    /**
     * Set the nodeResult property: Contains information about a node that was targeted by a user-induced operation.
     *
     * @param nodeResult the nodeResult value to set.
     * @return the NodeTransitionResult object itself.
     */
    public NodeTransitionResult setNodeResult(NodeResult nodeResult) {
        this.nodeResult = nodeResult;
        return this;
    }
}
