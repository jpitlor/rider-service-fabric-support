package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents a scaling trigger related to an average load of a metric/resource of a partition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("AveragePartitionLoad")
@Fluent
public final class AveragePartitionLoadScalingTrigger extends ScalingTriggerDescription {
    /*
     * The name of the metric for which usage should be tracked.
     */
    @JsonProperty(value = "MetricName", required = true)
    private String metricName;

    /*
     * The lower limit of the load below which a scale in operation should be
     * performed.
     */
    @JsonProperty(value = "LowerLoadThreshold", required = true)
    private String lowerLoadThreshold;

    /*
     * The upper limit of the load beyond which a scale out operation should be
     * performed.
     */
    @JsonProperty(value = "UpperLoadThreshold", required = true)
    private String upperLoadThreshold;

    /*
     * The period in seconds on which a decision is made whether to scale or
     * not.
     */
    @JsonProperty(value = "ScaleIntervalInSeconds", required = true)
    private long scaleIntervalInSeconds;

    /**
     * Get the metricName property: The name of the metric for which usage should be tracked.
     *
     * @return the metricName value.
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: The name of the metric for which usage should be tracked.
     *
     * @param metricName the metricName value to set.
     * @return the AveragePartitionLoadScalingTrigger object itself.
     */
    public AveragePartitionLoadScalingTrigger setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the lowerLoadThreshold property: The lower limit of the load below which a scale in operation should be
     * performed.
     *
     * @return the lowerLoadThreshold value.
     */
    public String getLowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Set the lowerLoadThreshold property: The lower limit of the load below which a scale in operation should be
     * performed.
     *
     * @param lowerLoadThreshold the lowerLoadThreshold value to set.
     * @return the AveragePartitionLoadScalingTrigger object itself.
     */
    public AveragePartitionLoadScalingTrigger setLowerLoadThreshold(String lowerLoadThreshold) {
        this.lowerLoadThreshold = lowerLoadThreshold;
        return this;
    }

    /**
     * Get the upperLoadThreshold property: The upper limit of the load beyond which a scale out operation should be
     * performed.
     *
     * @return the upperLoadThreshold value.
     */
    public String getUpperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    /**
     * Set the upperLoadThreshold property: The upper limit of the load beyond which a scale out operation should be
     * performed.
     *
     * @param upperLoadThreshold the upperLoadThreshold value to set.
     * @return the AveragePartitionLoadScalingTrigger object itself.
     */
    public AveragePartitionLoadScalingTrigger setUpperLoadThreshold(String upperLoadThreshold) {
        this.upperLoadThreshold = upperLoadThreshold;
        return this;
    }

    /**
     * Get the scaleIntervalInSeconds property: The period in seconds on which a decision is made whether to scale or
     * not.
     *
     * @return the scaleIntervalInSeconds value.
     */
    public long getScaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Set the scaleIntervalInSeconds property: The period in seconds on which a decision is made whether to scale or
     * not.
     *
     * @param scaleIntervalInSeconds the scaleIntervalInSeconds value to set.
     * @return the AveragePartitionLoadScalingTrigger object itself.
     */
    public AveragePartitionLoadScalingTrigger setScaleIntervalInSeconds(long scaleIntervalInSeconds) {
        this.scaleIntervalInSeconds = scaleIntervalInSeconds;
        return this;
    }
}
