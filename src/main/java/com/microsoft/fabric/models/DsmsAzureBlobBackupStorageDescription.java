package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the parameters for Dsms Azure blob store used for storing and enumerating backups. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "StorageKind")
@JsonTypeName("DsmsAzureBlobStore")
@Fluent
public final class DsmsAzureBlobBackupStorageDescription extends BackupStorageDescription {
    /*
     * The source location of the storage credentials to connect to the Dsms
     * Azure blob store.
     */
    @JsonProperty(value = "StorageCredentialsSourceLocation", required = true)
    private String storageCredentialsSourceLocation;

    /*
     * The name of the container in the blob store to store and enumerate
     * backups from.
     */
    @JsonProperty(value = "ContainerName", required = true)
    private String containerName;

    /**
     * Get the storageCredentialsSourceLocation property: The source location of the storage credentials to connect to
     * the Dsms Azure blob store.
     *
     * @return the storageCredentialsSourceLocation value.
     */
    public String getStorageCredentialsSourceLocation() {
        return this.storageCredentialsSourceLocation;
    }

    /**
     * Set the storageCredentialsSourceLocation property: The source location of the storage credentials to connect to
     * the Dsms Azure blob store.
     *
     * @param storageCredentialsSourceLocation the storageCredentialsSourceLocation value to set.
     * @return the DsmsAzureBlobBackupStorageDescription object itself.
     */
    public DsmsAzureBlobBackupStorageDescription setStorageCredentialsSourceLocation(
            String storageCredentialsSourceLocation) {
        this.storageCredentialsSourceLocation = storageCredentialsSourceLocation;
        return this;
    }

    /**
     * Get the containerName property: The name of the container in the blob store to store and enumerate backups from.
     *
     * @return the containerName value.
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The name of the container in the blob store to store and enumerate backups from.
     *
     * @param containerName the containerName value to set.
     * @return the DsmsAzureBlobBackupStorageDescription object itself.
     */
    public DsmsAzureBlobBackupStorageDescription setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
}
