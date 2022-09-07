package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information of a image store folder size. */
@Fluent
public final class FolderSizeInfo {
    /*
     * The remote location within image store. This path is relative to the
     * image store root.
     */
    @JsonProperty(value = "StoreRelativePath")
    private String storeRelativePath;

    /*
     * The size of folder in bytes.
     */
    @JsonProperty(value = "FolderSize")
    private String folderSize;

    /**
     * Get the storeRelativePath property: The remote location within image store. This path is relative to the image
     * store root.
     *
     * @return the storeRelativePath value.
     */
    public String getStoreRelativePath() {
        return this.storeRelativePath;
    }

    /**
     * Set the storeRelativePath property: The remote location within image store. This path is relative to the image
     * store root.
     *
     * @param storeRelativePath the storeRelativePath value to set.
     * @return the FolderSizeInfo object itself.
     */
    public FolderSizeInfo setStoreRelativePath(String storeRelativePath) {
        this.storeRelativePath = storeRelativePath;
        return this;
    }

    /**
     * Get the folderSize property: The size of folder in bytes.
     *
     * @return the folderSize value.
     */
    public String getFolderSize() {
        return this.folderSize;
    }

    /**
     * Set the folderSize property: The size of folder in bytes.
     *
     * @param folderSize the folderSize value to set.
     * @return the FolderSizeInfo object itself.
     */
    public FolderSizeInfo setFolderSize(String folderSize) {
        this.folderSize = folderSize;
        return this;
    }
}
