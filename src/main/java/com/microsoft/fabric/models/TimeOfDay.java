package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines an hour and minute of the day specified in 24 hour time. */
@Fluent
public final class TimeOfDay {
    /*
     * Represents the hour of the day. Value must be between 0 and 23
     * inclusive.
     */
    @JsonProperty(value = "Hour")
    private Integer hour;

    /*
     * Represents the minute of the hour. Value must be between 0 to 59
     * inclusive.
     */
    @JsonProperty(value = "Minute")
    private Integer minute;

    /**
     * Get the hour property: Represents the hour of the day. Value must be between 0 and 23 inclusive.
     *
     * @return the hour value.
     */
    public Integer getHour() {
        return this.hour;
    }

    /**
     * Set the hour property: Represents the hour of the day. Value must be between 0 and 23 inclusive.
     *
     * @param hour the hour value to set.
     * @return the TimeOfDay object itself.
     */
    public TimeOfDay setHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Get the minute property: Represents the minute of the hour. Value must be between 0 to 59 inclusive.
     *
     * @return the minute value.
     */
    public Integer getMinute() {
        return this.minute;
    }

    /**
     * Set the minute property: Represents the minute of the hour. Value must be between 0 to 59 inclusive.
     *
     * @param minute the minute value to set.
     * @return the TimeOfDay object itself.
     */
    public TimeOfDay setMinute(Integer minute) {
        this.minute = minute;
        return this;
    }
}
