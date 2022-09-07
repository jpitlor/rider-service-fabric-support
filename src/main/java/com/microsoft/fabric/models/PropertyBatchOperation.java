package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the base type for property operations that can be put into a batch and submitted. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = PropertyBatchOperation.class)
@JsonTypeName("PropertyBatchOperation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "CheckExists", value = CheckExistsPropertyBatchOperation.class),
    @JsonSubTypes.Type(name = "CheckSequence", value = CheckSequencePropertyBatchOperation.class),
    @JsonSubTypes.Type(name = "CheckValue", value = CheckValuePropertyBatchOperation.class),
    @JsonSubTypes.Type(name = "Delete", value = DeletePropertyBatchOperation.class),
    @JsonSubTypes.Type(name = "Get", value = GetPropertyBatchOperation.class),
    @JsonSubTypes.Type(name = "Put", value = PutPropertyBatchOperation.class)
})
@Fluent
public class PropertyBatchOperation {
    /*
     * The name of the Service Fabric property.
     */
    @JsonProperty(value = "PropertyName", required = true)
    private String propertyName;

    /**
     * Get the propertyName property: The name of the Service Fabric property.
     *
     * @return the propertyName value.
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * Set the propertyName property: The name of the Service Fabric property.
     *
     * @param propertyName the propertyName value to set.
     * @return the PropertyBatchOperation object itself.
     */
    public PropertyBatchOperation setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
}
