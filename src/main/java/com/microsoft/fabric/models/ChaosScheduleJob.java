package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a repetition rule and parameters of Chaos to be used with the Chaos Schedule. */
@Fluent
public final class ChaosScheduleJob {
    /*
     * A reference to which Chaos Parameters of the Chaos Schedule to use.
     */
    @JsonProperty(value = "ChaosParameters")
    private String chaosParameters;

    /*
     * Defines the days of the week that a Chaos Schedule Job will run for.
     */
    @JsonProperty(value = "Days")
    private ChaosScheduleJobActiveDaysOfWeek days;

    /*
     * A list of Time Ranges that specify when during active days that this job
     * will run. The times are interpreted as UTC.
     */
    @JsonProperty(value = "Times")
    private List<TimeRange> times;

    /**
     * Get the chaosParameters property: A reference to which Chaos Parameters of the Chaos Schedule to use.
     *
     * @return the chaosParameters value.
     */
    public String getChaosParameters() {
        return this.chaosParameters;
    }

    /**
     * Set the chaosParameters property: A reference to which Chaos Parameters of the Chaos Schedule to use.
     *
     * @param chaosParameters the chaosParameters value to set.
     * @return the ChaosScheduleJob object itself.
     */
    public ChaosScheduleJob setChaosParameters(String chaosParameters) {
        this.chaosParameters = chaosParameters;
        return this;
    }

    /**
     * Get the days property: Defines the days of the week that a Chaos Schedule Job will run for.
     *
     * @return the days value.
     */
    public ChaosScheduleJobActiveDaysOfWeek getDays() {
        return this.days;
    }

    /**
     * Set the days property: Defines the days of the week that a Chaos Schedule Job will run for.
     *
     * @param days the days value to set.
     * @return the ChaosScheduleJob object itself.
     */
    public ChaosScheduleJob setDays(ChaosScheduleJobActiveDaysOfWeek days) {
        this.days = days;
        return this;
    }

    /**
     * Get the times property: A list of Time Ranges that specify when during active days that this job will run. The
     * times are interpreted as UTC.
     *
     * @return the times value.
     */
    public List<TimeRange> getTimes() {
        return this.times;
    }

    /**
     * Set the times property: A list of Time Ranges that specify when during active days that this job will run. The
     * times are interpreted as UTC.
     *
     * @param times the times value to set.
     * @return the ChaosScheduleJob object itself.
     */
    public ChaosScheduleJob setTimes(List<TimeRange> times) {
        this.times = times;
        return this;
    }
}
