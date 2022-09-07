package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a Service Fabric property value of type Double. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Double")
@Fluent
public final class DoublePropertyValue extends PropertyValue {
    /*
     * The data of the property value.
     */
    @JsonProperty(value = "Data", required = true)
    private double data;

    /**
     * Get the data property: The data of the property value.
     *
     * @return the data value.
     */
    public double getData() {
        return this.data;
    }

    /**
     * Set the data property: The data of the property value.
     *
     * @param data the data value to set.
     * @return the DoublePropertyValue object itself.
     */
    public DoublePropertyValue setData(double data) {
        this.data = data;
        return this;
    }
}
