package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an application parameter override to be applied when creating or upgrading an application. */
@Fluent
public final class ApplicationParameter {
    /*
     * The name of the parameter.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /*
     * The value of the parameter.
     */
    @JsonProperty(value = "Value", required = true)
    private String value;

    /**
     * Get the key property: The name of the parameter.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The name of the parameter.
     *
     * @param key the key value to set.
     * @return the ApplicationParameter object itself.
     */
    public ApplicationParameter setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value of the parameter.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the parameter.
     *
     * @param value the value value to set.
     * @return the ApplicationParameter object itself.
     */
    public ApplicationParameter setValue(String value) {
        this.value = value;
        return this;
    }
}
