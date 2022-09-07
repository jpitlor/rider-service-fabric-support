package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Information about load in a Service Fabric cluster. It holds a summary of all metrics and their load in a cluster.
 */
@Fluent
public final class ClusterLoadInfo {
    /*
     * The starting time of last resource balancing run.
     */
    @JsonProperty(value = "LastBalancingStartTimeUtc")
    private OffsetDateTime lastBalancingStartTimeUtc;

    /*
     * The end time of last resource balancing run.
     */
    @JsonProperty(value = "LastBalancingEndTimeUtc")
    private OffsetDateTime lastBalancingEndTimeUtc;

    /*
     * List that contains metrics and their load information in this cluster.
     */
    @JsonProperty(value = "LoadMetricInformation")
    private List<LoadMetricInformation> loadMetricInformation;

    /**
     * Get the lastBalancingStartTimeUtc property: The starting time of last resource balancing run.
     *
     * @return the lastBalancingStartTimeUtc value.
     */
    public OffsetDateTime getLastBalancingStartTimeUtc() {
        return this.lastBalancingStartTimeUtc;
    }

    /**
     * Set the lastBalancingStartTimeUtc property: The starting time of last resource balancing run.
     *
     * @param lastBalancingStartTimeUtc the lastBalancingStartTimeUtc value to set.
     * @return the ClusterLoadInfo object itself.
     */
    public ClusterLoadInfo setLastBalancingStartTimeUtc(OffsetDateTime lastBalancingStartTimeUtc) {
        this.lastBalancingStartTimeUtc = lastBalancingStartTimeUtc;
        return this;
    }

    /**
     * Get the lastBalancingEndTimeUtc property: The end time of last resource balancing run.
     *
     * @return the lastBalancingEndTimeUtc value.
     */
    public OffsetDateTime getLastBalancingEndTimeUtc() {
        return this.lastBalancingEndTimeUtc;
    }

    /**
     * Set the lastBalancingEndTimeUtc property: The end time of last resource balancing run.
     *
     * @param lastBalancingEndTimeUtc the lastBalancingEndTimeUtc value to set.
     * @return the ClusterLoadInfo object itself.
     */
    public ClusterLoadInfo setLastBalancingEndTimeUtc(OffsetDateTime lastBalancingEndTimeUtc) {
        this.lastBalancingEndTimeUtc = lastBalancingEndTimeUtc;
        return this;
    }

    /**
     * Get the loadMetricInformation property: List that contains metrics and their load information in this cluster.
     *
     * @return the loadMetricInformation value.
     */
    public List<LoadMetricInformation> getLoadMetricInformation() {
        return this.loadMetricInformation;
    }

    /**
     * Set the loadMetricInformation property: List that contains metrics and their load information in this cluster.
     *
     * @param loadMetricInformation the loadMetricInformation value to set.
     * @return the ClusterLoadInfo object itself.
     */
    public ClusterLoadInfo setLoadMetricInformation(List<LoadMetricInformation> loadMetricInformation) {
        this.loadMetricInformation = loadMetricInformation;
        return this;
    }
}
