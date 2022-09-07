package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents a scaling mechanism for adding or removing instances of stateless service partition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("PartitionInstanceCount")
@Fluent
public final class PartitionInstanceCountScaleMechanism extends ScalingMechanismDescription {
    /*
     * Minimum number of instances of the partition.
     */
    @JsonProperty(value = "MinInstanceCount", required = true)
    private int minInstanceCount;

    /*
     * Maximum number of instances of the partition.
     */
    @JsonProperty(value = "MaxInstanceCount", required = true)
    private int maxInstanceCount;

    /*
     * The number of instances to add or remove during a scaling operation.
     */
    @JsonProperty(value = "ScaleIncrement", required = true)
    private int scaleIncrement;

    /**
     * Get the minInstanceCount property: Minimum number of instances of the partition.
     *
     * @return the minInstanceCount value.
     */
    public int getMinInstanceCount() {
        return this.minInstanceCount;
    }

    /**
     * Set the minInstanceCount property: Minimum number of instances of the partition.
     *
     * @param minInstanceCount the minInstanceCount value to set.
     * @return the PartitionInstanceCountScaleMechanism object itself.
     */
    public PartitionInstanceCountScaleMechanism setMinInstanceCount(int minInstanceCount) {
        this.minInstanceCount = minInstanceCount;
        return this;
    }

    /**
     * Get the maxInstanceCount property: Maximum number of instances of the partition.
     *
     * @return the maxInstanceCount value.
     */
    public int getMaxInstanceCount() {
        return this.maxInstanceCount;
    }

    /**
     * Set the maxInstanceCount property: Maximum number of instances of the partition.
     *
     * @param maxInstanceCount the maxInstanceCount value to set.
     * @return the PartitionInstanceCountScaleMechanism object itself.
     */
    public PartitionInstanceCountScaleMechanism setMaxInstanceCount(int maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        return this;
    }

    /**
     * Get the scaleIncrement property: The number of instances to add or remove during a scaling operation.
     *
     * @return the scaleIncrement value.
     */
    public int getScaleIncrement() {
        return this.scaleIncrement;
    }

    /**
     * Set the scaleIncrement property: The number of instances to add or remove during a scaling operation.
     *
     * @param scaleIncrement the scaleIncrement value to set.
     * @return the PartitionInstanceCountScaleMechanism object itself.
     */
    public PartitionInstanceCountScaleMechanism setScaleIncrement(int scaleIncrement) {
        this.scaleIncrement = scaleIncrement;
        return this;
    }
}
