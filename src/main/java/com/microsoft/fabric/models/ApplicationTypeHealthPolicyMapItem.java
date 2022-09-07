package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines an item in ApplicationTypeHealthPolicyMap. */
@Fluent
public final class ApplicationTypeHealthPolicyMapItem {
    /*
     * The key of the application type health policy map item. This is the name
     * of the application type.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /*
     * The value of the application type health policy map item.
     * The max percent unhealthy applications allowed for the application type.
     * Must be between zero and 100.
     */
    @JsonProperty(value = "Value", required = true)
    private int value;

    /**
     * Get the key property: The key of the application type health policy map item. This is the name of the application
     * type.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key of the application type health policy map item. This is the name of the application
     * type.
     *
     * @param key the key value to set.
     * @return the ApplicationTypeHealthPolicyMapItem object itself.
     */
    public ApplicationTypeHealthPolicyMapItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value of the application type health policy map item. The max percent unhealthy
     * applications allowed for the application type. Must be between zero and 100.
     *
     * @return the value value.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the application type health policy map item. The max percent unhealthy
     * applications allowed for the application type. Must be between zero and 100.
     *
     * @param value the value value to set.
     * @return the ApplicationTypeHealthPolicyMapItem object itself.
     */
    public ApplicationTypeHealthPolicyMapItem setValue(int value) {
        this.value = value;
        return this;
    }
}
