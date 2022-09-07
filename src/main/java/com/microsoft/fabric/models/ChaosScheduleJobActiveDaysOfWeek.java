package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the days of the week that a Chaos Schedule Job will run for. */
@Fluent
public final class ChaosScheduleJobActiveDaysOfWeek {
    /*
     * Indicates if the Chaos Schedule Job will run on Sunday
     */
    @JsonProperty(value = "Sunday")
    private Boolean sunday;

    /*
     * Indicates if the Chaos Schedule Job will run on Monday
     */
    @JsonProperty(value = "Monday")
    private Boolean monday;

    /*
     * Indicates if the Chaos Schedule Job will run on Tuesday
     */
    @JsonProperty(value = "Tuesday")
    private Boolean tuesday;

    /*
     * Indicates if the Chaos Schedule Job will run on Wednesday
     */
    @JsonProperty(value = "Wednesday")
    private Boolean wednesday;

    /*
     * Indicates if the Chaos Schedule Job will run on Thursday
     */
    @JsonProperty(value = "Thursday")
    private Boolean thursday;

    /*
     * Indicates if the Chaos Schedule Job will run on Friday
     */
    @JsonProperty(value = "Friday")
    private Boolean friday;

    /*
     * Indicates if the Chaos Schedule Job will run on Saturday
     */
    @JsonProperty(value = "Saturday")
    private Boolean saturday;

    /**
     * Get the sunday property: Indicates if the Chaos Schedule Job will run on Sunday.
     *
     * @return the sunday value.
     */
    public Boolean isSunday() {
        return this.sunday;
    }

    /**
     * Set the sunday property: Indicates if the Chaos Schedule Job will run on Sunday.
     *
     * @param sunday the sunday value to set.
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek setSunday(Boolean sunday) {
        this.sunday = sunday;
        return this;
    }

    /**
     * Get the monday property: Indicates if the Chaos Schedule Job will run on Monday.
     *
     * @return the monday value.
     */
    public Boolean isMonday() {
        return this.monday;
    }

    /**
     * Set the monday property: Indicates if the Chaos Schedule Job will run on Monday.
     *
     * @param monday the monday value to set.
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek setMonday(Boolean monday) {
        this.monday = monday;
        return this;
    }

    /**
     * Get the tuesday property: Indicates if the Chaos Schedule Job will run on Tuesday.
     *
     * @return the tuesday value.
     */
    public Boolean isTuesday() {
        return this.tuesday;
    }

    /**
     * Set the tuesday property: Indicates if the Chaos Schedule Job will run on Tuesday.
     *
     * @param tuesday the tuesday value to set.
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    /**
     * Get the wednesday property: Indicates if the Chaos Schedule Job will run on Wednesday.
     *
     * @return the wednesday value.
     */
    public Boolean isWednesday() {
        return this.wednesday;
    }

    /**
     * Set the wednesday property: Indicates if the Chaos Schedule Job will run on Wednesday.
     *
     * @param wednesday the wednesday value to set.
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    /**
     * Get the thursday property: Indicates if the Chaos Schedule Job will run on Thursday.
     *
     * @return the thursday value.
     */
    public Boolean isThursday() {
        return this.thursday;
    }

    /**
     * Set the thursday property: Indicates if the Chaos Schedule Job will run on Thursday.
     *
     * @param thursday the thursday value to set.
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek setThursday(Boolean thursday) {
        this.thursday = thursday;
        return this;
    }

    /**
     * Get the friday property: Indicates if the Chaos Schedule Job will run on Friday.
     *
     * @return the friday value.
     */
    public Boolean isFriday() {
        return this.friday;
    }

    /**
     * Set the friday property: Indicates if the Chaos Schedule Job will run on Friday.
     *
     * @param friday the friday value to set.
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek setFriday(Boolean friday) {
        this.friday = friday;
        return this;
    }

    /**
     * Get the saturday property: Indicates if the Chaos Schedule Job will run on Saturday.
     *
     * @return the saturday value.
     */
    public Boolean isSaturday() {
        return this.saturday;
    }

    /**
     * Set the saturday property: Indicates if the Chaos Schedule Job will run on Saturday.
     *
     * @param saturday the saturday value to set.
     * @return the ChaosScheduleJobActiveDaysOfWeek object itself.
     */
    public ChaosScheduleJobActiveDaysOfWeek setSaturday(Boolean saturday) {
        this.saturday = saturday;
        return this;
    }
}
