package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Cluster Upgrade Rollback Completed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ClusterUpgradeRollbackCompleted")
@Fluent
public final class ClusterUpgradeRollbackCompletedEvent extends ClusterEvent {
    /*
     * Target Cluster version.
     */
    @JsonProperty(value = "TargetClusterVersion", required = true)
    private String targetClusterVersion;

    /*
     * Describes failure.
     */
    @JsonProperty(value = "FailureReason", required = true)
    private String failureReason;

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
     * @return the ClusterUpgradeRollbackCompletedEvent object itself.
     */
    public ClusterUpgradeRollbackCompletedEvent setTargetClusterVersion(String targetClusterVersion) {
        this.targetClusterVersion = targetClusterVersion;
        return this;
    }

    /**
     * Get the failureReason property: Describes failure.
     *
     * @return the failureReason value.
     */
    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * Set the failureReason property: Describes failure.
     *
     * @param failureReason the failureReason value to set.
     * @return the ClusterUpgradeRollbackCompletedEvent object itself.
     */
    public ClusterUpgradeRollbackCompletedEvent setFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
     * @return the ClusterUpgradeRollbackCompletedEvent object itself.
     */
    public ClusterUpgradeRollbackCompletedEvent setOverallUpgradeElapsedTimeInMs(double overallUpgradeElapsedTimeInMs) {
        this.overallUpgradeElapsedTimeInMs = overallUpgradeElapsedTimeInMs;
        return this;
    }
}
