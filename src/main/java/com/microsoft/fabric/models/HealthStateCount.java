package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents information about how many health entities are in Ok, Warning and Error health state. */
@Fluent
public final class HealthStateCount {
    /*
     * The number of health entities with aggregated health state Ok.
     */
    @JsonProperty(value = "OkCount")
    private Long okCount;

    /*
     * The number of health entities with aggregated health state Warning.
     */
    @JsonProperty(value = "WarningCount")
    private Long warningCount;

    /*
     * The number of health entities with aggregated health state Error.
     */
    @JsonProperty(value = "ErrorCount")
    private Long errorCount;

    /**
     * Get the okCount property: The number of health entities with aggregated health state Ok.
     *
     * @return the okCount value.
     */
    public Long getOkCount() {
        return this.okCount;
    }

    /**
     * Set the okCount property: The number of health entities with aggregated health state Ok.
     *
     * @param okCount the okCount value to set.
     * @return the HealthStateCount object itself.
     */
    public HealthStateCount setOkCount(Long okCount) {
        this.okCount = okCount;
        return this;
    }

    /**
     * Get the warningCount property: The number of health entities with aggregated health state Warning.
     *
     * @return the warningCount value.
     */
    public Long getWarningCount() {
        return this.warningCount;
    }

    /**
     * Set the warningCount property: The number of health entities with aggregated health state Warning.
     *
     * @param warningCount the warningCount value to set.
     * @return the HealthStateCount object itself.
     */
    public HealthStateCount setWarningCount(Long warningCount) {
        this.warningCount = warningCount;
        return this;
    }

    /**
     * Get the errorCount property: The number of health entities with aggregated health state Error.
     *
     * @return the errorCount value.
     */
    public Long getErrorCount() {
        return this.errorCount;
    }

    /**
     * Set the errorCount property: The number of health entities with aggregated health state Error.
     *
     * @param errorCount the errorCount value to set.
     * @return the HealthStateCount object itself.
     */
    public HealthStateCount setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
        return this;
    }
}
