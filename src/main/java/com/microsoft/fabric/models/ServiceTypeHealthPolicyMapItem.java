package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines an item in ServiceTypeHealthPolicyMap. */
@Fluent
public final class ServiceTypeHealthPolicyMapItem {
    /*
     * The key of the service type health policy map item. This is the name of
     * the service type.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /*
     * The value of the service type health policy map item. This is the
     * ServiceTypeHealthPolicy for this service type.
     */
    @JsonProperty(value = "Value", required = true)
    private ServiceTypeHealthPolicy value;

    /**
     * Get the key property: The key of the service type health policy map item. This is the name of the service type.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key of the service type health policy map item. This is the name of the service type.
     *
     * @param key the key value to set.
     * @return the ServiceTypeHealthPolicyMapItem object itself.
     */
    public ServiceTypeHealthPolicyMapItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value of the service type health policy map item. This is the ServiceTypeHealthPolicy
     * for this service type.
     *
     * @return the value value.
     */
    public ServiceTypeHealthPolicy getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the service type health policy map item. This is the ServiceTypeHealthPolicy
     * for this service type.
     *
     * @param value the value value to set.
     * @return the ServiceTypeHealthPolicyMapItem object itself.
     */
    public ServiceTypeHealthPolicyMapItem setValue(ServiceTypeHealthPolicy value) {
        this.value = value;
        return this;
    }
}
