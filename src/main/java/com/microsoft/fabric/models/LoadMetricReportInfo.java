package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Information about load reported by replica. */
@Fluent
public final class LoadMetricReportInfo {
    /*
     * The name of the metric.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The value of the load for the metric. In future releases of Service
     * Fabric this parameter will be deprecated in favor of CurrentValue.
     */
    @JsonProperty(value = "Value")
    private Integer value;

    /*
     * The double value of the load for the metric.
     */
    @JsonProperty(value = "CurrentValue")
    private String currentValue;

    /*
     * The UTC time when the load is reported.
     */
    @JsonProperty(value = "LastReportedUtc")
    private OffsetDateTime lastReportedUtc;

    /**
     * Get the name property: The name of the metric.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     *
     * @param name the name value to set.
     * @return the LoadMetricReportInfo object itself.
     */
    public LoadMetricReportInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the load for the metric. In future releases of Service Fabric this parameter
     * will be deprecated in favor of CurrentValue.
     *
     * @return the value value.
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the load for the metric. In future releases of Service Fabric this parameter
     * will be deprecated in favor of CurrentValue.
     *
     * @param value the value value to set.
     * @return the LoadMetricReportInfo object itself.
     */
    public LoadMetricReportInfo setValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Get the currentValue property: The double value of the load for the metric.
     *
     * @return the currentValue value.
     */
    public String getCurrentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The double value of the load for the metric.
     *
     * @param currentValue the currentValue value to set.
     * @return the LoadMetricReportInfo object itself.
     */
    public LoadMetricReportInfo setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the lastReportedUtc property: The UTC time when the load is reported.
     *
     * @return the lastReportedUtc value.
     */
    public OffsetDateTime getLastReportedUtc() {
        return this.lastReportedUtc;
    }

    /**
     * Set the lastReportedUtc property: The UTC time when the load is reported.
     *
     * @param lastReportedUtc the lastReportedUtc value to set.
     * @return the LoadMetricReportInfo object itself.
     */
    public LoadMetricReportInfo setLastReportedUtc(OffsetDateTime lastReportedUtc) {
        this.lastReportedUtc = lastReportedUtc;
        return this;
    }
}
