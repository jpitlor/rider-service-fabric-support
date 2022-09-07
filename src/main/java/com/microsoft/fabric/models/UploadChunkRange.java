package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about which portion of the file to upload. */
@Fluent
public final class UploadChunkRange {
    /*
     * The start position of the portion of the file. It's represented by the
     * number of bytes.
     */
    @JsonProperty(value = "StartPosition")
    private String startPosition;

    /*
     * The end position of the portion of the file. It's represented by the
     * number of bytes.
     */
    @JsonProperty(value = "EndPosition")
    private String endPosition;

    /**
     * Get the startPosition property: The start position of the portion of the file. It's represented by the number of
     * bytes.
     *
     * @return the startPosition value.
     */
    public String getStartPosition() {
        return this.startPosition;
    }

    /**
     * Set the startPosition property: The start position of the portion of the file. It's represented by the number of
     * bytes.
     *
     * @param startPosition the startPosition value to set.
     * @return the UploadChunkRange object itself.
     */
    public UploadChunkRange setStartPosition(String startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    /**
     * Get the endPosition property: The end position of the portion of the file. It's represented by the number of
     * bytes.
     *
     * @return the endPosition value.
     */
    public String getEndPosition() {
        return this.endPosition;
    }

    /**
     * Set the endPosition property: The end position of the portion of the file. It's represented by the number of
     * bytes.
     *
     * @param endPosition the endPosition value to set.
     * @return the UploadChunkRange object itself.
     */
    public UploadChunkRange setEndPosition(String endPosition) {
        this.endPosition = endPosition;
        return this;
    }
}
