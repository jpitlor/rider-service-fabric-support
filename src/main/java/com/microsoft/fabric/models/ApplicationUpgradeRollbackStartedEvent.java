package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Application Upgrade Rollback Started event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationUpgradeRollbackStarted")
@Fluent
public final class ApplicationUpgradeRollbackStartedEvent extends ApplicationEvent {
    /*
     * Application type name.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /*
     * Current Application type version.
     */
    @JsonProperty(value = "CurrentApplicationTypeVersion", required = true)
    private String currentApplicationTypeVersion;

    /*
     * Target Application type version.
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
     * @return the ApplicationUpgradeRollbackStartedEvent object itself.
     */
    public ApplicationUpgradeRollbackStartedEvent setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the currentApplicationTypeVersion property: Current Application type version.
     *
     * @return the currentApplicationTypeVersion value.
     */
    public String getCurrentApplicationTypeVersion() {
        return this.currentApplicationTypeVersion;
    }

    /**
     * Set the currentApplicationTypeVersion property: Current Application type version.
     *
     * @param currentApplicationTypeVersion the currentApplicationTypeVersion value to set.
     * @return the ApplicationUpgradeRollbackStartedEvent object itself.
     */
    public ApplicationUpgradeRollbackStartedEvent setCurrentApplicationTypeVersion(
            String currentApplicationTypeVersion) {
        this.currentApplicationTypeVersion = currentApplicationTypeVersion;
        return this;
    }

    /**
     * Get the applicationTypeVersion property: Target Application type version.
     *
     * @return the applicationTypeVersion value.
     */
    public String getApplicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the applicationTypeVersion property: Target Application type version.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set.
     * @return the ApplicationUpgradeRollbackStartedEvent object itself.
     */
    public ApplicationUpgradeRollbackStartedEvent setApplicationTypeVersion(String applicationTypeVersion) {
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
     * @return the ApplicationUpgradeRollbackStartedEvent object itself.
     */
    public ApplicationUpgradeRollbackStartedEvent setFailureReason(String failureReason) {
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
     * @return the ApplicationUpgradeRollbackStartedEvent object itself.
     */
    public ApplicationUpgradeRollbackStartedEvent setOverallUpgradeElapsedTimeInMs(
            double overallUpgradeElapsedTimeInMs) {
        this.overallUpgradeElapsedTimeInMs = overallUpgradeElapsedTimeInMs;
        return this;
    }
}
