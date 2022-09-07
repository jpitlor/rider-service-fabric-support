package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state of an application, which contains the application identifier and the aggregated health
 * state.
 */
@Fluent
public final class ApplicationHealthState extends EntityHealthState {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Get the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ApplicationHealthState object itself.
     */
    public ApplicationHealthState setName(String name) {
        this.name = name;
        return this;
    }
}
