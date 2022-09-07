package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * Represents the health state of a partition, which contains the partition identifier and its aggregated health state.
 */
@Fluent
public final class PartitionHealthState extends EntityHealthState {
    /*
     * Id of the partition whose health state is described by this object.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get the partitionId property: Id of the partition whose health state is described by this object.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: Id of the partition whose health state is described by this object.
     *
     * @param partitionId the partitionId value to set.
     * @return the PartitionHealthState object itself.
     */
    public PartitionHealthState setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }
}
