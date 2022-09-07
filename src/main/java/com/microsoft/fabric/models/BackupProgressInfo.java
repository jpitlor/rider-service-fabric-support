package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Describes the progress of a partition's backup. */
@Fluent
public final class BackupProgressInfo {
    /*
     * Represents the current state of the partition backup operation.
     */
    @JsonProperty(value = "BackupState")
    private BackupState backupState;

    /*
     * TimeStamp in UTC when operation succeeded or failed.
     */
    @JsonProperty(value = "TimeStampUtc")
    private OffsetDateTime timeStampUtc;

    /*
     * Unique ID of the newly created backup.
     */
    @JsonProperty(value = "BackupId")
    private UUID backupId;

    /*
     * Location, relative to the backup store, of the newly created backup.
     */
    @JsonProperty(value = "BackupLocation")
    private String backupLocation;

    /*
     * Specifies the epoch of the last record included in backup.
     */
    @JsonProperty(value = "EpochOfLastBackupRecord")
    private Epoch epochOfLastBackupRecord;

    /*
     * The LSN of last record included in backup.
     */
    @JsonProperty(value = "LsnOfLastBackupRecord")
    private String lsnOfLastBackupRecord;

    /*
     * Denotes the failure encountered in performing backup operation.
     */
    @JsonProperty(value = "FailureError")
    private FabricErrorError failureError;

    /**
     * Get the backupState property: Represents the current state of the partition backup operation.
     *
     * @return the backupState value.
     */
    public BackupState getBackupState() {
        return this.backupState;
    }

    /**
     * Set the backupState property: Represents the current state of the partition backup operation.
     *
     * @param backupState the backupState value to set.
     * @return the BackupProgressInfo object itself.
     */
    public BackupProgressInfo setBackupState(BackupState backupState) {
        this.backupState = backupState;
        return this;
    }

    /**
     * Get the timeStampUtc property: TimeStamp in UTC when operation succeeded or failed.
     *
     * @return the timeStampUtc value.
     */
    public OffsetDateTime getTimeStampUtc() {
        return this.timeStampUtc;
    }

    /**
     * Set the timeStampUtc property: TimeStamp in UTC when operation succeeded or failed.
     *
     * @param timeStampUtc the timeStampUtc value to set.
     * @return the BackupProgressInfo object itself.
     */
    public BackupProgressInfo setTimeStampUtc(OffsetDateTime timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
        return this;
    }

    /**
     * Get the backupId property: Unique ID of the newly created backup.
     *
     * @return the backupId value.
     */
    public UUID getBackupId() {
        return this.backupId;
    }

    /**
     * Set the backupId property: Unique ID of the newly created backup.
     *
     * @param backupId the backupId value to set.
     * @return the BackupProgressInfo object itself.
     */
    public BackupProgressInfo setBackupId(UUID backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * Get the backupLocation property: Location, relative to the backup store, of the newly created backup.
     *
     * @return the backupLocation value.
     */
    public String getBackupLocation() {
        return this.backupLocation;
    }

    /**
     * Set the backupLocation property: Location, relative to the backup store, of the newly created backup.
     *
     * @param backupLocation the backupLocation value to set.
     * @return the BackupProgressInfo object itself.
     */
    public BackupProgressInfo setBackupLocation(String backupLocation) {
        this.backupLocation = backupLocation;
        return this;
    }

    /**
     * Get the epochOfLastBackupRecord property: Specifies the epoch of the last record included in backup.
     *
     * @return the epochOfLastBackupRecord value.
     */
    public Epoch getEpochOfLastBackupRecord() {
        return this.epochOfLastBackupRecord;
    }

    /**
     * Set the epochOfLastBackupRecord property: Specifies the epoch of the last record included in backup.
     *
     * @param epochOfLastBackupRecord the epochOfLastBackupRecord value to set.
     * @return the BackupProgressInfo object itself.
     */
    public BackupProgressInfo setEpochOfLastBackupRecord(Epoch epochOfLastBackupRecord) {
        this.epochOfLastBackupRecord = epochOfLastBackupRecord;
        return this;
    }

    /**
     * Get the lsnOfLastBackupRecord property: The LSN of last record included in backup.
     *
     * @return the lsnOfLastBackupRecord value.
     */
    public String getLsnOfLastBackupRecord() {
        return this.lsnOfLastBackupRecord;
    }

    /**
     * Set the lsnOfLastBackupRecord property: The LSN of last record included in backup.
     *
     * @param lsnOfLastBackupRecord the lsnOfLastBackupRecord value to set.
     * @return the BackupProgressInfo object itself.
     */
    public BackupProgressInfo setLsnOfLastBackupRecord(String lsnOfLastBackupRecord) {
        this.lsnOfLastBackupRecord = lsnOfLastBackupRecord;
        return this;
    }

    /**
     * Get the failureError property: Denotes the failure encountered in performing backup operation.
     *
     * @return the failureError value.
     */
    public FabricErrorError getFailureError() {
        return this.failureError;
    }

    /**
     * Set the failureError property: Denotes the failure encountered in performing backup operation.
     *
     * @param failureError the failureError value to set.
     * @return the BackupProgressInfo object itself.
     */
    public BackupProgressInfo setFailureError(FabricErrorError failureError) {
        this.failureError = failureError;
        return this;
    }
}
