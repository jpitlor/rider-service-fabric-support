package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.UUID;

/**
 * Represents health evaluation for a replica, containing information about the data and the algorithm used by health
 * store to evaluate health. The evaluation is returned only when the aggregated health state is either Error or
 * Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Replica")
@Fluent
public final class ReplicaHealthEvaluation extends HealthEvaluation {
    /*
     * Id of the partition to which the replica belongs.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * Id of a stateful service replica or a stateless service instance. This
     * ID is used in the queries that apply to both stateful and stateless
     * services. It is used by Service Fabric to uniquely identify a replica of
     * a partition of a stateful service or an instance of a stateless service
     * partition. It is unique within a partition and does not change for the
     * lifetime of the replica or the instance. If a stateful replica gets
     * dropped and another replica gets created on the same node for the same
     * partition, it will get a different value for the ID. If a stateless
     * instance is failed over on the same or different node it will get a
     * different value for the ID.
     */
    @JsonProperty(value = "ReplicaOrInstanceId")
    private String replicaOrInstanceId;

    /*
     * List of unhealthy evaluations that led to the current aggregated health
     * state of the replica. The types of the unhealthy evaluations can be
     * EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the partitionId property: Id of the partition to which the replica belongs.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: Id of the partition to which the replica belongs.
     *
     * @param partitionId the partitionId value to set.
     * @return the ReplicaHealthEvaluation object itself.
     */
    public ReplicaHealthEvaluation setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the replicaOrInstanceId property: Id of a stateful service replica or a stateless service instance. This ID
     * is used in the queries that apply to both stateful and stateless services. It is used by Service Fabric to
     * uniquely identify a replica of a partition of a stateful service or an instance of a stateless service partition.
     * It is unique within a partition and does not change for the lifetime of the replica or the instance. If a
     * stateful replica gets dropped and another replica gets created on the same node for the same partition, it will
     * get a different value for the ID. If a stateless instance is failed over on the same or different node it will
     * get a different value for the ID.
     *
     * @return the replicaOrInstanceId value.
     */
    public String getReplicaOrInstanceId() {
        return this.replicaOrInstanceId;
    }

    /**
     * Set the replicaOrInstanceId property: Id of a stateful service replica or a stateless service instance. This ID
     * is used in the queries that apply to both stateful and stateless services. It is used by Service Fabric to
     * uniquely identify a replica of a partition of a stateful service or an instance of a stateless service partition.
     * It is unique within a partition and does not change for the lifetime of the replica or the instance. If a
     * stateful replica gets dropped and another replica gets created on the same node for the same partition, it will
     * get a different value for the ID. If a stateless instance is failed over on the same or different node it will
     * get a different value for the ID.
     *
     * @param replicaOrInstanceId the replicaOrInstanceId value to set.
     * @return the ReplicaHealthEvaluation object itself.
     */
    public ReplicaHealthEvaluation setReplicaOrInstanceId(String replicaOrInstanceId) {
        this.replicaOrInstanceId = replicaOrInstanceId;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the replica. The types of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the replica. The types of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the ReplicaHealthEvaluation object itself.
     */
    public ReplicaHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
