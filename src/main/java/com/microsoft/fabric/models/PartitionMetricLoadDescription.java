package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * Represents load information for a partition, which contains the metrics load information about primary, all secondary
 * replicas/instances or a specific secondary replica/instance on a specific node , all auxiliary replicas or a specific
 * auxiliary replica on a specific node.
 */
@Fluent
public final class PartitionMetricLoadDescription {
    /*
     * Id of the partition.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * Partition's load information for primary replica, in case partition is
     * from a stateful service.
     */
    @JsonProperty(value = "PrimaryReplicaLoadEntries")
    private List<MetricLoadDescription> primaryReplicaLoadEntries;

    /*
     * Partition's load information for all secondary replicas or instances.
     */
    @JsonProperty(value = "SecondaryReplicasOrInstancesLoadEntries")
    private List<MetricLoadDescription> secondaryReplicasOrInstancesLoadEntries;

    /*
     * Partition's load information for a specific secondary replica or
     * instance located on a specific node.
     */
    @JsonProperty(value = "SecondaryReplicaOrInstanceLoadEntriesPerNode")
    private List<ReplicaMetricLoadDescription> secondaryReplicaOrInstanceLoadEntriesPerNode;

    /*
     * Partition's load information for all auxiliary replicas.
     */
    @JsonProperty(value = "AuxiliaryReplicasLoadEntries")
    private List<MetricLoadDescription> auxiliaryReplicasLoadEntries;

    /*
     * Partition's load information for a specific auxiliary replica located on
     * a specific node.
     */
    @JsonProperty(value = "AuxiliaryReplicaLoadEntriesPerNode")
    private List<ReplicaMetricLoadDescription> auxiliaryReplicaLoadEntriesPerNode;

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
     * @return the PartitionMetricLoadDescription object itself.
     */
    public PartitionMetricLoadDescription setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the primaryReplicaLoadEntries property: Partition's load information for primary replica, in case partition
     * is from a stateful service.
     *
     * @return the primaryReplicaLoadEntries value.
     */
    public List<MetricLoadDescription> getPrimaryReplicaLoadEntries() {
        return this.primaryReplicaLoadEntries;
    }

    /**
     * Set the primaryReplicaLoadEntries property: Partition's load information for primary replica, in case partition
     * is from a stateful service.
     *
     * @param primaryReplicaLoadEntries the primaryReplicaLoadEntries value to set.
     * @return the PartitionMetricLoadDescription object itself.
     */
    public PartitionMetricLoadDescription setPrimaryReplicaLoadEntries(
            List<MetricLoadDescription> primaryReplicaLoadEntries) {
        this.primaryReplicaLoadEntries = primaryReplicaLoadEntries;
        return this;
    }

    /**
     * Get the secondaryReplicasOrInstancesLoadEntries property: Partition's load information for all secondary replicas
     * or instances.
     *
     * @return the secondaryReplicasOrInstancesLoadEntries value.
     */
    public List<MetricLoadDescription> getSecondaryReplicasOrInstancesLoadEntries() {
        return this.secondaryReplicasOrInstancesLoadEntries;
    }

    /**
     * Set the secondaryReplicasOrInstancesLoadEntries property: Partition's load information for all secondary replicas
     * or instances.
     *
     * @param secondaryReplicasOrInstancesLoadEntries the secondaryReplicasOrInstancesLoadEntries value to set.
     * @return the PartitionMetricLoadDescription object itself.
     */
    public PartitionMetricLoadDescription setSecondaryReplicasOrInstancesLoadEntries(
            List<MetricLoadDescription> secondaryReplicasOrInstancesLoadEntries) {
        this.secondaryReplicasOrInstancesLoadEntries = secondaryReplicasOrInstancesLoadEntries;
        return this;
    }

    /**
     * Get the secondaryReplicaOrInstanceLoadEntriesPerNode property: Partition's load information for a specific
     * secondary replica or instance located on a specific node.
     *
     * @return the secondaryReplicaOrInstanceLoadEntriesPerNode value.
     */
    public List<ReplicaMetricLoadDescription> getSecondaryReplicaOrInstanceLoadEntriesPerNode() {
        return this.secondaryReplicaOrInstanceLoadEntriesPerNode;
    }

    /**
     * Set the secondaryReplicaOrInstanceLoadEntriesPerNode property: Partition's load information for a specific
     * secondary replica or instance located on a specific node.
     *
     * @param secondaryReplicaOrInstanceLoadEntriesPerNode the secondaryReplicaOrInstanceLoadEntriesPerNode value to
     *     set.
     * @return the PartitionMetricLoadDescription object itself.
     */
    public PartitionMetricLoadDescription setSecondaryReplicaOrInstanceLoadEntriesPerNode(
            List<ReplicaMetricLoadDescription> secondaryReplicaOrInstanceLoadEntriesPerNode) {
        this.secondaryReplicaOrInstanceLoadEntriesPerNode = secondaryReplicaOrInstanceLoadEntriesPerNode;
        return this;
    }

    /**
     * Get the auxiliaryReplicasLoadEntries property: Partition's load information for all auxiliary replicas.
     *
     * @return the auxiliaryReplicasLoadEntries value.
     */
    public List<MetricLoadDescription> getAuxiliaryReplicasLoadEntries() {
        return this.auxiliaryReplicasLoadEntries;
    }

    /**
     * Set the auxiliaryReplicasLoadEntries property: Partition's load information for all auxiliary replicas.
     *
     * @param auxiliaryReplicasLoadEntries the auxiliaryReplicasLoadEntries value to set.
     * @return the PartitionMetricLoadDescription object itself.
     */
    public PartitionMetricLoadDescription setAuxiliaryReplicasLoadEntries(
            List<MetricLoadDescription> auxiliaryReplicasLoadEntries) {
        this.auxiliaryReplicasLoadEntries = auxiliaryReplicasLoadEntries;
        return this;
    }

    /**
     * Get the auxiliaryReplicaLoadEntriesPerNode property: Partition's load information for a specific auxiliary
     * replica located on a specific node.
     *
     * @return the auxiliaryReplicaLoadEntriesPerNode value.
     */
    public List<ReplicaMetricLoadDescription> getAuxiliaryReplicaLoadEntriesPerNode() {
        return this.auxiliaryReplicaLoadEntriesPerNode;
    }

    /**
     * Set the auxiliaryReplicaLoadEntriesPerNode property: Partition's load information for a specific auxiliary
     * replica located on a specific node.
     *
     * @param auxiliaryReplicaLoadEntriesPerNode the auxiliaryReplicaLoadEntriesPerNode value to set.
     * @return the PartitionMetricLoadDescription object itself.
     */
    public PartitionMetricLoadDescription setAuxiliaryReplicaLoadEntriesPerNode(
            List<ReplicaMetricLoadDescription> auxiliaryReplicaLoadEntriesPerNode) {
        this.auxiliaryReplicaLoadEntriesPerNode = auxiliaryReplicaLoadEntriesPerNode;
        return this;
    }
}
