package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Chaos event corresponding to a failure during validation. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ValidationFailed")
@Fluent
public final class ValidationFailedChaosEvent extends ChaosEvent {
    /*
     * Describes why the ValidationFailedChaosEvent was generated. This may
     * happen because more than MaxPercentUnhealthyNodes are unhealthy for more
     * than MaxClusterStabilizationTimeout. This reason will be in the Reason
     * property of the ValidationFailedChaosEvent as a string.
     */
    @JsonProperty(value = "Reason")
    private String reason;

    /**
     * Get the reason property: Describes why the ValidationFailedChaosEvent was generated. This may happen because more
     * than MaxPercentUnhealthyNodes are unhealthy for more than MaxClusterStabilizationTimeout. This reason will be in
     * the Reason property of the ValidationFailedChaosEvent as a string.
     *
     * @return the reason value.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Set the reason property: Describes why the ValidationFailedChaosEvent was generated. This may happen because more
     * than MaxPercentUnhealthyNodes are unhealthy for more than MaxClusterStabilizationTimeout. This reason will be in
     * the Reason property of the ValidationFailedChaosEvent as a string.
     *
     * @param reason the reason value to set.
     * @return the ValidationFailedChaosEvent object itself.
     */
    public ValidationFailedChaosEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
