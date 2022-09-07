package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/**
 * Represents a base class for stateful service replica or stateless service instance health. Contains the replica
 * aggregated health state, the health events and the unhealthy evaluations.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = ReplicaHealth.class)
@JsonTypeName("ReplicaHealth")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceReplicaHealth.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceInstanceHealth.class)
})
@Fluent
public class ReplicaHealth extends EntityHealth {
    /*
     * Id of the partition to which this replica belongs.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get the partitionId property: Id of the partition to which this replica belongs.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: Id of the partition to which this replica belongs.
     *
     * @param partitionId the partitionId value to set.
     * @return the ReplicaHealth object itself.
     */
    public ReplicaHealth setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }
}
