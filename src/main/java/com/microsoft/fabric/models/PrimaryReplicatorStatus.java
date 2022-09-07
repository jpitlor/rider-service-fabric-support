package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Provides statistics about the Service Fabric Replicator, when it is functioning in a Primary role. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Primary")
@Fluent
public final class PrimaryReplicatorStatus extends ReplicatorStatus {
    /*
     * Details about the replication queue on the primary replicator.
     */
    @JsonProperty(value = "ReplicationQueueStatus")
    private ReplicatorQueueStatus replicationQueueStatus;

    /*
     * The status of all the active and idle secondary replicators that the
     * primary is aware of.
     */
    @JsonProperty(value = "RemoteReplicators")
    private List<RemoteReplicatorStatus> remoteReplicators;

    /**
     * Get the replicationQueueStatus property: Details about the replication queue on the primary replicator.
     *
     * @return the replicationQueueStatus value.
     */
    public ReplicatorQueueStatus getReplicationQueueStatus() {
        return this.replicationQueueStatus;
    }

    /**
     * Set the replicationQueueStatus property: Details about the replication queue on the primary replicator.
     *
     * @param replicationQueueStatus the replicationQueueStatus value to set.
     * @return the PrimaryReplicatorStatus object itself.
     */
    public PrimaryReplicatorStatus setReplicationQueueStatus(ReplicatorQueueStatus replicationQueueStatus) {
        this.replicationQueueStatus = replicationQueueStatus;
        return this;
    }

    /**
     * Get the remoteReplicators property: The status of all the active and idle secondary replicators that the primary
     * is aware of.
     *
     * @return the remoteReplicators value.
     */
    public List<RemoteReplicatorStatus> getRemoteReplicators() {
        return this.remoteReplicators;
    }

    /**
     * Set the remoteReplicators property: The status of all the active and idle secondary replicators that the primary
     * is aware of.
     *
     * @param remoteReplicators the remoteReplicators value to set.
     * @return the PrimaryReplicatorStatus object itself.
     */
    public PrimaryReplicatorStatus setRemoteReplicators(List<RemoteReplicatorStatus> remoteReplicators) {
        this.remoteReplicators = remoteReplicators;
        return this;
    }
}
