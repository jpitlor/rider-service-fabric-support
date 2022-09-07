package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a PropertyBatchOperation that compares the Boolean existence of a property with the Exists argument. The
 * PropertyBatchOperation operation fails if the property's existence is not equal to the Exists argument. The
 * CheckExistsPropertyBatchOperation is generally used as a precondition for the write operations in the batch. Note
 * that if one PropertyBatchOperation in a PropertyBatch fails, the entire batch fails and cannot be committed in a
 * transactional manner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("CheckExists")
@Fluent
public final class CheckExistsPropertyBatchOperation extends PropertyBatchOperation {
    /*
     * Whether or not the property should exist for the operation to pass.
     */
    @JsonProperty(value = "Exists", required = true)
    private boolean exists;

    /**
     * Get the exists property: Whether or not the property should exist for the operation to pass.
     *
     * @return the exists value.
     */
    public boolean isExists() {
        return this.exists;
    }

    /**
     * Set the exists property: Whether or not the property should exist for the operation to pass.
     *
     * @param exists the exists value to set.
     * @return the CheckExistsPropertyBatchOperation object itself.
     */
    public CheckExistsPropertyBatchOperation setExists(boolean exists) {
        this.exists = exists;
        return this;
    }
}
