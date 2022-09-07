package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about service package deployed on a Service Fabric node. */
@Fluent
public final class DeployedServicePackageInfo {
    /*
     * The name of the service package as specified in the service manifest.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The version of the service package specified in service manifest.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Specifies the status of a deployed application or service package on a
     * Service Fabric node.
     */
    @JsonProperty(value = "Status")
    private DeploymentStatus status;

    /*
     * The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the
     * service
     * is 'SharedProcess' (or if it is not specified, in which case it defaults
     * to 'SharedProcess'), then value of ServicePackageActivationId
     * is always an empty string.
     */
    @JsonProperty(value = "ServicePackageActivationId")
    private String servicePackageActivationId;

    /**
     * Get the name property: The name of the service package as specified in the service manifest.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the service package as specified in the service manifest.
     *
     * @param name the name value to set.
     * @return the DeployedServicePackageInfo object itself.
     */
    public DeployedServicePackageInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: The version of the service package specified in service manifest.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the service package specified in service manifest.
     *
     * @param version the version value to set.
     * @return the DeployedServicePackageInfo object itself.
     */
    public DeployedServicePackageInfo setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the status property: Specifies the status of a deployed application or service package on a Service Fabric
     * node.
     *
     * @return the status value.
     */
    public DeploymentStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Specifies the status of a deployed application or service package on a Service Fabric
     * node.
     *
     * @param status the status value to set.
     * @return the DeployedServicePackageInfo object itself.
     */
    public DeployedServicePackageInfo setStatus(DeploymentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the servicePackageActivationId property: The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the service is 'SharedProcess' (or if it is not
     * specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId is always an
     * empty string.
     *
     * @return the servicePackageActivationId value.
     */
    public String getServicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId property: The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the service is 'SharedProcess' (or if it is not
     * specified, in which case it defaults to 'SharedProcess'), then value of ServicePackageActivationId is always an
     * empty string.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set.
     * @return the DeployedServicePackageInfo object itself.
     */
    public DeployedServicePackageInfo setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }
}
