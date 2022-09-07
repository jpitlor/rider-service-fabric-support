package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the horizontal auto scaling mechanism that adds or removes replicas (containers or container groups). */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AddRemoveReplica")
@Fluent
public final class AddRemoveReplicaScalingMechanism extends AutoScalingMechanism {
    /*
     * Minimum number of containers (scale down won't be performed below this
     * number).
     */
    @JsonProperty(value = "minCount", required = true)
    private int minCount;

    /*
     * Maximum number of containers (scale up won't be performed above this
     * number).
     */
    @JsonProperty(value = "maxCount", required = true)
    private int maxCount;

    /*
     * Each time auto scaling is performed, this number of containers will be
     * added or removed.
     */
    @JsonProperty(value = "scaleIncrement", required = true)
    private int scaleIncrement;

    /**
     * Get the minCount property: Minimum number of containers (scale down won't be performed below this number).
     *
     * @return the minCount value.
     */
    public int getMinCount() {
        return this.minCount;
    }

    /**
     * Set the minCount property: Minimum number of containers (scale down won't be performed below this number).
     *
     * @param minCount the minCount value to set.
     * @return the AddRemoveReplicaScalingMechanism object itself.
     */
    public AddRemoveReplicaScalingMechanism setMinCount(int minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get the maxCount property: Maximum number of containers (scale up won't be performed above this number).
     *
     * @return the maxCount value.
     */
    public int getMaxCount() {
        return this.maxCount;
    }

    /**
     * Set the maxCount property: Maximum number of containers (scale up won't be performed above this number).
     *
     * @param maxCount the maxCount value to set.
     * @return the AddRemoveReplicaScalingMechanism object itself.
     */
    public AddRemoveReplicaScalingMechanism setMaxCount(int maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get the scaleIncrement property: Each time auto scaling is performed, this number of containers will be added or
     * removed.
     *
     * @return the scaleIncrement value.
     */
    public int getScaleIncrement() {
        return this.scaleIncrement;
    }

    /**
     * Set the scaleIncrement property: Each time auto scaling is performed, this number of containers will be added or
     * removed.
     *
     * @param scaleIncrement the scaleIncrement value to set.
     * @return the AddRemoveReplicaScalingMechanism object itself.
     */
    public AddRemoveReplicaScalingMechanism setScaleIncrement(int scaleIncrement) {
        this.scaleIncrement = scaleIncrement;
        return this;
    }
}
