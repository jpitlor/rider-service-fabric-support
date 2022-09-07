package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the resource that is used for triggering auto scaling. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Resource")
@Fluent
public final class AutoScalingResourceMetric extends AutoScalingMetric {
    /*
     * Name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private AutoScalingResourceMetricName name;

    /**
     * Get the name property: Name of the resource.
     *
     * @return the name value.
     */
    public AutoScalingResourceMetricName getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource.
     *
     * @param name the name value to set.
     * @return the AutoScalingResourceMetric object itself.
     */
    public AutoScalingResourceMetric setName(AutoScalingResourceMetricName name) {
        this.name = name;
        return this;
    }
}
