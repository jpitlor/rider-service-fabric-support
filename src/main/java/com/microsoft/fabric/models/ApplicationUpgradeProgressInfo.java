package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the parameters for an application upgrade. */
@Fluent
public final class ApplicationUpgradeProgressInfo {
    /*
     * The name of the target application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "TypeName")
    private String typeName;

    /*
     * The target application type version (found in the application manifest)
     * for the application upgrade.
     */
    @JsonProperty(value = "TargetApplicationTypeVersion")
    private String targetApplicationTypeVersion;

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
     * Describes the parameters for an application upgrade. Note that upgrade
     * description replaces the existing application description. This means
     * that if the parameters are not specified, the existing parameters on the
     * applications will be overwritten with the empty parameters list. This
     * would result in the application using the default value of the
     * parameters from the application manifest. If you do not want to change
     * any existing parameter values, please get the application parameters
     * first using the GetApplicationInfo query and then supply those values as
     * Parameters in this ApplicationUpgradeDescription.
     */
    @JsonProperty(value = "UpgradeDescription")
    private ApplicationUpgradeDescription upgradeDescription;

    /*
     * The estimated total amount of time spent processing the overall upgrade.
     */
    @JsonProperty(value = "UpgradeDurationInMilliseconds")
    private String upgradeDurationInMilliseconds;

    /*
     * The estimated total amount of time spent processing the current upgrade
     * domain.
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
     * Additional detailed information about the status of the pending upgrade.
     */
    @JsonProperty(value = "UpgradeStatusDetails")
    private String upgradeStatusDetails;

    /*
     * Indicates whether this upgrade is node-by-node.
     */
    @JsonProperty(value = "IsNodeByNode")
    private Boolean isNodeByNode;

    /**
     * Get the name property: The name of the target application, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the target application, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the typeName property: The application type name as defined in the application manifest.
     *
     * @return the typeName value.
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The application type name as defined in the application manifest.
     *
     * @param typeName the typeName value to set.
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setTypeName(String typeName) {
        this.typeName = typeName;
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setTargetApplicationTypeVersion(String targetApplicationTypeVersion) {
        this.targetApplicationTypeVersion = targetApplicationTypeVersion;
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeDomains(List<UpgradeDomainInfo> upgradeDomains) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeUnits(List<UpgradeUnitInfo> upgradeUnits) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeState(UpgradeState upgradeState) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setNextUpgradeDomain(String nextUpgradeDomain) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the upgradeDescription property: Describes the parameters for an application upgrade. Note that upgrade
     * description replaces the existing application description. This means that if the parameters are not specified,
     * the existing parameters on the applications will be overwritten with the empty parameters list. This would result
     * in the application using the default value of the parameters from the application manifest. If you do not want to
     * change any existing parameter values, please get the application parameters first using the GetApplicationInfo
     * query and then supply those values as Parameters in this ApplicationUpgradeDescription.
     *
     * @return the upgradeDescription value.
     */
    public ApplicationUpgradeDescription getUpgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set the upgradeDescription property: Describes the parameters for an application upgrade. Note that upgrade
     * description replaces the existing application description. This means that if the parameters are not specified,
     * the existing parameters on the applications will be overwritten with the empty parameters list. This would result
     * in the application using the default value of the parameters from the application manifest. If you do not want to
     * change any existing parameter values, please get the application parameters first using the GetApplicationInfo
     * query and then supply those values as Parameters in this ApplicationUpgradeDescription.
     *
     * @param upgradeDescription the upgradeDescription value to set.
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeDescription(ApplicationUpgradeDescription upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

    /**
     * Get the upgradeDurationInMilliseconds property: The estimated total amount of time spent processing the overall
     * upgrade.
     *
     * @return the upgradeDurationInMilliseconds value.
     */
    public String getUpgradeDurationInMilliseconds() {
        return this.upgradeDurationInMilliseconds;
    }

    /**
     * Set the upgradeDurationInMilliseconds property: The estimated total amount of time spent processing the overall
     * upgrade.
     *
     * @param upgradeDurationInMilliseconds the upgradeDurationInMilliseconds value to set.
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeDurationInMilliseconds(String upgradeDurationInMilliseconds) {
        this.upgradeDurationInMilliseconds = upgradeDurationInMilliseconds;
        return this;
    }

    /**
     * Get the upgradeDomainDurationInMilliseconds property: The estimated total amount of time spent processing the
     * current upgrade domain.
     *
     * @return the upgradeDomainDurationInMilliseconds value.
     */
    public String getUpgradeDomainDurationInMilliseconds() {
        return this.upgradeDomainDurationInMilliseconds;
    }

    /**
     * Set the upgradeDomainDurationInMilliseconds property: The estimated total amount of time spent processing the
     * current upgrade domain.
     *
     * @param upgradeDomainDurationInMilliseconds the upgradeDomainDurationInMilliseconds value to set.
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeDomainDurationInMilliseconds(
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setCurrentUpgradeDomainProgress(
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setCurrentUpgradeUnitsProgress(
            CurrentUpgradeUnitsProgressInfo currentUpgradeUnitsProgress) {
        this.currentUpgradeUnitsProgress = currentUpgradeUnitsProgress;
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setStartTimestampUtc(String startTimestampUtc) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setFailureTimestampUtc(String failureTimestampUtc) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setFailureReason(FailureReason failureReason) {
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeDomainProgressAtFailure(
            FailureUpgradeDomainProgressInfo upgradeDomainProgressAtFailure) {
        this.upgradeDomainProgressAtFailure = upgradeDomainProgressAtFailure;
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setUpgradeStatusDetails(String upgradeStatusDetails) {
        this.upgradeStatusDetails = upgradeStatusDetails;
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
     * @return the ApplicationUpgradeProgressInfo object itself.
     */
    public ApplicationUpgradeProgressInfo setIsNodeByNode(Boolean isNodeByNode) {
        this.isNodeByNode = isNodeByNode;
        return this;
    }
}
