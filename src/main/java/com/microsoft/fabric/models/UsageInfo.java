package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about how much space and how many files in the file system the ImageStore is using in this category. */
@Fluent
public final class UsageInfo {
    /*
     * the size of all files in this category
     */
    @JsonProperty(value = "UsedSpace")
    private String usedSpace;

    /*
     * the number of all files in this category
     */
    @JsonProperty(value = "FileCount")
    private String fileCount;

    /**
     * Get the usedSpace property: the size of all files in this category.
     *
     * @return the usedSpace value.
     */
    public String getUsedSpace() {
        return this.usedSpace;
    }

    /**
     * Set the usedSpace property: the size of all files in this category.
     *
     * @param usedSpace the usedSpace value to set.
     * @return the UsageInfo object itself.
     */
    public UsageInfo setUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
        return this;
    }

    /**
     * Get the fileCount property: the number of all files in this category.
     *
     * @return the fileCount value.
     */
    public String getFileCount() {
        return this.fileCount;
    }

    /**
     * Set the fileCount property: the number of all files in this category.
     *
     * @param fileCount the fileCount value to set.
     * @return the UsageInfo object itself.
     */
    public UsageInfo setFileCount(String fileCount) {
        this.fileCount = fileCount;
        return this;
    }
}
