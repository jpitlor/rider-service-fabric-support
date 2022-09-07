package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Information about an image store upload session. A session is associated with a relative path in the image store. */
@Fluent
public final class UploadSessionInfo {
    /*
     * The remote location within image store. This path is relative to the
     * image store root.
     */
    @JsonProperty(value = "StoreRelativePath")
    private String storeRelativePath;

    /*
     * A unique ID of the upload session. A session ID can be reused only if
     * the session was committed or removed.
     */
    @JsonProperty(value = "SessionId")
    private UUID sessionId;

    /*
     * The date and time when the upload session was last modified.
     */
    @JsonProperty(value = "ModifiedDate")
    private OffsetDateTime modifiedDate;

    /*
     * The size in bytes of the uploading file.
     */
    @JsonProperty(value = "FileSize")
    private String fileSize;

    /*
     * List of chunk ranges that image store has not received yet.
     */
    @JsonProperty(value = "ExpectedRanges")
    private List<UploadChunkRange> expectedRanges;

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
     * @return the UploadSessionInfo object itself.
     */
    public UploadSessionInfo setStoreRelativePath(String storeRelativePath) {
        this.storeRelativePath = storeRelativePath;
        return this;
    }

    /**
     * Get the sessionId property: A unique ID of the upload session. A session ID can be reused only if the session was
     * committed or removed.
     *
     * @return the sessionId value.
     */
    public UUID getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: A unique ID of the upload session. A session ID can be reused only if the session was
     * committed or removed.
     *
     * @param sessionId the sessionId value to set.
     * @return the UploadSessionInfo object itself.
     */
    public UploadSessionInfo setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the modifiedDate property: The date and time when the upload session was last modified.
     *
     * @return the modifiedDate value.
     */
    public OffsetDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Set the modifiedDate property: The date and time when the upload session was last modified.
     *
     * @param modifiedDate the modifiedDate value to set.
     * @return the UploadSessionInfo object itself.
     */
    public UploadSessionInfo setModifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Get the fileSize property: The size in bytes of the uploading file.
     *
     * @return the fileSize value.
     */
    public String getFileSize() {
        return this.fileSize;
    }

    /**
     * Set the fileSize property: The size in bytes of the uploading file.
     *
     * @param fileSize the fileSize value to set.
     * @return the UploadSessionInfo object itself.
     */
    public UploadSessionInfo setFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * Get the expectedRanges property: List of chunk ranges that image store has not received yet.
     *
     * @return the expectedRanges value.
     */
    public List<UploadChunkRange> getExpectedRanges() {
        return this.expectedRanges;
    }

    /**
     * Set the expectedRanges property: List of chunk ranges that image store has not received yet.
     *
     * @param expectedRanges the expectedRanges value to set.
     * @return the UploadSessionInfo object itself.
     */
    public UploadSessionInfo setExpectedRanges(List<UploadChunkRange> expectedRanges) {
        this.expectedRanges = expectedRanges;
        return this;
    }
}
