package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about a stateful service replica deployed on a node. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class DeployedStatefulServiceReplicaInfo extends DeployedServiceReplicaInfo {
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

    /*
     * The role of a replica of a stateful service.
     */
    @JsonProperty(value = "ReplicaRole")
    private ReplicaRole replicaRole;

    /*
     * Information about current reconfiguration like phase, type, previous
     * configuration role of replica and reconfiguration start date time.
     */
    @JsonProperty(value = "ReconfigurationInformation")
    private ReconfigurationInformation reconfigurationInformation;

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
     * @return the DeployedStatefulServiceReplicaInfo object itself.
     */
    public DeployedStatefulServiceReplicaInfo setReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }

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
     * @return the DeployedStatefulServiceReplicaInfo object itself.
     */
    public DeployedStatefulServiceReplicaInfo setReplicaRole(ReplicaRole replicaRole) {
        this.replicaRole = replicaRole;
        return this;
    }

    /**
     * Get the reconfigurationInformation property: Information about current reconfiguration like phase, type, previous
     * configuration role of replica and reconfiguration start date time.
     *
     * @return the reconfigurationInformation value.
     */
    public ReconfigurationInformation getReconfigurationInformation() {
        return this.reconfigurationInformation;
    }

    /**
     * Set the reconfigurationInformation property: Information about current reconfiguration like phase, type, previous
     * configuration role of replica and reconfiguration start date time.
     *
     * @param reconfigurationInformation the reconfigurationInformation value to set.
     * @return the DeployedStatefulServiceReplicaInfo object itself.
     */
    public DeployedStatefulServiceReplicaInfo setReconfigurationInformation(
            ReconfigurationInformation reconfigurationInformation) {
        this.reconfigurationInformation = reconfigurationInformation;
        return this;
    }
}
