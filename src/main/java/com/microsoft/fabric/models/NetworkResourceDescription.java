package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type describes a network resource. */
@Fluent
public final class NetworkResourceDescription {
    /*
     * Name of the Network resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes properties of a network resource.
     */
    @JsonProperty(value = "properties", required = true)
    private NetworkResourceProperties properties;

    /**
     * Get the name property: Name of the Network resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Network resource.
     *
     * @param name the name value to set.
     * @return the NetworkResourceDescription object itself.
     */
    public NetworkResourceDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Describes properties of a network resource.
     *
     * @return the properties value.
     */
    public NetworkResourceProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Describes properties of a network resource.
     *
     * @param properties the properties value to set.
     * @return the NetworkResourceDescription object itself.
     */
    public NetworkResourceDescription setProperties(NetworkResourceProperties properties) {
        this.properties = properties;
        return this;
    }
}
