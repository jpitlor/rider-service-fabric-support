package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Epoch is a configuration number for the partition as a whole. When the configuration of the replica set changes,
 * for example when the Primary replica changes, the operations that are replicated from the new Primary replica are
 * said to be a new Epoch from the ones which were sent by the old Primary replica.
 */
@Fluent
public final class Epoch {
    /*
     * The current configuration number of this Epoch. The configuration number
     * is an increasing value that is updated whenever the configuration of
     * this replica set changes.
     */
    @JsonProperty(value = "ConfigurationVersion")
    private String configurationVersion;

    /*
     * The current data loss number of this Epoch. The data loss number
     * property is an increasing value which is updated whenever data loss is
     * suspected, as when loss of a quorum of replicas in the replica set that
     * includes the Primary replica.
     */
    @JsonProperty(value = "DataLossVersion")
    private String dataLossVersion;

    /**
     * Get the configurationVersion property: The current configuration number of this Epoch. The configuration number
     * is an increasing value that is updated whenever the configuration of this replica set changes.
     *
     * @return the configurationVersion value.
     */
    public String getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * Set the configurationVersion property: The current configuration number of this Epoch. The configuration number
     * is an increasing value that is updated whenever the configuration of this replica set changes.
     *
     * @param configurationVersion the configurationVersion value to set.
     * @return the Epoch object itself.
     */
    public Epoch setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }

    /**
     * Get the dataLossVersion property: The current data loss number of this Epoch. The data loss number property is an
     * increasing value which is updated whenever data loss is suspected, as when loss of a quorum of replicas in the
     * replica set that includes the Primary replica.
     *
     * @return the dataLossVersion value.
     */
    public String getDataLossVersion() {
        return this.dataLossVersion;
    }

    /**
     * Set the dataLossVersion property: The current data loss number of this Epoch. The data loss number property is an
     * increasing value which is updated whenever data loss is suspected, as when loss of a quorum of replicas in the
     * replica set that includes the Primary replica.
     *
     * @param dataLossVersion the dataLossVersion value to set.
     * @return the Epoch object itself.
     */
    public Epoch setDataLossVersion(String dataLossVersion) {
        this.dataLossVersion = dataLossVersion;
        return this;
    }
}
