package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a request to cancel a repair task.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@Fluent
public final class RepairTaskCancelDescription {
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

    /*
     * _True_ if the repair should be stopped as soon as possible even if it
     * has already started executing. _False_ if the repair should be cancelled
     * only if execution has not yet started.
     */
    @JsonProperty(value = "RequestAbort")
    private Boolean requestAbort;

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
     * @return the RepairTaskCancelDescription object itself.
     */
    public RepairTaskCancelDescription setTaskId(String taskId) {
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
     * @return the RepairTaskCancelDescription object itself.
     */
    public RepairTaskCancelDescription setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the requestAbort property: _True_ if the repair should be stopped as soon as possible even if it has already
     * started executing. _False_ if the repair should be cancelled only if execution has not yet started.
     *
     * @return the requestAbort value.
     */
    public Boolean isRequestAbort() {
        return this.requestAbort;
    }

    /**
     * Set the requestAbort property: _True_ if the repair should be stopped as soon as possible even if it has already
     * started executing. _False_ if the repair should be cancelled only if execution has not yet started.
     *
     * @param requestAbort the requestAbort value to set.
     * @return the RepairTaskCancelDescription object itself.
     */
    public RepairTaskCancelDescription setRequestAbort(Boolean requestAbort) {
        this.requestAbort = requestAbort;
        return this;
    }
}
