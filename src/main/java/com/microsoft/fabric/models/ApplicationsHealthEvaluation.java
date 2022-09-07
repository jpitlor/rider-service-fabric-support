package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for applications, containing health evaluations for each unhealthy application that
 * impacted current aggregated health state.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Applications")
@Fluent
public final class ApplicationsHealthEvaluation extends HealthEvaluation {
    /*
     * Maximum allowed percentage of unhealthy applications from the
     * ClusterHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyApplications")
    private Integer maxPercentUnhealthyApplications;

    /*
     * Total number of applications from the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ApplicationHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the maxPercentUnhealthyApplications property: Maximum allowed percentage of unhealthy applications from the
     * ClusterHealthPolicy.
     *
     * @return the maxPercentUnhealthyApplications value.
     */
    public Integer getMaxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications;
    }

    /**
     * Set the maxPercentUnhealthyApplications property: Maximum allowed percentage of unhealthy applications from the
     * ClusterHealthPolicy.
     *
     * @param maxPercentUnhealthyApplications the maxPercentUnhealthyApplications value to set.
     * @return the ApplicationsHealthEvaluation object itself.
     */
    public ApplicationsHealthEvaluation setMaxPercentUnhealthyApplications(Integer maxPercentUnhealthyApplications) {
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
        return this;
    }

    /**
     * Get the totalCount property: Total number of applications from the health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of applications from the health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the ApplicationsHealthEvaluation object itself.
     */
    public ApplicationsHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ApplicationHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ApplicationHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the ApplicationsHealthEvaluation object itself.
     */
    public ApplicationsHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
