package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the standalone cluster configuration. */
@Fluent
public final class ClusterConfiguration {
    /*
     * The contents of the cluster configuration file.
     */
    @JsonProperty(value = "ClusterConfiguration")
    private String clusterConfiguration;

    /**
     * Get the clusterConfiguration property: The contents of the cluster configuration file.
     *
     * @return the clusterConfiguration value.
     */
    public String getClusterConfiguration() {
        return this.clusterConfiguration;
    }

    /**
     * Set the clusterConfiguration property: The contents of the cluster configuration file.
     *
     * @param clusterConfiguration the clusterConfiguration value to set.
     * @return the ClusterConfiguration object itself.
     */
    public ClusterConfiguration setClusterConfiguration(String clusterConfiguration) {
        this.clusterConfiguration = clusterConfiguration;
        return this;
    }
}
