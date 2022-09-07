package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for starting a cluster upgrade. */
@Fluent
public final class StartClusterUpgradeDescription {
    /*
     * The cluster code version.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /*
     * The cluster configuration version.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

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
     * If true, then processes are forcefully restarted during upgrade even
     * when the code version has not changed (the upgrade only changes
     * configuration or data).
     */
    @JsonProperty(value = "ForceRestart")
    private Boolean forceRestart;

    /*
     * Defines the order in which an upgrade proceeds through the cluster.
     */
    @JsonProperty(value = "SortOrder")
    private UpgradeSortOrder sortOrder;

    /*
     * Describes the parameters for monitoring an upgrade in Monitored mode.
     */
    @JsonProperty(value = "MonitoringPolicy")
    private MonitoringPolicyDescription monitoringPolicy;

    /*
     * Defines a health policy used to evaluate the health of the cluster or of
     * a cluster node.
     */
    @JsonProperty(value = "ClusterHealthPolicy")
    private ClusterHealthPolicy clusterHealthPolicy;

    /*
     * When true, enables delta health evaluation rather than absolute health
     * evaluation after completion of each upgrade domain.
     */
    @JsonProperty(value = "EnableDeltaHealthEvaluation")
    private Boolean enableDeltaHealthEvaluation;

    /*
     * Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     */
    @JsonProperty(value = "ClusterUpgradeHealthPolicy")
    private ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy;

    /*
     * Defines the application health policy map used to evaluate the health of
     * an application or one of its children entities.
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private ApplicationHealthPolicies applicationHealthPolicyMap;

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
     * Get the codeVersion property: The cluster code version.
     *
     * @return the codeVersion value.
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the codeVersion property: The cluster code version.
     *
     * @param codeVersion the codeVersion value to set.
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the configVersion property: The cluster configuration version.
     *
     * @return the configVersion value.
     */
    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * Set the configVersion property: The cluster configuration version.
     *
     * @param configVersion the configVersion value to set.
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
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
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setUpgradeKind(UpgradeKind upgradeKind) {
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
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
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
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setUpgradeReplicaSetCheckTimeoutInSeconds(
            Long upgradeReplicaSetCheckTimeoutInSeconds) {
        this.upgradeReplicaSetCheckTimeoutInSeconds = upgradeReplicaSetCheckTimeoutInSeconds;
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
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get the sortOrder property: Defines the order in which an upgrade proceeds through the cluster.
     *
     * @return the sortOrder value.
     */
    public UpgradeSortOrder getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Set the sortOrder property: Defines the order in which an upgrade proceeds through the cluster.
     *
     * @param sortOrder the sortOrder value to set.
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setSortOrder(UpgradeSortOrder sortOrder) {
        this.sortOrder = sortOrder;
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
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setMonitoringPolicy(MonitoringPolicyDescription monitoringPolicy) {
        this.monitoringPolicy = monitoringPolicy;
        return this;
    }

    /**
     * Get the clusterHealthPolicy property: Defines a health policy used to evaluate the health of the cluster or of a
     * cluster node.
     *
     * @return the clusterHealthPolicy value.
     */
    public ClusterHealthPolicy getClusterHealthPolicy() {
        return this.clusterHealthPolicy;
    }

    /**
     * Set the clusterHealthPolicy property: Defines a health policy used to evaluate the health of the cluster or of a
     * cluster node.
     *
     * @param clusterHealthPolicy the clusterHealthPolicy value to set.
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setClusterHealthPolicy(ClusterHealthPolicy clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }

    /**
     * Get the enableDeltaHealthEvaluation property: When true, enables delta health evaluation rather than absolute
     * health evaluation after completion of each upgrade domain.
     *
     * @return the enableDeltaHealthEvaluation value.
     */
    public Boolean isEnableDeltaHealthEvaluation() {
        return this.enableDeltaHealthEvaluation;
    }

    /**
     * Set the enableDeltaHealthEvaluation property: When true, enables delta health evaluation rather than absolute
     * health evaluation after completion of each upgrade domain.
     *
     * @param enableDeltaHealthEvaluation the enableDeltaHealthEvaluation value to set.
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setEnableDeltaHealthEvaluation(Boolean enableDeltaHealthEvaluation) {
        this.enableDeltaHealthEvaluation = enableDeltaHealthEvaluation;
        return this;
    }

    /**
     * Get the clusterUpgradeHealthPolicy property: Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     *
     * @return the clusterUpgradeHealthPolicy value.
     */
    public ClusterUpgradeHealthPolicyObject getClusterUpgradeHealthPolicy() {
        return this.clusterUpgradeHealthPolicy;
    }

    /**
     * Set the clusterUpgradeHealthPolicy property: Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     *
     * @param clusterUpgradeHealthPolicy the clusterUpgradeHealthPolicy value to set.
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setClusterUpgradeHealthPolicy(
            ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy) {
        this.clusterUpgradeHealthPolicy = clusterUpgradeHealthPolicy;
        return this;
    }

    /**
     * Get the applicationHealthPolicyMap property: Defines the application health policy map used to evaluate the
     * health of an application or one of its children entities.
     *
     * @return the applicationHealthPolicyMap value.
     */
    public ApplicationHealthPolicies getApplicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set the applicationHealthPolicyMap property: Defines the application health policy map used to evaluate the
     * health of an application or one of its children entities.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set.
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setApplicationHealthPolicyMap(
            ApplicationHealthPolicies applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
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
     * @return the StartClusterUpgradeDescription object itself.
     */
    public StartClusterUpgradeDescription setInstanceCloseDelayDurationInSeconds(
            Long instanceCloseDelayDurationInSeconds) {
        this.instanceCloseDelayDurationInSeconds = instanceCloseDelayDurationInSeconds;
        return this;
    }
}
