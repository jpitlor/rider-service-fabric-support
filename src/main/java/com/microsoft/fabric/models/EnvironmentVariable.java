package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an environment variable for the container. */
@Fluent
public final class EnvironmentVariable {
    /*
     * The type of the environment variable being given in value
     */
    @JsonProperty(value = "type")
    private EnvironmentVariableType type;

    /*
     * The name of the environment variable.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of the environment variable, will be processed based on the
     * type provided.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the type property: The type of the environment variable being given in value.
     *
     * @return the type value.
     */
    public EnvironmentVariableType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the environment variable being given in value.
     *
     * @param type the type value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable setType(EnvironmentVariableType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The name of the environment variable.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the environment variable.
     *
     * @param name the name value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the environment variable, will be processed based on the type provided.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the environment variable, will be processed based on the type provided.
     *
     * @param value the value value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable setValue(String value) {
        this.value = value;
        return this;
    }
}
