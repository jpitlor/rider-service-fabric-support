package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a Service Fabric property value of type String. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("String")
@Fluent
public final class StringPropertyValue extends PropertyValue {
    /*
     * The data of the property value.
     */
    @JsonProperty(value = "Data", required = true)
    private String data;

    /**
     * Get the data property: The data of the property value.
     *
     * @return the data value.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Set the data property: The data of the property value.
     *
     * @param data the data value to set.
     * @return the StringPropertyValue object itself.
     */
    public StringPropertyValue setData(String data) {
        this.data = data;
        return this;
    }
}
