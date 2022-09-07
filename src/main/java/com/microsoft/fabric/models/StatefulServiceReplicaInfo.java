package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a stateful service replica. This includes information about the identity, role, status, health, node name,
 * uptime, and other details about the replica.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServiceReplicaInfo extends ReplicaInfo {
    /*
     * The role of a replica of a stateful service.
     */
    @JsonProperty(value = "ReplicaRole")
    private ReplicaRole replicaRole;

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
     * Get the replicaRole property: The role of a replica of a stateful service.
     *
     * @return the replicaRole value.
     */
    public ReplicaRole getReplicaRole() {
        return this.replicaRole;
    }

    /**
     * Set the replicaRole property: The role of a replica of a stateful service.
     *
     * @param replicaRole the replicaRole value to set.
     * @return the StatefulServiceReplicaInfo object itself.
     */
    public StatefulServiceReplicaInfo setReplicaRole(ReplicaRole replicaRole) {
        this.replicaRole = replicaRole;
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
     * @return the StatefulServiceReplicaInfo object itself.
     */
    public StatefulServiceReplicaInfo setReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }
}
