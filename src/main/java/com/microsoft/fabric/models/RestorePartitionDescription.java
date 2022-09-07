package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Specifies the parameters needed to trigger a restore of a specific partition. */
@Fluent
public final class RestorePartitionDescription {
    /*
     * Unique backup ID.
     */
    @JsonProperty(value = "BackupId", required = true)
    private UUID backupId;

    /*
     * Location of the backup relative to the backup storage specified/
     * configured.
     */
    @JsonProperty(value = "BackupLocation", required = true)
    private String backupLocation;

    /*
     * Location of the backup from where the partition will be restored.
     */
    @JsonProperty(value = "BackupStorage")
    private BackupStorageDescription backupStorage;

    /**
     * Get the backupId property: Unique backup ID.
     *
     * @return the backupId value.
     */
    public UUID getBackupId() {
        return this.backupId;
    }

    /**
     * Set the backupId property: Unique backup ID.
     *
     * @param backupId the backupId value to set.
     * @return the RestorePartitionDescription object itself.
     */
    public RestorePartitionDescription setBackupId(UUID backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * Get the backupLocation property: Location of the backup relative to the backup storage specified/ configured.
     *
     * @return the backupLocation value.
     */
    public String getBackupLocation() {
        return this.backupLocation;
    }

    /**
     * Set the backupLocation property: Location of the backup relative to the backup storage specified/ configured.
     *
     * @param backupLocation the backupLocation value to set.
     * @return the RestorePartitionDescription object itself.
     */
    public RestorePartitionDescription setBackupLocation(String backupLocation) {
        this.backupLocation = backupLocation;
        return this;
    }

    /**
     * Get the backupStorage property: Location of the backup from where the partition will be restored.
     *
     * @return the backupStorage value.
     */
    public BackupStorageDescription getBackupStorage() {
        return this.backupStorage;
    }

    /**
     * Set the backupStorage property: Location of the backup from where the partition will be restored.
     *
     * @param backupStorage the backupStorage value to set.
     * @return the RestorePartitionDescription object itself.
     */
    public RestorePartitionDescription setBackupStorage(BackupStorageDescription backupStorage) {
        this.backupStorage = backupStorage;
        return this;
    }
}
