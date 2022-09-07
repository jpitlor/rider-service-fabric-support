package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for monitoring an upgrade in Monitored mode. */
@Fluent
public final class MonitoringPolicyDescription {
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
     * @return the MonitoringPolicyDescription object itself.
     */
    public MonitoringPolicyDescription setFailureAction(FailureAction failureAction) {
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
     * @return the MonitoringPolicyDescription object itself.
     */
    public MonitoringPolicyDescription setHealthCheckWaitDurationInMilliseconds(
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
     * @return the MonitoringPolicyDescription object itself.
     */
    public MonitoringPolicyDescription setHealthCheckStableDurationInMilliseconds(
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
     * @return the MonitoringPolicyDescription object itself.
     */
    public MonitoringPolicyDescription setHealthCheckRetryTimeoutInMilliseconds(
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
     * @return the MonitoringPolicyDescription object itself.
     */
    public MonitoringPolicyDescription setUpgradeTimeoutInMilliseconds(String upgradeTimeoutInMilliseconds) {
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
     * @return the MonitoringPolicyDescription object itself.
     */
    public MonitoringPolicyDescription setUpgradeDomainTimeoutInMilliseconds(
            String upgradeDomainTimeoutInMilliseconds) {
        this.upgradeDomainTimeoutInMilliseconds = upgradeDomainTimeoutInMilliseconds;
        return this;
    }
}
