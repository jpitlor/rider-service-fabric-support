package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a container label. */
@Fluent
public final class ContainerLabel {
    /*
     * The name of the container label.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The value of the container label.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: The name of the container label.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the container label.
     *
     * @param name the name value to set.
     * @return the ContainerLabel object itself.
     */
    public ContainerLabel setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the container label.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the container label.
     *
     * @param value the value value to set.
     * @return the ContainerLabel object itself.
     */
    public ContainerLabel setValue(String value) {
        this.value = value;
        return this;
    }
}
