package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for the partitions of a service, containing health evaluations for each unhealthy
 * partition that impacts current aggregated health state. Can be returned when evaluating service health and the
 * aggregated health state is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Partitions")
@Fluent
public final class PartitionsHealthEvaluation extends HealthEvaluation {
    /*
     * Maximum allowed percentage of unhealthy partitions per service from the
     * ServiceTypeHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyPartitionsPerService")
    private Integer maxPercentUnhealthyPartitionsPerService;

    /*
     * Total number of partitions of the service from the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy PartitionHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the maxPercentUnhealthyPartitionsPerService property: Maximum allowed percentage of unhealthy partitions per
     * service from the ServiceTypeHealthPolicy.
     *
     * @return the maxPercentUnhealthyPartitionsPerService value.
     */
    public Integer getMaxPercentUnhealthyPartitionsPerService() {
        return this.maxPercentUnhealthyPartitionsPerService;
    }

    /**
     * Set the maxPercentUnhealthyPartitionsPerService property: Maximum allowed percentage of unhealthy partitions per
     * service from the ServiceTypeHealthPolicy.
     *
     * @param maxPercentUnhealthyPartitionsPerService the maxPercentUnhealthyPartitionsPerService value to set.
     * @return the PartitionsHealthEvaluation object itself.
     */
    public PartitionsHealthEvaluation setMaxPercentUnhealthyPartitionsPerService(
            Integer maxPercentUnhealthyPartitionsPerService) {
        this.maxPercentUnhealthyPartitionsPerService = maxPercentUnhealthyPartitionsPerService;
        return this;
    }

    /**
     * Get the totalCount property: Total number of partitions of the service from the health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of partitions of the service from the health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the PartitionsHealthEvaluation object itself.
     */
    public PartitionsHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy PartitionHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy PartitionHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the PartitionsHealthEvaluation object itself.
     */
    public PartitionsHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
