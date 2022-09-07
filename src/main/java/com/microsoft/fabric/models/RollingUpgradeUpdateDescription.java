package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for updating a rolling upgrade of application or cluster. */
@Fluent
public final class RollingUpgradeUpdateDescription {
    /*
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     */
    @JsonProperty(value = "RollingUpgradeMode", required = true)
    private UpgradeMode rollingUpgradeMode;

    /*
     * If true, then processes are forcefully restarted during upgrade even
     * when the code version has not changed (the upgrade only changes
     * configuration or data).
     */
    @JsonProperty(value = "ForceRestart")
    private Boolean forceRestart;

    /*
     * The maximum amount of time to block processing of an upgrade domain and
     * prevent loss of availability when there are unexpected issues. When this
     * timeout expires, processing of the upgrade domain will proceed
     * regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925
     * inclusive. (unsigned 32-bit integer).
     */
    @JsonProperty(value = "ReplicaSetCheckTimeoutInMilliseconds")
    private Long replicaSetCheckTimeoutInMilliseconds;

    /*
     * The compensating action to perform when a Monitored upgrade encounters
     * monitoring policy or health policy violations.
     * Invalid indicates the failure action is invalid. Rollback specifies that
     * the upgrade will start rolling back automatically.
     * Manual indicates that the upgrade will switch to UnmonitoredManual
     * upgrade mode.
     */
    @JsonProperty(value = "FailureAction")
    private FailureAction failureAction;

    /*
     * The amount of time to wait after completing an upgrade domain before
     * applying health policies. It is first interpreted as a string
     * representing an ISO 8601 duration. If that fails, then it is interpreted
     * as a number representing the total number of milliseconds.
     */
    @JsonProperty(value = "HealthCheckWaitDurationInMilliseconds")
    private String healthCheckWaitDurationInMilliseconds;

    /*
     * The amount of time that the application or cluster must remain healthy
     * before the upgrade proceeds to the next upgrade domain. It is first
     * interpreted as a string representing an ISO 8601 duration. If that
     * fails, then it is interpreted as a number representing the total number
     * of milliseconds.
     */
    @JsonProperty(value = "HealthCheckStableDurationInMilliseconds")
    private String healthCheckStableDurationInMilliseconds;

    /*
     * The amount of time to retry health evaluation when the application or
     * cluster is unhealthy before FailureAction is executed. It is first
     * interpreted as a string representing an ISO 8601 duration. If that
     * fails, then it is interpreted as a number representing the total number
     * of milliseconds.
     */
    @JsonProperty(value = "HealthCheckRetryTimeoutInMilliseconds")
    private String healthCheckRetryTimeoutInMilliseconds;

    /*
     * The amount of time the overall upgrade has to complete before
     * FailureAction is executed. It is first interpreted as a string
     * representing an ISO 8601 duration. If that fails, then it is interpreted
     * as a number representing the total number of milliseconds.
     */
    @JsonProperty(value = "UpgradeTimeoutInMilliseconds")
    private String upgradeTimeoutInMilliseconds;

    /*
     * The amount of time each upgrade domain has to complete before
     * FailureAction is executed. It is first interpreted as a string
     * representing an ISO 8601 duration. If that fails, then it is interpreted
     * as a number representing the total number of milliseconds.
     */
    @JsonProperty(value = "UpgradeDomainTimeoutInMilliseconds")
    private String upgradeDomainTimeoutInMilliseconds;

    /*
     * Duration in seconds, to wait before a stateless instance is closed, to
     * allow the active requests to drain gracefully. This would be effective
     * when the instance is closing during the application/cluster
     * upgrade, only for those instances which have a non-zero delay duration
     * configured in the service description. See
     * InstanceCloseDelayDurationSeconds property in $ref:
     * "#/definitions/StatelessServiceDescription.yaml" for details.
     * Note, the default value of InstanceCloseDelayDurationInSeconds is
     * 4294967295, which indicates that the behavior will entirely depend on
     * the delay configured in the stateless service description.
     */
    @JsonProperty(value = "InstanceCloseDelayDurationInSeconds")
    private Long instanceCloseDelayDurationInSeconds;

    /**
     * Get the rollingUpgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     *
     * @return the rollingUpgradeMode value.
     */
    public UpgradeMode getRollingUpgradeMode() {
        return this.rollingUpgradeMode;
    }

    /**
     * Set the rollingUpgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     *
     * @param rollingUpgradeMode the rollingUpgradeMode value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the forceRestart property: If true, then processes are forcefully restarted during upgrade even when the code
     * version has not changed (the upgrade only changes configuration or data).
     *
     * @return the forceRestart value.
     */
    public Boolean isForceRestart() {
        return this.forceRestart;
    }

    /**
     * Set the forceRestart property: If true, then processes are forcefully restarted during upgrade even when the code
     * version has not changed (the upgrade only changes configuration or data).
     *
     * @param forceRestart the forceRestart value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get the replicaSetCheckTimeoutInMilliseconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @return the replicaSetCheckTimeoutInMilliseconds value.
     */
    public Long getReplicaSetCheckTimeoutInMilliseconds() {
        return this.replicaSetCheckTimeoutInMilliseconds;
    }

    /**
     * Set the replicaSetCheckTimeoutInMilliseconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @param replicaSetCheckTimeoutInMilliseconds the replicaSetCheckTimeoutInMilliseconds value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setReplicaSetCheckTimeoutInMilliseconds(
            Long replicaSetCheckTimeoutInMilliseconds) {
        this.replicaSetCheckTimeoutInMilliseconds = replicaSetCheckTimeoutInMilliseconds;
        return this;
    }

    /**
     * Get the failureAction property: The compensating action to perform when a Monitored upgrade encounters monitoring
     * policy or health policy violations. Invalid indicates the failure action is invalid. Rollback specifies that the
     * upgrade will start rolling back automatically. Manual indicates that the upgrade will switch to UnmonitoredManual
     * upgrade mode.
     *
     * @return the failureAction value.
     */
    public FailureAction getFailureAction() {
        return this.failureAction;
    }

    /**
     * Set the failureAction property: The compensating action to perform when a Monitored upgrade encounters monitoring
     * policy or health policy violations. Invalid indicates the failure action is invalid. Rollback specifies that the
     * upgrade will start rolling back automatically. Manual indicates that the upgrade will switch to UnmonitoredManual
     * upgrade mode.
     *
     * @param failureAction the failureAction value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setFailureAction(FailureAction failureAction) {
        this.failureAction = failureAction;
        return this;
    }

    /**
     * Get the healthCheckWaitDurationInMilliseconds property: The amount of time to wait after completing an upgrade
     * domain before applying health policies. It is first interpreted as a string representing an ISO 8601 duration. If
     * that fails, then it is interpreted as a number representing the total number of milliseconds.
     *
     * @return the healthCheckWaitDurationInMilliseconds value.
     */
    public String getHealthCheckWaitDurationInMilliseconds() {
        return this.healthCheckWaitDurationInMilliseconds;
    }

    /**
     * Set the healthCheckWaitDurationInMilliseconds property: The amount of time to wait after completing an upgrade
     * domain before applying health policies. It is first interpreted as a string representing an ISO 8601 duration. If
     * that fails, then it is interpreted as a number representing the total number of milliseconds.
     *
     * @param healthCheckWaitDurationInMilliseconds the healthCheckWaitDurationInMilliseconds value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setHealthCheckWaitDurationInMilliseconds(
            String healthCheckWaitDurationInMilliseconds) {
        this.healthCheckWaitDurationInMilliseconds = healthCheckWaitDurationInMilliseconds;
        return this;
    }

    /**
     * Get the healthCheckStableDurationInMilliseconds property: The amount of time that the application or cluster must
     * remain healthy before the upgrade proceeds to the next upgrade domain. It is first interpreted as a string
     * representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total
     * number of milliseconds.
     *
     * @return the healthCheckStableDurationInMilliseconds value.
     */
    public String getHealthCheckStableDurationInMilliseconds() {
        return this.healthCheckStableDurationInMilliseconds;
    }

    /**
     * Set the healthCheckStableDurationInMilliseconds property: The amount of time that the application or cluster must
     * remain healthy before the upgrade proceeds to the next upgrade domain. It is first interpreted as a string
     * representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total
     * number of milliseconds.
     *
     * @param healthCheckStableDurationInMilliseconds the healthCheckStableDurationInMilliseconds value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setHealthCheckStableDurationInMilliseconds(
            String healthCheckStableDurationInMilliseconds) {
        this.healthCheckStableDurationInMilliseconds = healthCheckStableDurationInMilliseconds;
        return this;
    }

    /**
     * Get the healthCheckRetryTimeoutInMilliseconds property: The amount of time to retry health evaluation when the
     * application or cluster is unhealthy before FailureAction is executed. It is first interpreted as a string
     * representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total
     * number of milliseconds.
     *
     * @return the healthCheckRetryTimeoutInMilliseconds value.
     */
    public String getHealthCheckRetryTimeoutInMilliseconds() {
        return this.healthCheckRetryTimeoutInMilliseconds;
    }

    /**
     * Set the healthCheckRetryTimeoutInMilliseconds property: The amount of time to retry health evaluation when the
     * application or cluster is unhealthy before FailureAction is executed. It is first interpreted as a string
     * representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total
     * number of milliseconds.
     *
     * @param healthCheckRetryTimeoutInMilliseconds the healthCheckRetryTimeoutInMilliseconds value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setHealthCheckRetryTimeoutInMilliseconds(
            String healthCheckRetryTimeoutInMilliseconds) {
        this.healthCheckRetryTimeoutInMilliseconds = healthCheckRetryTimeoutInMilliseconds;
        return this;
    }

    /**
     * Get the upgradeTimeoutInMilliseconds property: The amount of time the overall upgrade has to complete before
     * FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails,
     * then it is interpreted as a number representing the total number of milliseconds.
     *
     * @return the upgradeTimeoutInMilliseconds value.
     */
    public String getUpgradeTimeoutInMilliseconds() {
        return this.upgradeTimeoutInMilliseconds;
    }

    /**
     * Set the upgradeTimeoutInMilliseconds property: The amount of time the overall upgrade has to complete before
     * FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails,
     * then it is interpreted as a number representing the total number of milliseconds.
     *
     * @param upgradeTimeoutInMilliseconds the upgradeTimeoutInMilliseconds value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setUpgradeTimeoutInMilliseconds(String upgradeTimeoutInMilliseconds) {
        this.upgradeTimeoutInMilliseconds = upgradeTimeoutInMilliseconds;
        return this;
    }

    /**
     * Get the upgradeDomainTimeoutInMilliseconds property: The amount of time each upgrade domain has to complete
     * before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that
     * fails, then it is interpreted as a number representing the total number of milliseconds.
     *
     * @return the upgradeDomainTimeoutInMilliseconds value.
     */
    public String getUpgradeDomainTimeoutInMilliseconds() {
        return this.upgradeDomainTimeoutInMilliseconds;
    }

    /**
     * Set the upgradeDomainTimeoutInMilliseconds property: The amount of time each upgrade domain has to complete
     * before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that
     * fails, then it is interpreted as a number representing the total number of milliseconds.
     *
     * @param upgradeDomainTimeoutInMilliseconds the upgradeDomainTimeoutInMilliseconds value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setUpgradeDomainTimeoutInMilliseconds(
            String upgradeDomainTimeoutInMilliseconds) {
        this.upgradeDomainTimeoutInMilliseconds = upgradeDomainTimeoutInMilliseconds;
        return this;
    }

    /**
     * Get the instanceCloseDelayDurationInSeconds property: Duration in seconds, to wait before a stateless instance is
     * closed, to allow the active requests to drain gracefully. This would be effective when the instance is closing
     * during the application/cluster upgrade, only for those instances which have a non-zero delay duration configured
     * in the service description. See InstanceCloseDelayDurationSeconds property in $ref:
     * "#/definitions/StatelessServiceDescription.yaml" for details. Note, the default value of
     * InstanceCloseDelayDurationInSeconds is 4294967295, which indicates that the behavior will entirely depend on the
     * delay configured in the stateless service description.
     *
     * @return the instanceCloseDelayDurationInSeconds value.
     */
    public Long getInstanceCloseDelayDurationInSeconds() {
        return this.instanceCloseDelayDurationInSeconds;
    }

    /**
     * Set the instanceCloseDelayDurationInSeconds property: Duration in seconds, to wait before a stateless instance is
     * closed, to allow the active requests to drain gracefully. This would be effective when the instance is closing
     * during the application/cluster upgrade, only for those instances which have a non-zero delay duration configured
     * in the service description. See InstanceCloseDelayDurationSeconds property in $ref:
     * "#/definitions/StatelessServiceDescription.yaml" for details. Note, the default value of
     * InstanceCloseDelayDurationInSeconds is 4294967295, which indicates that the behavior will entirely depend on the
     * delay configured in the stateless service description.
     *
     * @param instanceCloseDelayDurationInSeconds the instanceCloseDelayDurationInSeconds value to set.
     * @return the RollingUpgradeUpdateDescription object itself.
     */
    public RollingUpgradeUpdateDescription setInstanceCloseDelayDurationInSeconds(
            Long instanceCloseDelayDurationInSeconds) {
        this.instanceCloseDelayDurationInSeconds = instanceCloseDelayDurationInSeconds;
        return this;
    }
}
