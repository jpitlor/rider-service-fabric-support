package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents information about an operation in a terminal state (Completed or Faulted). */
@Fluent
public final class InvokeQuorumLossResult {
    /*
     * If OperationState is Completed, this is 0.  If OperationState is
     * Faulted, this is an error code indicating the reason.
     */
    @JsonProperty(value = "ErrorCode")
    private Integer errorCode;

    /*
     * This class returns information about the partition that the user-induced
     * operation acted upon.
     */
    @JsonProperty(value = "SelectedPartition")
    private SelectedPartition selectedPartition;

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
     * @return the InvokeQuorumLossResult object itself.
     */
    public InvokeQuorumLossResult setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the selectedPartition property: This class returns information about the partition that the user-induced
     * operation acted upon.
     *
     * @return the selectedPartition value.
     */
    public SelectedPartition getSelectedPartition() {
        return this.selectedPartition;
    }

    /**
     * Set the selectedPartition property: This class returns information about the partition that the user-induced
     * operation acted upon.
     *
     * @param selectedPartition the selectedPartition value to set.
     * @return the InvokeQuorumLossResult object itself.
     */
    public InvokeQuorumLossResult setSelectedPartition(SelectedPartition selectedPartition) {
        this.selectedPartition = selectedPartition;
        return this;
    }
}
