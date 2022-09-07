package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a health policy used to evaluate the health of an application or one of its children entities. */
@Fluent
public final class ApplicationHealthPolicy {
    /*
     * Indicates whether warnings are treated with the same severity as errors.
     */
    @JsonProperty(value = "ConsiderWarningAsError")
    private Boolean considerWarningAsError;

    /*
     * The maximum allowed percentage of unhealthy deployed applications.
     * Allowed values are Byte values from zero to 100.
     * The percentage represents the maximum tolerated percentage of deployed
     * applications that can be unhealthy before the application is considered
     * in error.
     * This is calculated by dividing the number of unhealthy deployed
     * applications over the number of nodes where the application is currently
     * deployed on in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of
     * nodes. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyDeployedApplications")
    private Integer maxPercentUnhealthyDeployedApplications;

    /*
     * The health policy used by default to evaluate the health of a service
     * type.
     */
    @JsonProperty(value = "DefaultServiceTypeHealthPolicy")
    private ServiceTypeHealthPolicy defaultServiceTypeHealthPolicy;

    /*
     * The map with service type health policy per service type name. The map
     * is empty by default.
     */
    @JsonProperty(value = "ServiceTypeHealthPolicyMap")
    private List<ServiceTypeHealthPolicyMapItem> serviceTypeHealthPolicyMap;

    /**
     * Get the considerWarningAsError property: Indicates whether warnings are treated with the same severity as errors.
     *
     * @return the considerWarningAsError value.
     */
    public Boolean isConsiderWarningAsError() {
        return this.considerWarningAsError;
    }

    /**
     * Set the considerWarningAsError property: Indicates whether warnings are treated with the same severity as errors.
     *
     * @param considerWarningAsError the considerWarningAsError value to set.
     * @return the ApplicationHealthPolicy object itself.
     */
    public ApplicationHealthPolicy setConsiderWarningAsError(Boolean considerWarningAsError) {
        this.considerWarningAsError = considerWarningAsError;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyDeployedApplications property: The maximum allowed percentage of unhealthy deployed
     * applications. Allowed values are Byte values from zero to 100. The percentage represents the maximum tolerated
     * percentage of deployed applications that can be unhealthy before the application is considered in error. This is
     * calculated by dividing the number of unhealthy deployed applications over the number of nodes where the
     * application is currently deployed on in the cluster. The computation rounds up to tolerate one failure on small
     * numbers of nodes. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyDeployedApplications value.
     */
    public Integer getMaxPercentUnhealthyDeployedApplications() {
        return this.maxPercentUnhealthyDeployedApplications;
    }

    /**
     * Set the maxPercentUnhealthyDeployedApplications property: The maximum allowed percentage of unhealthy deployed
     * applications. Allowed values are Byte values from zero to 100. The percentage represents the maximum tolerated
     * percentage of deployed applications that can be unhealthy before the application is considered in error. This is
     * calculated by dividing the number of unhealthy deployed applications over the number of nodes where the
     * application is currently deployed on in the cluster. The computation rounds up to tolerate one failure on small
     * numbers of nodes. Default percentage is zero.
     *
     * @param maxPercentUnhealthyDeployedApplications the maxPercentUnhealthyDeployedApplications value to set.
     * @return the ApplicationHealthPolicy object itself.
     */
    public ApplicationHealthPolicy setMaxPercentUnhealthyDeployedApplications(
            Integer maxPercentUnhealthyDeployedApplications) {
        this.maxPercentUnhealthyDeployedApplications = maxPercentUnhealthyDeployedApplications;
        return this;
    }

    /**
     * Get the defaultServiceTypeHealthPolicy property: The health policy used by default to evaluate the health of a
     * service type.
     *
     * @return the defaultServiceTypeHealthPolicy value.
     */
    public ServiceTypeHealthPolicy getDefaultServiceTypeHealthPolicy() {
        return this.defaultServiceTypeHealthPolicy;
    }

    /**
     * Set the defaultServiceTypeHealthPolicy property: The health policy used by default to evaluate the health of a
     * service type.
     *
     * @param defaultServiceTypeHealthPolicy the defaultServiceTypeHealthPolicy value to set.
     * @return the ApplicationHealthPolicy object itself.
     */
    public ApplicationHealthPolicy setDefaultServiceTypeHealthPolicy(
            ServiceTypeHealthPolicy defaultServiceTypeHealthPolicy) {
        this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
        return this;
    }

    /**
     * Get the serviceTypeHealthPolicyMap property: The map with service type health policy per service type name. The
     * map is empty by default.
     *
     * @return the serviceTypeHealthPolicyMap value.
     */
    public List<ServiceTypeHealthPolicyMapItem> getServiceTypeHealthPolicyMap() {
        return this.serviceTypeHealthPolicyMap;
    }

    /**
     * Set the serviceTypeHealthPolicyMap property: The map with service type health policy per service type name. The
     * map is empty by default.
     *
     * @param serviceTypeHealthPolicyMap the serviceTypeHealthPolicyMap value to set.
     * @return the ApplicationHealthPolicy object itself.
     */
    public ApplicationHealthPolicy setServiceTypeHealthPolicyMap(
            List<ServiceTypeHealthPolicyMapItem> serviceTypeHealthPolicyMap) {
        this.serviceTypeHealthPolicyMap = serviceTypeHealthPolicyMap;
        return this;
    }
}
