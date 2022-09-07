package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Provides statistics about the Service Fabric Replicator, when it is functioning in a ActiveSecondary role. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = SecondaryReplicatorStatus.class)
@JsonTypeName("SecondaryReplicatorStatus")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ActiveSecondary", value = SecondaryActiveReplicatorStatus.class),
    @JsonSubTypes.Type(name = "IdleSecondary", value = SecondaryIdleReplicatorStatus.class)
})
@Fluent
public class SecondaryReplicatorStatus extends ReplicatorStatus {
    /*
     * Details about the replication queue on the secondary replicator.
     */
    @JsonProperty(value = "ReplicationQueueStatus")
    private ReplicatorQueueStatus replicationQueueStatus;

    /*
     * The last time-stamp (UTC) at which a replication operation was received
     * from the primary.
     * UTC 0 represents an invalid value, indicating that a replication
     * operation message was never received.
     */
    @JsonProperty(value = "LastReplicationOperationReceivedTimeUtc")
    private OffsetDateTime lastReplicationOperationReceivedTimeUtc;

    /*
     * Value that indicates whether the replica is currently being built.
     */
    @JsonProperty(value = "IsInBuild")
    private Boolean isInBuild;

    /*
     * Details about the copy queue on the secondary replicator.
     */
    @JsonProperty(value = "CopyQueueStatus")
    private ReplicatorQueueStatus copyQueueStatus;

    /*
     * The last time-stamp (UTC) at which a copy operation was received from
     * the primary.
     * UTC 0 represents an invalid value, indicating that a copy operation
     * message was never received.
     */
    @JsonProperty(value = "LastCopyOperationReceivedTimeUtc")
    private OffsetDateTime lastCopyOperationReceivedTimeUtc;

    /*
     * The last time-stamp (UTC) at which an acknowledgment was sent to the
     * primary replicator.
     * UTC 0 represents an invalid value, indicating that an acknowledgment
     * message was never sent.
     */
    @JsonProperty(value = "LastAcknowledgementSentTimeUtc")
    private OffsetDateTime lastAcknowledgementSentTimeUtc;

    /**
     * Get the replicationQueueStatus property: Details about the replication queue on the secondary replicator.
     *
     * @return the replicationQueueStatus value.
     */
    public ReplicatorQueueStatus getReplicationQueueStatus() {
        return this.replicationQueueStatus;
    }

    /**
     * Set the replicationQueueStatus property: Details about the replication queue on the secondary replicator.
     *
     * @param replicationQueueStatus the replicationQueueStatus value to set.
     * @return the SecondaryReplicatorStatus object itself.
     */
    public SecondaryReplicatorStatus setReplicationQueueStatus(ReplicatorQueueStatus replicationQueueStatus) {
        this.replicationQueueStatus = replicationQueueStatus;
        return this;
    }

    /**
     * Get the lastReplicationOperationReceivedTimeUtc property: The last time-stamp (UTC) at which a replication
     * operation was received from the primary. UTC 0 represents an invalid value, indicating that a replication
     * operation message was never received.
     *
     * @return the lastReplicationOperationReceivedTimeUtc value.
     */
    public OffsetDateTime getLastReplicationOperationReceivedTimeUtc() {
        return this.lastReplicationOperationReceivedTimeUtc;
    }

    /**
     * Set the lastReplicationOperationReceivedTimeUtc property: The last time-stamp (UTC) at which a replication
     * operation was received from the primary. UTC 0 represents an invalid value, indicating that a replication
     * operation message was never received.
     *
     * @param lastReplicationOperationReceivedTimeUtc the lastReplicationOperationReceivedTimeUtc value to set.
     * @return the SecondaryReplicatorStatus object itself.
     */
    public SecondaryReplicatorStatus setLastReplicationOperationReceivedTimeUtc(
            OffsetDateTime lastReplicationOperationReceivedTimeUtc) {
        this.lastReplicationOperationReceivedTimeUtc = lastReplicationOperationReceivedTimeUtc;
        return this;
    }

    /**
     * Get the isInBuild property: Value that indicates whether the replica is currently being built.
     *
     * @return the isInBuild value.
     */
    public Boolean isInBuild() {
        return this.isInBuild;
    }

    /**
     * Set the isInBuild property: Value that indicates whether the replica is currently being built.
     *
     * @param isInBuild the isInBuild value to set.
     * @return the SecondaryReplicatorStatus object itself.
     */
    public SecondaryReplicatorStatus setIsInBuild(Boolean isInBuild) {
        this.isInBuild = isInBuild;
        return this;
    }

    /**
     * Get the copyQueueStatus property: Details about the copy queue on the secondary replicator.
     *
     * @return the copyQueueStatus value.
     */
    public ReplicatorQueueStatus getCopyQueueStatus() {
        return this.copyQueueStatus;
    }

    /**
     * Set the copyQueueStatus property: Details about the copy queue on the secondary replicator.
     *
     * @param copyQueueStatus the copyQueueStatus value to set.
     * @return the SecondaryReplicatorStatus object itself.
     */
    public SecondaryReplicatorStatus setCopyQueueStatus(ReplicatorQueueStatus copyQueueStatus) {
        this.copyQueueStatus = copyQueueStatus;
        return this;
    }

    /**
     * Get the lastCopyOperationReceivedTimeUtc property: The last time-stamp (UTC) at which a copy operation was
     * received from the primary. UTC 0 represents an invalid value, indicating that a copy operation message was never
     * received.
     *
     * @return the lastCopyOperationReceivedTimeUtc value.
     */
    public OffsetDateTime getLastCopyOperationReceivedTimeUtc() {
        return this.lastCopyOperationReceivedTimeUtc;
    }

    /**
     * Set the lastCopyOperationReceivedTimeUtc property: The last time-stamp (UTC) at which a copy operation was
     * received from the primary. UTC 0 represents an invalid value, indicating that a copy operation message was never
     * received.
     *
     * @param lastCopyOperationReceivedTimeUtc the lastCopyOperationReceivedTimeUtc value to set.
     * @return the SecondaryReplicatorStatus object itself.
     */
    public SecondaryReplicatorStatus setLastCopyOperationReceivedTimeUtc(
            OffsetDateTime lastCopyOperationReceivedTimeUtc) {
        this.lastCopyOperationReceivedTimeUtc = lastCopyOperationReceivedTimeUtc;
        return this;
    }

    /**
     * Get the lastAcknowledgementSentTimeUtc property: The last time-stamp (UTC) at which an acknowledgment was sent to
     * the primary replicator. UTC 0 represents an invalid value, indicating that an acknowledgment message was never
     * sent.
     *
     * @return the lastAcknowledgementSentTimeUtc value.
     */
    public OffsetDateTime getLastAcknowledgementSentTimeUtc() {
        return this.lastAcknowledgementSentTimeUtc;
    }

    /**
     * Set the lastAcknowledgementSentTimeUtc property: The last time-stamp (UTC) at which an acknowledgment was sent to
     * the primary replicator. UTC 0 represents an invalid value, indicating that an acknowledgment message was never
     * sent.
     *
     * @param lastAcknowledgementSentTimeUtc the lastAcknowledgementSentTimeUtc value to set.
     * @return the SecondaryReplicatorStatus object itself.
     */
    public SecondaryReplicatorStatus setLastAcknowledgementSentTimeUtc(OffsetDateTime lastAcknowledgementSentTimeUtc) {
        this.lastAcknowledgementSentTimeUtc = lastAcknowledgementSentTimeUtc;
        return this;
    }
}
