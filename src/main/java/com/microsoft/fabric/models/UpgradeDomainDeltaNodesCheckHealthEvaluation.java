package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for delta unhealthy cluster nodes in an upgrade domain, containing health evaluations
 * for each unhealthy node that impacted current aggregated health state. Can be returned during cluster upgrade when
 * cluster aggregated health state is Warning or Error.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("UpgradeDomainDeltaNodesCheck")
@Fluent
public final class UpgradeDomainDeltaNodesCheckHealthEvaluation extends HealthEvaluation {
    /*
     * Name of the upgrade domain where nodes health is currently evaluated.
     */
    @JsonProperty(value = "UpgradeDomainName")
    private String upgradeDomainName;

    /*
     * Number of upgrade domain nodes with aggregated heath state Error in the
     * health store at the beginning of the cluster upgrade.
     */
    @JsonProperty(value = "BaselineErrorCount")
    private Long baselineErrorCount;

    /*
     * Total number of upgrade domain nodes in the health store at the
     * beginning of the cluster upgrade.
     */
    @JsonProperty(value = "BaselineTotalCount")
    private Long baselineTotalCount;

    /*
     * Maximum allowed percentage of upgrade domain delta unhealthy nodes from
     * the ClusterUpgradeHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentDeltaUnhealthyNodes")
    private Integer maxPercentDeltaUnhealthyNodes;

    /*
     * Total number of upgrade domain nodes in the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy NodeHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the upgradeDomainName property: Name of the upgrade domain where nodes health is currently evaluated.
     *
     * @return the upgradeDomainName value.
     */
    public String getUpgradeDomainName() {
        return this.upgradeDomainName;
    }

    /**
     * Set the upgradeDomainName property: Name of the upgrade domain where nodes health is currently evaluated.
     *
     * @param upgradeDomainName the upgradeDomainName value to set.
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation setUpgradeDomainName(String upgradeDomainName) {
        this.upgradeDomainName = upgradeDomainName;
        return this;
    }

    /**
     * Get the baselineErrorCount property: Number of upgrade domain nodes with aggregated heath state Error in the
     * health store at the beginning of the cluster upgrade.
     *
     * @return the baselineErrorCount value.
     */
    public Long getBaselineErrorCount() {
        return this.baselineErrorCount;
    }

    /**
     * Set the baselineErrorCount property: Number of upgrade domain nodes with aggregated heath state Error in the
     * health store at the beginning of the cluster upgrade.
     *
     * @param baselineErrorCount the baselineErrorCount value to set.
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation setBaselineErrorCount(Long baselineErrorCount) {
        this.baselineErrorCount = baselineErrorCount;
        return this;
    }

    /**
     * Get the baselineTotalCount property: Total number of upgrade domain nodes in the health store at the beginning of
     * the cluster upgrade.
     *
     * @return the baselineTotalCount value.
     */
    public Long getBaselineTotalCount() {
        return this.baselineTotalCount;
    }

    /**
     * Set the baselineTotalCount property: Total number of upgrade domain nodes in the health store at the beginning of
     * the cluster upgrade.
     *
     * @param baselineTotalCount the baselineTotalCount value to set.
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation setBaselineTotalCount(Long baselineTotalCount) {
        this.baselineTotalCount = baselineTotalCount;
        return this;
    }

    /**
     * Get the maxPercentDeltaUnhealthyNodes property: Maximum allowed percentage of upgrade domain delta unhealthy
     * nodes from the ClusterUpgradeHealthPolicy.
     *
     * @return the maxPercentDeltaUnhealthyNodes value.
     */
    public Integer getMaxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * Set the maxPercentDeltaUnhealthyNodes property: Maximum allowed percentage of upgrade domain delta unhealthy
     * nodes from the ClusterUpgradeHealthPolicy.
     *
     * @param maxPercentDeltaUnhealthyNodes the maxPercentDeltaUnhealthyNodes value to set.
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation setMaxPercentDeltaUnhealthyNodes(
            Integer maxPercentDeltaUnhealthyNodes) {
        this.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
        return this;
    }

    /**
     * Get the totalCount property: Total number of upgrade domain nodes in the health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of upgrade domain nodes in the health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy NodeHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy NodeHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the UpgradeDomainDeltaNodesCheckHealthEvaluation object itself.
     */
    public UpgradeDomainDeltaNodesCheckHealthEvaluation setUnhealthyEvaluations(
            List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
