package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Specifies result of updating load for specified partitions. The output will be ordered based on the partition ID. */
@Fluent
public final class UpdatePartitionLoadResult {
    /*
     * Id of the partition.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * If OperationState is Completed - this is 0.  If OperationState is
     * Faulted - this is an error code indicating the reason.
     */
    @JsonProperty(value = "PartitionErrorCode")
    private Integer partitionErrorCode;

    /**
     * Get the partitionId property: Id of the partition.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: Id of the partition.
     *
     * @param partitionId the partitionId value to set.
     * @return the UpdatePartitionLoadResult object itself.
     */
    public UpdatePartitionLoadResult setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the partitionErrorCode property: If OperationState is Completed - this is 0. If OperationState is Faulted -
     * this is an error code indicating the reason.
     *
     * @return the partitionErrorCode value.
     */
    public Integer getPartitionErrorCode() {
        return this.partitionErrorCode;
    }

    /**
     * Set the partitionErrorCode property: If OperationState is Completed - this is 0. If OperationState is Faulted -
     * this is an error code indicating the reason.
     *
     * @param partitionErrorCode the partitionErrorCode value to set.
     * @return the UpdatePartitionLoadResult object itself.
     */
    public UpdatePartitionLoadResult setPartitionErrorCode(Integer partitionErrorCode) {
        this.partitionErrorCode = partitionErrorCode;
        return this;
    }
}
