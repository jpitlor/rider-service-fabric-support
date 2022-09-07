package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Represents a backup point which can be used to trigger a restore. */
@Fluent
public final class BackupInfo {
    /*
     * Unique backup ID .
     */
    @JsonProperty(value = "BackupId")
    private UUID backupId;

    /*
     * Unique backup chain ID. All backups part of the same chain has the same
     * backup chain id. A backup chain is comprised of 1 full backup and
     * multiple incremental backups.
     */
    @JsonProperty(value = "BackupChainId")
    private UUID backupChainId;

    /*
     * Name of the Service Fabric application this partition backup belongs to.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * Name of the Service Fabric service this partition backup belongs to.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * Information about the partition to which this backup belongs to
     */
    @JsonProperty(value = "PartitionInformation")
    private PartitionInformation partitionInformation;

    /*
     * Location of the backup, relative to the backup store.
     */
    @JsonProperty(value = "BackupLocation")
    private String backupLocation;

    /*
     * Describes the type of backup, whether its full or incremental.
     */
    @JsonProperty(value = "BackupType")
    private BackupType backupType;

    /*
     * Epoch of the last record in this backup.
     */
    @JsonProperty(value = "EpochOfLastBackupRecord")
    private Epoch epochOfLastBackupRecord;

    /*
     * LSN of the last record in this backup.
     */
    @JsonProperty(value = "LsnOfLastBackupRecord")
    private String lsnOfLastBackupRecord;

    /*
     * The date time when this backup was taken.
     */
    @JsonProperty(value = "CreationTimeUtc")
    private OffsetDateTime creationTimeUtc;

    /*
     * Manifest Version of the service this partition backup belongs to.
     */
    @JsonProperty(value = "ServiceManifestVersion")
    private String serviceManifestVersion;

    /*
     * Denotes the failure encountered in getting backup point information.
     */
    @JsonProperty(value = "FailureError")
    private FabricErrorError failureError;

    /**
     * Get the backupId property: Unique backup ID .
     *
     * @return the backupId value.
     */
    public UUID getBackupId() {
        return this.backupId;
    }

    /**
     * Set the backupId property: Unique backup ID .
     *
     * @param backupId the backupId value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setBackupId(UUID backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * Get the backupChainId property: Unique backup chain ID. All backups part of the same chain has the same backup
     * chain id. A backup chain is comprised of 1 full backup and multiple incremental backups.
     *
     * @return the backupChainId value.
     */
    public UUID getBackupChainId() {
        return this.backupChainId;
    }

    /**
     * Set the backupChainId property: Unique backup chain ID. All backups part of the same chain has the same backup
     * chain id. A backup chain is comprised of 1 full backup and multiple incremental backups.
     *
     * @param backupChainId the backupChainId value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setBackupChainId(UUID backupChainId) {
        this.backupChainId = backupChainId;
        return this;
    }

    /**
     * Get the applicationName property: Name of the Service Fabric application this partition backup belongs to.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: Name of the Service Fabric application this partition backup belongs to.
     *
     * @param applicationName the applicationName value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the serviceName property: Name of the Service Fabric service this partition backup belongs to.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Name of the Service Fabric service this partition backup belongs to.
     *
     * @param serviceName the serviceName value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the partitionInformation property: Information about the partition to which this backup belongs to.
     *
     * @return the partitionInformation value.
     */
    public PartitionInformation getPartitionInformation() {
        return this.partitionInformation;
    }

    /**
     * Set the partitionInformation property: Information about the partition to which this backup belongs to.
     *
     * @param partitionInformation the partitionInformation value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setPartitionInformation(PartitionInformation partitionInformation) {
        this.partitionInformation = partitionInformation;
        return this;
    }

    /**
     * Get the backupLocation property: Location of the backup, relative to the backup store.
     *
     * @return the backupLocation value.
     */
    public String getBackupLocation() {
        return this.backupLocation;
    }

    /**
     * Set the backupLocation property: Location of the backup, relative to the backup store.
     *
     * @param backupLocation the backupLocation value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setBackupLocation(String backupLocation) {
        this.backupLocation = backupLocation;
        return this;
    }

    /**
     * Get the backupType property: Describes the type of backup, whether its full or incremental.
     *
     * @return the backupType value.
     */
    public BackupType getBackupType() {
        return this.backupType;
    }

    /**
     * Set the backupType property: Describes the type of backup, whether its full or incremental.
     *
     * @param backupType the backupType value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setBackupType(BackupType backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * Get the epochOfLastBackupRecord property: Epoch of the last record in this backup.
     *
     * @return the epochOfLastBackupRecord value.
     */
    public Epoch getEpochOfLastBackupRecord() {
        return this.epochOfLastBackupRecord;
    }

    /**
     * Set the epochOfLastBackupRecord property: Epoch of the last record in this backup.
     *
     * @param epochOfLastBackupRecord the epochOfLastBackupRecord value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setEpochOfLastBackupRecord(Epoch epochOfLastBackupRecord) {
        this.epochOfLastBackupRecord = epochOfLastBackupRecord;
        return this;
    }

    /**
     * Get the lsnOfLastBackupRecord property: LSN of the last record in this backup.
     *
     * @return the lsnOfLastBackupRecord value.
     */
    public String getLsnOfLastBackupRecord() {
        return this.lsnOfLastBackupRecord;
    }

    /**
     * Set the lsnOfLastBackupRecord property: LSN of the last record in this backup.
     *
     * @param lsnOfLastBackupRecord the lsnOfLastBackupRecord value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setLsnOfLastBackupRecord(String lsnOfLastBackupRecord) {
        this.lsnOfLastBackupRecord = lsnOfLastBackupRecord;
        return this;
    }

    /**
     * Get the creationTimeUtc property: The date time when this backup was taken.
     *
     * @return the creationTimeUtc value.
     */
    public OffsetDateTime getCreationTimeUtc() {
        return this.creationTimeUtc;
    }

    /**
     * Set the creationTimeUtc property: The date time when this backup was taken.
     *
     * @param creationTimeUtc the creationTimeUtc value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setCreationTimeUtc(OffsetDateTime creationTimeUtc) {
        this.creationTimeUtc = creationTimeUtc;
        return this;
    }

    /**
     * Get the serviceManifestVersion property: Manifest Version of the service this partition backup belongs to.
     *
     * @return the serviceManifestVersion value.
     */
    public String getServiceManifestVersion() {
        return this.serviceManifestVersion;
    }

    /**
     * Set the serviceManifestVersion property: Manifest Version of the service this partition backup belongs to.
     *
     * @param serviceManifestVersion the serviceManifestVersion value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setServiceManifestVersion(String serviceManifestVersion) {
        this.serviceManifestVersion = serviceManifestVersion;
        return this;
    }

    /**
     * Get the failureError property: Denotes the failure encountered in getting backup point information.
     *
     * @return the failureError value.
     */
    public FabricErrorError getFailureError() {
        return this.failureError;
    }

    /**
     * Set the failureError property: Denotes the failure encountered in getting backup point information.
     *
     * @param failureError the failureError value to set.
     * @return the BackupInfo object itself.
     */
    public BackupInfo setFailureError(FabricErrorError failureError) {
        this.failureError = failureError;
        return this;
    }
}
