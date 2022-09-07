package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents the health of the cluster. Contains the cluster aggregated health state, the cluster application and node
 * health states as well as the health events and the unhealthy evaluations.
 */
@Fluent
public final class ClusterHealth extends EntityHealth {
    /*
     * Cluster node health states as found in the health store.
     */
    @JsonProperty(value = "NodeHealthStates")
    private List<NodeHealthState> nodeHealthStates;

    /*
     * Cluster application health states as found in the health store.
     */
    @JsonProperty(value = "ApplicationHealthStates")
    private List<ApplicationHealthState> applicationHealthStates;

    /**
     * Get the nodeHealthStates property: Cluster node health states as found in the health store.
     *
     * @return the nodeHealthStates value.
     */
    public List<NodeHealthState> getNodeHealthStates() {
        return this.nodeHealthStates;
    }

    /**
     * Set the nodeHealthStates property: Cluster node health states as found in the health store.
     *
     * @param nodeHealthStates the nodeHealthStates value to set.
     * @return the ClusterHealth object itself.
     */
    public ClusterHealth setNodeHealthStates(List<NodeHealthState> nodeHealthStates) {
        this.nodeHealthStates = nodeHealthStates;
        return this;
    }

    /**
     * Get the applicationHealthStates property: Cluster application health states as found in the health store.
     *
     * @return the applicationHealthStates value.
     */
    public List<ApplicationHealthState> getApplicationHealthStates() {
        return this.applicationHealthStates;
    }

    /**
     * Set the applicationHealthStates property: Cluster application health states as found in the health store.
     *
     * @param applicationHealthStates the applicationHealthStates value to set.
     * @return the ClusterHealth object itself.
     */
    public ClusterHealth setApplicationHealthStates(List<ApplicationHealthState> applicationHealthStates) {
        this.applicationHealthStates = applicationHealthStates;
        return this;
    }
}
