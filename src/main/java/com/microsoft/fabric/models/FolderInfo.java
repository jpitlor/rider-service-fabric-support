package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a image store folder. It includes how many files this folder contains and its image store relative
 * path.
 */
@Fluent
public final class FolderInfo {
    /*
     * The remote location within image store. This path is relative to the
     * image store root.
     */
    @JsonProperty(value = "StoreRelativePath")
    private String storeRelativePath;

    /*
     * The number of files from within the image store folder.
     */
    @JsonProperty(value = "FileCount")
    private String fileCount;

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
     * @return the FolderInfo object itself.
     */
    public FolderInfo setStoreRelativePath(String storeRelativePath) {
        this.storeRelativePath = storeRelativePath;
        return this;
    }

    /**
     * Get the fileCount property: The number of files from within the image store folder.
     *
     * @return the fileCount value.
     */
    public String getFileCount() {
        return this.fileCount;
    }

    /**
     * Set the fileCount property: The number of files from within the image store folder.
     *
     * @param fileCount the fileCount value to set.
     * @return the FolderInfo object itself.
     */
    public FolderInfo setFileCount(String fileCount) {
        this.fileCount = fileCount;
        return this;
    }
}
