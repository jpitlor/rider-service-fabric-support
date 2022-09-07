package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the Chaos Schedule used by Chaos and the version of the Chaos Schedule. The version value wraps back to 0
 * after surpassing 2,147,483,647.
 */
@Fluent
public final class ChaosScheduleDescription {
    /*
     * The version number of the Schedule.
     */
    @JsonProperty(value = "Version")
    private Integer version;

    /*
     * Defines the schedule used by Chaos.
     */
    @JsonProperty(value = "Schedule")
    private ChaosSchedule schedule;

    /**
     * Get the version property: The version number of the Schedule.
     *
     * @return the version value.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version number of the Schedule.
     *
     * @param version the version value to set.
     * @return the ChaosScheduleDescription object itself.
     */
    public ChaosScheduleDescription setVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * Get the schedule property: Defines the schedule used by Chaos.
     *
     * @return the schedule value.
     */
    public ChaosSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Defines the schedule used by Chaos.
     *
     * @param schedule the schedule value to set.
     * @return the ChaosScheduleDescription object itself.
     */
    public ChaosScheduleDescription setSchedule(ChaosSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
}
