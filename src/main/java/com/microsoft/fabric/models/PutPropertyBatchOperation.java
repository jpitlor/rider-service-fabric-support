package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Puts the specified property under the specified name. Note that if one PropertyBatchOperation in a PropertyBatch
 * fails, the entire batch fails and cannot be committed in a transactional manner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Put")
@Fluent
public final class PutPropertyBatchOperation extends PropertyBatchOperation {
    /*
     * Describes a Service Fabric property value.
     */
    @JsonProperty(value = "Value", required = true)
    private PropertyValue value;

    /*
     * The property's custom type ID. Using this property, the user is able to
     * tag the type of the value of the property.
     */
    @JsonProperty(value = "CustomTypeId")
    private String customTypeId;

    /**
     * Get the value property: Describes a Service Fabric property value.
     *
     * @return the value value.
     */
    public PropertyValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: Describes a Service Fabric property value.
     *
     * @param value the value value to set.
     * @return the PutPropertyBatchOperation object itself.
     */
    public PutPropertyBatchOperation setValue(PropertyValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get the customTypeId property: The property's custom type ID. Using this property, the user is able to tag the
     * type of the value of the property.
     *
     * @return the customTypeId value.
     */
    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     * Set the customTypeId property: The property's custom type ID. Using this property, the user is able to tag the
     * type of the value of the property.
     *
     * @param customTypeId the customTypeId value to set.
     * @return the PutPropertyBatchOperation object itself.
     */
    public PutPropertyBatchOperation setCustomTypeId(String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }
}
