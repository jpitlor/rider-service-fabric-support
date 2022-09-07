package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Statistics about setup or main entry point of a code package deployed on a Service Fabric node. */
@Fluent
public final class CodePackageEntryPointStatistics {
    /*
     * The last exit code of the entry point.
     */
    @JsonProperty(value = "LastExitCode")
    private String lastExitCode;

    /*
     * The last time (in UTC) when Service Fabric attempted to run the entry
     * point.
     */
    @JsonProperty(value = "LastActivationTime")
    private OffsetDateTime lastActivationTime;

    /*
     * The last time (in UTC) when the entry point finished running.
     */
    @JsonProperty(value = "LastExitTime")
    private OffsetDateTime lastExitTime;

    /*
     * The last time (in UTC) when the entry point ran successfully.
     */
    @JsonProperty(value = "LastSuccessfulActivationTime")
    private OffsetDateTime lastSuccessfulActivationTime;

    /*
     * The last time (in UTC) when the entry point finished running gracefully.
     */
    @JsonProperty(value = "LastSuccessfulExitTime")
    private OffsetDateTime lastSuccessfulExitTime;

    /*
     * Number of times the entry point has run.
     */
    @JsonProperty(value = "ActivationCount")
    private String activationCount;

    /*
     * Number of times the entry point failed to run.
     */
    @JsonProperty(value = "ActivationFailureCount")
    private String activationFailureCount;

    /*
     * Number of times the entry point continuously failed to run.
     */
    @JsonProperty(value = "ContinuousActivationFailureCount")
    private String continuousActivationFailureCount;

    /*
     * Number of times the entry point finished running.
     */
    @JsonProperty(value = "ExitCount")
    private String exitCount;

    /*
     * Number of times the entry point failed to exit gracefully.
     */
    @JsonProperty(value = "ExitFailureCount")
    private String exitFailureCount;

    /*
     * Number of times the entry point continuously failed to exit gracefully.
     */
    @JsonProperty(value = "ContinuousExitFailureCount")
    private String continuousExitFailureCount;

    /**
     * Get the lastExitCode property: The last exit code of the entry point.
     *
     * @return the lastExitCode value.
     */
    public String getLastExitCode() {
        return this.lastExitCode;
    }

    /**
     * Set the lastExitCode property: The last exit code of the entry point.
     *
     * @param lastExitCode the lastExitCode value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setLastExitCode(String lastExitCode) {
        this.lastExitCode = lastExitCode;
        return this;
    }

    /**
     * Get the lastActivationTime property: The last time (in UTC) when Service Fabric attempted to run the entry point.
     *
     * @return the lastActivationTime value.
     */
    public OffsetDateTime getLastActivationTime() {
        return this.lastActivationTime;
    }

    /**
     * Set the lastActivationTime property: The last time (in UTC) when Service Fabric attempted to run the entry point.
     *
     * @param lastActivationTime the lastActivationTime value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setLastActivationTime(OffsetDateTime lastActivationTime) {
        this.lastActivationTime = lastActivationTime;
        return this;
    }

    /**
     * Get the lastExitTime property: The last time (in UTC) when the entry point finished running.
     *
     * @return the lastExitTime value.
     */
    public OffsetDateTime getLastExitTime() {
        return this.lastExitTime;
    }

    /**
     * Set the lastExitTime property: The last time (in UTC) when the entry point finished running.
     *
     * @param lastExitTime the lastExitTime value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setLastExitTime(OffsetDateTime lastExitTime) {
        this.lastExitTime = lastExitTime;
        return this;
    }

    /**
     * Get the lastSuccessfulActivationTime property: The last time (in UTC) when the entry point ran successfully.
     *
     * @return the lastSuccessfulActivationTime value.
     */
    public OffsetDateTime getLastSuccessfulActivationTime() {
        return this.lastSuccessfulActivationTime;
    }

    /**
     * Set the lastSuccessfulActivationTime property: The last time (in UTC) when the entry point ran successfully.
     *
     * @param lastSuccessfulActivationTime the lastSuccessfulActivationTime value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setLastSuccessfulActivationTime(
            OffsetDateTime lastSuccessfulActivationTime) {
        this.lastSuccessfulActivationTime = lastSuccessfulActivationTime;
        return this;
    }

    /**
     * Get the lastSuccessfulExitTime property: The last time (in UTC) when the entry point finished running gracefully.
     *
     * @return the lastSuccessfulExitTime value.
     */
    public OffsetDateTime getLastSuccessfulExitTime() {
        return this.lastSuccessfulExitTime;
    }

    /**
     * Set the lastSuccessfulExitTime property: The last time (in UTC) when the entry point finished running gracefully.
     *
     * @param lastSuccessfulExitTime the lastSuccessfulExitTime value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setLastSuccessfulExitTime(OffsetDateTime lastSuccessfulExitTime) {
        this.lastSuccessfulExitTime = lastSuccessfulExitTime;
        return this;
    }

    /**
     * Get the activationCount property: Number of times the entry point has run.
     *
     * @return the activationCount value.
     */
    public String getActivationCount() {
        return this.activationCount;
    }

    /**
     * Set the activationCount property: Number of times the entry point has run.
     *
     * @param activationCount the activationCount value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setActivationCount(String activationCount) {
        this.activationCount = activationCount;
        return this;
    }

    /**
     * Get the activationFailureCount property: Number of times the entry point failed to run.
     *
     * @return the activationFailureCount value.
     */
    public String getActivationFailureCount() {
        return this.activationFailureCount;
    }

    /**
     * Set the activationFailureCount property: Number of times the entry point failed to run.
     *
     * @param activationFailureCount the activationFailureCount value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setActivationFailureCount(String activationFailureCount) {
        this.activationFailureCount = activationFailureCount;
        return this;
    }

    /**
     * Get the continuousActivationFailureCount property: Number of times the entry point continuously failed to run.
     *
     * @return the continuousActivationFailureCount value.
     */
    public String getContinuousActivationFailureCount() {
        return this.continuousActivationFailureCount;
    }

    /**
     * Set the continuousActivationFailureCount property: Number of times the entry point continuously failed to run.
     *
     * @param continuousActivationFailureCount the continuousActivationFailureCount value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setContinuousActivationFailureCount(
            String continuousActivationFailureCount) {
        this.continuousActivationFailureCount = continuousActivationFailureCount;
        return this;
    }

    /**
     * Get the exitCount property: Number of times the entry point finished running.
     *
     * @return the exitCount value.
     */
    public String getExitCount() {
        return this.exitCount;
    }

    /**
     * Set the exitCount property: Number of times the entry point finished running.
     *
     * @param exitCount the exitCount value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setExitCount(String exitCount) {
        this.exitCount = exitCount;
        return this;
    }

    /**
     * Get the exitFailureCount property: Number of times the entry point failed to exit gracefully.
     *
     * @return the exitFailureCount value.
     */
    public String getExitFailureCount() {
        return this.exitFailureCount;
    }

    /**
     * Set the exitFailureCount property: Number of times the entry point failed to exit gracefully.
     *
     * @param exitFailureCount the exitFailureCount value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setExitFailureCount(String exitFailureCount) {
        this.exitFailureCount = exitFailureCount;
        return this;
    }

    /**
     * Get the continuousExitFailureCount property: Number of times the entry point continuously failed to exit
     * gracefully.
     *
     * @return the continuousExitFailureCount value.
     */
    public String getContinuousExitFailureCount() {
        return this.continuousExitFailureCount;
    }

    /**
     * Set the continuousExitFailureCount property: Number of times the entry point continuously failed to exit
     * gracefully.
     *
     * @param continuousExitFailureCount the continuousExitFailureCount value to set.
     * @return the CodePackageEntryPointStatistics object itself.
     */
    public CodePackageEntryPointStatistics setContinuousExitFailureCount(String continuousExitFailureCount) {
        this.continuousExitFailureCount = continuousExitFailureCount;
        return this;
    }
}
