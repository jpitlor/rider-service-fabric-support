package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a stateful service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServiceDescription extends ServiceDescription {
    /*
     * The target replica set size as a number.
     */
    @JsonProperty(value = "TargetReplicaSetSize", required = true)
    private int targetReplicaSetSize;

    /*
     * The minimum replica set size as a number.
     */
    @JsonProperty(value = "MinReplicaSetSize", required = true)
    private int minReplicaSetSize;

    /*
     * A flag indicating whether this is a persistent service which stores
     * states on the local disk. If it is then the value of this property is
     * true, if not it is false.
     */
    @JsonProperty(value = "HasPersistedState", required = true)
    private boolean hasPersistedState;

    /*
     * Flags indicating whether other properties are set. Each of the
     * associated properties corresponds to a flag, specified below, which, if
     * set, indicate that the property is specified.
     * This property can be a combination of those flags obtained using bitwise
     * 'OR' operator.
     * For example, if the provided value is 6 then the flags for
     * QuorumLossWaitDuration (2) and StandByReplicaKeepDuration(4) are set.
     *
     * - None - Does not indicate any other properties are set. The value is
     * zero.
     * - ReplicaRestartWaitDuration - Indicates the ReplicaRestartWaitDuration
     * property is set. The value is 1.
     * - QuorumLossWaitDuration - Indicates the QuorumLossWaitDuration property
     * is set. The value is 2.
     * - StandByReplicaKeepDuration - Indicates the StandByReplicaKeepDuration
     * property is set. The value is 4.
     * - ServicePlacementTimeLimit - Indicates the ServicePlacementTimeLimit
     * property is set. The value is 8.
     * - DropSourceReplicaOnMove - Indicates the DropSourceReplicaOnMove
     * property is set. The value is 16.
     */
    @JsonProperty(value = "Flags")
    private Integer flags;

    /*
     * The duration, in seconds, between when a replica goes down and when a
     * new replica is created.
     */
    @JsonProperty(value = "ReplicaRestartWaitDurationSeconds")
    private Long replicaRestartWaitDurationSeconds;

    /*
     * The maximum duration, in seconds, for which a partition is allowed to be
     * in a state of quorum loss.
     */
    @JsonProperty(value = "QuorumLossWaitDurationSeconds")
    private Long quorumLossWaitDurationSeconds;

    /*
     * The definition on how long StandBy replicas should be maintained before
     * being removed.
     */
    @JsonProperty(value = "StandByReplicaKeepDurationSeconds")
    private Long standByReplicaKeepDurationSeconds;

    /*
     * The duration for which replicas can stay InBuild before reporting that
     * build is stuck.
     */
    @JsonProperty(value = "ServicePlacementTimeLimitSeconds")
    private Long servicePlacementTimeLimitSeconds;

    /*
     * Indicates whether to drop source Secondary replica even if the target
     * replica has not finished build. If desired behavior is to drop it as
     * soon as possible the value of this property is true, if not it is false.
     */
    @JsonProperty(value = "DropSourceReplicaOnMove")
    private Boolean dropSourceReplicaOnMove;

    /*
     * Defines how replicas of this service will behave during their lifecycle.
     */
    @JsonProperty(value = "ReplicaLifecycleDescription")
    private ReplicaLifecycleDescription replicaLifecycleDescription;

    /*
     * The auxiliary replica count as a number. To use Auxiliary replicas, the
     * following must be true: AuxiliaryReplicaCount <
     * (TargetReplicaSetSize+1)/2 and TargetReplicaSetSize >=3.
     */
    @JsonProperty(value = "AuxiliaryReplicaCount")
    private Integer auxiliaryReplicaCount;

    /**
     * Get the targetReplicaSetSize property: The target replica set size as a number.
     *
     * @return the targetReplicaSetSize value.
     */
    public int getTargetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the targetReplicaSetSize property: The target replica set size as a number.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setTargetReplicaSetSize(int targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @return the minReplicaSetSize value.
     */
    public int getMinReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setMinReplicaSetSize(int minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the hasPersistedState property: A flag indicating whether this is a persistent service which stores states on
     * the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @return the hasPersistedState value.
     */
    public boolean isHasPersistedState() {
        return this.hasPersistedState;
    }

    /**
     * Set the hasPersistedState property: A flag indicating whether this is a persistent service which stores states on
     * the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @param hasPersistedState the hasPersistedState value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setHasPersistedState(boolean hasPersistedState) {
        this.hasPersistedState = hasPersistedState;
        return this;
    }

    /**
     * Get the flags property: Flags indicating whether other properties are set. Each of the associated properties
     * corresponds to a flag, specified below, which, if set, indicate that the property is specified. This property can
     * be a combination of those flags obtained using bitwise 'OR' operator. For example, if the provided value is 6
     * then the flags for QuorumLossWaitDuration (2) and StandByReplicaKeepDuration(4) are set.
     *
     * <p>- None - Does not indicate any other properties are set. The value is zero. - ReplicaRestartWaitDuration -
     * Indicates the ReplicaRestartWaitDuration property is set. The value is 1. - QuorumLossWaitDuration - Indicates
     * the QuorumLossWaitDuration property is set. The value is 2. - StandByReplicaKeepDuration - Indicates the
     * StandByReplicaKeepDuration property is set. The value is 4. - ServicePlacementTimeLimit - Indicates the
     * ServicePlacementTimeLimit property is set. The value is 8. - DropSourceReplicaOnMove - Indicates the
     * DropSourceReplicaOnMove property is set. The value is 16.
     *
     * @return the flags value.
     */
    public Integer getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: Flags indicating whether other properties are set. Each of the associated properties
     * corresponds to a flag, specified below, which, if set, indicate that the property is specified. This property can
     * be a combination of those flags obtained using bitwise 'OR' operator. For example, if the provided value is 6
     * then the flags for QuorumLossWaitDuration (2) and StandByReplicaKeepDuration(4) are set.
     *
     * <p>- None - Does not indicate any other properties are set. The value is zero. - ReplicaRestartWaitDuration -
     * Indicates the ReplicaRestartWaitDuration property is set. The value is 1. - QuorumLossWaitDuration - Indicates
     * the QuorumLossWaitDuration property is set. The value is 2. - StandByReplicaKeepDuration - Indicates the
     * StandByReplicaKeepDuration property is set. The value is 4. - ServicePlacementTimeLimit - Indicates the
     * ServicePlacementTimeLimit property is set. The value is 8. - DropSourceReplicaOnMove - Indicates the
     * DropSourceReplicaOnMove property is set. The value is 16.
     *
     * @param flags the flags value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setFlags(Integer flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the replicaRestartWaitDurationSeconds property: The duration, in seconds, between when a replica goes down
     * and when a new replica is created.
     *
     * @return the replicaRestartWaitDurationSeconds value.
     */
    public Long getReplicaRestartWaitDurationSeconds() {
        return this.replicaRestartWaitDurationSeconds;
    }

    /**
     * Set the replicaRestartWaitDurationSeconds property: The duration, in seconds, between when a replica goes down
     * and when a new replica is created.
     *
     * @param replicaRestartWaitDurationSeconds the replicaRestartWaitDurationSeconds value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setReplicaRestartWaitDurationSeconds(Long replicaRestartWaitDurationSeconds) {
        this.replicaRestartWaitDurationSeconds = replicaRestartWaitDurationSeconds;
        return this;
    }

    /**
     * Get the quorumLossWaitDurationSeconds property: The maximum duration, in seconds, for which a partition is
     * allowed to be in a state of quorum loss.
     *
     * @return the quorumLossWaitDurationSeconds value.
     */
    public Long getQuorumLossWaitDurationSeconds() {
        return this.quorumLossWaitDurationSeconds;
    }

    /**
     * Set the quorumLossWaitDurationSeconds property: The maximum duration, in seconds, for which a partition is
     * allowed to be in a state of quorum loss.
     *
     * @param quorumLossWaitDurationSeconds the quorumLossWaitDurationSeconds value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setQuorumLossWaitDurationSeconds(Long quorumLossWaitDurationSeconds) {
        this.quorumLossWaitDurationSeconds = quorumLossWaitDurationSeconds;
        return this;
    }

    /**
     * Get the standByReplicaKeepDurationSeconds property: The definition on how long StandBy replicas should be
     * maintained before being removed.
     *
     * @return the standByReplicaKeepDurationSeconds value.
     */
    public Long getStandByReplicaKeepDurationSeconds() {
        return this.standByReplicaKeepDurationSeconds;
    }

    /**
     * Set the standByReplicaKeepDurationSeconds property: The definition on how long StandBy replicas should be
     * maintained before being removed.
     *
     * @param standByReplicaKeepDurationSeconds the standByReplicaKeepDurationSeconds value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setStandByReplicaKeepDurationSeconds(Long standByReplicaKeepDurationSeconds) {
        this.standByReplicaKeepDurationSeconds = standByReplicaKeepDurationSeconds;
        return this;
    }

    /**
     * Get the servicePlacementTimeLimitSeconds property: The duration for which replicas can stay InBuild before
     * reporting that build is stuck.
     *
     * @return the servicePlacementTimeLimitSeconds value.
     */
    public Long getServicePlacementTimeLimitSeconds() {
        return this.servicePlacementTimeLimitSeconds;
    }

    /**
     * Set the servicePlacementTimeLimitSeconds property: The duration for which replicas can stay InBuild before
     * reporting that build is stuck.
     *
     * @param servicePlacementTimeLimitSeconds the servicePlacementTimeLimitSeconds value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setServicePlacementTimeLimitSeconds(Long servicePlacementTimeLimitSeconds) {
        this.servicePlacementTimeLimitSeconds = servicePlacementTimeLimitSeconds;
        return this;
    }

    /**
     * Get the dropSourceReplicaOnMove property: Indicates whether to drop source Secondary replica even if the target
     * replica has not finished build. If desired behavior is to drop it as soon as possible the value of this property
     * is true, if not it is false.
     *
     * @return the dropSourceReplicaOnMove value.
     */
    public Boolean isDropSourceReplicaOnMove() {
        return this.dropSourceReplicaOnMove;
    }

    /**
     * Set the dropSourceReplicaOnMove property: Indicates whether to drop source Secondary replica even if the target
     * replica has not finished build. If desired behavior is to drop it as soon as possible the value of this property
     * is true, if not it is false.
     *
     * @param dropSourceReplicaOnMove the dropSourceReplicaOnMove value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setDropSourceReplicaOnMove(Boolean dropSourceReplicaOnMove) {
        this.dropSourceReplicaOnMove = dropSourceReplicaOnMove;
        return this;
    }

    /**
     * Get the replicaLifecycleDescription property: Defines how replicas of this service will behave during their
     * lifecycle.
     *
     * @return the replicaLifecycleDescription value.
     */
    public ReplicaLifecycleDescription getReplicaLifecycleDescription() {
        return this.replicaLifecycleDescription;
    }

    /**
     * Set the replicaLifecycleDescription property: Defines how replicas of this service will behave during their
     * lifecycle.
     *
     * @param replicaLifecycleDescription the replicaLifecycleDescription value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setReplicaLifecycleDescription(
            ReplicaLifecycleDescription replicaLifecycleDescription) {
        this.replicaLifecycleDescription = replicaLifecycleDescription;
        return this;
    }

    /**
     * Get the auxiliaryReplicaCount property: The auxiliary replica count as a number. To use Auxiliary replicas, the
     * following must be true: AuxiliaryReplicaCount &lt; (TargetReplicaSetSize+1)/2 and TargetReplicaSetSize &gt;=3.
     *
     * @return the auxiliaryReplicaCount value.
     */
    public Integer getAuxiliaryReplicaCount() {
        return this.auxiliaryReplicaCount;
    }

    /**
     * Set the auxiliaryReplicaCount property: The auxiliary replica count as a number. To use Auxiliary replicas, the
     * following must be true: AuxiliaryReplicaCount &lt; (TargetReplicaSetSize+1)/2 and TargetReplicaSetSize &gt;=3.
     *
     * @param auxiliaryReplicaCount the auxiliaryReplicaCount value to set.
     * @return the StatefulServiceDescription object itself.
     */
    public StatefulServiceDescription setAuxiliaryReplicaCount(Integer auxiliaryReplicaCount) {
        this.auxiliaryReplicaCount = auxiliaryReplicaCount;
        return this;
    }
}
