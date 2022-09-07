package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a Chaos event that gets generated when Chaos is started. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Started")
@Fluent
public final class StartedChaosEvent extends ChaosEvent {
    /*
     * Defines all the parameters to configure a Chaos run.
     */
    @JsonProperty(value = "ChaosParameters")
    private ChaosParameters chaosParameters;

    /**
     * Get the chaosParameters property: Defines all the parameters to configure a Chaos run.
     *
     * @return the chaosParameters value.
     */
    public ChaosParameters getChaosParameters() {
        return this.chaosParameters;
    }

    /**
     * Set the chaosParameters property: Defines all the parameters to configure a Chaos run.
     *
     * @param chaosParameters the chaosParameters value to set.
     * @return the StartedChaosEvent object itself.
     */
    public StartedChaosEvent setChaosParameters(ChaosParameters chaosParameters) {
        this.chaosParameters = chaosParameters;
        return this;
    }
}
