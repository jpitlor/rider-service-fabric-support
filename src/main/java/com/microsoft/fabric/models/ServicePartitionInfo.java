package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about a partition of a Service Fabric service. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = ServicePartitionInfo.class)
@JsonTypeName("ServicePartitionInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServicePartitionInfo.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServicePartitionInfo.class)
})
@Fluent
public class ServicePartitionInfo {
    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /*
     * The status of the service fabric service partition.
     */
    @JsonProperty(value = "PartitionStatus")
    private ServicePartitionStatus partitionStatus;

    /*
     * Information about the partition identity, partitioning scheme and keys
     * supported by it.
     */
    @JsonProperty(value = "PartitionInformation")
    private PartitionInformation partitionInformation;

    /**
     * Get the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @param healthState the healthState value to set.
     * @return the ServicePartitionInfo object itself.
     */
    public ServicePartitionInfo setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the partitionStatus property: The status of the service fabric service partition.
     *
     * @return the partitionStatus value.
     */
    public ServicePartitionStatus getPartitionStatus() {
        return this.partitionStatus;
    }

    /**
     * Set the partitionStatus property: The status of the service fabric service partition.
     *
     * @param partitionStatus the partitionStatus value to set.
     * @return the ServicePartitionInfo object itself.
     */
    public ServicePartitionInfo setPartitionStatus(ServicePartitionStatus partitionStatus) {
        this.partitionStatus = partitionStatus;
        return this;
    }

    /**
     * Get the partitionInformation property: Information about the partition identity, partitioning scheme and keys
     * supported by it.
     *
     * @return the partitionInformation value.
     */
    public PartitionInformation getPartitionInformation() {
        return this.partitionInformation;
    }

    /**
     * Set the partitionInformation property: Information about the partition identity, partitioning scheme and keys
     * supported by it.
     *
     * @param partitionInformation the partitionInformation value to set.
     * @return the ServicePartitionInfo object itself.
     */
    public ServicePartitionInfo setPartitionInformation(PartitionInformation partitionInformation) {
        this.partitionInformation = partitionInformation;
        return this;
    }
}
