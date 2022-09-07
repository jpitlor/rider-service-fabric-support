package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for a deployed application, containing information about the data and the algorithm used
 * by the health store to evaluate health.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("DeployedApplication")
@Fluent
public final class DeployedApplicationHealthEvaluation extends HealthEvaluation {
    /*
     * Name of the node where the application is deployed to.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * List of  unhealthy evaluations that led to the current aggregated health
     * state of the deployed application.
     * The types of the unhealthy evaluations can be
     * DeployedServicePackagesHealthEvaluation or EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the nodeName property: Name of the node where the application is deployed to.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Name of the node where the application is deployed to.
     *
     * @param nodeName the nodeName value to set.
     * @return the DeployedApplicationHealthEvaluation object itself.
     */
    public DeployedApplicationHealthEvaluation setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param applicationName the applicationName value to set.
     * @return the DeployedApplicationHealthEvaluation object itself.
     */
    public DeployedApplicationHealthEvaluation setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the deployed application. The types of the unhealthy evaluations can be
     * DeployedServicePackagesHealthEvaluation or EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the deployed application. The types of the unhealthy evaluations can be
     * DeployedServicePackagesHealthEvaluation or EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the DeployedApplicationHealthEvaluation object itself.
     */
    public DeployedApplicationHealthEvaluation setUnhealthyEvaluations(
            List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
