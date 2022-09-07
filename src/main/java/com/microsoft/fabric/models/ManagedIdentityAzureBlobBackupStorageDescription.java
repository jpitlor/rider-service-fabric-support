package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the parameters for Azure blob store (connected using managed identity) used for storing and enumerating
 * backups.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "StorageKind")
@JsonTypeName("ManagedIdentityAzureBlobStore")
@Fluent
public final class ManagedIdentityAzureBlobBackupStorageDescription extends BackupStorageDescription {
    /*
     * The type of managed identity to be used to connect to Azure Blob Store
     * via Managed Identity.
     */
    @JsonProperty(value = "ManagedIdentityType", required = true)
    private ManagedIdentityType managedIdentityType;

    /*
     * The Blob Service Uri to connect to the Azure blob store..
     */
    @JsonProperty(value = "BlobServiceUri", required = true)
    private String blobServiceUri;

    /*
     * The name of the container in the blob store to store and enumerate
     * backups from.
     */
    @JsonProperty(value = "ContainerName", required = true)
    private String containerName;

    /**
     * Get the managedIdentityType property: The type of managed identity to be used to connect to Azure Blob Store via
     * Managed Identity.
     *
     * @return the managedIdentityType value.
     */
    public ManagedIdentityType getManagedIdentityType() {
        return this.managedIdentityType;
    }

    /**
     * Set the managedIdentityType property: The type of managed identity to be used to connect to Azure Blob Store via
     * Managed Identity.
     *
     * @param managedIdentityType the managedIdentityType value to set.
     * @return the ManagedIdentityAzureBlobBackupStorageDescription object itself.
     */
    public ManagedIdentityAzureBlobBackupStorageDescription setManagedIdentityType(
            ManagedIdentityType managedIdentityType) {
        this.managedIdentityType = managedIdentityType;
        return this;
    }

    /**
     * Get the blobServiceUri property: The Blob Service Uri to connect to the Azure blob store..
     *
     * @return the blobServiceUri value.
     */
    public String getBlobServiceUri() {
        return this.blobServiceUri;
    }

    /**
     * Set the blobServiceUri property: The Blob Service Uri to connect to the Azure blob store..
     *
     * @param blobServiceUri the blobServiceUri value to set.
     * @return the ManagedIdentityAzureBlobBackupStorageDescription object itself.
     */
    public ManagedIdentityAzureBlobBackupStorageDescription setBlobServiceUri(String blobServiceUri) {
        this.blobServiceUri = blobServiceUri;
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
     * @return the ManagedIdentityAzureBlobBackupStorageDescription object itself.
     */
    public ManagedIdentityAzureBlobBackupStorageDescription setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
}
