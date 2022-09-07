package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Describes basic retention policy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "RetentionPolicyType")
@JsonTypeName("Basic")
@Fluent
public final class BasicRetentionPolicyDescription extends RetentionPolicyDescription {
    /*
     * It is the minimum duration for which a backup created, will remain
     * stored in the storage and might get deleted after that span of time. It
     * should be specified in ISO8601 format.
     */
    @JsonProperty(value = "RetentionDuration", required = true)
    private Duration retentionDuration;

    /*
     * It is the minimum number of backups to be retained at any point of time.
     * If specified with a non zero value, backups will not be deleted even if
     * the backups have gone past retention duration and have number of backups
     * less than or equal to it.
     */
    @JsonProperty(value = "MinimumNumberOfBackups")
    private Integer minimumNumberOfBackups;

    /**
     * Get the retentionDuration property: It is the minimum duration for which a backup created, will remain stored in
     * the storage and might get deleted after that span of time. It should be specified in ISO8601 format.
     *
     * @return the retentionDuration value.
     */
    public Duration getRetentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set the retentionDuration property: It is the minimum duration for which a backup created, will remain stored in
     * the storage and might get deleted after that span of time. It should be specified in ISO8601 format.
     *
     * @param retentionDuration the retentionDuration value to set.
     * @return the BasicRetentionPolicyDescription object itself.
     */
    public BasicRetentionPolicyDescription setRetentionDuration(Duration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

    /**
     * Get the minimumNumberOfBackups property: It is the minimum number of backups to be retained at any point of time.
     * If specified with a non zero value, backups will not be deleted even if the backups have gone past retention
     * duration and have number of backups less than or equal to it.
     *
     * @return the minimumNumberOfBackups value.
     */
    public Integer getMinimumNumberOfBackups() {
        return this.minimumNumberOfBackups;
    }

    /**
     * Set the minimumNumberOfBackups property: It is the minimum number of backups to be retained at any point of time.
     * If specified with a non zero value, backups will not be deleted even if the backups have gone past retention
     * duration and have number of backups less than or equal to it.
     *
     * @param minimumNumberOfBackups the minimumNumberOfBackups value to set.
     * @return the BasicRetentionPolicyDescription object itself.
     */
    public BasicRetentionPolicyDescription setMinimumNumberOfBackups(Integer minimumNumberOfBackups) {
        this.minimumNumberOfBackups = minimumNumberOfBackups;
        return this;
    }
}
