package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Represents the base for all Replica Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ReplicaEvent.class)
@JsonTypeName("ReplicaEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StatefulReplicaNewHealthReport", value = StatefulReplicaNewHealthReportEvent.class),
    @JsonSubTypes.Type(
            name = "StatefulReplicaHealthReportExpired",
            value = StatefulReplicaHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "StatelessReplicaNewHealthReport", value = StatelessReplicaNewHealthReportEvent.class),
    @JsonSubTypes.Type(
            name = "StatelessReplicaHealthReportExpired",
            value = StatelessReplicaHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ChaosReplicaRemovalScheduled", value = ChaosReplicaRemovalScheduledEvent.class),
    @JsonSubTypes.Type(name = "ChaosReplicaRestartScheduled", value = ChaosReplicaRestartScheduledEvent.class)
})
@Fluent
public class ReplicaEvent extends FabricEvent {
    /*
     * An internal ID used by Service Fabric to uniquely identify a partition.
     * This is a randomly generated GUID when the service was created. The
     * partition ID is unique and does not change for the lifetime of the
     * service. If the same service was deleted and recreated the IDs of its
     * partitions would be different.
     */
    @JsonProperty(value = "PartitionId", required = true)
    private UUID partitionId;

    /*
     * Id of a stateful service replica. ReplicaId is used by Service Fabric to
     * uniquely identify a replica of a partition. It is unique within a
     * partition and does not change for the lifetime of the replica. If a
     * replica gets dropped and another replica gets created on the same node
     * for the same partition, it will get a different value for the id.
     * Sometimes the id of a stateless service instance is also referred as a
     * replica id.
     */
    @JsonProperty(value = "ReplicaId", required = true)
    private long replicaId;

    /**
     * Get the partitionId property: An internal ID used by Service Fabric to uniquely identify a partition. This is a
     * randomly generated GUID when the service was created. The partition ID is unique and does not change for the
     * lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be
     * different.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: An internal ID used by Service Fabric to uniquely identify a partition. This is a
     * randomly generated GUID when the service was created. The partition ID is unique and does not change for the
     * lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be
     * different.
     *
     * @param partitionId the partitionId value to set.
     * @return the ReplicaEvent object itself.
     */
    public ReplicaEvent setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the replicaId property: Id of a stateful service replica. ReplicaId is used by Service Fabric to uniquely
     * identify a replica of a partition. It is unique within a partition and does not change for the lifetime of the
     * replica. If a replica gets dropped and another replica gets created on the same node for the same partition, it
     * will get a different value for the id. Sometimes the id of a stateless service instance is also referred as a
     * replica id.
     *
     * @return the replicaId value.
     */
    public long getReplicaId() {
        return this.replicaId;
    }

    /**
     * Set the replicaId property: Id of a stateful service replica. ReplicaId is used by Service Fabric to uniquely
     * identify a replica of a partition. It is unique within a partition and does not change for the lifetime of the
     * replica. If a replica gets dropped and another replica gets created on the same node for the same partition, it
     * will get a different value for the id. Sometimes the id of a stateless service instance is also referred as a
     * replica id.
     *
     * @param replicaId the replicaId value to set.
     * @return the ReplicaEvent object itself.
     */
    public ReplicaEvent setReplicaId(long replicaId) {
        this.replicaId = replicaId;
        return this;
    }
}
