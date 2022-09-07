package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a PropertyBatchOperation that gets the specified property if it exists. Note that if one
 * PropertyBatchOperation in a PropertyBatch fails, the entire batch fails and cannot be committed in a transactional
 * manner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Get")
@Fluent
public final class GetPropertyBatchOperation extends PropertyBatchOperation {
    /*
     * Whether or not to return the property value with the metadata.
     * True if values should be returned with the metadata; False to return
     * only property metadata.
     */
    @JsonProperty(value = "IncludeValue")
    private Boolean includeValue;

    /**
     * Get the includeValue property: Whether or not to return the property value with the metadata. True if values
     * should be returned with the metadata; False to return only property metadata.
     *
     * @return the includeValue value.
     */
    public Boolean isIncludeValue() {
        return this.includeValue;
    }

    /**
     * Set the includeValue property: Whether or not to return the property value with the metadata. True if values
     * should be returned with the metadata; False to return only property metadata.
     *
     * @param includeValue the includeValue value to set.
     * @return the GetPropertyBatchOperation object itself.
     */
    public GetPropertyBatchOperation setIncludeValue(Boolean includeValue) {
        this.includeValue = includeValue;
        return this;
    }
}
