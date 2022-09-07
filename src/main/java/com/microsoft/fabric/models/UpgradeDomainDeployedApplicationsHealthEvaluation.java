package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for deployed applications in an upgrade domain, containing health evaluations for each
 * unhealthy deployed application that impacted current aggregated health state. Can be returned when evaluating cluster
 * health during cluster upgrade and the aggregated health state is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("UpgradeDomainDeployedApplications")
@Fluent
public final class UpgradeDomainDeployedApplicationsHealthEvaluation extends HealthEvaluation {
    /*
     * Name of the upgrade domain where deployed applications health is
     * currently evaluated.
     */
    @JsonProperty(value = "UpgradeDomainName")
    private String upgradeDomainName;

    /*
     * Maximum allowed percentage of unhealthy deployed applications from the
     * ClusterHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyDeployedApplications")
    private Integer maxPercentUnhealthyDeployedApplications;

    /*
     * Total number of deployed applications in the current upgrade domain.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy DeployedApplicationHealthEvaluation that
     * impacted the aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the upgradeDomainName property: Name of the upgrade domain where deployed applications health is currently
     * evaluated.
     *
     * @return the upgradeDomainName value.
     */
    public String getUpgradeDomainName() {
        return this.upgradeDomainName;
    }

    /**
     * Set the upgradeDomainName property: Name of the upgrade domain where deployed applications health is currently
     * evaluated.
     *
     * @param upgradeDomainName the upgradeDomainName value to set.
     * @return the UpgradeDomainDeployedApplicationsHealthEvaluation object itself.
     */
    public UpgradeDomainDeployedApplicationsHealthEvaluation setUpgradeDomainName(String upgradeDomainName) {
        this.upgradeDomainName = upgradeDomainName;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyDeployedApplications property: Maximum allowed percentage of unhealthy deployed
     * applications from the ClusterHealthPolicy.
     *
     * @return the maxPercentUnhealthyDeployedApplications value.
     */
    public Integer getMaxPercentUnhealthyDeployedApplications() {
        return this.maxPercentUnhealthyDeployedApplications;
    }

    /**
     * Set the maxPercentUnhealthyDeployedApplications property: Maximum allowed percentage of unhealthy deployed
     * applications from the ClusterHealthPolicy.
     *
     * @param maxPercentUnhealthyDeployedApplications the maxPercentUnhealthyDeployedApplications value to set.
     * @return the UpgradeDomainDeployedApplicationsHealthEvaluation object itself.
     */
    public UpgradeDomainDeployedApplicationsHealthEvaluation setMaxPercentUnhealthyDeployedApplications(
            Integer maxPercentUnhealthyDeployedApplications) {
        this.maxPercentUnhealthyDeployedApplications = maxPercentUnhealthyDeployedApplications;
        return this;
    }

    /**
     * Get the totalCount property: Total number of deployed applications in the current upgrade domain.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of deployed applications in the current upgrade domain.
     *
     * @param totalCount the totalCount value to set.
     * @return the UpgradeDomainDeployedApplicationsHealthEvaluation object itself.
     */
    public UpgradeDomainDeployedApplicationsHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy DeployedApplicationHealthEvaluation that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy DeployedApplicationHealthEvaluation that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the UpgradeDomainDeployedApplicationsHealthEvaluation object itself.
     */
    public UpgradeDomainDeployedApplicationsHealthEvaluation setUnhealthyEvaluations(
            List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
