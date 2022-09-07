package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the parameters for a compose deployment upgrade. */
@Fluent
public final class ComposeDeploymentUpgradeProgressInfo {
    /*
     * The name of the target deployment.
     */
    @JsonProperty(value = "DeploymentName")
    private String deploymentName;

    /*
     * The name of the target application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * The state of the compose deployment upgrade.
     */
    @JsonProperty(value = "UpgradeState")
    private ComposeDeploymentUpgradeState upgradeState;

    /*
     * Additional detailed information about the status of the pending upgrade.
     */
    @JsonProperty(value = "UpgradeStatusDetails")
    private String upgradeStatusDetails;

    /*
     * The kind of upgrade out of the following possible values.
     */
    @JsonProperty(value = "UpgradeKind")
    private UpgradeKind upgradeKind;

    /*
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     */
    @JsonProperty(value = "RollingUpgradeMode")
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
    @JsonProperty(value = "UpgradeReplicaSetCheckTimeoutInSeconds")
    private Long upgradeReplicaSetCheckTimeoutInSeconds;

    /*
     * Describes the parameters for monitoring an upgrade in Monitored mode.
     */
    @JsonProperty(value = "MonitoringPolicy")
    private MonitoringPolicyDescription monitoringPolicy;

    /*
     * Defines a health policy used to evaluate the health of an application or
     * one of its children entities.
     */
    @JsonProperty(value = "ApplicationHealthPolicy")
    private ApplicationHealthPolicy applicationHealthPolicy;

    /*
     * The target application type version (found in the application manifest)
     * for the application upgrade.
     */
    @JsonProperty(value = "TargetApplicationTypeVersion")
    private String targetApplicationTypeVersion;

    /*
     * The estimated amount of time that the overall upgrade elapsed. It is
     * first interpreted as a string representing an ISO 8601 duration. If that
     * fails, then it is interpreted as a number representing the total number
     * of milliseconds.
     */
    @JsonProperty(value = "UpgradeDuration")
    private String upgradeDuration;

    /*
     * The estimated amount of time spent processing current Upgrade Domain. It
     * is first interpreted as a string representing an ISO 8601 duration. If
     * that fails, then it is interpreted as a number representing the total
     * number of milliseconds.
     */
    @JsonProperty(value = "CurrentUpgradeDomainDuration")
    private String currentUpgradeDomainDuration;

    /*
     * List of health evaluations that resulted in the current aggregated
     * health state.
     */
    @JsonProperty(value = "ApplicationUnhealthyEvaluations")
    private List<HealthEvaluationWrapper> applicationUnhealthyEvaluations;

    /*
     * Information about the current in-progress upgrade domain. Not applicable
     * to node-by-node upgrades.
     */
    @JsonProperty(value = "CurrentUpgradeDomainProgress")
    private CurrentUpgradeDomainProgressInfo currentUpgradeDomainProgress;

    /*
     * The estimated UTC datetime when the upgrade started.
     */
    @JsonProperty(value = "StartTimestampUtc")
    private String startTimestampUtc;

    /*
     * The estimated UTC datetime when the upgrade failed and FailureAction was
     * executed.
     */
    @JsonProperty(value = "FailureTimestampUtc")
    private String failureTimestampUtc;

    /*
     * The cause of an upgrade failure that resulted in FailureAction being
     * executed.
     */
    @JsonProperty(value = "FailureReason")
    private FailureReason failureReason;

    /*
     * Information about the upgrade domain progress at the time of upgrade
     * failure.
     */
    @JsonProperty(value = "UpgradeDomainProgressAtFailure")
    private FailureUpgradeDomainProgressInfo upgradeDomainProgressAtFailure;

    /*
     * Additional details of application upgrade including failure message.
     */
    @JsonProperty(value = "ApplicationUpgradeStatusDetails")
    private String applicationUpgradeStatusDetails;

    /**
     * Get the deploymentName property: The name of the target deployment.
     *
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The name of the target deployment.
     *
     * @param deploymentName the deploymentName value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * Get the applicationName property: The name of the target application, including the 'fabric:' URI scheme.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The name of the target application, including the 'fabric:' URI scheme.
     *
     * @param applicationName the applicationName value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the upgradeState property: The state of the compose deployment upgrade.
     *
     * @return the upgradeState value.
     */
    public ComposeDeploymentUpgradeState getUpgradeState() {
        return this.upgradeState;
    }

    /**
     * Set the upgradeState property: The state of the compose deployment upgrade.
     *
     * @param upgradeState the upgradeState value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setUpgradeState(ComposeDeploymentUpgradeState upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the upgradeStatusDetails property: Additional detailed information about the status of the pending upgrade.
     *
     * @return the upgradeStatusDetails value.
     */
    public String getUpgradeStatusDetails() {
        return this.upgradeStatusDetails;
    }

    /**
     * Set the upgradeStatusDetails property: Additional detailed information about the status of the pending upgrade.
     *
     * @param upgradeStatusDetails the upgradeStatusDetails value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setUpgradeStatusDetails(String upgradeStatusDetails) {
        this.upgradeStatusDetails = upgradeStatusDetails;
        return this;
    }

    /**
     * Get the upgradeKind property: The kind of upgrade out of the following possible values.
     *
     * @return the upgradeKind value.
     */
    public UpgradeKind getUpgradeKind() {
        return this.upgradeKind;
    }

    /**
     * Set the upgradeKind property: The kind of upgrade out of the following possible values.
     *
     * @param upgradeKind the upgradeKind value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setUpgradeKind(UpgradeKind upgradeKind) {
        this.upgradeKind = upgradeKind;
        return this;
    }

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
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
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
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get the upgradeReplicaSetCheckTimeoutInSeconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @return the upgradeReplicaSetCheckTimeoutInSeconds value.
     */
    public Long getUpgradeReplicaSetCheckTimeoutInSeconds() {
        return this.upgradeReplicaSetCheckTimeoutInSeconds;
    }

    /**
     * Set the upgradeReplicaSetCheckTimeoutInSeconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @param upgradeReplicaSetCheckTimeoutInSeconds the upgradeReplicaSetCheckTimeoutInSeconds value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setUpgradeReplicaSetCheckTimeoutInSeconds(
            Long upgradeReplicaSetCheckTimeoutInSeconds) {
        this.upgradeReplicaSetCheckTimeoutInSeconds = upgradeReplicaSetCheckTimeoutInSeconds;
        return this;
    }

    /**
     * Get the monitoringPolicy property: Describes the parameters for monitoring an upgrade in Monitored mode.
     *
     * @return the monitoringPolicy value.
     */
    public MonitoringPolicyDescription getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /**
     * Set the monitoringPolicy property: Describes the parameters for monitoring an upgrade in Monitored mode.
     *
     * @param monitoringPolicy the monitoringPolicy value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setMonitoringPolicy(MonitoringPolicyDescription monitoringPolicy) {
        this.monitoringPolicy = monitoringPolicy;
        return this;
    }

    /**
     * Get the applicationHealthPolicy property: Defines a health policy used to evaluate the health of an application
     * or one of its children entities.
     *
     * @return the applicationHealthPolicy value.
     */
    public ApplicationHealthPolicy getApplicationHealthPolicy() {
        return this.applicationHealthPolicy;
    }

    /**
     * Set the applicationHealthPolicy property: Defines a health policy used to evaluate the health of an application
     * or one of its children entities.
     *
     * @param applicationHealthPolicy the applicationHealthPolicy value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setApplicationHealthPolicy(
            ApplicationHealthPolicy applicationHealthPolicy) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        return this;
    }

    /**
     * Get the targetApplicationTypeVersion property: The target application type version (found in the application
     * manifest) for the application upgrade.
     *
     * @return the targetApplicationTypeVersion value.
     */
    public String getTargetApplicationTypeVersion() {
        return this.targetApplicationTypeVersion;
    }

    /**
     * Set the targetApplicationTypeVersion property: The target application type version (found in the application
     * manifest) for the application upgrade.
     *
     * @param targetApplicationTypeVersion the targetApplicationTypeVersion value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setTargetApplicationTypeVersion(String targetApplicationTypeVersion) {
        this.targetApplicationTypeVersion = targetApplicationTypeVersion;
        return this;
    }

    /**
     * Get the upgradeDuration property: The estimated amount of time that the overall upgrade elapsed. It is first
     * interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number
     * representing the total number of milliseconds.
     *
     * @return the upgradeDuration value.
     */
    public String getUpgradeDuration() {
        return this.upgradeDuration;
    }

    /**
     * Set the upgradeDuration property: The estimated amount of time that the overall upgrade elapsed. It is first
     * interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number
     * representing the total number of milliseconds.
     *
     * @param upgradeDuration the upgradeDuration value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setUpgradeDuration(String upgradeDuration) {
        this.upgradeDuration = upgradeDuration;
        return this;
    }

    /**
     * Get the currentUpgradeDomainDuration property: The estimated amount of time spent processing current Upgrade
     * Domain. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is
     * interpreted as a number representing the total number of milliseconds.
     *
     * @return the currentUpgradeDomainDuration value.
     */
    public String getCurrentUpgradeDomainDuration() {
        return this.currentUpgradeDomainDuration;
    }

    /**
     * Set the currentUpgradeDomainDuration property: The estimated amount of time spent processing current Upgrade
     * Domain. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is
     * interpreted as a number representing the total number of milliseconds.
     *
     * @param currentUpgradeDomainDuration the currentUpgradeDomainDuration value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setCurrentUpgradeDomainDuration(String currentUpgradeDomainDuration) {
        this.currentUpgradeDomainDuration = currentUpgradeDomainDuration;
        return this;
    }

    /**
     * Get the applicationUnhealthyEvaluations property: List of health evaluations that resulted in the current
     * aggregated health state.
     *
     * @return the applicationUnhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getApplicationUnhealthyEvaluations() {
        return this.applicationUnhealthyEvaluations;
    }

    /**
     * Set the applicationUnhealthyEvaluations property: List of health evaluations that resulted in the current
     * aggregated health state.
     *
     * @param applicationUnhealthyEvaluations the applicationUnhealthyEvaluations value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setApplicationUnhealthyEvaluations(
            List<HealthEvaluationWrapper> applicationUnhealthyEvaluations) {
        this.applicationUnhealthyEvaluations = applicationUnhealthyEvaluations;
        return this;
    }

    /**
     * Get the currentUpgradeDomainProgress property: Information about the current in-progress upgrade domain. Not
     * applicable to node-by-node upgrades.
     *
     * @return the currentUpgradeDomainProgress value.
     */
    public CurrentUpgradeDomainProgressInfo getCurrentUpgradeDomainProgress() {
        return this.currentUpgradeDomainProgress;
    }

    /**
     * Set the currentUpgradeDomainProgress property: Information about the current in-progress upgrade domain. Not
     * applicable to node-by-node upgrades.
     *
     * @param currentUpgradeDomainProgress the currentUpgradeDomainProgress value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setCurrentUpgradeDomainProgress(
            CurrentUpgradeDomainProgressInfo currentUpgradeDomainProgress) {
        this.currentUpgradeDomainProgress = currentUpgradeDomainProgress;
        return this;
    }

    /**
     * Get the startTimestampUtc property: The estimated UTC datetime when the upgrade started.
     *
     * @return the startTimestampUtc value.
     */
    public String getStartTimestampUtc() {
        return this.startTimestampUtc;
    }

    /**
     * Set the startTimestampUtc property: The estimated UTC datetime when the upgrade started.
     *
     * @param startTimestampUtc the startTimestampUtc value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setStartTimestampUtc(String startTimestampUtc) {
        this.startTimestampUtc = startTimestampUtc;
        return this;
    }

    /**
     * Get the failureTimestampUtc property: The estimated UTC datetime when the upgrade failed and FailureAction was
     * executed.
     *
     * @return the failureTimestampUtc value.
     */
    public String getFailureTimestampUtc() {
        return this.failureTimestampUtc;
    }

    /**
     * Set the failureTimestampUtc property: The estimated UTC datetime when the upgrade failed and FailureAction was
     * executed.
     *
     * @param failureTimestampUtc the failureTimestampUtc value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setFailureTimestampUtc(String failureTimestampUtc) {
        this.failureTimestampUtc = failureTimestampUtc;
        return this;
    }

    /**
     * Get the failureReason property: The cause of an upgrade failure that resulted in FailureAction being executed.
     *
     * @return the failureReason value.
     */
    public FailureReason getFailureReason() {
        return this.failureReason;
    }

    /**
     * Set the failureReason property: The cause of an upgrade failure that resulted in FailureAction being executed.
     *
     * @param failureReason the failureReason value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Get the upgradeDomainProgressAtFailure property: Information about the upgrade domain progress at the time of
     * upgrade failure.
     *
     * @return the upgradeDomainProgressAtFailure value.
     */
    public FailureUpgradeDomainProgressInfo getUpgradeDomainProgressAtFailure() {
        return this.upgradeDomainProgressAtFailure;
    }

    /**
     * Set the upgradeDomainProgressAtFailure property: Information about the upgrade domain progress at the time of
     * upgrade failure.
     *
     * @param upgradeDomainProgressAtFailure the upgradeDomainProgressAtFailure value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setUpgradeDomainProgressAtFailure(
            FailureUpgradeDomainProgressInfo upgradeDomainProgressAtFailure) {
        this.upgradeDomainProgressAtFailure = upgradeDomainProgressAtFailure;
        return this;
    }

    /**
     * Get the applicationUpgradeStatusDetails property: Additional details of application upgrade including failure
     * message.
     *
     * @return the applicationUpgradeStatusDetails value.
     */
    public String getApplicationUpgradeStatusDetails() {
        return this.applicationUpgradeStatusDetails;
    }

    /**
     * Set the applicationUpgradeStatusDetails property: Additional details of application upgrade including failure
     * message.
     *
     * @param applicationUpgradeStatusDetails the applicationUpgradeStatusDetails value to set.
     * @return the ComposeDeploymentUpgradeProgressInfo object itself.
     */
    public ComposeDeploymentUpgradeProgressInfo setApplicationUpgradeStatusDetails(
            String applicationUpgradeStatusDetails) {
        this.applicationUpgradeStatusDetails = applicationUpgradeStatusDetails;
        return this;
    }
}
