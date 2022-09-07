package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents the load metric report which contains the time metric was reported, its name and value. */
@Fluent
public final class LoadMetricReport {
    /*
     * Gets the UTC time when the load was reported.
     */
    @JsonProperty(value = "LastReportedUtc")
    private OffsetDateTime lastReportedUtc;

    /*
     * The name of the load metric.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The value of the load metric. In future releases of Service Fabric this
     * parameter will be deprecated in favor of CurrentValue.
     */
    @JsonProperty(value = "Value")
    private String value;

    /*
     * The value of the load metric.
     */
    @JsonProperty(value = "CurrentValue")
    private String currentValue;

    /**
     * Get the lastReportedUtc property: Gets the UTC time when the load was reported.
     *
     * @return the lastReportedUtc value.
     */
    public OffsetDateTime getLastReportedUtc() {
        return this.lastReportedUtc;
    }

    /**
     * Set the lastReportedUtc property: Gets the UTC time when the load was reported.
     *
     * @param lastReportedUtc the lastReportedUtc value to set.
     * @return the LoadMetricReport object itself.
     */
    public LoadMetricReport setLastReportedUtc(OffsetDateTime lastReportedUtc) {
        this.lastReportedUtc = lastReportedUtc;
        return this;
    }

    /**
     * Get the name property: The name of the load metric.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the load metric.
     *
     * @param name the name value to set.
     * @return the LoadMetricReport object itself.
     */
    public LoadMetricReport setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the load metric. In future releases of Service Fabric this parameter will be
     * deprecated in favor of CurrentValue.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the load metric. In future releases of Service Fabric this parameter will be
     * deprecated in favor of CurrentValue.
     *
     * @param value the value value to set.
     * @return the LoadMetricReport object itself.
     */
    public LoadMetricReport setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the currentValue property: The value of the load metric.
     *
     * @return the currentValue value.
     */
    public String getCurrentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The value of the load metric.
     *
     * @param currentValue the currentValue value to set.
     * @return the LoadMetricReport object itself.
     */
    public LoadMetricReport setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }
}
