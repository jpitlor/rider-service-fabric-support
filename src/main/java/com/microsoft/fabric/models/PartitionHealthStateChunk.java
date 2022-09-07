package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * Represents the health state chunk of a partition, which contains the partition ID, its aggregated health state and
 * any replicas that respect the filters in the cluster health chunk query description.
 */
@Fluent
public final class PartitionHealthStateChunk extends EntityHealthStateChunk {
    /*
     * The Id of the partition.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * The list of replica health state chunks belonging to the partition that
     * respect the filters in the cluster health chunk query description.
     */
    @JsonProperty(value = "ReplicaHealthStateChunks")
    private ReplicaHealthStateChunkList replicaHealthStateChunks;

    /**
     * Get the partitionId property: The Id of the partition.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: The Id of the partition.
     *
     * @param partitionId the partitionId value to set.
     * @return the PartitionHealthStateChunk object itself.
     */
    public PartitionHealthStateChunk setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the replicaHealthStateChunks property: The list of replica health state chunks belonging to the partition
     * that respect the filters in the cluster health chunk query description.
     *
     * @return the replicaHealthStateChunks value.
     */
    public ReplicaHealthStateChunkList getReplicaHealthStateChunks() {
        return this.replicaHealthStateChunks;
    }

    /**
     * Set the replicaHealthStateChunks property: The list of replica health state chunks belonging to the partition
     * that respect the filters in the cluster health chunk query description.
     *
     * @param replicaHealthStateChunks the replicaHealthStateChunks value to set.
     * @return the PartitionHealthStateChunk object itself.
     */
    public PartitionHealthStateChunk setReplicaHealthStateChunks(ReplicaHealthStateChunkList replicaHealthStateChunks) {
        this.replicaHealthStateChunks = replicaHealthStateChunks;
        return this;
    }
}
