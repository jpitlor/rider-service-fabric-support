package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Describes additional filters to be applied, while listing backups, and backup storage details from where to fetch the
 * backups.
 */
@Fluent
public final class GetBackupByStorageQueryDescription {
    /*
     * Specifies the start date time in ISO8601 from which to enumerate
     * backups. If not specified, backups are enumerated from the beginning.
     */
    @JsonProperty(value = "StartDateTimeFilter")
    private OffsetDateTime startDateTimeFilter;

    /*
     * Specifies the end date time in ISO8601 till which to enumerate backups.
     * If not specified, backups are enumerated till the end.
     */
    @JsonProperty(value = "EndDateTimeFilter")
    private OffsetDateTime endDateTimeFilter;

    /*
     * If specified as true, gets the most recent backup (within the specified
     * time range) for every partition under the specified backup entity.
     */
    @JsonProperty(value = "Latest")
    private Boolean latest;

    /*
     * Describes the parameters for the backup storage from where to enumerate
     * backups. This is optional and by default backups are enumerated from the
     * backup storage where this backup entity is currently being backed up (as
     * specified in backup policy). This parameter is useful to be able to
     * enumerate backups from another cluster where you may intend to restore.
     */
    @JsonProperty(value = "Storage", required = true)
    private BackupStorageDescription storage;

    /*
     * Indicates the entity for which to enumerate backups.
     */
    @JsonProperty(value = "BackupEntity", required = true)
    private BackupEntity backupEntity;

    /**
     * Get the startDateTimeFilter property: Specifies the start date time in ISO8601 from which to enumerate backups.
     * If not specified, backups are enumerated from the beginning.
     *
     * @return the startDateTimeFilter value.
     */
    public OffsetDateTime getStartDateTimeFilter() {
        return this.startDateTimeFilter;
    }

    /**
     * Set the startDateTimeFilter property: Specifies the start date time in ISO8601 from which to enumerate backups.
     * If not specified, backups are enumerated from the beginning.
     *
     * @param startDateTimeFilter the startDateTimeFilter value to set.
     * @return the GetBackupByStorageQueryDescription object itself.
     */
    public GetBackupByStorageQueryDescription setStartDateTimeFilter(OffsetDateTime startDateTimeFilter) {
        this.startDateTimeFilter = startDateTimeFilter;
        return this;
    }

    /**
     * Get the endDateTimeFilter property: Specifies the end date time in ISO8601 till which to enumerate backups. If
     * not specified, backups are enumerated till the end.
     *
     * @return the endDateTimeFilter value.
     */
    public OffsetDateTime getEndDateTimeFilter() {
        return this.endDateTimeFilter;
    }

    /**
     * Set the endDateTimeFilter property: Specifies the end date time in ISO8601 till which to enumerate backups. If
     * not specified, backups are enumerated till the end.
     *
     * @param endDateTimeFilter the endDateTimeFilter value to set.
     * @return the GetBackupByStorageQueryDescription object itself.
     */
    public GetBackupByStorageQueryDescription setEndDateTimeFilter(OffsetDateTime endDateTimeFilter) {
        this.endDateTimeFilter = endDateTimeFilter;
        return this;
    }

    /**
     * Get the latest property: If specified as true, gets the most recent backup (within the specified time range) for
     * every partition under the specified backup entity.
     *
     * @return the latest value.
     */
    public Boolean isLatest() {
        return this.latest;
    }

    /**
     * Set the latest property: If specified as true, gets the most recent backup (within the specified time range) for
     * every partition under the specified backup entity.
     *
     * @param latest the latest value to set.
     * @return the GetBackupByStorageQueryDescription object itself.
     */
    public GetBackupByStorageQueryDescription setLatest(Boolean latest) {
        this.latest = latest;
        return this;
    }

    /**
     * Get the storage property: Describes the parameters for the backup storage from where to enumerate backups. This
     * is optional and by default backups are enumerated from the backup storage where this backup entity is currently
     * being backed up (as specified in backup policy). This parameter is useful to be able to enumerate backups from
     * another cluster where you may intend to restore.
     *
     * @return the storage value.
     */
    public BackupStorageDescription getStorage() {
        return this.storage;
    }

    /**
     * Set the storage property: Describes the parameters for the backup storage from where to enumerate backups. This
     * is optional and by default backups are enumerated from the backup storage where this backup entity is currently
     * being backed up (as specified in backup policy). This parameter is useful to be able to enumerate backups from
     * another cluster where you may intend to restore.
     *
     * @param storage the storage value to set.
     * @return the GetBackupByStorageQueryDescription object itself.
     */
    public GetBackupByStorageQueryDescription setStorage(BackupStorageDescription storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the backupEntity property: Indicates the entity for which to enumerate backups.
     *
     * @return the backupEntity value.
     */
    public BackupEntity getBackupEntity() {
        return this.backupEntity;
    }

    /**
     * Set the backupEntity property: Indicates the entity for which to enumerate backups.
     *
     * @param backupEntity the backupEntity value to set.
     * @return the GetBackupByStorageQueryDescription object itself.
     */
    public GetBackupByStorageQueryDescription setBackupEntity(BackupEntity backupEntity) {
        this.backupEntity = backupEntity;
        return this;
    }
}
