package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a backup policy for configuring periodic backup. */
@Fluent
public final class BackupPolicyDescription {
    /*
     * The unique name identifying this backup policy.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * Specifies whether to trigger restore automatically using the latest
     * available backup in case the partition experiences a data loss event.
     */
    @JsonProperty(value = "AutoRestoreOnDataLoss", required = true)
    private boolean autoRestoreOnDataLoss;

    /*
     * Defines the maximum number of incremental backups to be taken between
     * two full backups. This is just the upper limit. A full backup may be
     * taken before specified number of incremental backups are completed in
     * one of the following conditions
     * - The replica has never taken a full backup since it has become primary,
     * - Some of the log records since the last backup has been truncated, or
     * - Replica passed the MaxAccumulatedBackupLogSizeInMB limit.
     */
    @JsonProperty(value = "MaxIncrementalBackups", required = true)
    private int maxIncrementalBackups;

    /*
     * Describes the backup schedule parameters.
     */
    @JsonProperty(value = "Schedule", required = true)
    private BackupScheduleDescription schedule;

    /*
     * Describes the details of backup storage where to store the periodic
     * backups.
     */
    @JsonProperty(value = "Storage", required = true)
    private BackupStorageDescription storage;

    /*
     * Describes the policy to retain backups in storage.
     */
    @JsonProperty(value = "RetentionPolicy")
    private RetentionPolicyDescription retentionPolicy;

    /**
     * Get the name property: The unique name identifying this backup policy.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The unique name identifying this backup policy.
     *
     * @param name the name value to set.
     * @return the BackupPolicyDescription object itself.
     */
    public BackupPolicyDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the autoRestoreOnDataLoss property: Specifies whether to trigger restore automatically using the latest
     * available backup in case the partition experiences a data loss event.
     *
     * @return the autoRestoreOnDataLoss value.
     */
    public boolean isAutoRestoreOnDataLoss() {
        return this.autoRestoreOnDataLoss;
    }

    /**
     * Set the autoRestoreOnDataLoss property: Specifies whether to trigger restore automatically using the latest
     * available backup in case the partition experiences a data loss event.
     *
     * @param autoRestoreOnDataLoss the autoRestoreOnDataLoss value to set.
     * @return the BackupPolicyDescription object itself.
     */
    public BackupPolicyDescription setAutoRestoreOnDataLoss(boolean autoRestoreOnDataLoss) {
        this.autoRestoreOnDataLoss = autoRestoreOnDataLoss;
        return this;
    }

    /**
     * Get the maxIncrementalBackups property: Defines the maximum number of incremental backups to be taken between two
     * full backups. This is just the upper limit. A full backup may be taken before specified number of incremental
     * backups are completed in one of the following conditions - The replica has never taken a full backup since it has
     * become primary, - Some of the log records since the last backup has been truncated, or - Replica passed the
     * MaxAccumulatedBackupLogSizeInMB limit.
     *
     * @return the maxIncrementalBackups value.
     */
    public int getMaxIncrementalBackups() {
        return this.maxIncrementalBackups;
    }

    /**
     * Set the maxIncrementalBackups property: Defines the maximum number of incremental backups to be taken between two
     * full backups. This is just the upper limit. A full backup may be taken before specified number of incremental
     * backups are completed in one of the following conditions - The replica has never taken a full backup since it has
     * become primary, - Some of the log records since the last backup has been truncated, or - Replica passed the
     * MaxAccumulatedBackupLogSizeInMB limit.
     *
     * @param maxIncrementalBackups the maxIncrementalBackups value to set.
     * @return the BackupPolicyDescription object itself.
     */
    public BackupPolicyDescription setMaxIncrementalBackups(int maxIncrementalBackups) {
        this.maxIncrementalBackups = maxIncrementalBackups;
        return this;
    }

    /**
     * Get the schedule property: Describes the backup schedule parameters.
     *
     * @return the schedule value.
     */
    public BackupScheduleDescription getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Describes the backup schedule parameters.
     *
     * @param schedule the schedule value to set.
     * @return the BackupPolicyDescription object itself.
     */
    public BackupPolicyDescription setSchedule(BackupScheduleDescription schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the storage property: Describes the details of backup storage where to store the periodic backups.
     *
     * @return the storage value.
     */
    public BackupStorageDescription getStorage() {
        return this.storage;
    }

    /**
     * Set the storage property: Describes the details of backup storage where to store the periodic backups.
     *
     * @param storage the storage value to set.
     * @return the BackupPolicyDescription object itself.
     */
    public BackupPolicyDescription setStorage(BackupStorageDescription storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the retentionPolicy property: Describes the policy to retain backups in storage.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicyDescription getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Describes the policy to retain backups in storage.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the BackupPolicyDescription object itself.
     */
    public BackupPolicyDescription setRetentionPolicy(RetentionPolicyDescription retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
}
