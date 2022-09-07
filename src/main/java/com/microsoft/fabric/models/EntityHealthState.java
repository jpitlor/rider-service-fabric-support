package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A base type for the health state of various entities in the cluster. It contains the aggregated health state. */
@Fluent
public class EntityHealthState {
    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "AggregatedHealthState")
    private HealthState aggregatedHealthState;

    /**
     * Get the aggregatedHealthState property: The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     *
     * @return the aggregatedHealthState value.
     */
    public HealthState getAggregatedHealthState() {
        return this.aggregatedHealthState;
    }

    /**
     * Set the aggregatedHealthState property: The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     *
     * @param aggregatedHealthState the aggregatedHealthState value to set.
     * @return the EntityHealthState object itself.
     */
    public EntityHealthState setAggregatedHealthState(HealthState aggregatedHealthState) {
        this.aggregatedHealthState = aggregatedHealthState;
        return this;
    }
}
