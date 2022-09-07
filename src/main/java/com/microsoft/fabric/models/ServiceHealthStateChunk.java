package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state chunk of a service, which contains the service name, its aggregated health state and any
 * partitions that respect the filters in the cluster health chunk query description.
 */
@Fluent
public final class ServiceHealthStateChunk extends EntityHealthStateChunk {
    /*
     * The name of the service whose health state chunk is provided in this
     * object.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * The list of partition health state chunks belonging to the service that
     * respect the filters in the cluster health chunk query description.
     */
    @JsonProperty(value = "PartitionHealthStateChunks")
    private PartitionHealthStateChunkList partitionHealthStateChunks;

    /**
     * Get the serviceName property: The name of the service whose health state chunk is provided in this object.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service whose health state chunk is provided in this object.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceHealthStateChunk object itself.
     */
    public ServiceHealthStateChunk setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the partitionHealthStateChunks property: The list of partition health state chunks belonging to the service
     * that respect the filters in the cluster health chunk query description.
     *
     * @return the partitionHealthStateChunks value.
     */
    public PartitionHealthStateChunkList getPartitionHealthStateChunks() {
        return this.partitionHealthStateChunks;
    }

    /**
     * Set the partitionHealthStateChunks property: The list of partition health state chunks belonging to the service
     * that respect the filters in the cluster health chunk query description.
     *
     * @param partitionHealthStateChunks the partitionHealthStateChunks value to set.
     * @return the ServiceHealthStateChunk object itself.
     */
    public ServiceHealthStateChunk setPartitionHealthStateChunks(
            PartitionHealthStateChunkList partitionHealthStateChunks) {
        this.partitionHealthStateChunks = partitionHealthStateChunks;
        return this;
    }
}
