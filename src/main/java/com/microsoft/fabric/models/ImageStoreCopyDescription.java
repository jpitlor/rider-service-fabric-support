package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Information about how to copy image store content from one image store relative path to another image store relative
 * path.
 */
@Fluent
public final class ImageStoreCopyDescription {
    /*
     * The relative path of source image store content to be copied from.
     */
    @JsonProperty(value = "RemoteSource", required = true)
    private String remoteSource;

    /*
     * The relative path of destination image store content to be copied to.
     */
    @JsonProperty(value = "RemoteDestination", required = true)
    private String remoteDestination;

    /*
     * The list of the file names to be skipped for copying.
     */
    @JsonProperty(value = "SkipFiles")
    private List<String> skipFiles;

    /*
     * Indicates whether to check mark file during copying. The property is
     * true if checking mark file is required, false otherwise. The mark file
     * is used to check whether the folder is well constructed. If the property
     * is true and mark file does not exist, the copy is skipped.
     */
    @JsonProperty(value = "CheckMarkFile")
    private Boolean checkMarkFile;

    /**
     * Get the remoteSource property: The relative path of source image store content to be copied from.
     *
     * @return the remoteSource value.
     */
    public String getRemoteSource() {
        return this.remoteSource;
    }

    /**
     * Set the remoteSource property: The relative path of source image store content to be copied from.
     *
     * @param remoteSource the remoteSource value to set.
     * @return the ImageStoreCopyDescription object itself.
     */
    public ImageStoreCopyDescription setRemoteSource(String remoteSource) {
        this.remoteSource = remoteSource;
        return this;
    }

    /**
     * Get the remoteDestination property: The relative path of destination image store content to be copied to.
     *
     * @return the remoteDestination value.
     */
    public String getRemoteDestination() {
        return this.remoteDestination;
    }

    /**
     * Set the remoteDestination property: The relative path of destination image store content to be copied to.
     *
     * @param remoteDestination the remoteDestination value to set.
     * @return the ImageStoreCopyDescription object itself.
     */
    public ImageStoreCopyDescription setRemoteDestination(String remoteDestination) {
        this.remoteDestination = remoteDestination;
        return this;
    }

    /**
     * Get the skipFiles property: The list of the file names to be skipped for copying.
     *
     * @return the skipFiles value.
     */
    public List<String> getSkipFiles() {
        return this.skipFiles;
    }

    /**
     * Set the skipFiles property: The list of the file names to be skipped for copying.
     *
     * @param skipFiles the skipFiles value to set.
     * @return the ImageStoreCopyDescription object itself.
     */
    public ImageStoreCopyDescription setSkipFiles(List<String> skipFiles) {
        this.skipFiles = skipFiles;
        return this;
    }

    /**
     * Get the checkMarkFile property: Indicates whether to check mark file during copying. The property is true if
     * checking mark file is required, false otherwise. The mark file is used to check whether the folder is well
     * constructed. If the property is true and mark file does not exist, the copy is skipped.
     *
     * @return the checkMarkFile value.
     */
    public Boolean isCheckMarkFile() {
        return this.checkMarkFile;
    }

    /**
     * Set the checkMarkFile property: Indicates whether to check mark file during copying. The property is true if
     * checking mark file is required, false otherwise. The mark file is used to check whether the folder is well
     * constructed. If the property is true and mark file does not exist, the copy is skipped.
     *
     * @param checkMarkFile the checkMarkFile value to set.
     * @return the ImageStoreCopyDescription object itself.
     */
    public ImageStoreCopyDescription setCheckMarkFile(Boolean checkMarkFile) {
        this.checkMarkFile = checkMarkFile;
        return this;
    }
}
