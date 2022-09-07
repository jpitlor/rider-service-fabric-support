package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes an update for a stateful service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServiceUpdateDescription extends ServiceUpdateDescription {
    /*
     * The target replica set size as a number.
     */
    @JsonProperty(value = "TargetReplicaSetSize")
    private Integer targetReplicaSetSize;

    /*
     * The minimum replica set size as a number.
     */
    @JsonProperty(value = "MinReplicaSetSize")
    private Integer minReplicaSetSize;

    /*
     * The duration, in seconds, between when a replica goes down and when a
     * new replica is created.
     */
    @JsonProperty(value = "ReplicaRestartWaitDurationSeconds")
    private String replicaRestartWaitDurationSeconds;

    /*
     * The maximum duration, in seconds, for which a partition is allowed to be
     * in a state of quorum loss.
     */
    @JsonProperty(value = "QuorumLossWaitDurationSeconds")
    private String quorumLossWaitDurationSeconds;

    /*
     * The definition on how long StandBy replicas should be maintained before
     * being removed.
     */
    @JsonProperty(value = "StandByReplicaKeepDurationSeconds")
    private String standByReplicaKeepDurationSeconds;

    /*
     * The duration for which replicas can stay InBuild before reporting that
     * build is stuck.
     */
    @JsonProperty(value = "ServicePlacementTimeLimitSeconds")
    private String servicePlacementTimeLimitSeconds;

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
    public Integer getTargetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the targetReplicaSetSize property: The target replica set size as a number.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set.
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setTargetReplicaSetSize(Integer targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @return the minReplicaSetSize value.
     */
    public Integer getMinReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set.
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setMinReplicaSetSize(Integer minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the replicaRestartWaitDurationSeconds property: The duration, in seconds, between when a replica goes down
     * and when a new replica is created.
     *
     * @return the replicaRestartWaitDurationSeconds value.
     */
    public String getReplicaRestartWaitDurationSeconds() {
        return this.replicaRestartWaitDurationSeconds;
    }

    /**
     * Set the replicaRestartWaitDurationSeconds property: The duration, in seconds, between when a replica goes down
     * and when a new replica is created.
     *
     * @param replicaRestartWaitDurationSeconds the replicaRestartWaitDurationSeconds value to set.
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setReplicaRestartWaitDurationSeconds(
            String replicaRestartWaitDurationSeconds) {
        this.replicaRestartWaitDurationSeconds = replicaRestartWaitDurationSeconds;
        return this;
    }

    /**
     * Get the quorumLossWaitDurationSeconds property: The maximum duration, in seconds, for which a partition is
     * allowed to be in a state of quorum loss.
     *
     * @return the quorumLossWaitDurationSeconds value.
     */
    public String getQuorumLossWaitDurationSeconds() {
        return this.quorumLossWaitDurationSeconds;
    }

    /**
     * Set the quorumLossWaitDurationSeconds property: The maximum duration, in seconds, for which a partition is
     * allowed to be in a state of quorum loss.
     *
     * @param quorumLossWaitDurationSeconds the quorumLossWaitDurationSeconds value to set.
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setQuorumLossWaitDurationSeconds(String quorumLossWaitDurationSeconds) {
        this.quorumLossWaitDurationSeconds = quorumLossWaitDurationSeconds;
        return this;
    }

    /**
     * Get the standByReplicaKeepDurationSeconds property: The definition on how long StandBy replicas should be
     * maintained before being removed.
     *
     * @return the standByReplicaKeepDurationSeconds value.
     */
    public String getStandByReplicaKeepDurationSeconds() {
        return this.standByReplicaKeepDurationSeconds;
    }

    /**
     * Set the standByReplicaKeepDurationSeconds property: The definition on how long StandBy replicas should be
     * maintained before being removed.
     *
     * @param standByReplicaKeepDurationSeconds the standByReplicaKeepDurationSeconds value to set.
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setStandByReplicaKeepDurationSeconds(
            String standByReplicaKeepDurationSeconds) {
        this.standByReplicaKeepDurationSeconds = standByReplicaKeepDurationSeconds;
        return this;
    }

    /**
     * Get the servicePlacementTimeLimitSeconds property: The duration for which replicas can stay InBuild before
     * reporting that build is stuck.
     *
     * @return the servicePlacementTimeLimitSeconds value.
     */
    public String getServicePlacementTimeLimitSeconds() {
        return this.servicePlacementTimeLimitSeconds;
    }

    /**
     * Set the servicePlacementTimeLimitSeconds property: The duration for which replicas can stay InBuild before
     * reporting that build is stuck.
     *
     * @param servicePlacementTimeLimitSeconds the servicePlacementTimeLimitSeconds value to set.
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setServicePlacementTimeLimitSeconds(
            String servicePlacementTimeLimitSeconds) {
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
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setDropSourceReplicaOnMove(Boolean dropSourceReplicaOnMove) {
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
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setReplicaLifecycleDescription(
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
     * @return the StatefulServiceUpdateDescription object itself.
     */
    public StatefulServiceUpdateDescription setAuxiliaryReplicaCount(Integer auxiliaryReplicaCount) {
        this.auxiliaryReplicaCount = auxiliaryReplicaCount;
        return this;
    }
}
