package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a cluster upgrade. */
@Fluent
public final class ClusterUpgradeProgressObject {
    /*
     * The ServiceFabric code version of the cluster.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /*
     * The cluster configuration version (specified in the cluster manifest).
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /*
     * List of upgrade domains and their statuses. Not applicable to
     * node-by-node upgrades.
     */
    @JsonProperty(value = "UpgradeDomains")
    private List<UpgradeDomainInfo> upgradeDomains;

    /*
     * List of upgrade units and their statuses.
     */
    @JsonProperty(value = "UpgradeUnits")
    private List<UpgradeUnitInfo> upgradeUnits;

    /*
     * The state of the upgrade domain.
     */
    @JsonProperty(value = "UpgradeState")
    private UpgradeState upgradeState;

    /*
     * The name of the next upgrade domain to be processed. Not applicable to
     * node-by-node upgrades.
     */
    @JsonProperty(value = "NextUpgradeDomain")
    private String nextUpgradeDomain;

    /*
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     */
    @JsonProperty(value = "RollingUpgradeMode")
    private UpgradeMode rollingUpgradeMode;

    /*
     * Represents a ServiceFabric cluster upgrade
     */
    @JsonProperty(value = "UpgradeDescription")
    private ClusterUpgradeDescriptionObject upgradeDescription;

    /*
     * The estimated elapsed time spent processing the current overall upgrade.
     */
    @JsonProperty(value = "UpgradeDurationInMilliseconds")
    private String upgradeDurationInMilliseconds;

    /*
     * The estimated elapsed time spent processing the current upgrade domain.
     * Not applicable to node-by-node upgrades.
     */
    @JsonProperty(value = "UpgradeDomainDurationInMilliseconds")
    private String upgradeDomainDurationInMilliseconds;

    /*
     * List of health evaluations that resulted in the current aggregated
     * health state.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /*
     * Information about the current in-progress upgrade domain. Not applicable
     * to node-by-node upgrades.
     */
    @JsonProperty(value = "CurrentUpgradeDomainProgress")
    private CurrentUpgradeDomainProgressInfo currentUpgradeDomainProgress;

    /*
     * Information about the current in-progress upgrade units.
     */
    @JsonProperty(value = "CurrentUpgradeUnitsProgress")
    private CurrentUpgradeUnitsProgressInfo currentUpgradeUnitsProgress;

    /*
     * The start time of the upgrade in UTC.
     */
    @JsonProperty(value = "StartTimestampUtc")
    private String startTimestampUtc;

    /*
     * The failure time of the upgrade in UTC.
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
     * The detailed upgrade progress for nodes in the current upgrade domain at
     * the point of failure. Not applicable to node-by-node upgrades.
     */
    @JsonProperty(value = "UpgradeDomainProgressAtFailure")
    private FailedUpgradeDomainProgressObject upgradeDomainProgressAtFailure;

    /*
     * Indicates whether this upgrade is node-by-node.
     */
    @JsonProperty(value = "IsNodeByNode")
    private Boolean isNodeByNode;

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
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

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
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    /**
     * Get the upgradeDomains property: List of upgrade domains and their statuses. Not applicable to node-by-node
     * upgrades.
     *
     * @return the upgradeDomains value.
     */
    public List<UpgradeDomainInfo> getUpgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Set the upgradeDomains property: List of upgrade domains and their statuses. Not applicable to node-by-node
     * upgrades.
     *
     * @param upgradeDomains the upgradeDomains value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUpgradeDomains(List<UpgradeDomainInfo> upgradeDomains) {
        this.upgradeDomains = upgradeDomains;
        return this;
    }

    /**
     * Get the upgradeUnits property: List of upgrade units and their statuses.
     *
     * @return the upgradeUnits value.
     */
    public List<UpgradeUnitInfo> getUpgradeUnits() {
        return this.upgradeUnits;
    }

    /**
     * Set the upgradeUnits property: List of upgrade units and their statuses.
     *
     * @param upgradeUnits the upgradeUnits value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUpgradeUnits(List<UpgradeUnitInfo> upgradeUnits) {
        this.upgradeUnits = upgradeUnits;
        return this;
    }

    /**
     * Get the upgradeState property: The state of the upgrade domain.
     *
     * @return the upgradeState value.
     */
    public UpgradeState getUpgradeState() {
        return this.upgradeState;
    }

    /**
     * Set the upgradeState property: The state of the upgrade domain.
     *
     * @param upgradeState the upgradeState value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUpgradeState(UpgradeState upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the nextUpgradeDomain property: The name of the next upgrade domain to be processed. Not applicable to
     * node-by-node upgrades.
     *
     * @return the nextUpgradeDomain value.
     */
    public String getNextUpgradeDomain() {
        return this.nextUpgradeDomain;
    }

    /**
     * Set the nextUpgradeDomain property: The name of the next upgrade domain to be processed. Not applicable to
     * node-by-node upgrades.
     *
     * @param nextUpgradeDomain the nextUpgradeDomain value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setNextUpgradeDomain(String nextUpgradeDomain) {
        this.nextUpgradeDomain = nextUpgradeDomain;
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
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the upgradeDescription property: Represents a ServiceFabric cluster upgrade.
     *
     * @return the upgradeDescription value.
     */
    public ClusterUpgradeDescriptionObject getUpgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set the upgradeDescription property: Represents a ServiceFabric cluster upgrade.
     *
     * @param upgradeDescription the upgradeDescription value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUpgradeDescription(ClusterUpgradeDescriptionObject upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

    /**
     * Get the upgradeDurationInMilliseconds property: The estimated elapsed time spent processing the current overall
     * upgrade.
     *
     * @return the upgradeDurationInMilliseconds value.
     */
    public String getUpgradeDurationInMilliseconds() {
        return this.upgradeDurationInMilliseconds;
    }

    /**
     * Set the upgradeDurationInMilliseconds property: The estimated elapsed time spent processing the current overall
     * upgrade.
     *
     * @param upgradeDurationInMilliseconds the upgradeDurationInMilliseconds value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUpgradeDurationInMilliseconds(String upgradeDurationInMilliseconds) {
        this.upgradeDurationInMilliseconds = upgradeDurationInMilliseconds;
        return this;
    }

    /**
     * Get the upgradeDomainDurationInMilliseconds property: The estimated elapsed time spent processing the current
     * upgrade domain. Not applicable to node-by-node upgrades.
     *
     * @return the upgradeDomainDurationInMilliseconds value.
     */
    public String getUpgradeDomainDurationInMilliseconds() {
        return this.upgradeDomainDurationInMilliseconds;
    }

    /**
     * Set the upgradeDomainDurationInMilliseconds property: The estimated elapsed time spent processing the current
     * upgrade domain. Not applicable to node-by-node upgrades.
     *
     * @param upgradeDomainDurationInMilliseconds the upgradeDomainDurationInMilliseconds value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUpgradeDomainDurationInMilliseconds(
            String upgradeDomainDurationInMilliseconds) {
        this.upgradeDomainDurationInMilliseconds = upgradeDomainDurationInMilliseconds;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of health evaluations that resulted in the current aggregated health
     * state.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of health evaluations that resulted in the current aggregated health
     * state.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
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
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setCurrentUpgradeDomainProgress(
            CurrentUpgradeDomainProgressInfo currentUpgradeDomainProgress) {
        this.currentUpgradeDomainProgress = currentUpgradeDomainProgress;
        return this;
    }

    /**
     * Get the currentUpgradeUnitsProgress property: Information about the current in-progress upgrade units.
     *
     * @return the currentUpgradeUnitsProgress value.
     */
    public CurrentUpgradeUnitsProgressInfo getCurrentUpgradeUnitsProgress() {
        return this.currentUpgradeUnitsProgress;
    }

    /**
     * Set the currentUpgradeUnitsProgress property: Information about the current in-progress upgrade units.
     *
     * @param currentUpgradeUnitsProgress the currentUpgradeUnitsProgress value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setCurrentUpgradeUnitsProgress(
            CurrentUpgradeUnitsProgressInfo currentUpgradeUnitsProgress) {
        this.currentUpgradeUnitsProgress = currentUpgradeUnitsProgress;
        return this;
    }

    /**
     * Get the startTimestampUtc property: The start time of the upgrade in UTC.
     *
     * @return the startTimestampUtc value.
     */
    public String getStartTimestampUtc() {
        return this.startTimestampUtc;
    }

    /**
     * Set the startTimestampUtc property: The start time of the upgrade in UTC.
     *
     * @param startTimestampUtc the startTimestampUtc value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setStartTimestampUtc(String startTimestampUtc) {
        this.startTimestampUtc = startTimestampUtc;
        return this;
    }

    /**
     * Get the failureTimestampUtc property: The failure time of the upgrade in UTC.
     *
     * @return the failureTimestampUtc value.
     */
    public String getFailureTimestampUtc() {
        return this.failureTimestampUtc;
    }

    /**
     * Set the failureTimestampUtc property: The failure time of the upgrade in UTC.
     *
     * @param failureTimestampUtc the failureTimestampUtc value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setFailureTimestampUtc(String failureTimestampUtc) {
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
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Get the upgradeDomainProgressAtFailure property: The detailed upgrade progress for nodes in the current upgrade
     * domain at the point of failure. Not applicable to node-by-node upgrades.
     *
     * @return the upgradeDomainProgressAtFailure value.
     */
    public FailedUpgradeDomainProgressObject getUpgradeDomainProgressAtFailure() {
        return this.upgradeDomainProgressAtFailure;
    }

    /**
     * Set the upgradeDomainProgressAtFailure property: The detailed upgrade progress for nodes in the current upgrade
     * domain at the point of failure. Not applicable to node-by-node upgrades.
     *
     * @param upgradeDomainProgressAtFailure the upgradeDomainProgressAtFailure value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setUpgradeDomainProgressAtFailure(
            FailedUpgradeDomainProgressObject upgradeDomainProgressAtFailure) {
        this.upgradeDomainProgressAtFailure = upgradeDomainProgressAtFailure;
        return this;
    }

    /**
     * Get the isNodeByNode property: Indicates whether this upgrade is node-by-node.
     *
     * @return the isNodeByNode value.
     */
    public Boolean isNodeByNode() {
        return this.isNodeByNode;
    }

    /**
     * Set the isNodeByNode property: Indicates whether this upgrade is node-by-node.
     *
     * @param isNodeByNode the isNodeByNode value to set.
     * @return the ClusterUpgradeProgressObject object itself.
     */
    public ClusterUpgradeProgressObject setIsNodeByNode(Boolean isNodeByNode) {
        this.isNodeByNode = isNodeByNode;
        return this;
    }
}
