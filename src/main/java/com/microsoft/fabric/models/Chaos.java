package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains a description of Chaos. */
@Fluent
public final class Chaos {
    /*
     * If Chaos is running, these are the parameters Chaos is running with.
     */
    @JsonProperty(value = "ChaosParameters")
    private ChaosParameters chaosParameters;

    /*
     * Current status of the Chaos run.
     */
    @JsonProperty(value = "Status")
    private ChaosStatus status;

    /*
     * Current status of the schedule.
     */
    @JsonProperty(value = "ScheduleStatus")
    private ChaosScheduleStatus scheduleStatus;

    /**
     * Get the chaosParameters property: If Chaos is running, these are the parameters Chaos is running with.
     *
     * @return the chaosParameters value.
     */
    public ChaosParameters getChaosParameters() {
        return this.chaosParameters;
    }

    /**
     * Set the chaosParameters property: If Chaos is running, these are the parameters Chaos is running with.
     *
     * @param chaosParameters the chaosParameters value to set.
     * @return the Chaos object itself.
     */
    public Chaos setChaosParameters(ChaosParameters chaosParameters) {
        this.chaosParameters = chaosParameters;
        return this;
    }

    /**
     * Get the status property: Current status of the Chaos run.
     *
     * @return the status value.
     */
    public ChaosStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Current status of the Chaos run.
     *
     * @param status the status value to set.
     * @return the Chaos object itself.
     */
    public Chaos setStatus(ChaosStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the scheduleStatus property: Current status of the schedule.
     *
     * @return the scheduleStatus value.
     */
    public ChaosScheduleStatus getScheduleStatus() {
        return this.scheduleStatus;
    }

    /**
     * Set the scheduleStatus property: Current status of the schedule.
     *
     * @param scheduleStatus the scheduleStatus value to set.
     * @return the Chaos object itself.
     */
    public Chaos setScheduleStatus(ChaosScheduleStatus scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
}
