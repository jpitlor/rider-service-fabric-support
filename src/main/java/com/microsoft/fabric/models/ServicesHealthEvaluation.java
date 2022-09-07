package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for services of a certain service type belonging to an application, containing health
 * evaluations for each unhealthy service that impacted current aggregated health state. Can be returned when evaluating
 * application health and the aggregated health state is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Services")
@Fluent
public final class ServicesHealthEvaluation extends HealthEvaluation {
    /*
     * Name of the service type of the services.
     */
    @JsonProperty(value = "ServiceTypeName")
    private String serviceTypeName;

    /*
     * Maximum allowed percentage of unhealthy services from the
     * ServiceTypeHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyServices")
    private Integer maxPercentUnhealthyServices;

    /*
     * Total number of services of the current service type in the application
     * from the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ServiceHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the serviceTypeName property: Name of the service type of the services.
     *
     * @return the serviceTypeName value.
     */
    public String getServiceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set the serviceTypeName property: Name of the service type of the services.
     *
     * @param serviceTypeName the serviceTypeName value to set.
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyServices property: Maximum allowed percentage of unhealthy services from the
     * ServiceTypeHealthPolicy.
     *
     * @return the maxPercentUnhealthyServices value.
     */
    public Integer getMaxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices;
    }

    /**
     * Set the maxPercentUnhealthyServices property: Maximum allowed percentage of unhealthy services from the
     * ServiceTypeHealthPolicy.
     *
     * @param maxPercentUnhealthyServices the maxPercentUnhealthyServices value to set.
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation setMaxPercentUnhealthyServices(Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
        return this;
    }

    /**
     * Get the totalCount property: Total number of services of the current service type in the application from the
     * health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of services of the current service type in the application from the
     * health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ServiceHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ServiceHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the ServicesHealthEvaluation object itself.
     */
    public ServicesHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
