package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the auto scaling policy. */
@Fluent
public final class AutoScalingPolicy {
    /*
     * The name of the auto scaling policy.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Determines when auto scaling operation will be invoked.
     */
    @JsonProperty(value = "trigger", required = true)
    private AutoScalingTrigger trigger;

    /*
     * The mechanism that is used to scale when auto scaling operation is
     * invoked.
     */
    @JsonProperty(value = "mechanism", required = true)
    private AutoScalingMechanism mechanism;

    /**
     * Get the name property: The name of the auto scaling policy.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the auto scaling policy.
     *
     * @param name the name value to set.
     * @return the AutoScalingPolicy object itself.
     */
    public AutoScalingPolicy setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the trigger property: Determines when auto scaling operation will be invoked.
     *
     * @return the trigger value.
     */
    public AutoScalingTrigger getTrigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: Determines when auto scaling operation will be invoked.
     *
     * @param trigger the trigger value to set.
     * @return the AutoScalingPolicy object itself.
     */
    public AutoScalingPolicy setTrigger(AutoScalingTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the mechanism property: The mechanism that is used to scale when auto scaling operation is invoked.
     *
     * @return the mechanism value.
     */
    public AutoScalingMechanism getMechanism() {
        return this.mechanism;
    }

    /**
     * Set the mechanism property: The mechanism that is used to scale when auto scaling operation is invoked.
     *
     * @param mechanism the mechanism value to set.
     * @return the AutoScalingPolicy object itself.
     */
    public AutoScalingPolicy setMechanism(AutoScalingMechanism mechanism) {
        this.mechanism = mechanism;
        return this;
    }
}
