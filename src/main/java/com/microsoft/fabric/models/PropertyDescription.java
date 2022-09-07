package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of a Service Fabric property. */
@Fluent
public final class PropertyDescription {
    /*
     * The name of the Service Fabric property.
     */
    @JsonProperty(value = "PropertyName", required = true)
    private String propertyName;

    /*
     * The property's custom type ID. Using this property, the user is able to
     * tag the type of the value of the property.
     */
    @JsonProperty(value = "CustomTypeId")
    private String customTypeId;

    /*
     * Describes a Service Fabric property value.
     */
    @JsonProperty(value = "Value", required = true)
    private PropertyValue value;

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
     * @return the PropertyDescription object itself.
     */
    public PropertyDescription setPropertyName(String propertyName) {
        this.propertyName = propertyName;
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
     * @return the PropertyDescription object itself.
     */
    public PropertyDescription setCustomTypeId(String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

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
     * @return the PropertyDescription object itself.
     */
    public PropertyDescription setValue(PropertyValue value) {
        this.value = value;
        return this;
    }
}
