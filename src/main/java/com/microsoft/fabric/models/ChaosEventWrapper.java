package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Wrapper object for Chaos event. */
@Fluent
public final class ChaosEventWrapper {
    /*
     * Represents an event generated during a Chaos run.
     */
    @JsonProperty(value = "ChaosEvent")
    private ChaosEvent chaosEvent;

    /**
     * Get the chaosEvent property: Represents an event generated during a Chaos run.
     *
     * @return the chaosEvent value.
     */
    public ChaosEvent getChaosEvent() {
        return this.chaosEvent;
    }

    /**
     * Set the chaosEvent property: Represents an event generated during a Chaos run.
     *
     * @param chaosEvent the chaosEvent value to set.
     * @return the ChaosEventWrapper object itself.
     */
    public ChaosEventWrapper setChaosEvent(ChaosEvent chaosEvent) {
        this.chaosEvent = chaosEvent;
        return this;
    }
}
