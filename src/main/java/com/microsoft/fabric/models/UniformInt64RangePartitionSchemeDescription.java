package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a partitioning scheme where an integer range is allocated evenly across a number of partitions. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "PartitionScheme")
@JsonTypeName("UniformInt64Range")
@Fluent
public final class UniformInt64RangePartitionSchemeDescription extends PartitionSchemeDescription {
    /*
     * The number of partitions.
     */
    @JsonProperty(value = "Count", required = true)
    private int count;

    /*
     * String indicating the lower bound of the partition key range that
     * should be split between the partitions.
     */
    @JsonProperty(value = "LowKey", required = true)
    private String lowKey;

    /*
     * String indicating the upper bound of the partition key range that
     * should be split between the partitions.
     */
    @JsonProperty(value = "HighKey", required = true)
    private String highKey;

    /**
     * Get the count property: The number of partitions.
     *
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: The number of partitions.
     *
     * @param count the count value to set.
     * @return the UniformInt64RangePartitionSchemeDescription object itself.
     */
    public UniformInt64RangePartitionSchemeDescription setCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the lowKey property: String indicating the lower bound of the partition key range that should be split
     * between the partitions.
     *
     * @return the lowKey value.
     */
    public String getLowKey() {
        return this.lowKey;
    }

    /**
     * Set the lowKey property: String indicating the lower bound of the partition key range that should be split
     * between the partitions.
     *
     * @param lowKey the lowKey value to set.
     * @return the UniformInt64RangePartitionSchemeDescription object itself.
     */
    public UniformInt64RangePartitionSchemeDescription setLowKey(String lowKey) {
        this.lowKey = lowKey;
        return this;
    }

    /**
     * Get the highKey property: String indicating the upper bound of the partition key range that should be split
     * between the partitions.
     *
     * @return the highKey value.
     */
    public String getHighKey() {
        return this.highKey;
    }

    /**
     * Set the highKey property: String indicating the upper bound of the partition key range that should be split
     * between the partitions.
     *
     * @param highKey the highKey value to set.
     * @return the UniformInt64RangePartitionSchemeDescription object itself.
     */
    public UniformInt64RangePartitionSchemeDescription setHighKey(String highKey) {
        this.highKey = highKey;
        return this;
    }
}
