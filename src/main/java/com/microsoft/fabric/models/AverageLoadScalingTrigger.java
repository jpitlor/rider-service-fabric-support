package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the average load trigger used for auto scaling. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AverageLoad")
@Fluent
public final class AverageLoadScalingTrigger extends AutoScalingTrigger {
    /*
     * Description of the metric that is used for scaling.
     */
    @JsonProperty(value = "metric", required = true)
    private AutoScalingMetric metric;

    /*
     * Lower load threshold (if average load is below this threshold, service
     * will scale down).
     */
    @JsonProperty(value = "lowerLoadThreshold", required = true)
    private double lowerLoadThreshold;

    /*
     * Upper load threshold (if average load is above this threshold, service
     * will scale up).
     */
    @JsonProperty(value = "upperLoadThreshold", required = true)
    private double upperLoadThreshold;

    /*
     * Scale interval that indicates how often will this trigger be checked.
     */
    @JsonProperty(value = "scaleIntervalInSeconds", required = true)
    private int scaleIntervalInSeconds;

    /**
     * Get the metric property: Description of the metric that is used for scaling.
     *
     * @return the metric value.
     */
    public AutoScalingMetric getMetric() {
        return this.metric;
    }

    /**
     * Set the metric property: Description of the metric that is used for scaling.
     *
     * @param metric the metric value to set.
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger setMetric(AutoScalingMetric metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the lowerLoadThreshold property: Lower load threshold (if average load is below this threshold, service will
     * scale down).
     *
     * @return the lowerLoadThreshold value.
     */
    public double getLowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Set the lowerLoadThreshold property: Lower load threshold (if average load is below this threshold, service will
     * scale down).
     *
     * @param lowerLoadThreshold the lowerLoadThreshold value to set.
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger setLowerLoadThreshold(double lowerLoadThreshold) {
        this.lowerLoadThreshold = lowerLoadThreshold;
        return this;
    }

    /**
     * Get the upperLoadThreshold property: Upper load threshold (if average load is above this threshold, service will
     * scale up).
     *
     * @return the upperLoadThreshold value.
     */
    public double getUpperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    /**
     * Set the upperLoadThreshold property: Upper load threshold (if average load is above this threshold, service will
     * scale up).
     *
     * @param upperLoadThreshold the upperLoadThreshold value to set.
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger setUpperLoadThreshold(double upperLoadThreshold) {
        this.upperLoadThreshold = upperLoadThreshold;
        return this;
    }

    /**
     * Get the scaleIntervalInSeconds property: Scale interval that indicates how often will this trigger be checked.
     *
     * @return the scaleIntervalInSeconds value.
     */
    public int getScaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Set the scaleIntervalInSeconds property: Scale interval that indicates how often will this trigger be checked.
     *
     * @param scaleIntervalInSeconds the scaleIntervalInSeconds value to set.
     * @return the AverageLoadScalingTrigger object itself.
     */
    public AverageLoadScalingTrigger setScaleIntervalInSeconds(int scaleIntervalInSeconds) {
        this.scaleIntervalInSeconds = scaleIntervalInSeconds;
        return this;
    }
}
