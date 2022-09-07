package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Chaos Stopped event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosStopped")
@Fluent
public final class ChaosStoppedEvent extends ClusterEvent {
    /*
     * Describes reason.
     */
    @JsonProperty(value = "Reason", required = true)
    private String reason;

    /**
     * Get the reason property: Describes reason.
     *
     * @return the reason value.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Set the reason property: Describes reason.
     *
     * @param reason the reason value to set.
     * @return the ChaosStoppedEvent object itself.
     */
    public ChaosStoppedEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
