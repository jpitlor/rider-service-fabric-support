package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A base type for the health state chunk of various entities in the cluster. It contains the aggregated health state.
 */
@Fluent
public class EntityHealthStateChunk {
    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /**
     * Get the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @param healthState the healthState value to set.
     * @return the EntityHealthStateChunk object itself.
     */
    public EntityHealthStateChunk setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }
}
