package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Represents a base class for stateful service replica or stateless service instance health state. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = ReplicaHealthState.class)
@JsonTypeName("ReplicaHealthState")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceReplicaHealthState.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceInstanceHealthState.class)
})
@Fluent
public class ReplicaHealthState extends EntityHealthState {
    /*
     * The ID of the partition to which this replica belongs.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get the partitionId property: The ID of the partition to which this replica belongs.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: The ID of the partition to which this replica belongs.
     *
     * @param partitionId the partitionId value to set.
     * @return the ReplicaHealthState object itself.
     */
    public ReplicaHealthState setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }
}
