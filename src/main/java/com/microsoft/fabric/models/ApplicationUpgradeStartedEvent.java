package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Application Upgrade Started event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationUpgradeStarted")
@Fluent
public final class ApplicationUpgradeStartedEvent extends ApplicationEvent {
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
     * Type of upgrade.
     */
    @JsonProperty(value = "UpgradeType", required = true)
    private String upgradeType;

    /*
     * Mode of upgrade.
     */
    @JsonProperty(value = "RollingUpgradeMode", required = true)
    private String rollingUpgradeMode;

    /*
     * Action if failed.
     */
    @JsonProperty(value = "FailureAction", required = true)
    private String failureAction;

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
     * @return the ApplicationUpgradeStartedEvent object itself.
     */
    public ApplicationUpgradeStartedEvent setApplicationTypeName(String applicationTypeName) {
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
     * @return the ApplicationUpgradeStartedEvent object itself.
     */
    public ApplicationUpgradeStartedEvent setCurrentApplicationTypeVersion(String currentApplicationTypeVersion) {
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
     * @return the ApplicationUpgradeStartedEvent object itself.
     */
    public ApplicationUpgradeStartedEvent setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the upgradeType property: Type of upgrade.
     *
     * @return the upgradeType value.
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    /**
     * Set the upgradeType property: Type of upgrade.
     *
     * @param upgradeType the upgradeType value to set.
     * @return the ApplicationUpgradeStartedEvent object itself.
     */
    public ApplicationUpgradeStartedEvent setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }

    /**
     * Get the rollingUpgradeMode property: Mode of upgrade.
     *
     * @return the rollingUpgradeMode value.
     */
    public String getRollingUpgradeMode() {
        return this.rollingUpgradeMode;
    }

    /**
     * Set the rollingUpgradeMode property: Mode of upgrade.
     *
     * @param rollingUpgradeMode the rollingUpgradeMode value to set.
     * @return the ApplicationUpgradeStartedEvent object itself.
     */
    public ApplicationUpgradeStartedEvent setRollingUpgradeMode(String rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the failureAction property: Action if failed.
     *
     * @return the failureAction value.
     */
    public String getFailureAction() {
        return this.failureAction;
    }

    /**
     * Set the failureAction property: Action if failed.
     *
     * @param failureAction the failureAction value to set.
     * @return the ApplicationUpgradeStartedEvent object itself.
     */
    public ApplicationUpgradeStartedEvent setFailureAction(String failureAction) {
        this.failureAction = failureAction;
        return this;
    }
}
