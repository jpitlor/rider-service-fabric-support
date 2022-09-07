package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Describes the frequency based backup schedule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ScheduleKind")
@JsonTypeName("FrequencyBased")
@Fluent
public final class FrequencyBasedBackupScheduleDescription extends BackupScheduleDescription {
    /*
     * Defines the interval with which backups are periodically taken. It
     * should be specified in ISO8601 format. Timespan in seconds is not
     * supported and will be ignored while creating the policy.
     */
    @JsonProperty(value = "Interval", required = true)
    private Duration interval;

    /**
     * Get the interval property: Defines the interval with which backups are periodically taken. It should be specified
     * in ISO8601 format. Timespan in seconds is not supported and will be ignored while creating the policy.
     *
     * @return the interval value.
     */
    public Duration getInterval() {
        return this.interval;
    }

    /**
     * Set the interval property: Defines the interval with which backups are periodically taken. It should be specified
     * in ISO8601 format. Timespan in seconds is not supported and will be ignored while creating the policy.
     *
     * @param interval the interval value to set.
     * @return the FrequencyBasedBackupScheduleDescription object itself.
     */
    public FrequencyBasedBackupScheduleDescription setInterval(Duration interval) {
        this.interval = interval;
        return this;
    }
}
