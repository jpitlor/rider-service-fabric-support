package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines a time range in a 24 hour day specified by a start and end time. */
@Fluent
public final class TimeRange {
    /*
     * Defines an hour and minute of the day specified in 24 hour time.
     */
    @JsonProperty(value = "StartTime")
    private TimeOfDay startTime;

    /*
     * Defines an hour and minute of the day specified in 24 hour time.
     */
    @JsonProperty(value = "EndTime")
    private TimeOfDay endTime;

    /**
     * Get the startTime property: Defines an hour and minute of the day specified in 24 hour time.
     *
     * @return the startTime value.
     */
    public TimeOfDay getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Defines an hour and minute of the day specified in 24 hour time.
     *
     * @param startTime the startTime value to set.
     * @return the TimeRange object itself.
     */
    public TimeRange setStartTime(TimeOfDay startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Defines an hour and minute of the day specified in 24 hour time.
     *
     * @return the endTime value.
     */
    public TimeOfDay getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Defines an hour and minute of the day specified in 24 hour time.
     *
     * @param endTime the endTime value to set.
     * @return the TimeRange object itself.
     */
    public TimeRange setEndTime(TimeOfDay endTime) {
        this.endTime = endTime;
        return this;
    }
}
