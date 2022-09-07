package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a Service Fabric property. */
@Fluent
public final class PropertyInfo {
    /*
     * The name of the Service Fabric property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * Describes a Service Fabric property value.
     */
    @JsonProperty(value = "Value")
    private PropertyValue value;

    /*
     * The metadata associated with a property, including the property's name.
     */
    @JsonProperty(value = "Metadata", required = true)
    private PropertyMetadata metadata;

    /**
     * Get the name property: The name of the Service Fabric property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Service Fabric property.
     *
     * @param name the name value to set.
     * @return the PropertyInfo object itself.
     */
    public PropertyInfo setName(String name) {
        this.name = name;
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
     * @return the PropertyInfo object itself.
     */
    public PropertyInfo setValue(PropertyValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get the metadata property: The metadata associated with a property, including the property's name.
     *
     * @return the metadata value.
     */
    public PropertyMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata associated with a property, including the property's name.
     *
     * @param metadata the metadata value to set.
     * @return the PropertyInfo object itself.
     */
    public PropertyInfo setMetadata(PropertyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
}
