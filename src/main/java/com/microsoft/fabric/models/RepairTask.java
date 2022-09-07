package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a repair task, which includes information about what kind of repair was requested, what its progress is,
 * and what its final result was.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@Fluent
public final class RepairTask {
    /*
     * The ID of the repair task.
     */
    @JsonProperty(value = "TaskId", required = true)
    private String taskId;

    /*
     * The version of the repair task.
     * When creating a new repair task, the version must be set to zero.  When
     * updating a repair task,
     * the version is used for optimistic concurrency checks.  If the version
     * is
     * set to zero, the update will not check for write conflicts.  If the
     * version is set to a non-zero value, then the
     * update will only succeed if the actual current version of the repair
     * task matches this value.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * A description of the purpose of the repair task, or other informational
     * details.
     * May be set when the repair task is created, and is immutable once set.
     */
    @JsonProperty(value = "Description")
    private String description;

    /*
     * The workflow state of the repair task. Valid initial states are Created,
     * Claimed, and Preparing.
     */
    @JsonProperty(value = "State", required = true)
    private State state;

    /*
     * A bitwise-OR of the following values, which gives additional details
     * about the status of the repair task.
     * - 1 - Cancellation of the repair has been requested
     * - 2 - Abort of the repair has been requested
     * - 4 - Approval of the repair was forced via client request
     */
    @JsonProperty(value = "Flags")
    private Integer flags;

    /*
     * The requested repair action. Must be specified when the repair task is
     * created, and is immutable once set.
     */
    @JsonProperty(value = "Action", required = true)
    private String action;

    /*
     * The target object determines what actions the system will take to
     * prepare for the impact of the repair, prior to approving execution of
     * the repair.
     * May be set when the repair task is created, and is immutable once set.
     */
    @JsonProperty(value = "Target")
    private RepairTargetDescriptionBase target;

    /*
     * The name of the repair executor. Must be specified in Claimed and later
     * states, and is immutable once set.
     */
    @JsonProperty(value = "Executor")
    private String executor;

    /*
     * A data string that the repair executor can use to store its internal
     * state.
     */
    @JsonProperty(value = "ExecutorData")
    private String executorData;

    /*
     * The impact object determines what actions the system will take to
     * prepare for the impact of the repair, prior to approving execution of
     * the repair.
     * Impact must be specified by the repair executor when transitioning to
     * the Preparing state, and is immutable once set.
     */
    @JsonProperty(value = "Impact")
    private RepairImpactDescriptionBase impact;

    /*
     * A value describing the overall result of the repair task execution. Must
     * be specified in the Restoring and later states, and is immutable once
     * set.
     */
    @JsonProperty(value = "ResultStatus")
    private ResultStatus resultStatus;

    /*
     * A numeric value providing additional details about the result of the
     * repair task execution.
     * May be specified in the Restoring and later states, and is immutable
     * once set.
     */
    @JsonProperty(value = "ResultCode")
    private Integer resultCode;

    /*
     * A string providing additional details about the result of the repair
     * task execution.
     * May be specified in the Restoring and later states, and is immutable
     * once set.
     */
    @JsonProperty(value = "ResultDetails")
    private String resultDetails;

    /*
     * An object that contains timestamps of the repair task's state
     * transitions.
     * These timestamps are updated by the system, and cannot be directly
     * modified.
     */
    @JsonProperty(value = "History")
    private RepairTaskHistory history;

    /*
     * The workflow state of the health check when the repair task is in the
     * Preparing state.
     */
    @JsonProperty(value = "PreparingHealthCheckState")
    private RepairTaskHealthCheckState preparingHealthCheckState;

    /*
     * The workflow state of the health check when the repair task is in the
     * Restoring state.
     */
    @JsonProperty(value = "RestoringHealthCheckState")
    private RepairTaskHealthCheckState restoringHealthCheckState;

    /*
     * A value to determine if health checks will be performed when the repair
     * task enters the Preparing state.
     */
    @JsonProperty(value = "PerformPreparingHealthCheck")
    private Boolean performPreparingHealthCheck;

    /*
     * A value to determine if health checks will be performed when the repair
     * task enters the Restoring state.
     */
    @JsonProperty(value = "PerformRestoringHealthCheck")
    private Boolean performRestoringHealthCheck;

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
     * @return the RepairTask object itself.
     */
    public RepairTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the version property: The version of the repair task. When creating a new repair task, the version must be
     * set to zero. When updating a repair task, the version is used for optimistic concurrency checks. If the version
     * is set to zero, the update will not check for write conflicts. If the version is set to a non-zero value, then
     * the update will only succeed if the actual current version of the repair task matches this value.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the repair task. When creating a new repair task, the version must be
     * set to zero. When updating a repair task, the version is used for optimistic concurrency checks. If the version
     * is set to zero, the update will not check for write conflicts. If the version is set to a non-zero value, then
     * the update will only succeed if the actual current version of the repair task matches this value.
     *
     * @param version the version value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the description property: A description of the purpose of the repair task, or other informational details.
     * May be set when the repair task is created, and is immutable once set.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A description of the purpose of the repair task, or other informational details.
     * May be set when the repair task is created, and is immutable once set.
     *
     * @param description the description value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the state property: The workflow state of the repair task. Valid initial states are Created, Claimed, and
     * Preparing.
     *
     * @return the state value.
     */
    public State getState() {
        return this.state;
    }

    /**
     * Set the state property: The workflow state of the repair task. Valid initial states are Created, Claimed, and
     * Preparing.
     *
     * @param state the state value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get the flags property: A bitwise-OR of the following values, which gives additional details about the status of
     * the repair task. - 1 - Cancellation of the repair has been requested - 2 - Abort of the repair has been requested
     * - 4 - Approval of the repair was forced via client request.
     *
     * @return the flags value.
     */
    public Integer getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: A bitwise-OR of the following values, which gives additional details about the status of
     * the repair task. - 1 - Cancellation of the repair has been requested - 2 - Abort of the repair has been requested
     * - 4 - Approval of the repair was forced via client request.
     *
     * @param flags the flags value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setFlags(Integer flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the action property: The requested repair action. Must be specified when the repair task is created, and is
     * immutable once set.
     *
     * @return the action value.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Set the action property: The requested repair action. Must be specified when the repair task is created, and is
     * immutable once set.
     *
     * @param action the action value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the target property: The target object determines what actions the system will take to prepare for the impact
     * of the repair, prior to approving execution of the repair. May be set when the repair task is created, and is
     * immutable once set.
     *
     * @return the target value.
     */
    public RepairTargetDescriptionBase getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target object determines what actions the system will take to prepare for the impact
     * of the repair, prior to approving execution of the repair. May be set when the repair task is created, and is
     * immutable once set.
     *
     * @param target the target value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setTarget(RepairTargetDescriptionBase target) {
        this.target = target;
        return this;
    }

    /**
     * Get the executor property: The name of the repair executor. Must be specified in Claimed and later states, and is
     * immutable once set.
     *
     * @return the executor value.
     */
    public String getExecutor() {
        return this.executor;
    }

    /**
     * Set the executor property: The name of the repair executor. Must be specified in Claimed and later states, and is
     * immutable once set.
     *
     * @param executor the executor value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * Get the executorData property: A data string that the repair executor can use to store its internal state.
     *
     * @return the executorData value.
     */
    public String getExecutorData() {
        return this.executorData;
    }

    /**
     * Set the executorData property: A data string that the repair executor can use to store its internal state.
     *
     * @param executorData the executorData value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setExecutorData(String executorData) {
        this.executorData = executorData;
        return this;
    }

    /**
     * Get the impact property: The impact object determines what actions the system will take to prepare for the impact
     * of the repair, prior to approving execution of the repair. Impact must be specified by the repair executor when
     * transitioning to the Preparing state, and is immutable once set.
     *
     * @return the impact value.
     */
    public RepairImpactDescriptionBase getImpact() {
        return this.impact;
    }

    /**
     * Set the impact property: The impact object determines what actions the system will take to prepare for the impact
     * of the repair, prior to approving execution of the repair. Impact must be specified by the repair executor when
     * transitioning to the Preparing state, and is immutable once set.
     *
     * @param impact the impact value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setImpact(RepairImpactDescriptionBase impact) {
        this.impact = impact;
        return this;
    }

    /**
     * Get the resultStatus property: A value describing the overall result of the repair task execution. Must be
     * specified in the Restoring and later states, and is immutable once set.
     *
     * @return the resultStatus value.
     */
    public ResultStatus getResultStatus() {
        return this.resultStatus;
    }

    /**
     * Set the resultStatus property: A value describing the overall result of the repair task execution. Must be
     * specified in the Restoring and later states, and is immutable once set.
     *
     * @param resultStatus the resultStatus value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * Get the resultCode property: A numeric value providing additional details about the result of the repair task
     * execution. May be specified in the Restoring and later states, and is immutable once set.
     *
     * @return the resultCode value.
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * Set the resultCode property: A numeric value providing additional details about the result of the repair task
     * execution. May be specified in the Restoring and later states, and is immutable once set.
     *
     * @param resultCode the resultCode value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * Get the resultDetails property: A string providing additional details about the result of the repair task
     * execution. May be specified in the Restoring and later states, and is immutable once set.
     *
     * @return the resultDetails value.
     */
    public String getResultDetails() {
        return this.resultDetails;
    }

    /**
     * Set the resultDetails property: A string providing additional details about the result of the repair task
     * execution. May be specified in the Restoring and later states, and is immutable once set.
     *
     * @param resultDetails the resultDetails value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setResultDetails(String resultDetails) {
        this.resultDetails = resultDetails;
        return this;
    }

    /**
     * Get the history property: An object that contains timestamps of the repair task's state transitions. These
     * timestamps are updated by the system, and cannot be directly modified.
     *
     * @return the history value.
     */
    public RepairTaskHistory getHistory() {
        return this.history;
    }

    /**
     * Set the history property: An object that contains timestamps of the repair task's state transitions. These
     * timestamps are updated by the system, and cannot be directly modified.
     *
     * @param history the history value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setHistory(RepairTaskHistory history) {
        this.history = history;
        return this;
    }

    /**
     * Get the preparingHealthCheckState property: The workflow state of the health check when the repair task is in the
     * Preparing state.
     *
     * @return the preparingHealthCheckState value.
     */
    public RepairTaskHealthCheckState getPreparingHealthCheckState() {
        return this.preparingHealthCheckState;
    }

    /**
     * Set the preparingHealthCheckState property: The workflow state of the health check when the repair task is in the
     * Preparing state.
     *
     * @param preparingHealthCheckState the preparingHealthCheckState value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setPreparingHealthCheckState(RepairTaskHealthCheckState preparingHealthCheckState) {
        this.preparingHealthCheckState = preparingHealthCheckState;
        return this;
    }

    /**
     * Get the restoringHealthCheckState property: The workflow state of the health check when the repair task is in the
     * Restoring state.
     *
     * @return the restoringHealthCheckState value.
     */
    public RepairTaskHealthCheckState getRestoringHealthCheckState() {
        return this.restoringHealthCheckState;
    }

    /**
     * Set the restoringHealthCheckState property: The workflow state of the health check when the repair task is in the
     * Restoring state.
     *
     * @param restoringHealthCheckState the restoringHealthCheckState value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setRestoringHealthCheckState(RepairTaskHealthCheckState restoringHealthCheckState) {
        this.restoringHealthCheckState = restoringHealthCheckState;
        return this;
    }

    /**
     * Get the performPreparingHealthCheck property: A value to determine if health checks will be performed when the
     * repair task enters the Preparing state.
     *
     * @return the performPreparingHealthCheck value.
     */
    public Boolean isPerformPreparingHealthCheck() {
        return this.performPreparingHealthCheck;
    }

    /**
     * Set the performPreparingHealthCheck property: A value to determine if health checks will be performed when the
     * repair task enters the Preparing state.
     *
     * @param performPreparingHealthCheck the performPreparingHealthCheck value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setPerformPreparingHealthCheck(Boolean performPreparingHealthCheck) {
        this.performPreparingHealthCheck = performPreparingHealthCheck;
        return this;
    }

    /**
     * Get the performRestoringHealthCheck property: A value to determine if health checks will be performed when the
     * repair task enters the Restoring state.
     *
     * @return the performRestoringHealthCheck value.
     */
    public Boolean isPerformRestoringHealthCheck() {
        return this.performRestoringHealthCheck;
    }

    /**
     * Set the performRestoringHealthCheck property: A value to determine if health checks will be performed when the
     * repair task enters the Restoring state.
     *
     * @param performRestoringHealthCheck the performRestoringHealthCheck value to set.
     * @return the RepairTask object itself.
     */
    public RepairTask setPerformRestoringHealthCheck(Boolean performRestoringHealthCheck) {
        this.performRestoringHealthCheck = performRestoringHealthCheck;
        return this;
    }
}
