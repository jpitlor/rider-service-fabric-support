package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackupStorageKind. */
public final class BackupStorageKind extends ExpandableStringEnum<BackupStorageKind> {
    /** Static value Invalid for BackupStorageKind. */
    public static final BackupStorageKind INVALID = fromString("Invalid");

    /** Static value FileShare for BackupStorageKind. */
    public static final BackupStorageKind FILE_SHARE = fromString("FileShare");

    /** Static value AzureBlobStore for BackupStorageKind. */
    public static final BackupStorageKind AZURE_BLOB_STORE = fromString("AzureBlobStore");

    /** Static value DsmsAzureBlobStore for BackupStorageKind. */
    public static final BackupStorageKind DSMS_AZURE_BLOB_STORE = fromString("DsmsAzureBlobStore");

    /** Static value ManagedIdentityAzureBlobStore for BackupStorageKind. */
    public static final BackupStorageKind MANAGED_IDENTITY_AZURE_BLOB_STORE =
            fromString("ManagedIdentityAzureBlobStore");

    /**
     * Creates or finds a BackupStorageKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupStorageKind.
     */
    @JsonCreator
    public static BackupStorageKind fromString(String name) {
        return fromString(name, BackupStorageKind.class);
    }

    /**
     * Gets known BackupStorageKind values.
     *
     * @return known BackupStorageKind values.
     */
    public static Collection<BackupStorageKind> values() {
        return values(BackupStorageKind.class);
    }
}
