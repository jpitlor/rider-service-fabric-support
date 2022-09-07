package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/**
 * Represents a safety check for the service partition being performed by service fabric before continuing with
 * operations.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = PartitionSafetyCheck.class)
@JsonTypeName("PartitionSafetyCheck")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "EnsureAvailability", value = EnsureAvailabilitySafetyCheck.class),
    @JsonSubTypes.Type(name = "EnsurePartitionQuorum", value = EnsurePartitionQuorumSafetyCheck.class),
    @JsonSubTypes.Type(name = "WaitForInbuildReplica", value = WaitForInbuildReplicaSafetyCheck.class),
    @JsonSubTypes.Type(name = "WaitForPrimaryPlacement", value = WaitForPrimaryPlacementSafetyCheck.class),
    @JsonSubTypes.Type(name = "WaitForPrimarySwap", value = WaitForPrimarySwapSafetyCheck.class),
    @JsonSubTypes.Type(name = "WaitForReconfiguration", value = WaitForReconfigurationSafetyCheck.class)
})
@Fluent
public class PartitionSafetyCheck extends SafetyCheck {
    /*
     * Id of the partition which is undergoing the safety check.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get the partitionId property: Id of the partition which is undergoing the safety check.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: Id of the partition which is undergoing the safety check.
     *
     * @param partitionId the partitionId value to set.
     * @return the PartitionSafetyCheck object itself.
     */
    public PartitionSafetyCheck setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }
}
