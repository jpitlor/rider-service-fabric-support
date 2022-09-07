package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the image store content. */
@Fluent
public final class ImageStoreContent {
    /*
     * The list of image store file info objects represents files found under
     * the given image store relative path.
     */
    @JsonProperty(value = "StoreFiles")
    private List<FileInfo> storeFiles;

    /*
     * The list of image store folder info objects represents subfolders found
     * under the given image store relative path.
     */
    @JsonProperty(value = "StoreFolders")
    private List<FolderInfo> storeFolders;

    /**
     * Get the storeFiles property: The list of image store file info objects represents files found under the given
     * image store relative path.
     *
     * @return the storeFiles value.
     */
    public List<FileInfo> getStoreFiles() {
        return this.storeFiles;
    }

    /**
     * Set the storeFiles property: The list of image store file info objects represents files found under the given
     * image store relative path.
     *
     * @param storeFiles the storeFiles value to set.
     * @return the ImageStoreContent object itself.
     */
    public ImageStoreContent setStoreFiles(List<FileInfo> storeFiles) {
        this.storeFiles = storeFiles;
        return this;
    }

    /**
     * Get the storeFolders property: The list of image store folder info objects represents subfolders found under the
     * given image store relative path.
     *
     * @return the storeFolders value.
     */
    public List<FolderInfo> getStoreFolders() {
        return this.storeFolders;
    }

    /**
     * Set the storeFolders property: The list of image store folder info objects represents subfolders found under the
     * given image store relative path.
     *
     * @param storeFolders the storeFolders value to set.
     * @return the ImageStoreContent object itself.
     */
    public ImageStoreContent setStoreFolders(List<FolderInfo> storeFolders) {
        this.storeFolders = storeFolders;
        return this;
    }
}
