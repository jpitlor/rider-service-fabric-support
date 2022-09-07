package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a image store upload session. */
@Fluent
public final class UploadSession {
    /*
     * When querying upload session by upload session ID, the result contains
     * only one upload session. When querying upload session by image store
     * relative path, the result might contain multiple upload sessions.
     */
    @JsonProperty(value = "UploadSessions")
    private List<UploadSessionInfo> uploadSessions;

    /**
     * Get the uploadSessions property: When querying upload session by upload session ID, the result contains only one
     * upload session. When querying upload session by image store relative path, the result might contain multiple
     * upload sessions.
     *
     * @return the uploadSessions value.
     */
    public List<UploadSessionInfo> getUploadSessions() {
        return this.uploadSessions;
    }

    /**
     * Set the uploadSessions property: When querying upload session by upload session ID, the result contains only one
     * upload session. When querying upload session by image store relative path, the result might contain multiple
     * upload sessions.
     *
     * @param uploadSessions the uploadSessions value to set.
     * @return the UploadSession object itself.
     */
    public UploadSession setUploadSessions(List<UploadSessionInfo> uploadSessions) {
        this.uploadSessions = uploadSessions;
        return this;
    }
}
