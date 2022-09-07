package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Represents the base for all Partition Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = PartitionEvent.class)
@JsonTypeName("PartitionEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "PartitionAnalysisEvent", value = PartitionAnalysisEvent.class),
    @JsonSubTypes.Type(name = "PartitionNewHealthReport", value = PartitionNewHealthReportEvent.class),
    @JsonSubTypes.Type(name = "PartitionHealthReportExpired", value = PartitionHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "PartitionReconfigured", value = PartitionReconfiguredEvent.class),
    @JsonSubTypes.Type(
            name = "ChaosPartitionSecondaryMoveScheduled",
            value = ChaosPartitionSecondaryMoveScheduledEvent.class),
    @JsonSubTypes.Type(
            name = "ChaosPartitionPrimaryMoveScheduled",
            value = ChaosPartitionPrimaryMoveScheduledEvent.class)
})
@Fluent
public class PartitionEvent extends FabricEvent {
    /*
     * An internal ID used by Service Fabric to uniquely identify a partition.
     * This is a randomly generated GUID when the service was created. The
     * partition ID is unique and does not change for the lifetime of the
     * service. If the same service was deleted and recreated the IDs of its
     * partitions would be different.
     */
    @JsonProperty(value = "PartitionId", required = true)
    private UUID partitionId;

    /**
     * Get the partitionId property: An internal ID used by Service Fabric to uniquely identify a partition. This is a
     * randomly generated GUID when the service was created. The partition ID is unique and does not change for the
     * lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be
     * different.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: An internal ID used by Service Fabric to uniquely identify a partition. This is a
     * randomly generated GUID when the service was created. The partition ID is unique and does not change for the
     * lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be
     * different.
     *
     * @param partitionId the partitionId value to set.
     * @return the PartitionEvent object itself.
     */
    public PartitionEvent setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }
}
