package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This type describes properties of a service resource. */
@Fluent
public final class ServiceResourceProperties extends ServiceReplicaProperties {
    /*
     * User readable description of the service.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The number of replicas of the service to create. Defaults to 1 if not
     * specified.
     */
    @JsonProperty(value = "replicaCount")
    private Integer replicaCount;

    /*
     * The execution policy of the service
     */
    @JsonProperty(value = "executionPolicy")
    private ExecutionPolicy executionPolicy;

    /*
     * Auto scaling policies
     */
    @JsonProperty(value = "autoScalingPolicies")
    private List<AutoScalingPolicy> autoScalingPolicies;

    /*
     * Status of the service.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /*
     * Gives additional information about the current status of the service.
     */
    @JsonProperty(value = "statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * Describes the health state of an application resource.
     */
    @JsonProperty(value = "healthState", access = JsonProperty.Access.WRITE_ONLY)
    private HealthState healthState;

    /*
     * When the service's health state is not 'Ok', this additional details
     * from service fabric Health Manager for the user to know why the service
     * is marked unhealthy.
     */
    @JsonProperty(value = "unhealthyEvaluation", access = JsonProperty.Access.WRITE_ONLY)
    private String unhealthyEvaluation;

    /*
     * The service identity list.
     */
    @JsonProperty(value = "identityRefs")
    private List<ServiceIdentity> identityRefs;

    /*
     * Dns name of the service.
     */
    @JsonProperty(value = "dnsName")
    private String dnsName;

    /**
     * Get the description property: User readable description of the service.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: User readable description of the service.
     *
     * @param description the description value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the replicaCount property: The number of replicas of the service to create. Defaults to 1 if not specified.
     *
     * @return the replicaCount value.
     */
    public Integer getReplicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the replicaCount property: The number of replicas of the service to create. Defaults to 1 if not specified.
     *
     * @param replicaCount the replicaCount value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the executionPolicy property: The execution policy of the service.
     *
     * @return the executionPolicy value.
     */
    public ExecutionPolicy getExecutionPolicy() {
        return this.executionPolicy;
    }

    /**
     * Set the executionPolicy property: The execution policy of the service.
     *
     * @param executionPolicy the executionPolicy value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties setExecutionPolicy(ExecutionPolicy executionPolicy) {
        this.executionPolicy = executionPolicy;
        return this;
    }

    /**
     * Get the autoScalingPolicies property: Auto scaling policies.
     *
     * @return the autoScalingPolicies value.
     */
    public List<AutoScalingPolicy> getAutoScalingPolicies() {
        return this.autoScalingPolicies;
    }

    /**
     * Set the autoScalingPolicies property: Auto scaling policies.
     *
     * @param autoScalingPolicies the autoScalingPolicies value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties setAutoScalingPolicies(List<AutoScalingPolicy> autoScalingPolicies) {
        this.autoScalingPolicies = autoScalingPolicies;
        return this;
    }

    /**
     * Get the status property: Status of the service.
     *
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetails property: Gives additional information about the current status of the service.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the healthState property: Describes the health state of an application resource.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Get the unhealthyEvaluation property: When the service's health state is not 'Ok', this additional details from
     * service fabric Health Manager for the user to know why the service is marked unhealthy.
     *
     * @return the unhealthyEvaluation value.
     */
    public String getUnhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    /**
     * Get the identityRefs property: The service identity list.
     *
     * @return the identityRefs value.
     */
    public List<ServiceIdentity> getIdentityRefs() {
        return this.identityRefs;
    }

    /**
     * Set the identityRefs property: The service identity list.
     *
     * @param identityRefs the identityRefs value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties setIdentityRefs(List<ServiceIdentity> identityRefs) {
        this.identityRefs = identityRefs;
        return this;
    }

    /**
     * Get the dnsName property: Dns name of the service.
     *
     * @return the dnsName value.
     */
    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * Set the dnsName property: Dns name of the service.
     *
     * @param dnsName the dnsName value to set.
     * @return the ServiceResourceProperties object itself.
     */
    public ServiceResourceProperties setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
}
