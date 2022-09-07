package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a standalone cluster configuration upgrade status. */
@Fluent
public final class ClusterConfigurationUpgradeStatusInfo {
    /*
     * The state of the upgrade domain.
     */
    @JsonProperty(value = "UpgradeState")
    private UpgradeState upgradeState;

    /*
     * The cluster manifest version.
     */
    @JsonProperty(value = "ProgressStatus")
    private Integer progressStatus;

    /*
     * The cluster configuration version.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /*
     * The cluster upgrade status details.
     */
    @JsonProperty(value = "Details")
    private String details;

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
     * @return the ClusterConfigurationUpgradeStatusInfo object itself.
     */
    public ClusterConfigurationUpgradeStatusInfo setUpgradeState(UpgradeState upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the progressStatus property: The cluster manifest version.
     *
     * @return the progressStatus value.
     */
    public Integer getProgressStatus() {
        return this.progressStatus;
    }

    /**
     * Set the progressStatus property: The cluster manifest version.
     *
     * @param progressStatus the progressStatus value to set.
     * @return the ClusterConfigurationUpgradeStatusInfo object itself.
     */
    public ClusterConfigurationUpgradeStatusInfo setProgressStatus(Integer progressStatus) {
        this.progressStatus = progressStatus;
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
     * @return the ClusterConfigurationUpgradeStatusInfo object itself.
     */
    public ClusterConfigurationUpgradeStatusInfo setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    /**
     * Get the details property: The cluster upgrade status details.
     *
     * @return the details value.
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Set the details property: The cluster upgrade status details.
     *
     * @param details the details value to set.
     * @return the ClusterConfigurationUpgradeStatusInfo object itself.
     */
    public ClusterConfigurationUpgradeStatusInfo setDetails(String details) {
        this.details = details;
        return this;
    }
}
