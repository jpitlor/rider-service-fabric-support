package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Information about current reconfiguration like phase, type, previous configuration role of replica and
 * reconfiguration start date time.
 */
@Fluent
public final class ReconfigurationInformation {
    /*
     * Replica role before reconfiguration started.
     */
    @JsonProperty(value = "PreviousConfigurationRole")
    private ReplicaRole previousConfigurationRole;

    /*
     * Current phase of ongoing reconfiguration. If no reconfiguration is
     * taking place then this value will be "None".
     */
    @JsonProperty(value = "ReconfigurationPhase")
    private ReconfigurationPhase reconfigurationPhase;

    /*
     * Type of current ongoing reconfiguration. If no reconfiguration is taking
     * place then this value will be "None".
     */
    @JsonProperty(value = "ReconfigurationType")
    private ReconfigurationType reconfigurationType;

    /*
     * Start time (in UTC) of the ongoing reconfiguration. If no
     * reconfiguration is taking place then this value will be zero date-time.
     */
    @JsonProperty(value = "ReconfigurationStartTimeUtc")
    private OffsetDateTime reconfigurationStartTimeUtc;

    /**
     * Get the previousConfigurationRole property: Replica role before reconfiguration started.
     *
     * @return the previousConfigurationRole value.
     */
    public ReplicaRole getPreviousConfigurationRole() {
        return this.previousConfigurationRole;
    }

    /**
     * Set the previousConfigurationRole property: Replica role before reconfiguration started.
     *
     * @param previousConfigurationRole the previousConfigurationRole value to set.
     * @return the ReconfigurationInformation object itself.
     */
    public ReconfigurationInformation setPreviousConfigurationRole(ReplicaRole previousConfigurationRole) {
        this.previousConfigurationRole = previousConfigurationRole;
        return this;
    }

    /**
     * Get the reconfigurationPhase property: Current phase of ongoing reconfiguration. If no reconfiguration is taking
     * place then this value will be "None".
     *
     * @return the reconfigurationPhase value.
     */
    public ReconfigurationPhase getReconfigurationPhase() {
        return this.reconfigurationPhase;
    }

    /**
     * Set the reconfigurationPhase property: Current phase of ongoing reconfiguration. If no reconfiguration is taking
     * place then this value will be "None".
     *
     * @param reconfigurationPhase the reconfigurationPhase value to set.
     * @return the ReconfigurationInformation object itself.
     */
    public ReconfigurationInformation setReconfigurationPhase(ReconfigurationPhase reconfigurationPhase) {
        this.reconfigurationPhase = reconfigurationPhase;
        return this;
    }

    /**
     * Get the reconfigurationType property: Type of current ongoing reconfiguration. If no reconfiguration is taking
     * place then this value will be "None".
     *
     * @return the reconfigurationType value.
     */
    public ReconfigurationType getReconfigurationType() {
        return this.reconfigurationType;
    }

    /**
     * Set the reconfigurationType property: Type of current ongoing reconfiguration. If no reconfiguration is taking
     * place then this value will be "None".
     *
     * @param reconfigurationType the reconfigurationType value to set.
     * @return the ReconfigurationInformation object itself.
     */
    public ReconfigurationInformation setReconfigurationType(ReconfigurationType reconfigurationType) {
        this.reconfigurationType = reconfigurationType;
        return this;
    }

    /**
     * Get the reconfigurationStartTimeUtc property: Start time (in UTC) of the ongoing reconfiguration. If no
     * reconfiguration is taking place then this value will be zero date-time.
     *
     * @return the reconfigurationStartTimeUtc value.
     */
    public OffsetDateTime getReconfigurationStartTimeUtc() {
        return this.reconfigurationStartTimeUtc;
    }

    /**
     * Set the reconfigurationStartTimeUtc property: Start time (in UTC) of the ongoing reconfiguration. If no
     * reconfiguration is taking place then this value will be zero date-time.
     *
     * @param reconfigurationStartTimeUtc the reconfigurationStartTimeUtc value to set.
     * @return the ReconfigurationInformation object itself.
     */
    public ReconfigurationInformation setReconfigurationStartTimeUtc(OffsetDateTime reconfigurationStartTimeUtc) {
        this.reconfigurationStartTimeUtc = reconfigurationStartTimeUtc;
        return this;
    }
}
