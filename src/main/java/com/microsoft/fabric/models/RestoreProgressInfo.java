package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes the progress of a restore operation on a partition. */
@Fluent
public final class RestoreProgressInfo {
    /*
     * Represents the current state of the partition restore operation.
     */
    @JsonProperty(value = "RestoreState")
    private RestoreState restoreState;

    /*
     * Timestamp when operation succeeded or failed.
     */
    @JsonProperty(value = "TimeStampUtc")
    private OffsetDateTime timeStampUtc;

    /*
     * Describes the epoch at which the partition is restored.
     */
    @JsonProperty(value = "RestoredEpoch")
    private Epoch restoredEpoch;

    /*
     * Restored LSN.
     */
    @JsonProperty(value = "RestoredLsn")
    private String restoredLsn;

    /*
     * Denotes the failure encountered in performing restore operation.
     */
    @JsonProperty(value = "FailureError")
    private FabricErrorError failureError;

    /**
     * Get the restoreState property: Represents the current state of the partition restore operation.
     *
     * @return the restoreState value.
     */
    public RestoreState getRestoreState() {
        return this.restoreState;
    }

    /**
     * Set the restoreState property: Represents the current state of the partition restore operation.
     *
     * @param restoreState the restoreState value to set.
     * @return the RestoreProgressInfo object itself.
     */
    public RestoreProgressInfo setRestoreState(RestoreState restoreState) {
        this.restoreState = restoreState;
        return this;
    }

    /**
     * Get the timeStampUtc property: Timestamp when operation succeeded or failed.
     *
     * @return the timeStampUtc value.
     */
    public OffsetDateTime getTimeStampUtc() {
        return this.timeStampUtc;
    }

    /**
     * Set the timeStampUtc property: Timestamp when operation succeeded or failed.
     *
     * @param timeStampUtc the timeStampUtc value to set.
     * @return the RestoreProgressInfo object itself.
     */
    public RestoreProgressInfo setTimeStampUtc(OffsetDateTime timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
        return this;
    }

    /**
     * Get the restoredEpoch property: Describes the epoch at which the partition is restored.
     *
     * @return the restoredEpoch value.
     */
    public Epoch getRestoredEpoch() {
        return this.restoredEpoch;
    }

    /**
     * Set the restoredEpoch property: Describes the epoch at which the partition is restored.
     *
     * @param restoredEpoch the restoredEpoch value to set.
     * @return the RestoreProgressInfo object itself.
     */
    public RestoreProgressInfo setRestoredEpoch(Epoch restoredEpoch) {
        this.restoredEpoch = restoredEpoch;
        return this;
    }

    /**
     * Get the restoredLsn property: Restored LSN.
     *
     * @return the restoredLsn value.
     */
    public String getRestoredLsn() {
        return this.restoredLsn;
    }

    /**
     * Set the restoredLsn property: Restored LSN.
     *
     * @param restoredLsn the restoredLsn value to set.
     * @return the RestoreProgressInfo object itself.
     */
    public RestoreProgressInfo setRestoredLsn(String restoredLsn) {
        this.restoredLsn = restoredLsn;
        return this;
    }

    /**
     * Get the failureError property: Denotes the failure encountered in performing restore operation.
     *
     * @return the failureError value.
     */
    public FabricErrorError getFailureError() {
        return this.failureError;
    }

    /**
     * Set the failureError property: Denotes the failure encountered in performing restore operation.
     *
     * @param failureError the failureError value to set.
     * @return the RestoreProgressInfo object itself.
     */
    public RestoreProgressInfo setFailureError(FabricErrorError failureError) {
        this.failureError = failureError;
        return this;
    }
}
