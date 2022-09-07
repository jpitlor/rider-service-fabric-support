package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the parameters for an application upgrade. Note that upgrade description replaces the existing application
 * description. This means that if the parameters are not specified, the existing parameters on the applications will be
 * overwritten with the empty parameters list. This would result in the application using the default value of the
 * parameters from the application manifest. If you do not want to change any existing parameter values, please get the
 * application parameters first using the GetApplicationInfo query and then supply those values as Parameters in this
 * ApplicationUpgradeDescription.
 */
@Fluent
public final class ApplicationUpgradeDescription {
    /*
     * The name of the target application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The target application type version (found in the application manifest)
     * for the application upgrade.
     */
    @JsonProperty(value = "TargetApplicationTypeVersion", required = true)
    private String targetApplicationTypeVersion;

    /*
     * List of application parameters with overridden values from their default
     * values specified in the application manifest.
     */
    @JsonProperty(value = "Parameters")
    private List<ApplicationParameter> parameters;

    /*
     * The kind of upgrade out of the following possible values.
     */
    @JsonProperty(value = "UpgradeKind", required = true)
    private UpgradeKind upgradeKind;

    /*
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     */
    @JsonProperty(value = "RollingUpgradeMode")
    private UpgradeMode rollingUpgradeMode;

    /*
     * The maximum amount of time to block processing of an upgrade domain and
     * prevent loss of availability when there are unexpected issues. When this
     * timeout expires, processing of the upgrade domain will proceed
     * regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925
     * inclusive. (unsigned 32-bit integer).
     */
    @JsonProperty(value = "UpgradeReplicaSetCheckTimeoutInSeconds")
    private Long upgradeReplicaSetCheckTimeoutInSeconds;

    /*
     * If true, then processes are forcefully restarted during upgrade even
     * when the code version has not changed (the upgrade only changes
     * configuration or data).
     */
    @JsonProperty(value = "ForceRestart")
    private Boolean forceRestart;

    /*
     * Defines the order in which an upgrade proceeds through the cluster.
     */
    @JsonProperty(value = "SortOrder")
    private UpgradeSortOrder sortOrder;

    /*
     * Describes the parameters for monitoring an upgrade in Monitored mode.
     */
    @JsonProperty(value = "MonitoringPolicy")
    private MonitoringPolicyDescription monitoringPolicy;

    /*
     * Defines a health policy used to evaluate the health of an application or
     * one of its children entities.
     */
    @JsonProperty(value = "ApplicationHealthPolicy")
    private ApplicationHealthPolicy applicationHealthPolicy;

    /*
     * Duration in seconds, to wait before a stateless instance is closed, to
     * allow the active requests to drain gracefully. This would be effective
     * when the instance is closing during the application/cluster
     * upgrade, only for those instances which have a non-zero delay duration
     * configured in the service description. See
     * InstanceCloseDelayDurationSeconds property in $ref:
     * "#/definitions/StatelessServiceDescription.yaml" for details.
     * Note, the default value of InstanceCloseDelayDurationInSeconds is
     * 4294967295, which indicates that the behavior will entirely depend on
     * the delay configured in the stateless service description.
     */
    @JsonProperty(value = "InstanceCloseDelayDurationInSeconds")
    private Long instanceCloseDelayDurationInSeconds;

    /*
     * Managed application identity description.
     */
    @JsonProperty(value = "ManagedApplicationIdentity")
    private ManagedApplicationIdentityDescription managedApplicationIdentity;

    /**
     * Get the name property: The name of the target application, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the target application, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the targetApplicationTypeVersion property: The target application type version (found in the application
     * manifest) for the application upgrade.
     *
     * @return the targetApplicationTypeVersion value.
     */
    public String getTargetApplicationTypeVersion() {
        return this.targetApplicationTypeVersion;
    }

    /**
     * Set the targetApplicationTypeVersion property: The target application type version (found in the application
     * manifest) for the application upgrade.
     *
     * @param targetApplicationTypeVersion the targetApplicationTypeVersion value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setTargetApplicationTypeVersion(String targetApplicationTypeVersion) {
        this.targetApplicationTypeVersion = targetApplicationTypeVersion;
        return this;
    }

    /**
     * Get the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @return the parameters value.
     */
    public List<ApplicationParameter> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @param parameters the parameters value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setParameters(List<ApplicationParameter> parameters) {
        this.parameters = parameters;
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
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setUpgradeKind(UpgradeKind upgradeKind) {
        this.upgradeKind = upgradeKind;
        return this;
    }

    /**
     * Get the rollingUpgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     *
     * @return the rollingUpgradeMode value.
     */
    public UpgradeMode getRollingUpgradeMode() {
        return this.rollingUpgradeMode;
    }

    /**
     * Set the rollingUpgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, Monitored, and UnmonitoredDeferred.
     *
     * @param rollingUpgradeMode the rollingUpgradeMode value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
        this.rollingUpgradeMode = rollingUpgradeMode;
        return this;
    }

    /**
     * Get the upgradeReplicaSetCheckTimeoutInSeconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @return the upgradeReplicaSetCheckTimeoutInSeconds value.
     */
    public Long getUpgradeReplicaSetCheckTimeoutInSeconds() {
        return this.upgradeReplicaSetCheckTimeoutInSeconds;
    }

    /**
     * Set the upgradeReplicaSetCheckTimeoutInSeconds property: The maximum amount of time to block processing of an
     * upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires,
     * processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @param upgradeReplicaSetCheckTimeoutInSeconds the upgradeReplicaSetCheckTimeoutInSeconds value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setUpgradeReplicaSetCheckTimeoutInSeconds(
            Long upgradeReplicaSetCheckTimeoutInSeconds) {
        this.upgradeReplicaSetCheckTimeoutInSeconds = upgradeReplicaSetCheckTimeoutInSeconds;
        return this;
    }

    /**
     * Get the forceRestart property: If true, then processes are forcefully restarted during upgrade even when the code
     * version has not changed (the upgrade only changes configuration or data).
     *
     * @return the forceRestart value.
     */
    public Boolean isForceRestart() {
        return this.forceRestart;
    }

    /**
     * Set the forceRestart property: If true, then processes are forcefully restarted during upgrade even when the code
     * version has not changed (the upgrade only changes configuration or data).
     *
     * @param forceRestart the forceRestart value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get the sortOrder property: Defines the order in which an upgrade proceeds through the cluster.
     *
     * @return the sortOrder value.
     */
    public UpgradeSortOrder getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Set the sortOrder property: Defines the order in which an upgrade proceeds through the cluster.
     *
     * @param sortOrder the sortOrder value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setSortOrder(UpgradeSortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * Get the monitoringPolicy property: Describes the parameters for monitoring an upgrade in Monitored mode.
     *
     * @return the monitoringPolicy value.
     */
    public MonitoringPolicyDescription getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /**
     * Set the monitoringPolicy property: Describes the parameters for monitoring an upgrade in Monitored mode.
     *
     * @param monitoringPolicy the monitoringPolicy value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setMonitoringPolicy(MonitoringPolicyDescription monitoringPolicy) {
        this.monitoringPolicy = monitoringPolicy;
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
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setApplicationHealthPolicy(ApplicationHealthPolicy applicationHealthPolicy) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        return this;
    }

    /**
     * Get the instanceCloseDelayDurationInSeconds property: Duration in seconds, to wait before a stateless instance is
     * closed, to allow the active requests to drain gracefully. This would be effective when the instance is closing
     * during the application/cluster upgrade, only for those instances which have a non-zero delay duration configured
     * in the service description. See InstanceCloseDelayDurationSeconds property in $ref:
     * "#/definitions/StatelessServiceDescription.yaml" for details. Note, the default value of
     * InstanceCloseDelayDurationInSeconds is 4294967295, which indicates that the behavior will entirely depend on the
     * delay configured in the stateless service description.
     *
     * @return the instanceCloseDelayDurationInSeconds value.
     */
    public Long getInstanceCloseDelayDurationInSeconds() {
        return this.instanceCloseDelayDurationInSeconds;
    }

    /**
     * Set the instanceCloseDelayDurationInSeconds property: Duration in seconds, to wait before a stateless instance is
     * closed, to allow the active requests to drain gracefully. This would be effective when the instance is closing
     * during the application/cluster upgrade, only for those instances which have a non-zero delay duration configured
     * in the service description. See InstanceCloseDelayDurationSeconds property in $ref:
     * "#/definitions/StatelessServiceDescription.yaml" for details. Note, the default value of
     * InstanceCloseDelayDurationInSeconds is 4294967295, which indicates that the behavior will entirely depend on the
     * delay configured in the stateless service description.
     *
     * @param instanceCloseDelayDurationInSeconds the instanceCloseDelayDurationInSeconds value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setInstanceCloseDelayDurationInSeconds(
            Long instanceCloseDelayDurationInSeconds) {
        this.instanceCloseDelayDurationInSeconds = instanceCloseDelayDurationInSeconds;
        return this;
    }

    /**
     * Get the managedApplicationIdentity property: Managed application identity description.
     *
     * @return the managedApplicationIdentity value.
     */
    public ManagedApplicationIdentityDescription getManagedApplicationIdentity() {
        return this.managedApplicationIdentity;
    }

    /**
     * Set the managedApplicationIdentity property: Managed application identity description.
     *
     * @param managedApplicationIdentity the managedApplicationIdentity value to set.
     * @return the ApplicationUpgradeDescription object itself.
     */
    public ApplicationUpgradeDescription setManagedApplicationIdentity(
            ManagedApplicationIdentityDescription managedApplicationIdentity) {
        this.managedApplicationIdentity = managedApplicationIdentity;
        return this;
    }
}
