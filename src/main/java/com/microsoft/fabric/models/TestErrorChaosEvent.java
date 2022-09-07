package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a Chaos event that gets generated when an unexpected event occurs in the Chaos engine. For example, due to
 * the cluster snapshot being inconsistent, while faulting an entity, Chaos found that the entity was already faulted --
 * which would be an unexpected event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("TestError")
@Fluent
public final class TestErrorChaosEvent extends ChaosEvent {
    /*
     * Describes why TestErrorChaosEvent was generated. For example, Chaos
     * tries to fault a partition but finds that the partition is no longer
     * fault tolerant, then a TestErrorEvent gets generated with the reason
     * stating that the partition is not fault tolerant.
     */
    @JsonProperty(value = "Reason")
    private String reason;

    /**
     * Get the reason property: Describes why TestErrorChaosEvent was generated. For example, Chaos tries to fault a
     * partition but finds that the partition is no longer fault tolerant, then a TestErrorEvent gets generated with the
     * reason stating that the partition is not fault tolerant.
     *
     * @return the reason value.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Set the reason property: Describes why TestErrorChaosEvent was generated. For example, Chaos tries to fault a
     * partition but finds that the partition is no longer fault tolerant, then a TestErrorEvent gets generated with the
     * reason stating that the partition is not fault tolerant.
     *
     * @param reason the reason value to set.
     * @return the TestErrorChaosEvent object itself.
     */
    public TestErrorChaosEvent setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
