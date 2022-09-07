package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Health information common to all entities in the cluster. It contains the aggregated health state, health events and
 * unhealthy evaluation.
 */
@Fluent
public class EntityHealth {
    /*
     * The HealthState representing the aggregated health state of the entity
     * computed by Health Manager.
     * The health evaluation of the entity reflects all events reported on the
     * entity and its children (if any).
     * The aggregation is done by applying the desired health policy.
     */
    @JsonProperty(value = "AggregatedHealthState")
    private HealthState aggregatedHealthState;

    /*
     * The list of health events reported on the entity.
     */
    @JsonProperty(value = "HealthEvents")
    private List<HealthEvent> healthEvents;

    /*
     * The unhealthy evaluations that show why the current aggregated health
     * state was returned by Health Manager.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /*
     * Shows the health statistics for all children types of the queried
     * entity.
     */
    @JsonProperty(value = "HealthStatistics")
    private HealthStatistics healthStatistics;

    /**
     * Get the aggregatedHealthState property: The HealthState representing the aggregated health state of the entity
     * computed by Health Manager. The health evaluation of the entity reflects all events reported on the entity and
     * its children (if any). The aggregation is done by applying the desired health policy.
     *
     * @return the aggregatedHealthState value.
     */
    public HealthState getAggregatedHealthState() {
        return this.aggregatedHealthState;
    }

    /**
     * Set the aggregatedHealthState property: The HealthState representing the aggregated health state of the entity
     * computed by Health Manager. The health evaluation of the entity reflects all events reported on the entity and
     * its children (if any). The aggregation is done by applying the desired health policy.
     *
     * @param aggregatedHealthState the aggregatedHealthState value to set.
     * @return the EntityHealth object itself.
     */
    public EntityHealth setAggregatedHealthState(HealthState aggregatedHealthState) {
        this.aggregatedHealthState = aggregatedHealthState;
        return this;
    }

    /**
     * Get the healthEvents property: The list of health events reported on the entity.
     *
     * @return the healthEvents value.
     */
    public List<HealthEvent> getHealthEvents() {
        return this.healthEvents;
    }

    /**
     * Set the healthEvents property: The list of health events reported on the entity.
     *
     * @param healthEvents the healthEvents value to set.
     * @return the EntityHealth object itself.
     */
    public EntityHealth setHealthEvents(List<HealthEvent> healthEvents) {
        this.healthEvents = healthEvents;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: The unhealthy evaluations that show why the current aggregated health
     * state was returned by Health Manager.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: The unhealthy evaluations that show why the current aggregated health
     * state was returned by Health Manager.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the EntityHealth object itself.
     */
    public EntityHealth setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

    /**
     * Get the healthStatistics property: Shows the health statistics for all children types of the queried entity.
     *
     * @return the healthStatistics value.
     */
    public HealthStatistics getHealthStatistics() {
        return this.healthStatistics;
    }

    /**
     * Set the healthStatistics property: Shows the health statistics for all children types of the queried entity.
     *
     * @param healthStatistics the healthStatistics value to set.
     * @return the EntityHealth object itself.
     */
    public EntityHealth setHealthStatistics(HealthStatistics healthStatistics) {
        this.healthStatistics = healthStatistics;
        return this;
    }
}
