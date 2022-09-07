package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for replicas, containing health evaluations for each unhealthy replica that impacted
 * current aggregated health state. Can be returned when evaluating partition health and the aggregated health state is
 * either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Replicas")
@Fluent
public final class ReplicasHealthEvaluation extends HealthEvaluation {
    /*
     * Maximum allowed percentage of unhealthy replicas per partition from the
     * ApplicationHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyReplicasPerPartition")
    private Integer maxPercentUnhealthyReplicasPerPartition;

    /*
     * Total number of replicas in the partition from the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ReplicaHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the maxPercentUnhealthyReplicasPerPartition property: Maximum allowed percentage of unhealthy replicas per
     * partition from the ApplicationHealthPolicy.
     *
     * @return the maxPercentUnhealthyReplicasPerPartition value.
     */
    public Integer getMaxPercentUnhealthyReplicasPerPartition() {
        return this.maxPercentUnhealthyReplicasPerPartition;
    }

    /**
     * Set the maxPercentUnhealthyReplicasPerPartition property: Maximum allowed percentage of unhealthy replicas per
     * partition from the ApplicationHealthPolicy.
     *
     * @param maxPercentUnhealthyReplicasPerPartition the maxPercentUnhealthyReplicasPerPartition value to set.
     * @return the ReplicasHealthEvaluation object itself.
     */
    public ReplicasHealthEvaluation setMaxPercentUnhealthyReplicasPerPartition(
            Integer maxPercentUnhealthyReplicasPerPartition) {
        this.maxPercentUnhealthyReplicasPerPartition = maxPercentUnhealthyReplicasPerPartition;
        return this;
    }

    /**
     * Get the totalCount property: Total number of replicas in the partition from the health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of replicas in the partition from the health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the ReplicasHealthEvaluation object itself.
     */
    public ReplicasHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ReplicaHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ReplicaHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the ReplicasHealthEvaluation object itself.
     */
    public ReplicasHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
