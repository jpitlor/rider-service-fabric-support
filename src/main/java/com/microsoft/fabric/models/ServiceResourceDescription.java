package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This type describes a service resource. */
@JsonFlatten
@Fluent
public class ServiceResourceDescription {
    /*
     * Name of the Service resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The operation system required by the code in service.
     */
    @JsonProperty(value = "properties.osType", required = true)
    private OperatingSystemType osType;

    /*
     * Describes the set of code packages that forms the service. A code
     * package describes the container and the properties for running it. All
     * the code packages are started together on the same host and share the
     * same context (network, process etc.).
     */
    @JsonProperty(value = "properties.codePackages", required = true)
    private List<ContainerCodePackageProperties> codePackages;

    /*
     * The names of the private networks that this service needs to be part of.
     */
    @JsonProperty(value = "properties.networkRefs")
    private List<NetworkRef> networkRefs;

    /*
     * Reference to sinks in DiagnosticsDescription.
     */
    @JsonProperty(value = "properties.diagnostics")
    private DiagnosticsRef diagnostics;

    /*
     * User readable description of the service.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The number of replicas of the service to create. Defaults to 1 if not
     * specified.
     */
    @JsonProperty(value = "properties.replicaCount")
    private Integer replicaCount;

    /*
     * The execution policy of the service
     */
    @JsonProperty(value = "properties.executionPolicy")
    private ExecutionPolicy executionPolicy;

    /*
     * Auto scaling policies
     */
    @JsonProperty(value = "properties.autoScalingPolicies")
    private List<AutoScalingPolicy> autoScalingPolicies;

    /*
     * Status of the service.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /*
     * Gives additional information about the current status of the service.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * Describes the health state of an application resource.
     */
    @JsonProperty(value = "properties.healthState", access = JsonProperty.Access.WRITE_ONLY)
    private HealthState healthState;

    /*
     * When the service's health state is not 'Ok', this additional details
     * from service fabric Health Manager for the user to know why the service
     * is marked unhealthy.
     */
    @JsonProperty(value = "properties.unhealthyEvaluation", access = JsonProperty.Access.WRITE_ONLY)
    private String unhealthyEvaluation;

    /*
     * The service identity list.
     */
    @JsonProperty(value = "properties.identityRefs")
    private List<ServiceIdentity> identityRefs;

    /*
     * Dns name of the service.
     */
    @JsonProperty(value = "properties.dnsName")
    private String dnsName;

    /**
     * Get the name property: Name of the Service resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Service resource.
     *
     * @param name the name value to set.
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the osType property: The operation system required by the code in service.
     *
     * @return the osType value.
     */
    public OperatingSystemType getOsType() {
        return this.osType;
    }

    /**
     * Set the osType property: The operation system required by the code in service.
     *
     * @param osType the osType value to set.
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setOsType(OperatingSystemType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the codePackages property: Describes the set of code packages that forms the service. A code package
     * describes the container and the properties for running it. All the code packages are started together on the same
     * host and share the same context (network, process etc.).
     *
     * @return the codePackages value.
     */
    public List<ContainerCodePackageProperties> getCodePackages() {
        return this.codePackages;
    }

    /**
     * Set the codePackages property: Describes the set of code packages that forms the service. A code package
     * describes the container and the properties for running it. All the code packages are started together on the same
     * host and share the same context (network, process etc.).
     *
     * @param codePackages the codePackages value to set.
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setCodePackages(List<ContainerCodePackageProperties> codePackages) {
        this.codePackages = codePackages;
        return this;
    }

    /**
     * Get the networkRefs property: The names of the private networks that this service needs to be part of.
     *
     * @return the networkRefs value.
     */
    public List<NetworkRef> getNetworkRefs() {
        return this.networkRefs;
    }

    /**
     * Set the networkRefs property: The names of the private networks that this service needs to be part of.
     *
     * @param networkRefs the networkRefs value to set.
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setNetworkRefs(List<NetworkRef> networkRefs) {
        this.networkRefs = networkRefs;
        return this;
    }

    /**
     * Get the diagnostics property: Reference to sinks in DiagnosticsDescription.
     *
     * @return the diagnostics value.
     */
    public DiagnosticsRef getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * Set the diagnostics property: Reference to sinks in DiagnosticsDescription.
     *
     * @param diagnostics the diagnostics value to set.
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setDiagnostics(DiagnosticsRef diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

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
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setDescription(String description) {
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
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setReplicaCount(Integer replicaCount) {
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
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setExecutionPolicy(ExecutionPolicy executionPolicy) {
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
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setAutoScalingPolicies(List<AutoScalingPolicy> autoScalingPolicies) {
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
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setIdentityRefs(List<ServiceIdentity> identityRefs) {
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
     * @return the ServiceResourceDescription object itself.
     */
    public ServiceResourceDescription setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
}
