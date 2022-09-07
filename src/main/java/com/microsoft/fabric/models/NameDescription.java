package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a Service Fabric name. */
@Fluent
public final class NameDescription {
    /*
     * The Service Fabric name, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /**
     * Get the name property: The Service Fabric name, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Service Fabric name, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the NameDescription object itself.
     */
    public NameDescription setName(String name) {
        this.name = name;
        return this;
    }
}
