package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides various statistics of the queue used in the service fabric replicator. Contains information about the
 * service fabric replicator like the replication/copy queue utilization, last acknowledgement received timestamp, etc.
 * Depending on the role of the replicator, the properties in this type imply different meanings.
 */
@Fluent
public final class ReplicatorQueueStatus {
    /*
     * Represents the utilization of the queue. A value of 0 indicates that the
     * queue is empty and a value of 100 indicates the queue is full.
     */
    @JsonProperty(value = "QueueUtilizationPercentage")
    private Integer queueUtilizationPercentage;

    /*
     * Represents the virtual memory consumed by the queue in bytes.
     */
    @JsonProperty(value = "QueueMemorySize")
    private String queueMemorySize;

    /*
     * On a primary replicator, this is semantically the sequence number of the
     * operation for which all the secondary replicas have sent an
     * acknowledgement.
     * On a secondary replicator, this is the smallest sequence number of the
     * operation that is present in the queue.
     */
    @JsonProperty(value = "FirstSequenceNumber")
    private String firstSequenceNumber;

    /*
     * On a primary replicator, this is semantically the highest sequence
     * number of the operation for which all the secondary replicas have sent
     * an acknowledgement.
     * On a secondary replicator, this is semantically the highest sequence
     * number that has been applied to the persistent state.
     */
    @JsonProperty(value = "CompletedSequenceNumber")
    private String completedSequenceNumber;

    /*
     * On a primary replicator, this is semantically the highest sequence
     * number of the operation for which a write quorum of the secondary
     * replicas have sent an acknowledgement.
     * On a secondary replicator, this is semantically the highest sequence
     * number of the in-order operation received from the primary.
     */
    @JsonProperty(value = "CommittedSequenceNumber")
    private String committedSequenceNumber;

    /*
     * Represents the latest sequence number of the operation that is available
     * in the queue.
     */
    @JsonProperty(value = "LastSequenceNumber")
    private String lastSequenceNumber;

    /**
     * Get the queueUtilizationPercentage property: Represents the utilization of the queue. A value of 0 indicates that
     * the queue is empty and a value of 100 indicates the queue is full.
     *
     * @return the queueUtilizationPercentage value.
     */
    public Integer getQueueUtilizationPercentage() {
        return this.queueUtilizationPercentage;
    }

    /**
     * Set the queueUtilizationPercentage property: Represents the utilization of the queue. A value of 0 indicates that
     * the queue is empty and a value of 100 indicates the queue is full.
     *
     * @param queueUtilizationPercentage the queueUtilizationPercentage value to set.
     * @return the ReplicatorQueueStatus object itself.
     */
    public ReplicatorQueueStatus setQueueUtilizationPercentage(Integer queueUtilizationPercentage) {
        this.queueUtilizationPercentage = queueUtilizationPercentage;
        return this;
    }

    /**
     * Get the queueMemorySize property: Represents the virtual memory consumed by the queue in bytes.
     *
     * @return the queueMemorySize value.
     */
    public String getQueueMemorySize() {
        return this.queueMemorySize;
    }

    /**
     * Set the queueMemorySize property: Represents the virtual memory consumed by the queue in bytes.
     *
     * @param queueMemorySize the queueMemorySize value to set.
     * @return the ReplicatorQueueStatus object itself.
     */
    public ReplicatorQueueStatus setQueueMemorySize(String queueMemorySize) {
        this.queueMemorySize = queueMemorySize;
        return this;
    }

    /**
     * Get the firstSequenceNumber property: On a primary replicator, this is semantically the sequence number of the
     * operation for which all the secondary replicas have sent an acknowledgement. On a secondary replicator, this is
     * the smallest sequence number of the operation that is present in the queue.
     *
     * @return the firstSequenceNumber value.
     */
    public String getFirstSequenceNumber() {
        return this.firstSequenceNumber;
    }

    /**
     * Set the firstSequenceNumber property: On a primary replicator, this is semantically the sequence number of the
     * operation for which all the secondary replicas have sent an acknowledgement. On a secondary replicator, this is
     * the smallest sequence number of the operation that is present in the queue.
     *
     * @param firstSequenceNumber the firstSequenceNumber value to set.
     * @return the ReplicatorQueueStatus object itself.
     */
    public ReplicatorQueueStatus setFirstSequenceNumber(String firstSequenceNumber) {
        this.firstSequenceNumber = firstSequenceNumber;
        return this;
    }

    /**
     * Get the completedSequenceNumber property: On a primary replicator, this is semantically the highest sequence
     * number of the operation for which all the secondary replicas have sent an acknowledgement. On a secondary
     * replicator, this is semantically the highest sequence number that has been applied to the persistent state.
     *
     * @return the completedSequenceNumber value.
     */
    public String getCompletedSequenceNumber() {
        return this.completedSequenceNumber;
    }

    /**
     * Set the completedSequenceNumber property: On a primary replicator, this is semantically the highest sequence
     * number of the operation for which all the secondary replicas have sent an acknowledgement. On a secondary
     * replicator, this is semantically the highest sequence number that has been applied to the persistent state.
     *
     * @param completedSequenceNumber the completedSequenceNumber value to set.
     * @return the ReplicatorQueueStatus object itself.
     */
    public ReplicatorQueueStatus setCompletedSequenceNumber(String completedSequenceNumber) {
        this.completedSequenceNumber = completedSequenceNumber;
        return this;
    }

    /**
     * Get the committedSequenceNumber property: On a primary replicator, this is semantically the highest sequence
     * number of the operation for which a write quorum of the secondary replicas have sent an acknowledgement. On a
     * secondary replicator, this is semantically the highest sequence number of the in-order operation received from
     * the primary.
     *
     * @return the committedSequenceNumber value.
     */
    public String getCommittedSequenceNumber() {
        return this.committedSequenceNumber;
    }

    /**
     * Set the committedSequenceNumber property: On a primary replicator, this is semantically the highest sequence
     * number of the operation for which a write quorum of the secondary replicas have sent an acknowledgement. On a
     * secondary replicator, this is semantically the highest sequence number of the in-order operation received from
     * the primary.
     *
     * @param committedSequenceNumber the committedSequenceNumber value to set.
     * @return the ReplicatorQueueStatus object itself.
     */
    public ReplicatorQueueStatus setCommittedSequenceNumber(String committedSequenceNumber) {
        this.committedSequenceNumber = committedSequenceNumber;
        return this;
    }

    /**
     * Get the lastSequenceNumber property: Represents the latest sequence number of the operation that is available in
     * the queue.
     *
     * @return the lastSequenceNumber value.
     */
    public String getLastSequenceNumber() {
        return this.lastSequenceNumber;
    }

    /**
     * Set the lastSequenceNumber property: Represents the latest sequence number of the operation that is available in
     * the queue.
     *
     * @param lastSequenceNumber the lastSequenceNumber value to set.
     * @return the ReplicatorQueueStatus object itself.
     */
    public ReplicatorQueueStatus setLastSequenceNumber(String lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
        return this;
    }
}
