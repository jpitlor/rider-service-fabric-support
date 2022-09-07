package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Application Upgrade Domain Completed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationUpgradeDomainCompleted")
@Fluent
public final class ApplicationUpgradeDomainCompletedEvent extends ApplicationEvent {
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
     * State of upgrade.
     */
    @JsonProperty(value = "UpgradeState", required = true)
    private String upgradeState;

    /*
     * Upgrade domains.
     */
    @JsonProperty(value = "UpgradeDomains", required = true)
    private String upgradeDomains;

    /*
     * Upgrade time of domain in milli-seconds.
     */
    @JsonProperty(value = "UpgradeDomainElapsedTimeInMs", required = true)
    private double upgradeDomainElapsedTimeInMs;

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
     * @return the ApplicationUpgradeDomainCompletedEvent object itself.
     */
    public ApplicationUpgradeDomainCompletedEvent setApplicationTypeName(String applicationTypeName) {
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
     * @return the ApplicationUpgradeDomainCompletedEvent object itself.
     */
    public ApplicationUpgradeDomainCompletedEvent setCurrentApplicationTypeVersion(
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
     * @return the ApplicationUpgradeDomainCompletedEvent object itself.
     */
    public ApplicationUpgradeDomainCompletedEvent setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the upgradeState property: State of upgrade.
     *
     * @return the upgradeState value.
     */
    public String getUpgradeState() {
        return this.upgradeState;
    }

    /**
     * Set the upgradeState property: State of upgrade.
     *
     * @param upgradeState the upgradeState value to set.
     * @return the ApplicationUpgradeDomainCompletedEvent object itself.
     */
    public ApplicationUpgradeDomainCompletedEvent setUpgradeState(String upgradeState) {
        this.upgradeState = upgradeState;
        return this;
    }

    /**
     * Get the upgradeDomains property: Upgrade domains.
     *
     * @return the upgradeDomains value.
     */
    public String getUpgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Set the upgradeDomains property: Upgrade domains.
     *
     * @param upgradeDomains the upgradeDomains value to set.
     * @return the ApplicationUpgradeDomainCompletedEvent object itself.
     */
    public ApplicationUpgradeDomainCompletedEvent setUpgradeDomains(String upgradeDomains) {
        this.upgradeDomains = upgradeDomains;
        return this;
    }

    /**
     * Get the upgradeDomainElapsedTimeInMs property: Upgrade time of domain in milli-seconds.
     *
     * @return the upgradeDomainElapsedTimeInMs value.
     */
    public double getUpgradeDomainElapsedTimeInMs() {
        return this.upgradeDomainElapsedTimeInMs;
    }

    /**
     * Set the upgradeDomainElapsedTimeInMs property: Upgrade time of domain in milli-seconds.
     *
     * @param upgradeDomainElapsedTimeInMs the upgradeDomainElapsedTimeInMs value to set.
     * @return the ApplicationUpgradeDomainCompletedEvent object itself.
     */
    public ApplicationUpgradeDomainCompletedEvent setUpgradeDomainElapsedTimeInMs(double upgradeDomainElapsedTimeInMs) {
        this.upgradeDomainElapsedTimeInMs = upgradeDomainElapsedTimeInMs;
        return this;
    }
}
