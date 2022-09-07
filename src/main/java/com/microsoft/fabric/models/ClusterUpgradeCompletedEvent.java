package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Cluster Upgrade Completed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ClusterUpgradeCompleted")
@Fluent
public final class ClusterUpgradeCompletedEvent extends ClusterEvent {
    /*
     * Target Cluster version.
     */
    @JsonProperty(value = "TargetClusterVersion", required = true)
    private String targetClusterVersion;

    /*
     * Overall duration of upgrade in milli-seconds.
     */
    @JsonProperty(value = "OverallUpgradeElapsedTimeInMs", required = true)
    private double overallUpgradeElapsedTimeInMs;

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
     * @return the ClusterUpgradeCompletedEvent object itself.
     */
    public ClusterUpgradeCompletedEvent setTargetClusterVersion(String targetClusterVersion) {
        this.targetClusterVersion = targetClusterVersion;
        return this;
    }

    /**
     * Get the overallUpgradeElapsedTimeInMs property: Overall duration of upgrade in milli-seconds.
     *
     * @return the overallUpgradeElapsedTimeInMs value.
     */
    public double getOverallUpgradeElapsedTimeInMs() {
        return this.overallUpgradeElapsedTimeInMs;
    }

    /**
     * Set the overallUpgradeElapsedTimeInMs property: Overall duration of upgrade in milli-seconds.
     *
     * @param overallUpgradeElapsedTimeInMs the overallUpgradeElapsedTimeInMs value to set.
     * @return the ClusterUpgradeCompletedEvent object itself.
     */
    public ClusterUpgradeCompletedEvent setOverallUpgradeElapsedTimeInMs(double overallUpgradeElapsedTimeInMs) {
        this.overallUpgradeElapsedTimeInMs = overallUpgradeElapsedTimeInMs;
        return this;
    }
}
