package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the parameters for the backup storage. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "StorageKind",
        defaultImpl = BackupStorageDescription.class)
@JsonTypeName("BackupStorageDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureBlobStore", value = AzureBlobBackupStorageDescription.class),
    @JsonSubTypes.Type(name = "FileShare", value = FileShareBackupStorageDescription.class),
    @JsonSubTypes.Type(name = "DsmsAzureBlobStore", value = DsmsAzureBlobBackupStorageDescription.class),
    @JsonSubTypes.Type(
            name = "ManagedIdentityAzureBlobStore",
            value = ManagedIdentityAzureBlobBackupStorageDescription.class)
})
@Fluent
public class BackupStorageDescription {
    /*
     * Friendly name for this backup storage.
     */
    @JsonProperty(value = "FriendlyName")
    private String friendlyName;

    /**
     * Get the friendlyName property: Friendly name for this backup storage.
     *
     * @return the friendlyName value.
     */
    public String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name for this backup storage.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the BackupStorageDescription object itself.
     */
    public BackupStorageDescription setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }
}
