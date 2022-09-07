package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for applications of a particular application type. The application type applications
 * evaluation can be returned when cluster health evaluation returns unhealthy aggregated health state, either Error or
 * Warning. It contains health evaluations for each unhealthy application of the included application type that impacted
 * current aggregated health state.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationTypeApplications")
@Fluent
public final class ApplicationTypeApplicationsHealthEvaluation extends HealthEvaluation {
    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "ApplicationTypeName")
    private String applicationTypeName;

    /*
     * Maximum allowed percentage of unhealthy applications for the application
     * type, specified as an entry in ApplicationTypeHealthPolicyMap.
     */
    @JsonProperty(value = "MaxPercentUnhealthyApplications")
    private Integer maxPercentUnhealthyApplications;

    /*
     * Total number of applications of the application type found in the health
     * store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ApplicationHealthEvaluation of this
     * application type that impacted the aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the applicationTypeName property: The application type name as defined in the application manifest.
     *
     * @return the applicationTypeName value.
     */
    public String getApplicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set the applicationTypeName property: The application type name as defined in the application manifest.
     *
     * @param applicationTypeName the applicationTypeName value to set.
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyApplications property: Maximum allowed percentage of unhealthy applications for the
     * application type, specified as an entry in ApplicationTypeHealthPolicyMap.
     *
     * @return the maxPercentUnhealthyApplications value.
     */
    public Integer getMaxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications;
    }

    /**
     * Set the maxPercentUnhealthyApplications property: Maximum allowed percentage of unhealthy applications for the
     * application type, specified as an entry in ApplicationTypeHealthPolicyMap.
     *
     * @param maxPercentUnhealthyApplications the maxPercentUnhealthyApplications value to set.
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation setMaxPercentUnhealthyApplications(
            Integer maxPercentUnhealthyApplications) {
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
        return this;
    }

    /**
     * Get the totalCount property: Total number of applications of the application type found in the health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of applications of the application type found in the health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ApplicationHealthEvaluation of this application type that impacted the aggregated
     * health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ApplicationHealthEvaluation of this application type that impacted the aggregated
     * health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the ApplicationTypeApplicationsHealthEvaluation object itself.
     */
    public ApplicationTypeApplicationsHealthEvaluation setUnhealthyEvaluations(
            List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
