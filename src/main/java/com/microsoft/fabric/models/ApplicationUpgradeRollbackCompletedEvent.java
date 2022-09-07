package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Application Upgrade Rollback Completed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationUpgradeRollbackCompleted")
@Fluent
public final class ApplicationUpgradeRollbackCompletedEvent extends ApplicationEvent {
    /*
     * Application type name.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /*
     * Application type version.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /*
     * Describes reason of failure.
     */
    @JsonProperty(value = "FailureReason", required = true)
    private String failureReason;

    /*
     * Overall upgrade time in milli-seconds.
     */
    @JsonProperty(value = "OverallUpgradeElapsedTimeInMs", required = true)
    private double overallUpgradeElapsedTimeInMs;

    /**
     * Get the applicationTypeName property: Application type name.
     *
     * @return the applicationTypeName value.
     */
    public String getApplicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the applicationTypeName property: Application type name.
     *
     * @param applicationTypeName the applicationTypeName value to set.
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the applicationTypeVersion property: Application type version.
     *
     * @return the applicationTypeVersion value.
     */
    public String getApplicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the applicationTypeVersion property: Application type version.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set.
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the failureReason property: Describes reason of failure.
     *
     * @return the failureReason value.
     */
    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * Set the failureReason property: Describes reason of failure.
     *
     * @param failureReason the failureReason value to set.
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent setFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Get the overallUpgradeElapsedTimeInMs property: Overall upgrade time in milli-seconds.
     *
     * @return the overallUpgradeElapsedTimeInMs value.
     */
    public double getOverallUpgradeElapsedTimeInMs() {
        return this.overallUpgradeElapsedTimeInMs;
    }

    /**
     * Set the overallUpgradeElapsedTimeInMs property: Overall upgrade time in milli-seconds.
     *
     * @param overallUpgradeElapsedTimeInMs the overallUpgradeElapsedTimeInMs value to set.
     * @return the ApplicationUpgradeRollbackCompletedEvent object itself.
     */
    public ApplicationUpgradeRollbackCompletedEvent setOverallUpgradeElapsedTimeInMs(
            double overallUpgradeElapsedTimeInMs) {
        this.overallUpgradeElapsedTimeInMs = overallUpgradeElapsedTimeInMs;
        return this;
    }
}
