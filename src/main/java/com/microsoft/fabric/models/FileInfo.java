package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Information about a image store file. */
@Fluent
public final class FileInfo {
    /*
     * The size of file in bytes.
     */
    @JsonProperty(value = "FileSize")
    private String fileSize;

    /*
     * Information about the version of image store file.
     */
    @JsonProperty(value = "FileVersion")
    private FileVersion fileVersion;

    /*
     * The date and time when the image store file was last modified.
     */
    @JsonProperty(value = "ModifiedDate")
    private OffsetDateTime modifiedDate;

    /*
     * The file path relative to the image store root path.
     */
    @JsonProperty(value = "StoreRelativePath")
    private String storeRelativePath;

    /**
     * Get the fileSize property: The size of file in bytes.
     *
     * @return the fileSize value.
     */
    public String getFileSize() {
        return this.fileSize;
    }

    /**
     * Set the fileSize property: The size of file in bytes.
     *
     * @param fileSize the fileSize value to set.
     * @return the FileInfo object itself.
     */
    public FileInfo setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * Get the fileVersion property: Information about the version of image store file.
     *
     * @return the fileVersion value.
     */
    public FileVersion getFileVersion() {
        return this.fileVersion;
    }

    /**
     * Set the fileVersion property: Information about the version of image store file.
     *
     * @param fileVersion the fileVersion value to set.
     * @return the FileInfo object itself.
     */
    public FileInfo setFileVersion(FileVersion fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }

    /**
     * Get the modifiedDate property: The date and time when the image store file was last modified.
     *
     * @return the modifiedDate value.
     */
    public OffsetDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Set the modifiedDate property: The date and time when the image store file was last modified.
     *
     * @param modifiedDate the modifiedDate value to set.
     * @return the FileInfo object itself.
     */
    public FileInfo setModifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Get the storeRelativePath property: The file path relative to the image store root path.
     *
     * @return the storeRelativePath value.
     */
    public String getStoreRelativePath() {
        return this.storeRelativePath;
    }

    /**
     * Set the storeRelativePath property: The file path relative to the image store root path.
     *
     * @param storeRelativePath the storeRelativePath value to set.
     * @return the FileInfo object itself.
     */
    public FileInfo setStoreRelativePath(String storeRelativePath) {
        this.storeRelativePath = storeRelativePath;
        return this;
    }
}
