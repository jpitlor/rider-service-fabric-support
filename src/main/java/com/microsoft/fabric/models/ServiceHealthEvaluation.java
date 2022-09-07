package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for a service, containing information about the data and the algorithm used by health
 * store to evaluate health. The evaluation is returned only when the aggregated health state is either Error or
 * Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Service")
@Fluent
public final class ServiceHealthEvaluation extends HealthEvaluation {
    /*
     * Name of the service whose health evaluation is described by this object.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /*
     * List of unhealthy evaluations that led to the current aggregated health
     * state of the service. The types of the unhealthy evaluations can be
     * PartitionsHealthEvaluation or EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the serviceName property: Name of the service whose health evaluation is described by this object.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Name of the service whose health evaluation is described by this object.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceHealthEvaluation object itself.
     */
    public ServiceHealthEvaluation setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the service. The types of the unhealthy evaluations can be PartitionsHealthEvaluation or
     * EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the service. The types of the unhealthy evaluations can be PartitionsHealthEvaluation or
     * EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the ServiceHealthEvaluation object itself.
     */
    public ServiceHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
