package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Describes the parameters for a standalone cluster configuration upgrade. */
@Fluent
public final class ClusterConfigurationUpgradeDescription {
    /*
     * The cluster configuration as a JSON string. For example, [this
     * file](https://github.com/Azure-Samples/service-fabric-dotnet-standalone-cluster-configuration/blob/master/Samples/ClusterConfig.Unsecure.DevCluster.json)
     * contains JSON describing the [nodes and other properties of the
     * cluster](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-manifest).
     */
    @JsonProperty(value = "ClusterConfig", required = true)
    private String clusterConfig;

    /*
     * The length of time between attempts to perform health checks if the
     * application or cluster is not healthy.
     */
    @JsonProperty(value = "HealthCheckRetryTimeout")
    private Duration healthCheckRetryTimeout;

    /*
     * The length of time to wait after completing an upgrade domain before
     * starting the health checks process.
     */
    @JsonProperty(value = "HealthCheckWaitDurationInSeconds")
    private Duration healthCheckWaitDurationInSeconds;

    /*
     * The length of time that the application or cluster must remain healthy
     * before the upgrade proceeds to the next upgrade domain.
     */
    @JsonProperty(value = "HealthCheckStableDurationInSeconds")
    private Duration healthCheckStableDurationInSeconds;

    /*
     * The timeout for the upgrade domain.
     */
    @JsonProperty(value = "UpgradeDomainTimeoutInSeconds")
    private Duration upgradeDomainTimeoutInSeconds;

    /*
     * The upgrade timeout.
     */
    @JsonProperty(value = "UpgradeTimeoutInSeconds")
    private Duration upgradeTimeoutInSeconds;

    /*
     * The maximum allowed percentage of unhealthy applications during the
     * upgrade. Allowed values are integer values from zero to 100.
     */
    @JsonProperty(value = "MaxPercentUnhealthyApplications")
    private Integer maxPercentUnhealthyApplications;

    /*
     * The maximum allowed percentage of unhealthy nodes during the upgrade.
     * Allowed values are integer values from zero to 100.
     */
    @JsonProperty(value = "MaxPercentUnhealthyNodes")
    private Integer maxPercentUnhealthyNodes;

    /*
     * The maximum allowed percentage of delta health degradation during the
     * upgrade. Allowed values are integer values from zero to 100.
     */
    @JsonProperty(value = "MaxPercentDeltaUnhealthyNodes")
    private Integer maxPercentDeltaUnhealthyNodes;

    /*
     * The maximum allowed percentage of upgrade domain delta health
     * degradation during the upgrade. Allowed values are integer values from
     * zero to 100.
     */
    @JsonProperty(value = "MaxPercentUpgradeDomainDeltaUnhealthyNodes")
    private Integer maxPercentUpgradeDomainDeltaUnhealthyNodes;

    /*
     * Defines the application health policy map used to evaluate the health of
     * an application or one of its children entities.
     */
    @JsonProperty(value = "ApplicationHealthPolicies")
    private ApplicationHealthPolicies applicationHealthPolicies;

    /**
     * Get the clusterConfig property: The cluster configuration as a JSON string. For example, [this
     * file](https://github.com/Azure-Samples/service-fabric-dotnet-standalone-cluster-configuration/blob/master/Samples/ClusterConfig.Unsecure.DevCluster.json)
     * contains JSON describing the [nodes and other properties of the
     * cluster](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-manifest).
     *
     * @return the clusterConfig value.
     */
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * Set the clusterConfig property: The cluster configuration as a JSON string. For example, [this
     * file](https://github.com/Azure-Samples/service-fabric-dotnet-standalone-cluster-configuration/blob/master/Samples/ClusterConfig.Unsecure.DevCluster.json)
     * contains JSON describing the [nodes and other properties of the
     * cluster](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-manifest).
     *
     * @param clusterConfig the clusterConfig value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setClusterConfig(String clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }

    /**
     * Get the healthCheckRetryTimeout property: The length of time between attempts to perform health checks if the
     * application or cluster is not healthy.
     *
     * @return the healthCheckRetryTimeout value.
     */
    public Duration getHealthCheckRetryTimeout() {
        return this.healthCheckRetryTimeout;
    }

    /**
     * Set the healthCheckRetryTimeout property: The length of time between attempts to perform health checks if the
     * application or cluster is not healthy.
     *
     * @param healthCheckRetryTimeout the healthCheckRetryTimeout value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setHealthCheckRetryTimeout(Duration healthCheckRetryTimeout) {
        this.healthCheckRetryTimeout = healthCheckRetryTimeout;
        return this;
    }

    /**
     * Get the healthCheckWaitDurationInSeconds property: The length of time to wait after completing an upgrade domain
     * before starting the health checks process.
     *
     * @return the healthCheckWaitDurationInSeconds value.
     */
    public Duration getHealthCheckWaitDurationInSeconds() {
        return this.healthCheckWaitDurationInSeconds;
    }

    /**
     * Set the healthCheckWaitDurationInSeconds property: The length of time to wait after completing an upgrade domain
     * before starting the health checks process.
     *
     * @param healthCheckWaitDurationInSeconds the healthCheckWaitDurationInSeconds value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setHealthCheckWaitDurationInSeconds(
            Duration healthCheckWaitDurationInSeconds) {
        this.healthCheckWaitDurationInSeconds = healthCheckWaitDurationInSeconds;
        return this;
    }

    /**
     * Get the healthCheckStableDurationInSeconds property: The length of time that the application or cluster must
     * remain healthy before the upgrade proceeds to the next upgrade domain.
     *
     * @return the healthCheckStableDurationInSeconds value.
     */
    public Duration getHealthCheckStableDurationInSeconds() {
        return this.healthCheckStableDurationInSeconds;
    }

    /**
     * Set the healthCheckStableDurationInSeconds property: The length of time that the application or cluster must
     * remain healthy before the upgrade proceeds to the next upgrade domain.
     *
     * @param healthCheckStableDurationInSeconds the healthCheckStableDurationInSeconds value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setHealthCheckStableDurationInSeconds(
            Duration healthCheckStableDurationInSeconds) {
        this.healthCheckStableDurationInSeconds = healthCheckStableDurationInSeconds;
        return this;
    }

    /**
     * Get the upgradeDomainTimeoutInSeconds property: The timeout for the upgrade domain.
     *
     * @return the upgradeDomainTimeoutInSeconds value.
     */
    public Duration getUpgradeDomainTimeoutInSeconds() {
        return this.upgradeDomainTimeoutInSeconds;
    }

    /**
     * Set the upgradeDomainTimeoutInSeconds property: The timeout for the upgrade domain.
     *
     * @param upgradeDomainTimeoutInSeconds the upgradeDomainTimeoutInSeconds value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setUpgradeDomainTimeoutInSeconds(
            Duration upgradeDomainTimeoutInSeconds) {
        this.upgradeDomainTimeoutInSeconds = upgradeDomainTimeoutInSeconds;
        return this;
    }

    /**
     * Get the upgradeTimeoutInSeconds property: The upgrade timeout.
     *
     * @return the upgradeTimeoutInSeconds value.
     */
    public Duration getUpgradeTimeoutInSeconds() {
        return this.upgradeTimeoutInSeconds;
    }

    /**
     * Set the upgradeTimeoutInSeconds property: The upgrade timeout.
     *
     * @param upgradeTimeoutInSeconds the upgradeTimeoutInSeconds value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setUpgradeTimeoutInSeconds(Duration upgradeTimeoutInSeconds) {
        this.upgradeTimeoutInSeconds = upgradeTimeoutInSeconds;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyApplications property: The maximum allowed percentage of unhealthy applications during
     * the upgrade. Allowed values are integer values from zero to 100.
     *
     * @return the maxPercentUnhealthyApplications value.
     */
    public Integer getMaxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications;
    }

    /**
     * Set the maxPercentUnhealthyApplications property: The maximum allowed percentage of unhealthy applications during
     * the upgrade. Allowed values are integer values from zero to 100.
     *
     * @param maxPercentUnhealthyApplications the maxPercentUnhealthyApplications value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setMaxPercentUnhealthyApplications(
            Integer maxPercentUnhealthyApplications) {
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyNodes property: The maximum allowed percentage of unhealthy nodes during the upgrade.
     * Allowed values are integer values from zero to 100.
     *
     * @return the maxPercentUnhealthyNodes value.
     */
    public Integer getMaxPercentUnhealthyNodes() {
        return this.maxPercentUnhealthyNodes;
    }

    /**
     * Set the maxPercentUnhealthyNodes property: The maximum allowed percentage of unhealthy nodes during the upgrade.
     * Allowed values are integer values from zero to 100.
     *
     * @param maxPercentUnhealthyNodes the maxPercentUnhealthyNodes value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setMaxPercentUnhealthyNodes(Integer maxPercentUnhealthyNodes) {
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
        return this;
    }

    /**
     * Get the maxPercentDeltaUnhealthyNodes property: The maximum allowed percentage of delta health degradation during
     * the upgrade. Allowed values are integer values from zero to 100.
     *
     * @return the maxPercentDeltaUnhealthyNodes value.
     */
    public Integer getMaxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * Set the maxPercentDeltaUnhealthyNodes property: The maximum allowed percentage of delta health degradation during
     * the upgrade. Allowed values are integer values from zero to 100.
     *
     * @param maxPercentDeltaUnhealthyNodes the maxPercentDeltaUnhealthyNodes value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setMaxPercentDeltaUnhealthyNodes(
            Integer maxPercentDeltaUnhealthyNodes) {
        this.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
        return this;
    }

    /**
     * Get the maxPercentUpgradeDomainDeltaUnhealthyNodes property: The maximum allowed percentage of upgrade domain
     * delta health degradation during the upgrade. Allowed values are integer values from zero to 100.
     *
     * @return the maxPercentUpgradeDomainDeltaUnhealthyNodes value.
     */
    public Integer getMaxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    /**
     * Set the maxPercentUpgradeDomainDeltaUnhealthyNodes property: The maximum allowed percentage of upgrade domain
     * delta health degradation during the upgrade. Allowed values are integer values from zero to 100.
     *
     * @param maxPercentUpgradeDomainDeltaUnhealthyNodes the maxPercentUpgradeDomainDeltaUnhealthyNodes value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setMaxPercentUpgradeDomainDeltaUnhealthyNodes(
            Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = maxPercentUpgradeDomainDeltaUnhealthyNodes;
        return this;
    }

    /**
     * Get the applicationHealthPolicies property: Defines the application health policy map used to evaluate the health
     * of an application or one of its children entities.
     *
     * @return the applicationHealthPolicies value.
     */
    public ApplicationHealthPolicies getApplicationHealthPolicies() {
        return this.applicationHealthPolicies;
    }

    /**
     * Set the applicationHealthPolicies property: Defines the application health policy map used to evaluate the health
     * of an application or one of its children entities.
     *
     * @param applicationHealthPolicies the applicationHealthPolicies value to set.
     * @return the ClusterConfigurationUpgradeDescription object itself.
     */
    public ClusterConfigurationUpgradeDescription setApplicationHealthPolicies(
            ApplicationHealthPolicies applicationHealthPolicies) {
        this.applicationHealthPolicies = applicationHealthPolicies;
        return this;
    }
}
