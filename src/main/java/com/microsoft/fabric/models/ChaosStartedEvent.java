package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Chaos Started event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosStarted")
@Fluent
public final class ChaosStartedEvent extends ClusterEvent {
    /*
     * Maximum number of concurrent faults.
     */
    @JsonProperty(value = "MaxConcurrentFaults", required = true)
    private long maxConcurrentFaults;

    /*
     * Time to run in seconds.
     */
    @JsonProperty(value = "TimeToRunInSeconds", required = true)
    private double timeToRunInSeconds;

    /*
     * Maximum timeout for cluster stabilization in seconds.
     */
    @JsonProperty(value = "MaxClusterStabilizationTimeoutInSeconds", required = true)
    private double maxClusterStabilizationTimeoutInSeconds;

    /*
     * Wait time between iterations in seconds.
     */
    @JsonProperty(value = "WaitTimeBetweenIterationsInSeconds", required = true)
    private double waitTimeBetweenIterationsInSeconds;

    /*
     * Wait time between faults in seconds.
     */
    @JsonProperty(value = "WaitTimeBetweenFaultsInSeconds", required = true)
    private double waitTimeBetweenFaultsInSeconds;

    /*
     * Indicates MoveReplica fault is enabled.
     */
    @JsonProperty(value = "MoveReplicaFaultEnabled", required = true)
    private boolean moveReplicaFaultEnabled;

    /*
     * List of included Node types.
     */
    @JsonProperty(value = "IncludedNodeTypeList", required = true)
    private String includedNodeTypeList;

    /*
     * List of included Applications.
     */
    @JsonProperty(value = "IncludedApplicationList", required = true)
    private String includedApplicationList;

    /*
     * Health policy.
     */
    @JsonProperty(value = "ClusterHealthPolicy", required = true)
    private String clusterHealthPolicy;

    /*
     * Chaos Context.
     */
    @JsonProperty(value = "ChaosContext", required = true)
    private String chaosContext;

    /**
     * Get the maxConcurrentFaults property: Maximum number of concurrent faults.
     *
     * @return the maxConcurrentFaults value.
     */
    public long getMaxConcurrentFaults() {
        return this.maxConcurrentFaults;
    }

    /**
     * Set the maxConcurrentFaults property: Maximum number of concurrent faults.
     *
     * @param maxConcurrentFaults the maxConcurrentFaults value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setMaxConcurrentFaults(long maxConcurrentFaults) {
        this.maxConcurrentFaults = maxConcurrentFaults;
        return this;
    }

    /**
     * Get the timeToRunInSeconds property: Time to run in seconds.
     *
     * @return the timeToRunInSeconds value.
     */
    public double getTimeToRunInSeconds() {
        return this.timeToRunInSeconds;
    }

    /**
     * Set the timeToRunInSeconds property: Time to run in seconds.
     *
     * @param timeToRunInSeconds the timeToRunInSeconds value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setTimeToRunInSeconds(double timeToRunInSeconds) {
        this.timeToRunInSeconds = timeToRunInSeconds;
        return this;
    }

    /**
     * Get the maxClusterStabilizationTimeoutInSeconds property: Maximum timeout for cluster stabilization in seconds.
     *
     * @return the maxClusterStabilizationTimeoutInSeconds value.
     */
    public double getMaxClusterStabilizationTimeoutInSeconds() {
        return this.maxClusterStabilizationTimeoutInSeconds;
    }

    /**
     * Set the maxClusterStabilizationTimeoutInSeconds property: Maximum timeout for cluster stabilization in seconds.
     *
     * @param maxClusterStabilizationTimeoutInSeconds the maxClusterStabilizationTimeoutInSeconds value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setMaxClusterStabilizationTimeoutInSeconds(
            double maxClusterStabilizationTimeoutInSeconds) {
        this.maxClusterStabilizationTimeoutInSeconds = maxClusterStabilizationTimeoutInSeconds;
        return this;
    }

    /**
     * Get the waitTimeBetweenIterationsInSeconds property: Wait time between iterations in seconds.
     *
     * @return the waitTimeBetweenIterationsInSeconds value.
     */
    public double getWaitTimeBetweenIterationsInSeconds() {
        return this.waitTimeBetweenIterationsInSeconds;
    }

    /**
     * Set the waitTimeBetweenIterationsInSeconds property: Wait time between iterations in seconds.
     *
     * @param waitTimeBetweenIterationsInSeconds the waitTimeBetweenIterationsInSeconds value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setWaitTimeBetweenIterationsInSeconds(double waitTimeBetweenIterationsInSeconds) {
        this.waitTimeBetweenIterationsInSeconds = waitTimeBetweenIterationsInSeconds;
        return this;
    }

    /**
     * Get the waitTimeBetweenFaultsInSeconds property: Wait time between faults in seconds.
     *
     * @return the waitTimeBetweenFaultsInSeconds value.
     */
    public double getWaitTimeBetweenFaultsInSeconds() {
        return this.waitTimeBetweenFaultsInSeconds;
    }

    /**
     * Set the waitTimeBetweenFaultsInSeconds property: Wait time between faults in seconds.
     *
     * @param waitTimeBetweenFaultsInSeconds the waitTimeBetweenFaultsInSeconds value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setWaitTimeBetweenFaultsInSeconds(double waitTimeBetweenFaultsInSeconds) {
        this.waitTimeBetweenFaultsInSeconds = waitTimeBetweenFaultsInSeconds;
        return this;
    }

    /**
     * Get the moveReplicaFaultEnabled property: Indicates MoveReplica fault is enabled.
     *
     * @return the moveReplicaFaultEnabled value.
     */
    public boolean isMoveReplicaFaultEnabled() {
        return this.moveReplicaFaultEnabled;
    }

    /**
     * Set the moveReplicaFaultEnabled property: Indicates MoveReplica fault is enabled.
     *
     * @param moveReplicaFaultEnabled the moveReplicaFaultEnabled value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setMoveReplicaFaultEnabled(boolean moveReplicaFaultEnabled) {
        this.moveReplicaFaultEnabled = moveReplicaFaultEnabled;
        return this;
    }

    /**
     * Get the includedNodeTypeList property: List of included Node types.
     *
     * @return the includedNodeTypeList value.
     */
    public String getIncludedNodeTypeList() {
        return this.includedNodeTypeList;
    }

    /**
     * Set the includedNodeTypeList property: List of included Node types.
     *
     * @param includedNodeTypeList the includedNodeTypeList value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setIncludedNodeTypeList(String includedNodeTypeList) {
        this.includedNodeTypeList = includedNodeTypeList;
        return this;
    }

    /**
     * Get the includedApplicationList property: List of included Applications.
     *
     * @return the includedApplicationList value.
     */
    public String getIncludedApplicationList() {
        return this.includedApplicationList;
    }

    /**
     * Set the includedApplicationList property: List of included Applications.
     *
     * @param includedApplicationList the includedApplicationList value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setIncludedApplicationList(String includedApplicationList) {
        this.includedApplicationList = includedApplicationList;
        return this;
    }

    /**
     * Get the clusterHealthPolicy property: Health policy.
     *
     * @return the clusterHealthPolicy value.
     */
    public String getClusterHealthPolicy() {
        return this.clusterHealthPolicy;
    }

    /**
     * Set the clusterHealthPolicy property: Health policy.
     *
     * @param clusterHealthPolicy the clusterHealthPolicy value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setClusterHealthPolicy(String clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }

    /**
     * Get the chaosContext property: Chaos Context.
     *
     * @return the chaosContext value.
     */
    public String getChaosContext() {
        return this.chaosContext;
    }

    /**
     * Set the chaosContext property: Chaos Context.
     *
     * @param chaosContext the chaosContext value to set.
     * @return the ChaosStartedEvent object itself.
     */
    public ChaosStartedEvent setChaosContext(String chaosContext) {
        this.chaosContext = chaosContext;
        return this;
    }
}
