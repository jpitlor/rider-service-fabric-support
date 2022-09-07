package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for a compose deployment upgrade. */
@Fluent
public final class ComposeDeploymentUpgradeDescription {
    /*
     * The name of the deployment.
     */
    @JsonProperty(value = "DeploymentName", required = true)
    private String deploymentName;

    /*
     * The content of the compose file that describes the deployment to create.
     */
    @JsonProperty(value = "ComposeFileContent", required = true)
    private String composeFileContent;

    /*
     * Credential information to connect to container registry.
     */
    @JsonProperty(value = "RegistryCredential")
    private RegistryCredential registryCredential;

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

    /**
     * Get the deploymentName property: The name of the deployment.
     *
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The name of the deployment.
     *
     * @param deploymentName the deploymentName value to set.
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * Get the composeFileContent property: The content of the compose file that describes the deployment to create.
     *
     * @return the composeFileContent value.
     */
    public String getComposeFileContent() {
        return this.composeFileContent;
    }

    /**
     * Set the composeFileContent property: The content of the compose file that describes the deployment to create.
     *
     * @param composeFileContent the composeFileContent value to set.
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setComposeFileContent(String composeFileContent) {
        this.composeFileContent = composeFileContent;
        return this;
    }

    /**
     * Get the registryCredential property: Credential information to connect to container registry.
     *
     * @return the registryCredential value.
     */
    public RegistryCredential getRegistryCredential() {
        return this.registryCredential;
    }

    /**
     * Set the registryCredential property: Credential information to connect to container registry.
     *
     * @param registryCredential the registryCredential value to set.
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setRegistryCredential(RegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
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
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setUpgradeKind(UpgradeKind upgradeKind) {
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
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setRollingUpgradeMode(UpgradeMode rollingUpgradeMode) {
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
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setUpgradeReplicaSetCheckTimeoutInSeconds(
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
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
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
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setMonitoringPolicy(MonitoringPolicyDescription monitoringPolicy) {
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
     * @return the ComposeDeploymentUpgradeDescription object itself.
     */
    public ComposeDeploymentUpgradeDescription setApplicationHealthPolicy(
            ApplicationHealthPolicy applicationHealthPolicy) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        return this;
    }
}
