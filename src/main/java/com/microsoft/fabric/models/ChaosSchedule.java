package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Defines the schedule used by Chaos. */
@Fluent
public final class ChaosSchedule {
    /*
     * The date and time Chaos will start using this schedule.
     */
    @JsonProperty(value = "StartDate")
    private OffsetDateTime startDate;

    /*
     * The date and time Chaos will continue to use this schedule until.
     */
    @JsonProperty(value = "ExpiryDate")
    private OffsetDateTime expiryDate;

    /*
     * A mapping of string names to Chaos Parameters to be referenced by Chaos
     * Schedule Jobs.
     */
    @JsonProperty(value = "ChaosParametersDictionary")
    private List<ChaosParametersDictionaryItem> chaosParametersDictionary;

    /*
     * A list of all Chaos Schedule Jobs that will be automated by the
     * schedule.
     */
    @JsonProperty(value = "Jobs")
    private List<ChaosScheduleJob> jobs;

    /**
     * Get the startDate property: The date and time Chaos will start using this schedule.
     *
     * @return the startDate value.
     */
    public OffsetDateTime getStartDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The date and time Chaos will start using this schedule.
     *
     * @param startDate the startDate value to set.
     * @return the ChaosSchedule object itself.
     */
    public ChaosSchedule setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the expiryDate property: The date and time Chaos will continue to use this schedule until.
     *
     * @return the expiryDate value.
     */
    public OffsetDateTime getExpiryDate() {
        return this.expiryDate;
    }

    /**
     * Set the expiryDate property: The date and time Chaos will continue to use this schedule until.
     *
     * @param expiryDate the expiryDate value to set.
     * @return the ChaosSchedule object itself.
     */
    public ChaosSchedule setExpiryDate(OffsetDateTime expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get the chaosParametersDictionary property: A mapping of string names to Chaos Parameters to be referenced by
     * Chaos Schedule Jobs.
     *
     * @return the chaosParametersDictionary value.
     */
    public List<ChaosParametersDictionaryItem> getChaosParametersDictionary() {
        return this.chaosParametersDictionary;
    }

    /**
     * Set the chaosParametersDictionary property: A mapping of string names to Chaos Parameters to be referenced by
     * Chaos Schedule Jobs.
     *
     * @param chaosParametersDictionary the chaosParametersDictionary value to set.
     * @return the ChaosSchedule object itself.
     */
    public ChaosSchedule setChaosParametersDictionary(List<ChaosParametersDictionaryItem> chaosParametersDictionary) {
        this.chaosParametersDictionary = chaosParametersDictionary;
        return this;
    }

    /**
     * Get the jobs property: A list of all Chaos Schedule Jobs that will be automated by the schedule.
     *
     * @return the jobs value.
     */
    public List<ChaosScheduleJob> getJobs() {
        return this.jobs;
    }

    /**
     * Set the jobs property: A list of all Chaos Schedule Jobs that will be automated by the schedule.
     *
     * @param jobs the jobs value to set.
     * @return the ChaosSchedule object itself.
     */
    public ChaosSchedule setJobs(List<ChaosScheduleJob> jobs) {
        this.jobs = jobs;
        return this;
    }
}
