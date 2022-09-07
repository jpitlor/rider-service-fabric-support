package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for the fabric:/System application, containing information about the data and the
 * algorithm used by health store to evaluate health. The evaluation is returned only when the aggregated health state
 * of the cluster is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("SystemApplication")
@Fluent
public final class SystemApplicationHealthEvaluation extends HealthEvaluation {
    /*
     * List of unhealthy evaluations that led to the current aggregated health
     * state of the system application. The types of the unhealthy evaluations
     * can be DeployedApplicationsHealthEvaluation, ServicesHealthEvaluation or
     * EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the system application. The types of the unhealthy evaluations can be
     * DeployedApplicationsHealthEvaluation, ServicesHealthEvaluation or EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the system application. The types of the unhealthy evaluations can be
     * DeployedApplicationsHealthEvaluation, ServicesHealthEvaluation or EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the SystemApplicationHealthEvaluation object itself.
     */
    public SystemApplicationHealthEvaluation setUnhealthyEvaluations(
            List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
