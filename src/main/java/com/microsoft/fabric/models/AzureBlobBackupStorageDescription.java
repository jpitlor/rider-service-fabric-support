package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the parameters for Azure blob store used for storing and enumerating backups. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "StorageKind")
@JsonTypeName("AzureBlobStore")
@Fluent
public final class AzureBlobBackupStorageDescription extends BackupStorageDescription {
    /*
     * The connection string to connect to the Azure blob store.
     */
    @JsonProperty(value = "ConnectionString", required = true)
    private String connectionString;

    /*
     * The name of the container in the blob store to store and enumerate
     * backups from.
     */
    @JsonProperty(value = "ContainerName", required = true)
    private String containerName;

    /**
     * Get the connectionString property: The connection string to connect to the Azure blob store.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string to connect to the Azure blob store.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureBlobBackupStorageDescription object itself.
     */
    public AzureBlobBackupStorageDescription setConnectionString(String connectionString) {
        this.connectionString = connectionString;
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
     * @return the AzureBlobBackupStorageDescription object itself.
     */
    public AzureBlobBackupStorageDescription setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
}
