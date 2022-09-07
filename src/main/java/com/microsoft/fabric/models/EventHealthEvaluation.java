package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents health evaluation of a HealthEvent that was reported on the entity. The health evaluation is returned when
 * evaluating health of an entity results in Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Event")
@Fluent
public final class EventHealthEvaluation extends HealthEvaluation {
    /*
     * Indicates whether warnings are treated with the same severity as errors.
     * The field is specified in the health policy used to evaluate the entity.
     */
    @JsonProperty(value = "ConsiderWarningAsError")
    private Boolean considerWarningAsError;

    /*
     * Represents health information reported on a health entity, such as
     * cluster, application or node, with additional metadata added by the
     * Health Manager.
     */
    @JsonProperty(value = "UnhealthyEvent")
    private HealthEvent unhealthyEvent;

    /**
     * Get the considerWarningAsError property: Indicates whether warnings are treated with the same severity as errors.
     * The field is specified in the health policy used to evaluate the entity.
     *
     * @return the considerWarningAsError value.
     */
    public Boolean isConsiderWarningAsError() {
        return this.considerWarningAsError;
    }

    /**
     * Set the considerWarningAsError property: Indicates whether warnings are treated with the same severity as errors.
     * The field is specified in the health policy used to evaluate the entity.
     *
     * @param considerWarningAsError the considerWarningAsError value to set.
     * @return the EventHealthEvaluation object itself.
     */
    public EventHealthEvaluation setConsiderWarningAsError(Boolean considerWarningAsError) {
        this.considerWarningAsError = considerWarningAsError;
        return this;
    }

    /**
     * Get the unhealthyEvent property: Represents health information reported on a health entity, such as cluster,
     * application or node, with additional metadata added by the Health Manager.
     *
     * @return the unhealthyEvent value.
     */
    public HealthEvent getUnhealthyEvent() {
        return this.unhealthyEvent;
    }

    /**
     * Set the unhealthyEvent property: Represents health information reported on a health entity, such as cluster,
     * application or node, with additional metadata added by the Health Manager.
     *
     * @param unhealthyEvent the unhealthyEvent value to set.
     * @return the EventHealthEvaluation object itself.
     */
    public EventHealthEvaluation setUnhealthyEvent(HealthEvent unhealthyEvent) {
        this.unhealthyEvent = unhealthyEvent;
        return this;
    }
}
