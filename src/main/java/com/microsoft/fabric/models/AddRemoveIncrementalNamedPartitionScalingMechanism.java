package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a scaling mechanism for adding or removing named partitions of a stateless service. Partition names are in
 * the format '0','1''N-1'.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("AddRemoveIncrementalNamedPartition")
@Fluent
public final class AddRemoveIncrementalNamedPartitionScalingMechanism extends ScalingMechanismDescription {
    /*
     * Minimum number of named partitions of the service.
     */
    @JsonProperty(value = "MinPartitionCount", required = true)
    private int minPartitionCount;

    /*
     * Maximum number of named partitions of the service.
     */
    @JsonProperty(value = "MaxPartitionCount", required = true)
    private int maxPartitionCount;

    /*
     * The number of instances to add or remove during a scaling operation.
     */
    @JsonProperty(value = "ScaleIncrement", required = true)
    private int scaleIncrement;

    /**
     * Get the minPartitionCount property: Minimum number of named partitions of the service.
     *
     * @return the minPartitionCount value.
     */
    public int getMinPartitionCount() {
        return this.minPartitionCount;
    }

    /**
     * Set the minPartitionCount property: Minimum number of named partitions of the service.
     *
     * @param minPartitionCount the minPartitionCount value to set.
     * @return the AddRemoveIncrementalNamedPartitionScalingMechanism object itself.
     */
    public AddRemoveIncrementalNamedPartitionScalingMechanism setMinPartitionCount(int minPartitionCount) {
        this.minPartitionCount = minPartitionCount;
        return this;
    }

    /**
     * Get the maxPartitionCount property: Maximum number of named partitions of the service.
     *
     * @return the maxPartitionCount value.
     */
    public int getMaxPartitionCount() {
        return this.maxPartitionCount;
    }

    /**
     * Set the maxPartitionCount property: Maximum number of named partitions of the service.
     *
     * @param maxPartitionCount the maxPartitionCount value to set.
     * @return the AddRemoveIncrementalNamedPartitionScalingMechanism object itself.
     */
    public AddRemoveIncrementalNamedPartitionScalingMechanism setMaxPartitionCount(int maxPartitionCount) {
        this.maxPartitionCount = maxPartitionCount;
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
     * @return the AddRemoveIncrementalNamedPartitionScalingMechanism object itself.
     */
    public AddRemoveIncrementalNamedPartitionScalingMechanism setScaleIncrement(int scaleIncrement) {
        this.scaleIncrement = scaleIncrement;
        return this;
    }
}
