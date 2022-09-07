package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state of a deployed service package, containing the entity identifier and the aggregated health
 * state.
 */
@Fluent
public final class DeployedServicePackageHealthState extends EntityHealthState {
    /*
     * Name of the node on which the service package is deployed.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * Name of the manifest describing the service package.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

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
     * Get the nodeName property: Name of the node on which the service package is deployed.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Name of the node on which the service package is deployed.
     *
     * @param nodeName the nodeName value to set.
     * @return the DeployedServicePackageHealthState object itself.
     */
    public DeployedServicePackageHealthState setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param applicationName the applicationName value to set.
     * @return the DeployedServicePackageHealthState object itself.
     */
    public DeployedServicePackageHealthState setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the serviceManifestName property: Name of the manifest describing the service package.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: Name of the manifest describing the service package.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the DeployedServicePackageHealthState object itself.
     */
    public DeployedServicePackageHealthState setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
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
     * @return the DeployedServicePackageHealthState object itself.
     */
    public DeployedServicePackageHealthState setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }
}
