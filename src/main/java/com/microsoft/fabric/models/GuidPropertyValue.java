package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Describes a Service Fabric property value of type Guid. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Guid")
@Fluent
public final class GuidPropertyValue extends PropertyValue {
    /*
     * The data of the property value.
     */
    @JsonProperty(value = "Data", required = true)
    private UUID data;

    /**
     * Get the data property: The data of the property value.
     *
     * @return the data value.
     */
    public UUID getData() {
        return this.data;
    }

    /**
     * Set the data property: The data of the property value.
     *
     * @param data the data value to set.
     * @return the GuidPropertyValue object itself.
     */
    public GuidPropertyValue setData(UUID data) {
        this.data = data;
        return this;
    }
}
