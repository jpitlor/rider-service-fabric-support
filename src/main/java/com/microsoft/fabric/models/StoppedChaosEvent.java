package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a Chaos event that gets generated when Chaos stops because either the user issued a stop or the time to run
 * was up.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Stopped")
@Fluent
public final class StoppedChaosEvent extends ChaosEvent {
    /*
     * Describes why Chaos stopped. Chaos can stop because of StopChaos API
     * call or the timeToRun provided in ChaosParameters is over.
     */
    @JsonProperty(value = "Reason")
    private String reason;

    /**
     * Get the reason property: Describes why Chaos stopped. Chaos can stop because of StopChaos API call or the
     * timeToRun provided in ChaosParameters is over.
     *
     * @return the reason value.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Set the reason property: Describes why Chaos stopped. Chaos can stop because of StopChaos API call or the
     * timeToRun provided in ChaosParameters is over.
     *
     * @param reason the reason value to set.
     * @return the StoppedChaosEvent object itself.
     */
    public StoppedChaosEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
