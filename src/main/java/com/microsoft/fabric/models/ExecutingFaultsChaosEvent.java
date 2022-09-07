package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes a Chaos event that gets generated when Chaos has decided on the faults for an iteration. This Chaos event
 * contains the details of the faults as a list of strings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ExecutingFaults")
@Fluent
public final class ExecutingFaultsChaosEvent extends ChaosEvent {
    /*
     * List of string description of the faults that Chaos decided to execute
     * in an iteration.
     */
    @JsonProperty(value = "Faults")
    private List<String> faults;

    /**
     * Get the faults property: List of string description of the faults that Chaos decided to execute in an iteration.
     *
     * @return the faults value.
     */
    public List<String> getFaults() {
        return this.faults;
    }

    /**
     * Set the faults property: List of string description of the faults that Chaos decided to execute in an iteration.
     *
     * @param faults the faults value to set.
     * @return the ExecutingFaultsChaosEvent object itself.
     */
    public ExecutingFaultsChaosEvent setFaults(List<String> faults) {
        this.faults = faults;
        return this;
    }
}
