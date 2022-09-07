package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Http headers. */
@Fluent
public final class ProbeHttpGetHeaders {
    /*
     * The name of the header.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The value of the header.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: The name of the header.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the header.
     *
     * @param name the name value to set.
     * @return the ProbeHttpGetHeaders object itself.
     */
    public ProbeHttpGetHeaders setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the header.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the header.
     *
     * @param value the value value to set.
     * @return the ProbeHttpGetHeaders object itself.
     */
    public ProbeHttpGetHeaders setValue(String value) {
        this.value = value;
        return this;
    }
}
