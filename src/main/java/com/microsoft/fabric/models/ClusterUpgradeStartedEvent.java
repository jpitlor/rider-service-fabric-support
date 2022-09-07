package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Cluster Upgrade Started event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ClusterUpgradeStarted")
@Fluent
public final class ClusterUpgradeStartedEvent extends ClusterEvent {
    /*
     * Current Cluster version.
     */
    @JsonProperty(value = "CurrentClusterVersion", required = true)
    private String currentClusterVersion;

    /*
     * Target Cluster version.
     */
    @JsonProperty(value = "TargetClusterVersion", required = true)
    private String targetClusterVersion;

    /*
     * Type of upgrade.
     */
    @JsonProperty(value = "UpgradeType", required = true)
    private String upgradeType;

    /*
     * Mode of upgrade.
     */
    @JsonProperty(value = "RollingUpgradeMode", required = true)
    private String rollingUpgradeMode;

    /*
     * Action if failed.
     */
    @JsonProperty(value = "FailureAction", required = true)
    private String failureAction;

    /**
     * Get the currentClusterVersion property: Current Cluster version.
     *
     * @return the currentClusterVersion value.
     */
    public String getCurrentClusterVersion() {
        return this.currentClusterVersion;
    }

    /**
     * Set the currentClusterVersion property: Current Cluster version.
     *
     * @param currentClusterVersion the currentClusterVersion value to set.
     * @return the ClusterUpgradeStartedEvent object itself.
     */
    public ClusterUpgradeStartedEvent setCurrentClusterVersion(String currentClusterVersion) {
        this.currentClusterVersion = currentClusterVersion;
        return this;
    }

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
     * @return the ClusterUpgradeStartedEvent object itself.
     */
    public ClusterUpgradeStartedEvent setTargetClusterVersion(String targetClusterVersion) {
        this.targetClusterVersion = targetClusterVersion;
        return this;
    }

    /**
     * Get the upgradeType property: Type of upgrade.
     *
     * @return the upgradeType value.
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    /**
     * Set the upgradeType property: Type of upgrade.
     *
     * @param upgradeType the upgradeType value to set.
     * @return the ClusterUpgradeStartedEvent object itself.
     */
    public ClusterUpgradeStartedEvent setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * Get the rollingUpgradeMode property: Mode of upgrade.
     *
     * @return the rollingUpgradeMode value.
     */
    public String getRollingUpgradeMode() {
        return this.rollingUpgradeMode;
    }

    /**
     * Set the rollingUpgradeMode property: Mode of upgrade.
     *
     * @param rollingUpgradeMode the rollingUpgradeMode value to set.
     * @return the ClusterUpgradeStartedEvent object itself.
     */
    public ClusterUpgradeStartedEvent setRollingUpgradeMode(String rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the failureAction property: Action if failed.
     *
     * @return the failureAction value.
     */
    public String getFailureAction() {
        return this.failureAction;
    }

    /**
     * Set the failureAction property: Action if failed.
     *
     * @param failureAction the failureAction value to set.
     * @return the ClusterUpgradeStartedEvent object itself.
     */
    public ClusterUpgradeStartedEvent setFailureAction(String failureAction) {
        this.failureAction = failureAction;
        return this;
    }
}
