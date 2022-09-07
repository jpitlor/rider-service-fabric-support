package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes how the scaling should be performed. */
@Fluent
public final class ScalingPolicyDescription {
    /*
     * Specifies the trigger associated with this scaling policy
     */
    @JsonProperty(value = "ScalingTrigger", required = true)
    private ScalingTriggerDescription scalingTrigger;

    /*
     * Specifies the mechanism associated with this scaling policy
     */
    @JsonProperty(value = "ScalingMechanism", required = true)
    private ScalingMechanismDescription scalingMechanism;

    /**
     * Get the scalingTrigger property: Specifies the trigger associated with this scaling policy.
     *
     * @return the scalingTrigger value.
     */
    public ScalingTriggerDescription getScalingTrigger() {
        return this.scalingTrigger;
    }

    /**
     * Set the scalingTrigger property: Specifies the trigger associated with this scaling policy.
     *
     * @param scalingTrigger the scalingTrigger value to set.
     * @return the ScalingPolicyDescription object itself.
     */
    public ScalingPolicyDescription setScalingTrigger(ScalingTriggerDescription scalingTrigger) {
        this.scalingTrigger = scalingTrigger;
        return this;
    }

    /**
     * Get the scalingMechanism property: Specifies the mechanism associated with this scaling policy.
     *
     * @return the scalingMechanism value.
     */
    public ScalingMechanismDescription getScalingMechanism() {
        return this.scalingMechanism;
    }

    /**
     * Set the scalingMechanism property: Specifies the mechanism associated with this scaling policy.
     *
     * @param scalingMechanism the scalingMechanism value to set.
     * @return the ScalingPolicyDescription object itself.
     */
    public ScalingPolicyDescription setScalingMechanism(ScalingMechanismDescription scalingMechanism) {
        this.scalingMechanism = scalingMechanism;
        return this;
    }
}
