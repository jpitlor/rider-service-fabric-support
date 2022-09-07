package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for updating a cluster upgrade. */
@Fluent
public final class UpdateClusterUpgradeDescription {
    /*
     * The type of upgrade out of the following possible values.
     */
    @JsonProperty(value = "UpgradeKind")
    private UpgradeType upgradeKind;

    /*
     * Describes the parameters for updating a rolling upgrade of application
     * or cluster.
     */
    @JsonProperty(value = "UpdateDescription")
    private RollingUpgradeUpdateDescription updateDescription;

    /*
     * Defines a health policy used to evaluate the health of the cluster or of
     * a cluster node.
     */
    @JsonProperty(value = "ClusterHealthPolicy")
    private ClusterHealthPolicy clusterHealthPolicy;

    /*
     * When true, enables delta health evaluation rather than absolute health
     * evaluation after completion of each upgrade domain.
     */
    @JsonProperty(value = "EnableDeltaHealthEvaluation")
    private Boolean enableDeltaHealthEvaluation;

    /*
     * Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     */
    @JsonProperty(value = "ClusterUpgradeHealthPolicy")
    private ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy;

    /*
     * Defines the application health policy map used to evaluate the health of
     * an application or one of its children entities.
     */
    @JsonProperty(value = "ApplicationHealthPolicyMap")
    private ApplicationHealthPolicies applicationHealthPolicyMap;

    /**
     * Get the upgradeKind property: The type of upgrade out of the following possible values.
     *
     * @return the upgradeKind value.
     */
    public UpgradeType getUpgradeKind() {
        return this.upgradeKind;
    }

    /**
     * Set the upgradeKind property: The type of upgrade out of the following possible values.
     *
     * @param upgradeKind the upgradeKind value to set.
     * @return the UpdateClusterUpgradeDescription object itself.
     */
    public UpdateClusterUpgradeDescription setUpgradeKind(UpgradeType upgradeKind) {
        this.upgradeKind = upgradeKind;
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
     * @return the UpdateClusterUpgradeDescription object itself.
     */
    public UpdateClusterUpgradeDescription setUpdateDescription(RollingUpgradeUpdateDescription updateDescription) {
        this.updateDescription = updateDescription;
        return this;
    }

    /**
     * Get the clusterHealthPolicy property: Defines a health policy used to evaluate the health of the cluster or of a
     * cluster node.
     *
     * @return the clusterHealthPolicy value.
     */
    public ClusterHealthPolicy getClusterHealthPolicy() {
        return this.clusterHealthPolicy;
    }

    /**
     * Set the clusterHealthPolicy property: Defines a health policy used to evaluate the health of the cluster or of a
     * cluster node.
     *
     * @param clusterHealthPolicy the clusterHealthPolicy value to set.
     * @return the UpdateClusterUpgradeDescription object itself.
     */
    public UpdateClusterUpgradeDescription setClusterHealthPolicy(ClusterHealthPolicy clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }

    /**
     * Get the enableDeltaHealthEvaluation property: When true, enables delta health evaluation rather than absolute
     * health evaluation after completion of each upgrade domain.
     *
     * @return the enableDeltaHealthEvaluation value.
     */
    public Boolean isEnableDeltaHealthEvaluation() {
        return this.enableDeltaHealthEvaluation;
    }

    /**
     * Set the enableDeltaHealthEvaluation property: When true, enables delta health evaluation rather than absolute
     * health evaluation after completion of each upgrade domain.
     *
     * @param enableDeltaHealthEvaluation the enableDeltaHealthEvaluation value to set.
     * @return the UpdateClusterUpgradeDescription object itself.
     */
    public UpdateClusterUpgradeDescription setEnableDeltaHealthEvaluation(Boolean enableDeltaHealthEvaluation) {
        this.enableDeltaHealthEvaluation = enableDeltaHealthEvaluation;
        return this;
    }

    /**
     * Get the clusterUpgradeHealthPolicy property: Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     *
     * @return the clusterUpgradeHealthPolicy value.
     */
    public ClusterUpgradeHealthPolicyObject getClusterUpgradeHealthPolicy() {
        return this.clusterUpgradeHealthPolicy;
    }

    /**
     * Set the clusterUpgradeHealthPolicy property: Defines a health policy used to evaluate the health of the cluster
     * during a cluster upgrade.
     *
     * @param clusterUpgradeHealthPolicy the clusterUpgradeHealthPolicy value to set.
     * @return the UpdateClusterUpgradeDescription object itself.
     */
    public UpdateClusterUpgradeDescription setClusterUpgradeHealthPolicy(
            ClusterUpgradeHealthPolicyObject clusterUpgradeHealthPolicy) {
        this.clusterUpgradeHealthPolicy = clusterUpgradeHealthPolicy;
        return this;
    }

    /**
     * Get the applicationHealthPolicyMap property: Defines the application health policy map used to evaluate the
     * health of an application or one of its children entities.
     *
     * @return the applicationHealthPolicyMap value.
     */
    public ApplicationHealthPolicies getApplicationHealthPolicyMap() {
        return this.applicationHealthPolicyMap;
    }

    /**
     * Set the applicationHealthPolicyMap property: Defines the application health policy map used to evaluate the
     * health of an application or one of its children entities.
     *
     * @param applicationHealthPolicyMap the applicationHealthPolicyMap value to set.
     * @return the UpdateClusterUpgradeDescription object itself.
     */
    public UpdateClusterUpgradeDescription setApplicationHealthPolicyMap(
            ApplicationHealthPolicies applicationHealthPolicyMap) {
        this.applicationHealthPolicyMap = applicationHealthPolicyMap;
        return this;
    }
}
