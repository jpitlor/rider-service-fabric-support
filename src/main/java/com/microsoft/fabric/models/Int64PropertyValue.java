package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a Service Fabric property value of type Int64. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Int64")
@Fluent
public final class Int64PropertyValue extends PropertyValue {
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
     * @return the Int64PropertyValue object itself.
     */
    public Int64PropertyValue setData(String data) {
        this.data = data;
        return this;
    }
}
