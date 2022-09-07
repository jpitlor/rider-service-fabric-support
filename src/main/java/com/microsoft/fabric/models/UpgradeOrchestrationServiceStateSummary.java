package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Service state summary of Service Fabric Upgrade Orchestration Service. */
@Fluent
public final class UpgradeOrchestrationServiceStateSummary {
    /*
     * The current code version of the cluster.
     */
    @JsonProperty(value = "CurrentCodeVersion")
    private String currentCodeVersion;

    /*
     * The current manifest version of the cluster.
     */
    @JsonProperty(value = "CurrentManifestVersion")
    private String currentManifestVersion;

    /*
     * The target code version of  the cluster.
     */
    @JsonProperty(value = "TargetCodeVersion")
    private String targetCodeVersion;

    /*
     * The target manifest version of the cluster.
     */
    @JsonProperty(value = "TargetManifestVersion")
    private String targetManifestVersion;

    /*
     * The type of the pending upgrade of the cluster.
     */
    @JsonProperty(value = "PendingUpgradeType")
    private String pendingUpgradeType;

    /**
     * Get the currentCodeVersion property: The current code version of the cluster.
     *
     * @return the currentCodeVersion value.
     */
    public String getCurrentCodeVersion() {
        return this.currentCodeVersion;
    }

    /**
     * Set the currentCodeVersion property: The current code version of the cluster.
     *
     * @param currentCodeVersion the currentCodeVersion value to set.
     * @return the UpgradeOrchestrationServiceStateSummary object itself.
     */
    public UpgradeOrchestrationServiceStateSummary setCurrentCodeVersion(String currentCodeVersion) {
        this.currentCodeVersion = currentCodeVersion;
        return this;
    }

    /**
     * Get the currentManifestVersion property: The current manifest version of the cluster.
     *
     * @return the currentManifestVersion value.
     */
    public String getCurrentManifestVersion() {
        return this.currentManifestVersion;
    }

    /**
     * Set the currentManifestVersion property: The current manifest version of the cluster.
     *
     * @param currentManifestVersion the currentManifestVersion value to set.
     * @return the UpgradeOrchestrationServiceStateSummary object itself.
     */
    public UpgradeOrchestrationServiceStateSummary setCurrentManifestVersion(String currentManifestVersion) {
        this.currentManifestVersion = currentManifestVersion;
        return this;
    }

    /**
     * Get the targetCodeVersion property: The target code version of the cluster.
     *
     * @return the targetCodeVersion value.
     */
    public String getTargetCodeVersion() {
        return this.targetCodeVersion;
    }

    /**
     * Set the targetCodeVersion property: The target code version of the cluster.
     *
     * @param targetCodeVersion the targetCodeVersion value to set.
     * @return the UpgradeOrchestrationServiceStateSummary object itself.
     */
    public UpgradeOrchestrationServiceStateSummary setTargetCodeVersion(String targetCodeVersion) {
        this.targetCodeVersion = targetCodeVersion;
        return this;
    }

    /**
     * Get the targetManifestVersion property: The target manifest version of the cluster.
     *
     * @return the targetManifestVersion value.
     */
    public String getTargetManifestVersion() {
        return this.targetManifestVersion;
    }

    /**
     * Set the targetManifestVersion property: The target manifest version of the cluster.
     *
     * @param targetManifestVersion the targetManifestVersion value to set.
     * @return the UpgradeOrchestrationServiceStateSummary object itself.
     */
    public UpgradeOrchestrationServiceStateSummary setTargetManifestVersion(String targetManifestVersion) {
        this.targetManifestVersion = targetManifestVersion;
        return this;
    }

    /**
     * Get the pendingUpgradeType property: The type of the pending upgrade of the cluster.
     *
     * @return the pendingUpgradeType value.
     */
    public String getPendingUpgradeType() {
        return this.pendingUpgradeType;
    }

    /**
     * Set the pendingUpgradeType property: The type of the pending upgrade of the cluster.
     *
     * @param pendingUpgradeType the pendingUpgradeType value to set.
     * @return the UpgradeOrchestrationServiceStateSummary object itself.
     */
    public UpgradeOrchestrationServiceStateSummary setPendingUpgradeType(String pendingUpgradeType) {
        this.pendingUpgradeType = pendingUpgradeType;
        return this;
    }
}
