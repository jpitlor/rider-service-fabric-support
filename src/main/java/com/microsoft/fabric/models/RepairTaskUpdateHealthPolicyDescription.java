package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a request to update the health policy of a repair task.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@Fluent
public final class RepairTaskUpdateHealthPolicyDescription {
    /*
     * The ID of the repair task to be updated.
     */
    @JsonProperty(value = "TaskId", required = true)
    private String taskId;

    /*
     * The current version number of the repair task. If non-zero, then the
     * request will only succeed if this value matches the actual current value
     * of the repair task. If zero, then no version check is performed.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * A boolean indicating if health check is to be performed in the Preparing
     * stage of the repair task. If not specified the existing value should not
     * be altered. Otherwise, specify the desired new value.
     */
    @JsonProperty(value = "PerformPreparingHealthCheck")
    private Boolean performPreparingHealthCheck;

    /*
     * A boolean indicating if health check is to be performed in the Restoring
     * stage of the repair task. If not specified the existing value should not
     * be altered. Otherwise, specify the desired new value.
     */
    @JsonProperty(value = "PerformRestoringHealthCheck")
    private Boolean performRestoringHealthCheck;

    /**
     * Get the taskId property: The ID of the repair task to be updated.
     *
     * @return the taskId value.
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: The ID of the repair task to be updated.
     *
     * @param taskId the taskId value to set.
     * @return the RepairTaskUpdateHealthPolicyDescription object itself.
     */
    public RepairTaskUpdateHealthPolicyDescription setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the version property: The current version number of the repair task. If non-zero, then the request will only
     * succeed if this value matches the actual current value of the repair task. If zero, then no version check is
     * performed.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The current version number of the repair task. If non-zero, then the request will only
     * succeed if this value matches the actual current value of the repair task. If zero, then no version check is
     * performed.
     *
     * @param version the version value to set.
     * @return the RepairTaskUpdateHealthPolicyDescription object itself.
     */
    public RepairTaskUpdateHealthPolicyDescription setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the performPreparingHealthCheck property: A boolean indicating if health check is to be performed in the
     * Preparing stage of the repair task. If not specified the existing value should not be altered. Otherwise, specify
     * the desired new value.
     *
     * @return the performPreparingHealthCheck value.
     */
    public Boolean isPerformPreparingHealthCheck() {
        return this.performPreparingHealthCheck;
    }

    /**
     * Set the performPreparingHealthCheck property: A boolean indicating if health check is to be performed in the
     * Preparing stage of the repair task. If not specified the existing value should not be altered. Otherwise, specify
     * the desired new value.
     *
     * @param performPreparingHealthCheck the performPreparingHealthCheck value to set.
     * @return the RepairTaskUpdateHealthPolicyDescription object itself.
     */
    public RepairTaskUpdateHealthPolicyDescription setPerformPreparingHealthCheck(Boolean performPreparingHealthCheck) {
        this.performPreparingHealthCheck = performPreparingHealthCheck;
        return this;
    }

    /**
     * Get the performRestoringHealthCheck property: A boolean indicating if health check is to be performed in the
     * Restoring stage of the repair task. If not specified the existing value should not be altered. Otherwise, specify
     * the desired new value.
     *
     * @return the performRestoringHealthCheck value.
     */
    public Boolean isPerformRestoringHealthCheck() {
        return this.performRestoringHealthCheck;
    }

    /**
     * Set the performRestoringHealthCheck property: A boolean indicating if health check is to be performed in the
     * Restoring stage of the repair task. If not specified the existing value should not be altered. Otherwise, specify
     * the desired new value.
     *
     * @param performRestoringHealthCheck the performRestoringHealthCheck value to set.
     * @return the RepairTaskUpdateHealthPolicyDescription object itself.
     */
    public RepairTaskUpdateHealthPolicyDescription setPerformRestoringHealthCheck(Boolean performRestoringHealthCheck) {
        this.performRestoringHealthCheck = performRestoringHealthCheck;
        return this;
    }
}
