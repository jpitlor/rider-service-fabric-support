package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Provides various statistics of the acknowledgements that are being received from the remote replicator. */
@Fluent
public final class RemoteReplicatorAcknowledgementDetail {
    /*
     * Represents the average duration it takes for the remote replicator to
     * receive an operation.
     */
    @JsonProperty(value = "AverageReceiveDuration")
    private String averageReceiveDuration;

    /*
     * Represents the average duration it takes for the remote replicator to
     * apply an operation. This usually entails writing the operation to disk.
     */
    @JsonProperty(value = "AverageApplyDuration")
    private String averageApplyDuration;

    /*
     * Represents the number of operations not yet received by a remote
     * replicator.
     */
    @JsonProperty(value = "NotReceivedCount")
    private String notReceivedCount;

    /*
     * Represents the number of operations received and not yet applied by a
     * remote replicator.
     */
    @JsonProperty(value = "ReceivedAndNotAppliedCount")
    private String receivedAndNotAppliedCount;

    /**
     * Get the averageReceiveDuration property: Represents the average duration it takes for the remote replicator to
     * receive an operation.
     *
     * @return the averageReceiveDuration value.
     */
    public String getAverageReceiveDuration() {
        return this.averageReceiveDuration;
    }

    /**
     * Set the averageReceiveDuration property: Represents the average duration it takes for the remote replicator to
     * receive an operation.
     *
     * @param averageReceiveDuration the averageReceiveDuration value to set.
     * @return the RemoteReplicatorAcknowledgementDetail object itself.
     */
    public RemoteReplicatorAcknowledgementDetail setAverageReceiveDuration(String averageReceiveDuration) {
        this.averageReceiveDuration = averageReceiveDuration;
        return this;
    }

    /**
     * Get the averageApplyDuration property: Represents the average duration it takes for the remote replicator to
     * apply an operation. This usually entails writing the operation to disk.
     *
     * @return the averageApplyDuration value.
     */
    public String getAverageApplyDuration() {
        return this.averageApplyDuration;
    }

    /**
     * Set the averageApplyDuration property: Represents the average duration it takes for the remote replicator to
     * apply an operation. This usually entails writing the operation to disk.
     *
     * @param averageApplyDuration the averageApplyDuration value to set.
     * @return the RemoteReplicatorAcknowledgementDetail object itself.
     */
    public RemoteReplicatorAcknowledgementDetail setAverageApplyDuration(String averageApplyDuration) {
        this.averageApplyDuration = averageApplyDuration;
        return this;
    }

    /**
     * Get the notReceivedCount property: Represents the number of operations not yet received by a remote replicator.
     *
     * @return the notReceivedCount value.
     */
    public String getNotReceivedCount() {
        return this.notReceivedCount;
    }

    /**
     * Set the notReceivedCount property: Represents the number of operations not yet received by a remote replicator.
     *
     * @param notReceivedCount the notReceivedCount value to set.
     * @return the RemoteReplicatorAcknowledgementDetail object itself.
     */
    public RemoteReplicatorAcknowledgementDetail setNotReceivedCount(String notReceivedCount) {
        this.notReceivedCount = notReceivedCount;
        return this;
    }

    /**
     * Get the receivedAndNotAppliedCount property: Represents the number of operations received and not yet applied by
     * a remote replicator.
     *
     * @return the receivedAndNotAppliedCount value.
     */
    public String getReceivedAndNotAppliedCount() {
        return this.receivedAndNotAppliedCount;
    }

    /**
     * Set the receivedAndNotAppliedCount property: Represents the number of operations received and not yet applied by
     * a remote replicator.
     *
     * @param receivedAndNotAppliedCount the receivedAndNotAppliedCount value to set.
     * @return the RemoteReplicatorAcknowledgementDetail object itself.
     */
    public RemoteReplicatorAcknowledgementDetail setReceivedAndNotAppliedCount(String receivedAndNotAppliedCount) {
        this.receivedAndNotAppliedCount = receivedAndNotAppliedCount;
        return this;
    }
}
