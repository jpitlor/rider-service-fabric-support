package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents a scaling policy related to an average load of a metric/resource of a service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("AverageServiceLoad")
@Fluent
public final class AverageServiceLoadScalingTrigger extends ScalingTriggerDescription {
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

    /*
     * Flag determines whether only the load of primary replica should be
     * considered for scaling.
     * If set to true, then trigger will only consider the load of primary
     * replicas of stateful service.
     * If set to false, trigger will consider load of all replicas.
     * This parameter cannot be set to true for stateless service.
     */
    @JsonProperty(value = "UseOnlyPrimaryLoad", required = true)
    private boolean useOnlyPrimaryLoad;

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
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger setMetricName(String metricName) {
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
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger setLowerLoadThreshold(String lowerLoadThreshold) {
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
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger setUpperLoadThreshold(String upperLoadThreshold) {
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
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger setScaleIntervalInSeconds(long scaleIntervalInSeconds) {
        this.scaleIntervalInSeconds = scaleIntervalInSeconds;
        return this;
    }

    /**
     * Get the useOnlyPrimaryLoad property: Flag determines whether only the load of primary replica should be
     * considered for scaling. If set to true, then trigger will only consider the load of primary replicas of stateful
     * service. If set to false, trigger will consider load of all replicas. This parameter cannot be set to true for
     * stateless service.
     *
     * @return the useOnlyPrimaryLoad value.
     */
    public boolean isUseOnlyPrimaryLoad() {
        return this.useOnlyPrimaryLoad;
    }

    /**
     * Set the useOnlyPrimaryLoad property: Flag determines whether only the load of primary replica should be
     * considered for scaling. If set to true, then trigger will only consider the load of primary replicas of stateful
     * service. If set to false, trigger will consider load of all replicas. This parameter cannot be set to true for
     * stateless service.
     *
     * @param useOnlyPrimaryLoad the useOnlyPrimaryLoad value to set.
     * @return the AverageServiceLoadScalingTrigger object itself.
     */
    public AverageServiceLoadScalingTrigger setUseOnlyPrimaryLoad(boolean useOnlyPrimaryLoad) {
        this.useOnlyPrimaryLoad = useOnlyPrimaryLoad;
        return this;
    }
}
