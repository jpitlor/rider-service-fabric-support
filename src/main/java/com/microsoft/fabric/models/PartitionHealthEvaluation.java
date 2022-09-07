package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.UUID;

/**
 * Represents health evaluation for a partition, containing information about the data and the algorithm used by health
 * store to evaluate health. The evaluation is returned only when the aggregated health state is either Error or
 * Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Partition")
@Fluent
public final class PartitionHealthEvaluation extends HealthEvaluation {
    /*
     * Id of the partition whose health evaluation is described by this object.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /*
     * List of unhealthy evaluations that led to the current aggregated health
     * state of the partition. The types of the unhealthy evaluations can be
     * ReplicasHealthEvaluation or EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the partitionId property: Id of the partition whose health evaluation is described by this object.
     *
     * @return the partitionId value.
     */
    public UUID getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: Id of the partition whose health evaluation is described by this object.
     *
     * @param partitionId the partitionId value to set.
     * @return the PartitionHealthEvaluation object itself.
     */
    public PartitionHealthEvaluation setPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the partition. The types of the unhealthy evaluations can be ReplicasHealthEvaluation or
     * EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the partition. The types of the unhealthy evaluations can be ReplicasHealthEvaluation or
     * EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the PartitionHealthEvaluation object itself.
     */
    public PartitionHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
