package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Information about the health of a Service Fabric partition. */
@Fluent
public final class PartitionHealth extends EntityHealth {
    /*
     * ID of the partition whose health information is described by this
     * object.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * The list of replica health states associated with the partition.
     */
    @JsonProperty(value = "ReplicaHealthStates")
    private List<ReplicaHealthState> replicaHealthStates;

    /**
     * Get the partitionId property: ID of the partition whose health information is described by this object.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: ID of the partition whose health information is described by this object.
     *
     * @param partitionId the partitionId value to set.
     * @return the PartitionHealth object itself.
     */
    public PartitionHealth setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the replicaHealthStates property: The list of replica health states associated with the partition.
     *
     * @return the replicaHealthStates value.
     */
    public List<ReplicaHealthState> getReplicaHealthStates() {
        return this.replicaHealthStates;
    }

    /**
     * Set the replicaHealthStates property: The list of replica health states associated with the partition.
     *
     * @param replicaHealthStates the replicaHealthStates value to set.
     * @return the PartitionHealth object itself.
     */
    public PartitionHealth setReplicaHealthStates(List<ReplicaHealthState> replicaHealthStates) {
        this.replicaHealthStates = replicaHealthStates;
        return this;
    }
}
