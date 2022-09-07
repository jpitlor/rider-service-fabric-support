package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for triggering partition's backup. */
@Fluent
public final class BackupPartitionDescription {
    /*
     * Specifies the details of the backup storage where to save the backup.
     */
    @JsonProperty(value = "BackupStorage")
    private BackupStorageDescription backupStorage;

    /**
     * Get the backupStorage property: Specifies the details of the backup storage where to save the backup.
     *
     * @return the backupStorage value.
     */
    public BackupStorageDescription getBackupStorage() {
        return this.backupStorage;
    }

    /**
     * Set the backupStorage property: Specifies the details of the backup storage where to save the backup.
     *
     * @param backupStorage the backupStorage value to set.
     * @return the BackupPartitionDescription object itself.
     */
    public BackupPartitionDescription setBackupStorage(BackupStorageDescription backupStorage) {
        this.backupStorage = backupStorage;
        return this;
    }
}
