package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a request for forced approval of a repair task.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@Fluent
public final class RepairTaskApproveDescription {
    /*
     * The ID of the repair task.
     */
    @JsonProperty(value = "TaskId", required = true)
    private String taskId;

    /*
     * The current version number of the repair task. If non-zero, then the
     * request will only succeed if this value matches the actual current
     * version of the repair task. If zero, then no version check is performed.
     */
    @JsonProperty(value = "Version")
    private String version;

    /**
     * Get the taskId property: The ID of the repair task.
     *
     * @return the taskId value.
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: The ID of the repair task.
     *
     * @param taskId the taskId value to set.
     * @return the RepairTaskApproveDescription object itself.
     */
    public RepairTaskApproveDescription setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the version property: The current version number of the repair task. If non-zero, then the request will only
     * succeed if this value matches the actual current version of the repair task. If zero, then no version check is
     * performed.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The current version number of the repair task. If non-zero, then the request will only
     * succeed if this value matches the actual current version of the repair task. If zero, then no version check is
     * performed.
     *
     * @param version the version value to set.
     * @return the RepairTaskApproveDescription object itself.
     */
    public RepairTaskApproveDescription setVersion(String version) {
        this.version = version;
        return this;
    }
}
