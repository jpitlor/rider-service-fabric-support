package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Contains information for an unplaced replica. */
@Fluent
public final class UnplacedReplicaInformation {
    /*
     * The name of the service.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * The ID of the partition.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * List of reasons due to which a replica cannot be placed.
     */
    @JsonProperty(value = "UnplacedReplicaDetails")
    private List<String> unplacedReplicaDetails;

    /**
     * Get the serviceName property: The name of the service.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service.
     *
     * @param serviceName the serviceName value to set.
     * @return the UnplacedReplicaInformation object itself.
     */
    public UnplacedReplicaInformation setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the partitionId property: The ID of the partition.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: The ID of the partition.
     *
     * @param partitionId the partitionId value to set.
     * @return the UnplacedReplicaInformation object itself.
     */
    public UnplacedReplicaInformation setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the unplacedReplicaDetails property: List of reasons due to which a replica cannot be placed.
     *
     * @return the unplacedReplicaDetails value.
     */
    public List<String> getUnplacedReplicaDetails() {
        return this.unplacedReplicaDetails;
    }

    /**
     * Set the unplacedReplicaDetails property: List of reasons due to which a replica cannot be placed.
     *
     * @param unplacedReplicaDetails the unplacedReplicaDetails value to set.
     * @return the UnplacedReplicaInformation object itself.
     */
    public UnplacedReplicaInformation setUnplacedReplicaDetails(List<String> unplacedReplicaDetails) {
        this.unplacedReplicaDetails = unplacedReplicaDetails;
        return this;
    }
}
