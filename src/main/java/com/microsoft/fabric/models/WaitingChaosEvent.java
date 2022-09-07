package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a Chaos event that gets generated when Chaos is waiting for the cluster to become ready for faulting, for
 * example, Chaos may be waiting for the on-going upgrade to finish.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Waiting")
@Fluent
public final class WaitingChaosEvent extends ChaosEvent {
    /*
     * Describes why the WaitingChaosEvent was generated, for example, due to a
     * cluster upgrade.
     */
    @JsonProperty(value = "Reason")
    private String reason;

    /**
     * Get the reason property: Describes why the WaitingChaosEvent was generated, for example, due to a cluster
     * upgrade.
     *
     * @return the reason value.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Set the reason property: Describes why the WaitingChaosEvent was generated, for example, due to a cluster
     * upgrade.
     *
     * @param reason the reason value to set.
     * @return the WaitingChaosEvent object itself.
     */
    public WaitingChaosEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
