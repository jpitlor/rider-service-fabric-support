package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the version of image store file. */
@Fluent
public final class FileVersion {
    /*
     * The current image store version number for the file is used in image
     * store for checking whether it need to be updated.
     */
    @JsonProperty(value = "VersionNumber")
    private String versionNumber;

    /*
     * The epoch data loss number of image store replica when this file entry
     * was updated or created.
     */
    @JsonProperty(value = "EpochDataLossNumber")
    private String epochDataLossNumber;

    /*
     * The epoch configuration version number of the image store replica when
     * this file entry was created or updated.
     */
    @JsonProperty(value = "EpochConfigurationNumber")
    private String epochConfigurationNumber;

    /**
     * Get the versionNumber property: The current image store version number for the file is used in image store for
     * checking whether it need to be updated.
     *
     * @return the versionNumber value.
     */
    public String getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * Set the versionNumber property: The current image store version number for the file is used in image store for
     * checking whether it need to be updated.
     *
     * @param versionNumber the versionNumber value to set.
     * @return the FileVersion object itself.
     */
    public FileVersion setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * Get the epochDataLossNumber property: The epoch data loss number of image store replica when this file entry was
     * updated or created.
     *
     * @return the epochDataLossNumber value.
     */
    public String getEpochDataLossNumber() {
        return this.epochDataLossNumber;
    }

    /**
     * Set the epochDataLossNumber property: The epoch data loss number of image store replica when this file entry was
     * updated or created.
     *
     * @param epochDataLossNumber the epochDataLossNumber value to set.
     * @return the FileVersion object itself.
     */
    public FileVersion setEpochDataLossNumber(String epochDataLossNumber) {
        this.epochDataLossNumber = epochDataLossNumber;
        return this;
    }

    /**
     * Get the epochConfigurationNumber property: The epoch configuration version number of the image store replica when
     * this file entry was created or updated.
     *
     * @return the epochConfigurationNumber value.
     */
    public String getEpochConfigurationNumber() {
        return this.epochConfigurationNumber;
    }

    /**
     * Set the epochConfigurationNumber property: The epoch configuration version number of the image store replica when
     * this file entry was created or updated.
     *
     * @param epochConfigurationNumber the epochConfigurationNumber value to set.
     * @return the FileVersion object itself.
     */
    public FileVersion setEpochConfigurationNumber(String epochConfigurationNumber) {
        this.epochConfigurationNumber = epochConfigurationNumber;
        return this;
    }
}
