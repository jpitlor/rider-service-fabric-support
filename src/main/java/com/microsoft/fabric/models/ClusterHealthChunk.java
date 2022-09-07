package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health chunk of the cluster. Contains the cluster aggregated health state, and the cluster entities
 * that respect the input filter.
 */
@Fluent
public final class ClusterHealthChunk {
    /*
     * The HealthState representing the aggregated health state of the cluster
     * computed by Health Manager.
     * The health evaluation of the entity reflects all events reported on the
     * entity and its children (if any).
     * The aggregation is done by applying the desired cluster health policy
     * and the application health policies.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /*
     * The list of node health state chunks in the cluster that respect the
     * filters in the cluster health chunk query description.
     */
    @JsonProperty(value = "NodeHealthStateChunks")
    private NodeHealthStateChunkList nodeHealthStateChunks;

    /*
     * The list of application health state chunks in the cluster that respect
     * the filters in the cluster health chunk query description.
     */
    @JsonProperty(value = "ApplicationHealthStateChunks")
    private ApplicationHealthStateChunkList applicationHealthStateChunks;

    /**
     * Get the healthState property: The HealthState representing the aggregated health state of the cluster computed by
     * Health Manager. The health evaluation of the entity reflects all events reported on the entity and its children
     * (if any). The aggregation is done by applying the desired cluster health policy and the application health
     * policies.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: The HealthState representing the aggregated health state of the cluster computed by
     * Health Manager. The health evaluation of the entity reflects all events reported on the entity and its children
     * (if any). The aggregation is done by applying the desired cluster health policy and the application health
     * policies.
     *
     * @param healthState the healthState value to set.
     * @return the ClusterHealthChunk object itself.
     */
    public ClusterHealthChunk setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the nodeHealthStateChunks property: The list of node health state chunks in the cluster that respect the
     * filters in the cluster health chunk query description.
     *
     * @return the nodeHealthStateChunks value.
     */
    public NodeHealthStateChunkList getNodeHealthStateChunks() {
        return this.nodeHealthStateChunks;
    }

    /**
     * Set the nodeHealthStateChunks property: The list of node health state chunks in the cluster that respect the
     * filters in the cluster health chunk query description.
     *
     * @param nodeHealthStateChunks the nodeHealthStateChunks value to set.
     * @return the ClusterHealthChunk object itself.
     */
    public ClusterHealthChunk setNodeHealthStateChunks(NodeHealthStateChunkList nodeHealthStateChunks) {
        this.nodeHealthStateChunks = nodeHealthStateChunks;
        return this;
    }

    /**
     * Get the applicationHealthStateChunks property: The list of application health state chunks in the cluster that
     * respect the filters in the cluster health chunk query description.
     *
     * @return the applicationHealthStateChunks value.
     */
    public ApplicationHealthStateChunkList getApplicationHealthStateChunks() {
        return this.applicationHealthStateChunks;
    }

    /**
     * Set the applicationHealthStateChunks property: The list of application health state chunks in the cluster that
     * respect the filters in the cluster health chunk query description.
     *
     * @param applicationHealthStateChunks the applicationHealthStateChunks value to set.
     * @return the ClusterHealthChunk object itself.
     */
    public ClusterHealthChunk setApplicationHealthStateChunks(
            ApplicationHealthStateChunkList applicationHealthStateChunks) {
        this.applicationHealthStateChunks = applicationHealthStateChunks;
        return this;
    }
}
