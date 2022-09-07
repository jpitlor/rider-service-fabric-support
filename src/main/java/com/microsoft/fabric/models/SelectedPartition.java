package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** This class returns information about the partition that the user-induced operation acted upon. */
@Fluent
public final class SelectedPartition {
    /*
     * The name of the service the partition belongs to.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * An internal ID used by Service Fabric to uniquely identify a partition.
     * This is a randomly generated GUID when the service was created. The
     * partition ID is unique and does not change for the lifetime of the
     * service. If the same service was deleted and recreated the IDs of its
     * partitions would be different.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get the serviceName property: The name of the service the partition belongs to.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service the partition belongs to.
     *
     * @param serviceName the serviceName value to set.
     * @return the SelectedPartition object itself.
     */
    public SelectedPartition setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

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
     * @return the SelectedPartition object itself.
     */
    public SelectedPartition setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }
}
