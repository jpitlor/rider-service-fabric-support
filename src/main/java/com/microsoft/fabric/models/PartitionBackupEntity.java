package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Identifies the Service Fabric stateful partition which is being backed up. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "EntityKind")
@JsonTypeName("Partition")
@Fluent
public final class PartitionBackupEntity extends BackupEntity {
    /*
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * The partition ID identifying the partition.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @param serviceName the serviceName value to set.
     * @return the PartitionBackupEntity object itself.
     */
    public PartitionBackupEntity setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the partitionId property: The partition ID identifying the partition.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: The partition ID identifying the partition.
     *
     * @param partitionId the partitionId value to set.
     * @return the PartitionBackupEntity object itself.
     */
    public PartitionBackupEntity setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }
}
