package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Information about a partition of a stateful Service Fabric service.. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServicePartitionInfo extends ServicePartitionInfo {
    /*
     * The target replica set size as a number.
     */
    @JsonProperty(value = "TargetReplicaSetSize")
    private Long targetReplicaSetSize;

    /*
     * The minimum replica set size as a number.
     */
    @JsonProperty(value = "MinReplicaSetSize")
    private Long minReplicaSetSize;

    /*
     * The auxiliary replica count as a number. To use Auxiliary replicas the
     * following must be true, AuxiliaryReplicaCount <
     * (TargetReplicaSetSize+1)/2 and TargetReplicaSetSize >=3.
     */
    @JsonProperty(value = "AuxiliaryReplicaCount")
    private Long auxiliaryReplicaCount;

    /*
     * The duration for which this partition was in quorum loss. If the
     * partition is currently in quorum loss, it returns the duration since it
     * has been in that state. This field is using ISO8601 format for
     * specifying the duration.
     */
    @JsonProperty(value = "LastQuorumLossDuration")
    private Duration lastQuorumLossDuration;

    /*
     * An Epoch is a configuration number for the partition as a whole. When
     * the configuration of the replica set changes, for example when the
     * Primary replica changes, the operations that are replicated from the new
     * Primary replica are said to be a new Epoch from the ones which were sent
     * by the old Primary replica.
     */
    @JsonProperty(value = "PrimaryEpoch")
    private Epoch primaryEpoch;

    /**
     * Get the targetReplicaSetSize property: The target replica set size as a number.
     *
     * @return the targetReplicaSetSize value.
     */
    public Long getTargetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the targetReplicaSetSize property: The target replica set size as a number.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set.
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo setTargetReplicaSetSize(Long targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @return the minReplicaSetSize value.
     */
    public Long getMinReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set.
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo setMinReplicaSetSize(Long minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the auxiliaryReplicaCount property: The auxiliary replica count as a number. To use Auxiliary replicas the
     * following must be true, AuxiliaryReplicaCount &lt; (TargetReplicaSetSize+1)/2 and TargetReplicaSetSize &gt;=3.
     *
     * @return the auxiliaryReplicaCount value.
     */
    public Long getAuxiliaryReplicaCount() {
        return this.auxiliaryReplicaCount;
    }

    /**
     * Set the auxiliaryReplicaCount property: The auxiliary replica count as a number. To use Auxiliary replicas the
     * following must be true, AuxiliaryReplicaCount &lt; (TargetReplicaSetSize+1)/2 and TargetReplicaSetSize &gt;=3.
     *
     * @param auxiliaryReplicaCount the auxiliaryReplicaCount value to set.
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo setAuxiliaryReplicaCount(Long auxiliaryReplicaCount) {
        this.auxiliaryReplicaCount = auxiliaryReplicaCount;
        return this;
    }

    /**
     * Get the lastQuorumLossDuration property: The duration for which this partition was in quorum loss. If the
     * partition is currently in quorum loss, it returns the duration since it has been in that state. This field is
     * using ISO8601 format for specifying the duration.
     *
     * @return the lastQuorumLossDuration value.
     */
    public Duration getLastQuorumLossDuration() {
        return this.lastQuorumLossDuration;
    }

    /**
     * Set the lastQuorumLossDuration property: The duration for which this partition was in quorum loss. If the
     * partition is currently in quorum loss, it returns the duration since it has been in that state. This field is
     * using ISO8601 format for specifying the duration.
     *
     * @param lastQuorumLossDuration the lastQuorumLossDuration value to set.
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo setLastQuorumLossDuration(Duration lastQuorumLossDuration) {
        this.lastQuorumLossDuration = lastQuorumLossDuration;
        return this;
    }

    /**
     * Get the primaryEpoch property: An Epoch is a configuration number for the partition as a whole. When the
     * configuration of the replica set changes, for example when the Primary replica changes, the operations that are
     * replicated from the new Primary replica are said to be a new Epoch from the ones which were sent by the old
     * Primary replica.
     *
     * @return the primaryEpoch value.
     */
    public Epoch getPrimaryEpoch() {
        return this.primaryEpoch;
    }

    /**
     * Set the primaryEpoch property: An Epoch is a configuration number for the partition as a whole. When the
     * configuration of the replica set changes, for example when the Primary replica changes, the operations that are
     * replicated from the new Primary replica are said to be a new Epoch from the ones which were sent by the old
     * Primary replica.
     *
     * @param primaryEpoch the primaryEpoch value to set.
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo setPrimaryEpoch(Epoch primaryEpoch) {
        this.primaryEpoch = primaryEpoch;
        return this;
    }
}
