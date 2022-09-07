package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the partition information for the integer range that is based on partition schemes. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServicePartitionKind")
@JsonTypeName("Int64Range")
@Fluent
public final class Int64RangePartitionInformation extends PartitionInformation {
    /*
     * Specifies the minimum key value handled by this partition.
     */
    @JsonProperty(value = "LowKey")
    private String lowKey;

    /*
     * Specifies the maximum key value handled by this partition.
     */
    @JsonProperty(value = "HighKey")
    private String highKey;

    /**
     * Get the lowKey property: Specifies the minimum key value handled by this partition.
     *
     * @return the lowKey value.
     */
    public String getLowKey() {
        return this.lowKey;
    }

    /**
     * Set the lowKey property: Specifies the minimum key value handled by this partition.
     *
     * @param lowKey the lowKey value to set.
     * @return the Int64RangePartitionInformation object itself.
     */
    public Int64RangePartitionInformation setLowKey(String lowKey) {
        this.lowKey = lowKey;
        return this;
    }

    /**
     * Get the highKey property: Specifies the maximum key value handled by this partition.
     *
     * @return the highKey value.
     */
    public String getHighKey() {
        return this.highKey;
    }

    /**
     * Set the highKey property: Specifies the maximum key value handled by this partition.
     *
     * @param highKey the highKey value to set.
     * @return the Int64RangePartitionInformation object itself.
     */
    public Int64RangePartitionInformation setHighKey(String highKey) {
        this.highKey = highKey;
        return this;
    }
}
