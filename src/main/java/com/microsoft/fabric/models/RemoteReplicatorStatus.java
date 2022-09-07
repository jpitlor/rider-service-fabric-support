package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents the state of the secondary replicator from the primary replicator’s point of view. */
@Fluent
public final class RemoteReplicatorStatus {
    /*
     * Represents the replica ID of the remote secondary replicator.
     */
    @JsonProperty(value = "ReplicaId")
    private String replicaId;

    /*
     * The last timestamp (in UTC) when an acknowledgement from the secondary
     * replicator was processed on the primary.
     * UTC 0 represents an invalid value, indicating that no acknowledgement
     * messages were ever processed.
     */
    @JsonProperty(value = "LastAcknowledgementProcessedTimeUtc")
    private OffsetDateTime lastAcknowledgementProcessedTimeUtc;

    /*
     * The highest replication operation sequence number that the secondary has
     * received from the primary.
     */
    @JsonProperty(value = "LastReceivedReplicationSequenceNumber")
    private String lastReceivedReplicationSequenceNumber;

    /*
     * The highest replication operation sequence number that the secondary has
     * applied to its state.
     */
    @JsonProperty(value = "LastAppliedReplicationSequenceNumber")
    private String lastAppliedReplicationSequenceNumber;

    /*
     * A value that indicates whether the secondary replica is in the process
     * of being built.
     */
    @JsonProperty(value = "IsInBuild")
    private Boolean isInBuild;

    /*
     * The highest copy operation sequence number that the secondary has
     * received from the primary.
     * A value of -1 implies that the secondary has received all copy
     * operations.
     */
    @JsonProperty(value = "LastReceivedCopySequenceNumber")
    private String lastReceivedCopySequenceNumber;

    /*
     * The highest copy operation sequence number that the secondary has
     * applied to its state.
     * A value of -1 implies that the secondary has applied all copy operations
     * and the copy process is complete.
     */
    @JsonProperty(value = "LastAppliedCopySequenceNumber")
    private String lastAppliedCopySequenceNumber;

    /*
     * Represents the acknowledgment status for the remote secondary
     * replicator.
     */
    @JsonProperty(value = "RemoteReplicatorAcknowledgementStatus")
    private RemoteReplicatorAcknowledgementStatus remoteReplicatorAcknowledgementStatus;

    /**
     * Get the replicaId property: Represents the replica ID of the remote secondary replicator.
     *
     * @return the replicaId value.
     */
    public String getReplicaId() {
        return this.replicaId;
    }

    /**
     * Set the replicaId property: Represents the replica ID of the remote secondary replicator.
     *
     * @param replicaId the replicaId value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setReplicaId(String replicaId) {
        this.replicaId = replicaId;
        return this;
    }

    /**
     * Get the lastAcknowledgementProcessedTimeUtc property: The last timestamp (in UTC) when an acknowledgement from
     * the secondary replicator was processed on the primary. UTC 0 represents an invalid value, indicating that no
     * acknowledgement messages were ever processed.
     *
     * @return the lastAcknowledgementProcessedTimeUtc value.
     */
    public OffsetDateTime getLastAcknowledgementProcessedTimeUtc() {
        return this.lastAcknowledgementProcessedTimeUtc;
    }

    /**
     * Set the lastAcknowledgementProcessedTimeUtc property: The last timestamp (in UTC) when an acknowledgement from
     * the secondary replicator was processed on the primary. UTC 0 represents an invalid value, indicating that no
     * acknowledgement messages were ever processed.
     *
     * @param lastAcknowledgementProcessedTimeUtc the lastAcknowledgementProcessedTimeUtc value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setLastAcknowledgementProcessedTimeUtc(
            OffsetDateTime lastAcknowledgementProcessedTimeUtc) {
        this.lastAcknowledgementProcessedTimeUtc = lastAcknowledgementProcessedTimeUtc;
        return this;
    }

    /**
     * Get the lastReceivedReplicationSequenceNumber property: The highest replication operation sequence number that
     * the secondary has received from the primary.
     *
     * @return the lastReceivedReplicationSequenceNumber value.
     */
    public String getLastReceivedReplicationSequenceNumber() {
        return this.lastReceivedReplicationSequenceNumber;
    }

    /**
     * Set the lastReceivedReplicationSequenceNumber property: The highest replication operation sequence number that
     * the secondary has received from the primary.
     *
     * @param lastReceivedReplicationSequenceNumber the lastReceivedReplicationSequenceNumber value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setLastReceivedReplicationSequenceNumber(
            String lastReceivedReplicationSequenceNumber) {
        this.lastReceivedReplicationSequenceNumber = lastReceivedReplicationSequenceNumber;
        return this;
    }

    /**
     * Get the lastAppliedReplicationSequenceNumber property: The highest replication operation sequence number that the
     * secondary has applied to its state.
     *
     * @return the lastAppliedReplicationSequenceNumber value.
     */
    public String getLastAppliedReplicationSequenceNumber() {
        return this.lastAppliedReplicationSequenceNumber;
    }

    /**
     * Set the lastAppliedReplicationSequenceNumber property: The highest replication operation sequence number that the
     * secondary has applied to its state.
     *
     * @param lastAppliedReplicationSequenceNumber the lastAppliedReplicationSequenceNumber value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setLastAppliedReplicationSequenceNumber(String lastAppliedReplicationSequenceNumber) {
        this.lastAppliedReplicationSequenceNumber = lastAppliedReplicationSequenceNumber;
        return this;
    }

    /**
     * Get the isInBuild property: A value that indicates whether the secondary replica is in the process of being
     * built.
     *
     * @return the isInBuild value.
     */
    public Boolean isInBuild() {
        return this.isInBuild;
    }

    /**
     * Set the isInBuild property: A value that indicates whether the secondary replica is in the process of being
     * built.
     *
     * @param isInBuild the isInBuild value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setIsInBuild(Boolean isInBuild) {
        this.isInBuild = isInBuild;
        return this;
    }

    /**
     * Get the lastReceivedCopySequenceNumber property: The highest copy operation sequence number that the secondary
     * has received from the primary. A value of -1 implies that the secondary has received all copy operations.
     *
     * @return the lastReceivedCopySequenceNumber value.
     */
    public String getLastReceivedCopySequenceNumber() {
        return this.lastReceivedCopySequenceNumber;
    }

    /**
     * Set the lastReceivedCopySequenceNumber property: The highest copy operation sequence number that the secondary
     * has received from the primary. A value of -1 implies that the secondary has received all copy operations.
     *
     * @param lastReceivedCopySequenceNumber the lastReceivedCopySequenceNumber value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setLastReceivedCopySequenceNumber(String lastReceivedCopySequenceNumber) {
        this.lastReceivedCopySequenceNumber = lastReceivedCopySequenceNumber;
        return this;
    }

    /**
     * Get the lastAppliedCopySequenceNumber property: The highest copy operation sequence number that the secondary has
     * applied to its state. A value of -1 implies that the secondary has applied all copy operations and the copy
     * process is complete.
     *
     * @return the lastAppliedCopySequenceNumber value.
     */
    public String getLastAppliedCopySequenceNumber() {
        return this.lastAppliedCopySequenceNumber;
    }

    /**
     * Set the lastAppliedCopySequenceNumber property: The highest copy operation sequence number that the secondary has
     * applied to its state. A value of -1 implies that the secondary has applied all copy operations and the copy
     * process is complete.
     *
     * @param lastAppliedCopySequenceNumber the lastAppliedCopySequenceNumber value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setLastAppliedCopySequenceNumber(String lastAppliedCopySequenceNumber) {
        this.lastAppliedCopySequenceNumber = lastAppliedCopySequenceNumber;
        return this;
    }

    /**
     * Get the remoteReplicatorAcknowledgementStatus property: Represents the acknowledgment status for the remote
     * secondary replicator.
     *
     * @return the remoteReplicatorAcknowledgementStatus value.
     */
    public RemoteReplicatorAcknowledgementStatus getRemoteReplicatorAcknowledgementStatus() {
        return this.remoteReplicatorAcknowledgementStatus;
    }

    /**
     * Set the remoteReplicatorAcknowledgementStatus property: Represents the acknowledgment status for the remote
     * secondary replicator.
     *
     * @param remoteReplicatorAcknowledgementStatus the remoteReplicatorAcknowledgementStatus value to set.
     * @return the RemoteReplicatorStatus object itself.
     */
    public RemoteReplicatorStatus setRemoteReplicatorAcknowledgementStatus(
            RemoteReplicatorAcknowledgementStatus remoteReplicatorAcknowledgementStatus) {
        this.remoteReplicatorAcknowledgementStatus = remoteReplicatorAcknowledgementStatus;
        return this;
    }
}
