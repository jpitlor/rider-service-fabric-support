package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies metric load information. */
@Fluent
public final class MetricLoadDescription {
    /*
     * The name of the reported metric.
     */
    @JsonProperty(value = "MetricName")
    private String metricName;

    /*
     * The current value of the metric load.
     */
    @JsonProperty(value = "CurrentLoad")
    private Long currentLoad;

    /*
     * The predicted value of the metric load. Predicted metric load values is
     * currently a preview feature. It allows predicted load values to be
     * reported and used at the Service Fabric side, but that feature is
     * currently not enabled.
     */
    @JsonProperty(value = "PredictedLoad")
    private Long predictedLoad;

    /**
     * Get the metricName property: The name of the reported metric.
     *
     * @return the metricName value.
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * Set the metricName property: The name of the reported metric.
     *
     * @param metricName the metricName value to set.
     * @return the MetricLoadDescription object itself.
     */
    public MetricLoadDescription setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the currentLoad property: The current value of the metric load.
     *
     * @return the currentLoad value.
     */
    public Long getCurrentLoad() {
        return this.currentLoad;
    }

    /**
     * Set the currentLoad property: The current value of the metric load.
     *
     * @param currentLoad the currentLoad value to set.
     * @return the MetricLoadDescription object itself.
     */
    public MetricLoadDescription setCurrentLoad(Long currentLoad) {
        this.currentLoad = currentLoad;
        return this;
    }

    /**
     * Get the predictedLoad property: The predicted value of the metric load. Predicted metric load values is currently
     * a preview feature. It allows predicted load values to be reported and used at the Service Fabric side, but that
     * feature is currently not enabled.
     *
     * @return the predictedLoad value.
     */
    public Long getPredictedLoad() {
        return this.predictedLoad;
    }

    /**
     * Set the predictedLoad property: The predicted value of the metric load. Predicted metric load values is currently
     * a preview feature. It allows predicted load values to be reported and used at the Service Fabric side, but that
     * feature is currently not enabled.
     *
     * @param predictedLoad the predictedLoad value to set.
     * @return the MetricLoadDescription object itself.
     */
    public MetricLoadDescription setPredictedLoad(Long predictedLoad) {
        this.predictedLoad = predictedLoad;
        return this;
    }
}
