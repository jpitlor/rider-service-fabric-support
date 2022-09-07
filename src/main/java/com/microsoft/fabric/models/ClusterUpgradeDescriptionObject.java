package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a ServiceFabric cluster upgrade. */
@Fluent
public final class ClusterUpgradeDescriptionObject {
    /*
     * The cluster configuration version (specified in the cluster manifest).
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /*
     * The ServiceFabric code version of the cluster.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

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
     * When true, enables delta health evaluation rather than absolute health
     * evaluation after completion of each upgrade domain.
     */
    @JsonProperty(value = "EnableDeltaHealthEvaluation")
    private Boolean enableDeltaHealthEvaluation;

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
     * Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     */
    @JsonProperty(value = "ClusterUpgradeHealthPolicy")
    private ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy;

    /*
     * Represents the map of application health policies for a ServiceFabric
     * cluster upgrade
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private ApplicationHealthPolicyMapObject applicationHealthPolicyMap;

    /**
     * Get the configVersion property: The cluster configuration version (specified in the cluster manifest).
     *
     * @return the configVersion value.
     */
    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * Set the configVersion property: The cluster configuration version (specified in the cluster manifest).
     *
     * @param configVersion the configVersion value to set.
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    /**
     * Get the codeVersion property: The ServiceFabric code version of the cluster.
     *
     * @return the codeVersion value.
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the codeVersion property: The ServiceFabric code version of the cluster.
     *
     * @param codeVersion the codeVersion value to set.
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setUpgradeKind(UpgradeKind upgradeKind) {
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setUpgradeReplicaSetCheckTimeoutInSeconds(
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setForceRestart(Boolean forceRestart) {
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setSortOrder(UpgradeSortOrder sortOrder) {
        this.sortOrder = sortOrder;
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setEnableDeltaHealthEvaluation(Boolean enableDeltaHealthEvaluation) {
        this.enableDeltaHealthEvaluation = enableDeltaHealthEvaluation;
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setMonitoringPolicy(MonitoringPolicyDescription monitoringPolicy) {
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setClusterHealthPolicy(ClusterHealthPolicy clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
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
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setClusterUpgradeHealthPolicy(
            ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy) {
        this.clusterUpgradeHealthPolicy = clusterUpgradeHealthPolicy;
        return this;
    }

    /**
     * Get the applicationHealthPolicyMap property: Represents the map of application health policies for a
     * ServiceFabric cluster upgrade.
     *
     * @return the applicationHealthPolicyMap value.
     */
    public ApplicationHealthPolicyMapObject getApplicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set the applicationHealthPolicyMap property: Represents the map of application health policies for a
     * ServiceFabric cluster upgrade.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set.
     * @return the ClusterUpgradeDescriptionObject object itself.
     */
    public ClusterUpgradeDescriptionObject setApplicationHealthPolicyMap(
            ApplicationHealthPolicyMapObject applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
        return this;
    }
}
