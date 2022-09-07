package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a stateful replica running in a code package. Note DeployedServiceReplicaQueryResult will contain
 * duplicate data like ServiceKind, ServiceName, PartitionId and replicaId.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class DeployedStatefulServiceReplicaDetailInfo extends DeployedServiceReplicaDetailInfo {
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
     * Specifies the operation currently being executed by the Replicator.
     */
    @JsonProperty(value = "CurrentReplicatorOperation")
    private ReplicatorOperationName currentReplicatorOperation;

    /*
     * Specifies the access status of the partition.
     */
    @JsonProperty(value = "ReadStatus")
    private PartitionAccessStatus readStatus;

    /*
     * Specifies the access status of the partition.
     */
    @JsonProperty(value = "WriteStatus")
    private PartitionAccessStatus writeStatus;

    /*
     * Represents a base class for primary or secondary replicator status.
     * Contains information about the service fabric replicator like the
     * replication/copy queue utilization, last acknowledgement received
     * timestamp, etc.
     */
    @JsonProperty(value = "ReplicatorStatus")
    private ReplicatorStatus replicatorStatus;

    /*
     * Key value store related information for the replica.
     */
    @JsonProperty(value = "ReplicaStatus")
    private KeyValueStoreReplicaStatus replicaStatus;

    /*
     * Information about a stateful service replica deployed on a node.
     */
    @JsonProperty(value = "DeployedServiceReplicaQueryResult")
    private DeployedStatefulServiceReplicaInfo deployedServiceReplicaQueryResult;

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
     * @return the DeployedStatefulServiceReplicaDetailInfo object itself.
     */
    public DeployedStatefulServiceReplicaDetailInfo setReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }

    /**
     * Get the currentReplicatorOperation property: Specifies the operation currently being executed by the Replicator.
     *
     * @return the currentReplicatorOperation value.
     */
    public ReplicatorOperationName getCurrentReplicatorOperation() {
        return this.currentReplicatorOperation;
    }

    /**
     * Set the currentReplicatorOperation property: Specifies the operation currently being executed by the Replicator.
     *
     * @param currentReplicatorOperation the currentReplicatorOperation value to set.
     * @return the DeployedStatefulServiceReplicaDetailInfo object itself.
     */
    public DeployedStatefulServiceReplicaDetailInfo setCurrentReplicatorOperation(
            ReplicatorOperationName currentReplicatorOperation) {
        this.currentReplicatorOperation = currentReplicatorOperation;
        return this;
    }

    /**
     * Get the readStatus property: Specifies the access status of the partition.
     *
     * @return the readStatus value.
     */
    public PartitionAccessStatus getReadStatus() {
        return this.readStatus;
    }

    /**
     * Set the readStatus property: Specifies the access status of the partition.
     *
     * @param readStatus the readStatus value to set.
     * @return the DeployedStatefulServiceReplicaDetailInfo object itself.
     */
    public DeployedStatefulServiceReplicaDetailInfo setReadStatus(PartitionAccessStatus readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    /**
     * Get the writeStatus property: Specifies the access status of the partition.
     *
     * @return the writeStatus value.
     */
    public PartitionAccessStatus getWriteStatus() {
        return this.writeStatus;
    }

    /**
     * Set the writeStatus property: Specifies the access status of the partition.
     *
     * @param writeStatus the writeStatus value to set.
     * @return the DeployedStatefulServiceReplicaDetailInfo object itself.
     */
    public DeployedStatefulServiceReplicaDetailInfo setWriteStatus(PartitionAccessStatus writeStatus) {
        this.writeStatus = writeStatus;
        return this;
    }

    /**
     * Get the replicatorStatus property: Represents a base class for primary or secondary replicator status. Contains
     * information about the service fabric replicator like the replication/copy queue utilization, last acknowledgement
     * received timestamp, etc.
     *
     * @return the replicatorStatus value.
     */
    public ReplicatorStatus getReplicatorStatus() {
        return this.replicatorStatus;
    }

    /**
     * Set the replicatorStatus property: Represents a base class for primary or secondary replicator status. Contains
     * information about the service fabric replicator like the replication/copy queue utilization, last acknowledgement
     * received timestamp, etc.
     *
     * @param replicatorStatus the replicatorStatus value to set.
     * @return the DeployedStatefulServiceReplicaDetailInfo object itself.
     */
    public DeployedStatefulServiceReplicaDetailInfo setReplicatorStatus(ReplicatorStatus replicatorStatus) {
        this.replicatorStatus = replicatorStatus;
        return this;
    }

    /**
     * Get the replicaStatus property: Key value store related information for the replica.
     *
     * @return the replicaStatus value.
     */
    public KeyValueStoreReplicaStatus getReplicaStatus() {
        return this.replicaStatus;
    }

    /**
     * Set the replicaStatus property: Key value store related information for the replica.
     *
     * @param replicaStatus the replicaStatus value to set.
     * @return the DeployedStatefulServiceReplicaDetailInfo object itself.
     */
    public DeployedStatefulServiceReplicaDetailInfo setReplicaStatus(KeyValueStoreReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus;
        return this;
    }

    /**
     * Get the deployedServiceReplicaQueryResult property: Information about a stateful service replica deployed on a
     * node.
     *
     * @return the deployedServiceReplicaQueryResult value.
     */
    public DeployedStatefulServiceReplicaInfo getDeployedServiceReplicaQueryResult() {
        return this.deployedServiceReplicaQueryResult;
    }

    /**
     * Set the deployedServiceReplicaQueryResult property: Information about a stateful service replica deployed on a
     * node.
     *
     * @param deployedServiceReplicaQueryResult the deployedServiceReplicaQueryResult value to set.
     * @return the DeployedStatefulServiceReplicaDetailInfo object itself.
     */
    public DeployedStatefulServiceReplicaDetailInfo setDeployedServiceReplicaQueryResult(
            DeployedStatefulServiceReplicaInfo deployedServiceReplicaQueryResult) {
        this.deployedServiceReplicaQueryResult = deployedServiceReplicaQueryResult;
        return this;
    }
}
