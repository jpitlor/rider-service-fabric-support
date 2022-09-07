package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type describes a secret resource. */
@Fluent
public final class SecretResourceDescription {
    /*
     * Describes the properties of a secret resource.
     */
    @JsonProperty(value = "properties", required = true)
    private SecretResourceProperties properties;

    /*
     * Name of the Secret resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the properties property: Describes the properties of a secret resource.
     *
     * @return the properties value.
     */
    public SecretResourceProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Describes the properties of a secret resource.
     *
     * @param properties the properties value to set.
     * @return the SecretResourceDescription object itself.
     */
    public SecretResourceDescription setProperties(SecretResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the name property: Name of the Secret resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Secret resource.
     *
     * @param name the name value to set.
     * @return the SecretResourceDescription object itself.
     */
    public SecretResourceDescription setName(String name) {
        this.name = name;
        return this;
    }
}
