package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for updating an ongoing application upgrade. */
@Fluent
public final class ApplicationUpgradeUpdateDescription {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The kind of upgrade out of the following possible values.
     */
    @JsonProperty(value = "UpgradeKind", required = true)
    private UpgradeKind upgradeKind;

    /*
     * Defines a health policy used to evaluate the health of an application or
     * one of its children entities.
     */
    @JsonProperty(value = "ApplicationHealthPolicy")
    private ApplicationHealthPolicy applicationHealthPolicy;

    /*
     * Describes the parameters for updating a rolling upgrade of application
     * or cluster.
     */
    @JsonProperty(value = "UpdateDescription")
    private RollingUpgradeUpdateDescription updateDescription;

    /**
     * Get the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ApplicationUpgradeUpdateDescription object itself.
     */
    public ApplicationUpgradeUpdateDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the upgradeKind property: The kind of upgrade out of the following possible values.
     *
     * @return the upgradeKind value.
     */
    public UpgradeKind getUpgradeKind() {
        return this.upgradeKind;
    }

    /**
     * Set the upgradeKind property: The kind of upgrade out of the following possible values.
     *
     * @param upgradeKind the upgradeKind value to set.
     * @return the ApplicationUpgradeUpdateDescription object itself.
     */
    public ApplicationUpgradeUpdateDescription setUpgradeKind(UpgradeKind upgradeKind) {
        this.upgradeKind = upgradeKind;
        return this;
    }

    /**
     * Get the applicationHealthPolicy property: Defines a health policy used to evaluate the health of an application
     * or one of its children entities.
     *
     * @return the applicationHealthPolicy value.
     */
    public ApplicationHealthPolicy getApplicationHealthPolicy() {
        return this.applicationHealthPolicy;
    }

    /**
     * Set the applicationHealthPolicy property: Defines a health policy used to evaluate the health of an application
     * or one of its children entities.
     *
     * @param applicationHealthPolicy the applicationHealthPolicy value to set.
     * @return the ApplicationUpgradeUpdateDescription object itself.
     */
    public ApplicationUpgradeUpdateDescription setApplicationHealthPolicy(
            ApplicationHealthPolicy applicationHealthPolicy) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        return this;
    }

    /**
     * Get the updateDescription property: Describes the parameters for updating a rolling upgrade of application or
     * cluster.
     *
     * @return the updateDescription value.
     */
    public RollingUpgradeUpdateDescription getUpdateDescription() {
        return this.updateDescription;
    }

    /**
     * Set the updateDescription property: Describes the parameters for updating a rolling upgrade of application or
     * cluster.
     *
     * @param updateDescription the updateDescription value to set.
     * @return the ApplicationUpgradeUpdateDescription object itself.
     */
    public ApplicationUpgradeUpdateDescription setUpdateDescription(RollingUpgradeUpdateDescription updateDescription) {
        this.updateDescription = updateDescription;
        return this;
    }
}
