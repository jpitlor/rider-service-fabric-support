package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines an item in ApplicationHealthPolicyMap. */
@Fluent
public final class ApplicationHealthPolicyMapItem {
    /*
     * The key of the application health policy map item. This is the name of
     * the application.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /*
     * The value of the application health policy map item. This is the
     * ApplicationHealthPolicy for this application.
     */
    @JsonProperty(value = "Value", required = true)
    private ApplicationHealthPolicy value;

    /**
     * Get the key property: The key of the application health policy map item. This is the name of the application.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key of the application health policy map item. This is the name of the application.
     *
     * @param key the key value to set.
     * @return the ApplicationHealthPolicyMapItem object itself.
     */
    public ApplicationHealthPolicyMapItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value of the application health policy map item. This is the ApplicationHealthPolicy
     * for this application.
     *
     * @return the value value.
     */
    public ApplicationHealthPolicy getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the application health policy map item. This is the ApplicationHealthPolicy
     * for this application.
     *
     * @param value the value value to set.
     * @return the ApplicationHealthPolicyMapItem object itself.
     */
    public ApplicationHealthPolicyMapItem setValue(ApplicationHealthPolicy value) {
        this.value = value;
        return this;
    }
}
