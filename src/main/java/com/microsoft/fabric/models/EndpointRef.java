package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a reference to a service endpoint. */
@Fluent
public final class EndpointRef {
    /*
     * Name of the endpoint.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: Name of the endpoint.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the endpoint.
     *
     * @param name the name value to set.
     * @return the EndpointRef object itself.
     */
    public EndpointRef setName(String name) {
        this.name = name;
        return this;
    }
}
