package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for deployed applications, containing health evaluations for each unhealthy deployed
 * application that impacted current aggregated health state. Can be returned when evaluating application health and the
 * aggregated health state is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("DeployedApplications")
@Fluent
public final class DeployedApplicationsHealthEvaluation extends HealthEvaluation {
    /*
     * Maximum allowed percentage of unhealthy deployed applications from the
     * ApplicationHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyDeployedApplications")
    private Integer maxPercentUnhealthyDeployedApplications;

    /*
     * Total number of deployed applications of the application in the health
     * store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy DeployedApplicationHealthEvaluation that
     * impacted the aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the maxPercentUnhealthyDeployedApplications property: Maximum allowed percentage of unhealthy deployed
     * applications from the ApplicationHealthPolicy.
     *
     * @return the maxPercentUnhealthyDeployedApplications value.
     */
    public Integer getMaxPercentUnhealthyDeployedApplications() {
        return this.maxPercentUnhealthyDeployedApplications;
    }

    /**
     * Set the maxPercentUnhealthyDeployedApplications property: Maximum allowed percentage of unhealthy deployed
     * applications from the ApplicationHealthPolicy.
     *
     * @param maxPercentUnhealthyDeployedApplications the maxPercentUnhealthyDeployedApplications value to set.
     * @return the DeployedApplicationsHealthEvaluation object itself.
     */
    public DeployedApplicationsHealthEvaluation setMaxPercentUnhealthyDeployedApplications(
            Integer maxPercentUnhealthyDeployedApplications) {
        this.maxPercentUnhealthyDeployedApplications = maxPercentUnhealthyDeployedApplications;
        return this;
    }

    /**
     * Get the totalCount property: Total number of deployed applications of the application in the health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of deployed applications of the application in the health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the DeployedApplicationsHealthEvaluation object itself.
     */
    public DeployedApplicationsHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy DeployedApplicationHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy DeployedApplicationHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the DeployedApplicationsHealthEvaluation object itself.
     */
    public DeployedApplicationsHealthEvaluation setUnhealthyEvaluations(
            List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
