package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Derived from PropertyBatchInfo. Represents the property batch failing. Contains information about the specific batch
 * failure.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Failed")
@Fluent
public final class FailedPropertyBatchInfo extends PropertyBatchInfo {
    /*
     * The error message of the failed operation. Describes the exception
     * thrown due to the first unsuccessful operation in the property batch.
     */
    @JsonProperty(value = "ErrorMessage")
    private String errorMessage;

    /*
     * The index of the unsuccessful operation in the property batch.
     */
    @JsonProperty(value = "OperationIndex")
    private Integer operationIndex;

    /**
     * Get the errorMessage property: The error message of the failed operation. Describes the exception thrown due to
     * the first unsuccessful operation in the property batch.
     *
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: The error message of the failed operation. Describes the exception thrown due to
     * the first unsuccessful operation in the property batch.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the FailedPropertyBatchInfo object itself.
     */
    public FailedPropertyBatchInfo setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the operationIndex property: The index of the unsuccessful operation in the property batch.
     *
     * @return the operationIndex value.
     */
    public Integer getOperationIndex() {
        return this.operationIndex;
    }

    /**
     * Set the operationIndex property: The index of the unsuccessful operation in the property batch.
     *
     * @param operationIndex the operationIndex value to set.
     * @return the FailedPropertyBatchInfo object itself.
     */
    public FailedPropertyBatchInfo setOperationIndex(Integer operationIndex) {
        this.operationIndex = operationIndex;
        return this;
    }
}
