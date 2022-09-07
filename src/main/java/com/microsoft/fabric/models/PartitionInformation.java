package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Information about the partition identity, partitioning scheme and keys supported by it. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServicePartitionKind",
        defaultImpl = PartitionInformation.class)
@JsonTypeName("PartitionInformation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Int64Range", value = Int64RangePartitionInformation.class),
    @JsonSubTypes.Type(name = "Named", value = NamedPartitionInformation.class),
    @JsonSubTypes.Type(name = "Singleton", value = SingletonPartitionInformation.class)
})
@Fluent
public class PartitionInformation {
    /*
     * An internal ID used by Service Fabric to uniquely identify a partition.
     * This is a randomly generated GUID when the service was created. The
     * partition ID is unique and does not change for the lifetime of the
     * service. If the same service was deleted and recreated the IDs of its
     * partitions would be different.
     */
    @JsonProperty(value = "Id")
    private UUID id;

    /**
     * Get the id property: An internal ID used by Service Fabric to uniquely identify a partition. This is a randomly
     * generated GUID when the service was created. The partition ID is unique and does not change for the lifetime of
     * the service. If the same service was deleted and recreated the IDs of its partitions would be different.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Set the id property: An internal ID used by Service Fabric to uniquely identify a partition. This is a randomly
     * generated GUID when the service was created. The partition ID is unique and does not change for the lifetime of
     * the service. If the same service was deleted and recreated the IDs of its partitions would be different.
     *
     * @param id the id value to set.
     * @return the PartitionInformation object itself.
     */
    public PartitionInformation setId(UUID id) {
        this.id = id;
        return this;
    }
}
