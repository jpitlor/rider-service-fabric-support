package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Wrapper object for health evaluation. */
@Fluent
public final class HealthEvaluationWrapper {
    /*
     * Represents a health evaluation which describes the data and the
     * algorithm used by health manager to evaluate the health of an entity.
     */
    @JsonProperty(value = "HealthEvaluation")
    private HealthEvaluation healthEvaluation;

    /**
     * Get the healthEvaluation property: Represents a health evaluation which describes the data and the algorithm used
     * by health manager to evaluate the health of an entity.
     *
     * @return the healthEvaluation value.
     */
    public HealthEvaluation getHealthEvaluation() {
        return this.healthEvaluation;
    }

    /**
     * Set the healthEvaluation property: Represents a health evaluation which describes the data and the algorithm used
     * by health manager to evaluate the health of an entity.
     *
     * @param healthEvaluation the healthEvaluation value to set.
     * @return the HealthEvaluationWrapper object itself.
     */
    public HealthEvaluationWrapper setHealthEvaluation(HealthEvaluation healthEvaluation) {
        this.healthEvaluation = healthEvaluation;
        return this;
    }
}
