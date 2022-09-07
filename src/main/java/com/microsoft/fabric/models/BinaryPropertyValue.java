package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes a Service Fabric property value of type Binary. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Binary")
@Fluent
public final class BinaryPropertyValue extends PropertyValue {
    /*
     * Array of bytes to be sent as an integer array. Each element of array is
     * a number between 0 and 255.
     */
    @JsonProperty(value = "Data", required = true)
    private List<Integer> data;

    /**
     * Get the data property: Array of bytes to be sent as an integer array. Each element of array is a number between 0
     * and 255.
     *
     * @return the data value.
     */
    public List<Integer> getData() {
        return this.data;
    }

    /**
     * Set the data property: Array of bytes to be sent as an integer array. Each element of array is a number between 0
     * and 255.
     *
     * @param data the data value to set.
     * @return the BinaryPropertyValue object itself.
     */
    public BinaryPropertyValue setData(List<Integer> data) {
        this.data = data;
        return this;
    }
}
