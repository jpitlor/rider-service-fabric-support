package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies metric loads of a partition's specific secondary replica or instance. */
@Fluent
public final class ReplicaMetricLoadDescription {
    /*
     * Node name of a specific secondary replica or instance.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * Loads of a different metrics for a partition's secondary replica or
     * instance.
     */
    @JsonProperty(value = "ReplicaOrInstanceLoadEntries")
    private List<MetricLoadDescription> replicaOrInstanceLoadEntries;

    /**
     * Get the nodeName property: Node name of a specific secondary replica or instance.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Node name of a specific secondary replica or instance.
     *
     * @param nodeName the nodeName value to set.
     * @return the ReplicaMetricLoadDescription object itself.
     */
    public ReplicaMetricLoadDescription setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the replicaOrInstanceLoadEntries property: Loads of a different metrics for a partition's secondary replica
     * or instance.
     *
     * @return the replicaOrInstanceLoadEntries value.
     */
    public List<MetricLoadDescription> getReplicaOrInstanceLoadEntries() {
        return this.replicaOrInstanceLoadEntries;
    }

    /**
     * Set the replicaOrInstanceLoadEntries property: Loads of a different metrics for a partition's secondary replica
     * or instance.
     *
     * @param replicaOrInstanceLoadEntries the replicaOrInstanceLoadEntries value to set.
     * @return the ReplicaMetricLoadDescription object itself.
     */
    public ReplicaMetricLoadDescription setReplicaOrInstanceLoadEntries(
            List<MetricLoadDescription> replicaOrInstanceLoadEntries) {
        this.replicaOrInstanceLoadEntries = replicaOrInstanceLoadEntries;
        return this;
    }
}
