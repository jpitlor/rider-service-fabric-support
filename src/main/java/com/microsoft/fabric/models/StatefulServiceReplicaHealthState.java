package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents the health state of the stateful service replica, which contains the replica ID and the aggregated health
 * state.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServiceReplicaHealthState extends ReplicaHealthState {
    /*
     * Id of a stateful service replica. ReplicaId is used by Service Fabric to
     * uniquely identify a replica of a partition. It is unique within a
     * partition and does not change for the lifetime of the replica. If a
     * replica gets dropped and another replica gets created on the same node
     * for the same partition, it will get a different value for the id.
     * Sometimes the id of a stateless service instance is also referred as a
     * replica id.
     */
    @JsonProperty(value = "ReplicaId")
    private String replicaId;

    /**
     * Get the replicaId property: Id of a stateful service replica. ReplicaId is used by Service Fabric to uniquely
     * identify a replica of a partition. It is unique within a partition and does not change for the lifetime of the
     * replica. If a replica gets dropped and another replica gets created on the same node for the same partition, it
     * will get a different value for the id. Sometimes the id of a stateless service instance is also referred as a
     * replica id.
     *
     * @return the replicaId value.
     */
    public String getReplicaId() {
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
     * @return the StatefulServiceReplicaHealthState object itself.
     */
    public StatefulServiceReplicaHealthState setReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }
}
