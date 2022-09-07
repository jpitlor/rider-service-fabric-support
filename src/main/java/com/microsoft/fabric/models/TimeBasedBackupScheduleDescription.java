package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Describes the time based backup schedule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ScheduleKind")
@JsonTypeName("TimeBased")
@Fluent
public final class TimeBasedBackupScheduleDescription extends BackupScheduleDescription {
    /*
     * Describes the frequency with which to run the time based backup
     * schedule.
     */
    @JsonProperty(value = "ScheduleFrequencyType", required = true)
    private BackupScheduleFrequencyType scheduleFrequencyType;

    /*
     * List of days of a week when to trigger the periodic backup. This is
     * valid only when the backup schedule frequency type is weekly.
     */
    @JsonProperty(value = "RunDays")
    private List<DayOfWeek> runDays;

    /*
     * Represents the list of exact time during the day in ISO8601 format. Like
     * '19:00:00' will represent '7PM' during the day. Date specified along
     * with time will be ignored.
     */
    @JsonProperty(value = "RunTimes", required = true)
    private List<OffsetDateTime> runTimes;

    /**
     * Get the scheduleFrequencyType property: Describes the frequency with which to run the time based backup schedule.
     *
     * @return the scheduleFrequencyType value.
     */
    public BackupScheduleFrequencyType getScheduleFrequencyType() {
        return this.scheduleFrequencyType;
    }

    /**
     * Set the scheduleFrequencyType property: Describes the frequency with which to run the time based backup schedule.
     *
     * @param scheduleFrequencyType the scheduleFrequencyType value to set.
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription setScheduleFrequencyType(
            BackupScheduleFrequencyType scheduleFrequencyType) {
        this.scheduleFrequencyType = scheduleFrequencyType;
        return this;
    }

    /**
     * Get the runDays property: List of days of a week when to trigger the periodic backup. This is valid only when the
     * backup schedule frequency type is weekly.
     *
     * @return the runDays value.
     */
    public List<DayOfWeek> getRunDays() {
        return this.runDays;
    }

    /**
     * Set the runDays property: List of days of a week when to trigger the periodic backup. This is valid only when the
     * backup schedule frequency type is weekly.
     *
     * @param runDays the runDays value to set.
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription setRunDays(List<DayOfWeek> runDays) {
        this.runDays = runDays;
        return this;
    }

    /**
     * Get the runTimes property: Represents the list of exact time during the day in ISO8601 format. Like '19:00:00'
     * will represent '7PM' during the day. Date specified along with time will be ignored.
     *
     * @return the runTimes value.
     */
    public List<OffsetDateTime> getRunTimes() {
        return this.runTimes;
    }

    /**
     * Set the runTimes property: Represents the list of exact time during the day in ISO8601 format. Like '19:00:00'
     * will represent '7PM' during the day. Date specified along with time will be ignored.
     *
     * @param runTimes the runTimes value to set.
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription setRunTimes(List<OffsetDateTime> runTimes) {
        this.runTimes = runTimes;
        return this;
    }
}
