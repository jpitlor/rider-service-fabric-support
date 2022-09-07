package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Provides details about the remote replicators from the primary replicator's point of view. */
@Fluent
public final class RemoteReplicatorAcknowledgementStatus {
    /*
     * Details about the acknowledgements for operations that are part of the
     * replication stream data.
     */
    @JsonProperty(value = "ReplicationStreamAcknowledgementDetail")
    private RemoteReplicatorAcknowledgementDetail replicationStreamAcknowledgementDetail;

    /*
     * Details about the acknowledgements for operations that are part of the
     * copy stream data.
     */
    @JsonProperty(value = "CopyStreamAcknowledgementDetail")
    private RemoteReplicatorAcknowledgementDetail copyStreamAcknowledgementDetail;

    /**
     * Get the replicationStreamAcknowledgementDetail property: Details about the acknowledgements for operations that
     * are part of the replication stream data.
     *
     * @return the replicationStreamAcknowledgementDetail value.
     */
    public RemoteReplicatorAcknowledgementDetail getReplicationStreamAcknowledgementDetail() {
        return this.replicationStreamAcknowledgementDetail;
    }

    /**
     * Set the replicationStreamAcknowledgementDetail property: Details about the acknowledgements for operations that
     * are part of the replication stream data.
     *
     * @param replicationStreamAcknowledgementDetail the replicationStreamAcknowledgementDetail value to set.
     * @return the RemoteReplicatorAcknowledgementStatus object itself.
     */
    public RemoteReplicatorAcknowledgementStatus setReplicationStreamAcknowledgementDetail(
            RemoteReplicatorAcknowledgementDetail replicationStreamAcknowledgementDetail) {
        this.replicationStreamAcknowledgementDetail = replicationStreamAcknowledgementDetail;
        return this;
    }

    /**
     * Get the copyStreamAcknowledgementDetail property: Details about the acknowledgements for operations that are part
     * of the copy stream data.
     *
     * @return the copyStreamAcknowledgementDetail value.
     */
    public RemoteReplicatorAcknowledgementDetail getCopyStreamAcknowledgementDetail() {
        return this.copyStreamAcknowledgementDetail;
    }

    /**
     * Set the copyStreamAcknowledgementDetail property: Details about the acknowledgements for operations that are part
     * of the copy stream data.
     *
     * @param copyStreamAcknowledgementDetail the copyStreamAcknowledgementDetail value to set.
     * @return the RemoteReplicatorAcknowledgementStatus object itself.
     */
    public RemoteReplicatorAcknowledgementStatus setCopyStreamAcknowledgementDetail(
            RemoteReplicatorAcknowledgementDetail copyStreamAcknowledgementDetail) {
        this.copyStreamAcknowledgementDetail = copyStreamAcknowledgementDetail;
        return this;
    }
}
