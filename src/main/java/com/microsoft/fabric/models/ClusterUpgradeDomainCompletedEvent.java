package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Cluster Upgrade Domain Completed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ClusterUpgradeDomainCompleted")
@Fluent
public final class ClusterUpgradeDomainCompletedEvent extends ClusterEvent {
    /*
     * Target Cluster version.
     */
    @JsonProperty(value = "TargetClusterVersion", required = true)
    private String targetClusterVersion;

    /*
     * State of upgrade.
     */
    @JsonProperty(value = "UpgradeState", required = true)
    private String upgradeState;

    /*
     * Upgrade domains.
     */
    @JsonProperty(value = "UpgradeDomains", required = true)
    private String upgradeDomains;

    /*
     * Duration of domain upgrade in milli-seconds.
     */
    @JsonProperty(value = "UpgradeDomainElapsedTimeInMs", required = true)
    private double upgradeDomainElapsedTimeInMs;

    /**
     * Get the targetClusterVersion property: Target Cluster version.
     *
     * @return the targetClusterVersion value.
     */
    public String getTargetClusterVersion() {
        return this.targetClusterVersion;
    }

    /**
     * Set the targetClusterVersion property: Target Cluster version.
     *
     * @param targetClusterVersion the targetClusterVersion value to set.
     * @return the ClusterUpgradeDomainCompletedEvent object itself.
     */
    public ClusterUpgradeDomainCompletedEvent setTargetClusterVersion(String targetClusterVersion) {
        this.targetClusterVersion = targetClusterVersion;
        return this;
    }

    /**
     * Get the upgradeState property: State of upgrade.
     *
     * @return the upgradeState value.
     */
    public String getUpgradeState() {
        return this.upgradeState;
    }

    /**
     * Set the upgradeState property: State of upgrade.
     *
     * @param upgradeState the upgradeState value to set.
     * @return the ClusterUpgradeDomainCompletedEvent object itself.
     */
    public ClusterUpgradeDomainCompletedEvent setUpgradeState(String upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the upgradeDomains property: Upgrade domains.
     *
     * @return the upgradeDomains value.
     */
    public String getUpgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Set the upgradeDomains property: Upgrade domains.
     *
     * @param upgradeDomains the upgradeDomains value to set.
     * @return the ClusterUpgradeDomainCompletedEvent object itself.
     */
    public ClusterUpgradeDomainCompletedEvent setUpgradeDomains(String upgradeDomains) {
        this.upgradeDomains = upgradeDomains;
        return this;
    }

    /**
     * Get the upgradeDomainElapsedTimeInMs property: Duration of domain upgrade in milli-seconds.
     *
     * @return the upgradeDomainElapsedTimeInMs value.
     */
    public double getUpgradeDomainElapsedTimeInMs() {
        return this.upgradeDomainElapsedTimeInMs;
    }

    /**
     * Set the upgradeDomainElapsedTimeInMs property: Duration of domain upgrade in milli-seconds.
     *
     * @param upgradeDomainElapsedTimeInMs the upgradeDomainElapsedTimeInMs value to set.
     * @return the ClusterUpgradeDomainCompletedEvent object itself.
     */
    public ClusterUpgradeDomainCompletedEvent setUpgradeDomainElapsedTimeInMs(double upgradeDomainElapsedTimeInMs) {
        this.upgradeDomainElapsedTimeInMs = upgradeDomainElapsedTimeInMs;
        return this;
    }
}
