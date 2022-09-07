package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This type describes a value of a secret resource. The name of this resource is the version identifier corresponding
 * to this secret value.
 */
@JsonFlatten
@Fluent
public class SecretValueResourceDescription {
    /*
     * Version identifier of the secret value.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The actual value of the secret.
     */
    @JsonProperty(value = "properties.value")
    private String value;

    /**
     * Get the name property: Version identifier of the secret value.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Version identifier of the secret value.
     *
     * @param name the name value to set.
     * @return the SecretValueResourceDescription object itself.
     */
    public SecretValueResourceDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The actual value of the secret.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The actual value of the secret.
     *
     * @param value the value value to set.
     * @return the SecretValueResourceDescription object itself.
     */
    public SecretValueResourceDescription setValue(String value) {
        this.value = value;
        return this;
    }
}
