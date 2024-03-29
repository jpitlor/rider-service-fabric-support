package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a PropertyBatchOperation that compares the value of the property with the expected value. The
 * CheckValuePropertyBatchOperation is generally used as a precondition for the write operations in the batch. Note that
 * if one PropertyBatchOperation in a PropertyBatch fails, the entire batch fails and cannot be committed in a
 * transactional manner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("CheckValue")
@Fluent
public final class CheckValuePropertyBatchOperation extends PropertyBatchOperation {
    /*
     * The expected property value.
     */
    @JsonProperty(value = "Value", required = true)
    private PropertyValue value;

    /**
     * Get the value property: The expected property value.
     *
     * @return the value value.
     */
    public PropertyValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The expected property value.
     *
     * @param value the value value to set.
     * @return the CheckValuePropertyBatchOperation object itself.
     */
    public CheckValuePropertyBatchOperation setValue(PropertyValue value) {
        this.value = value;
        return this;
    }
}
