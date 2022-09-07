package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes extension of a service type defined in the service manifest. */
@Fluent
public final class ServiceTypeExtensionDescription {
    /*
     * The name of the extension.
     */
    @JsonProperty(value = "Key")
    private String key;

    /*
     * The extension value.
     */
    @JsonProperty(value = "Value")
    private String value;

    /**
     * Get the key property: The name of the extension.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The name of the extension.
     *
     * @param key the key value to set.
     * @return the ServiceTypeExtensionDescription object itself.
     */
    public ServiceTypeExtensionDescription setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The extension value.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The extension value.
     *
     * @param value the value value to set.
     * @return the ServiceTypeExtensionDescription object itself.
     */
    public ServiceTypeExtensionDescription setValue(String value) {
        this.value = value;
        return this;
    }
}
