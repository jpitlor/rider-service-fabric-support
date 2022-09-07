package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the health of a service package for a specific application deployed on a Service Fabric node. */
@Fluent
public final class DeployedServicePackageHealth extends EntityHealth {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * Name of the service manifest.
     */
    @JsonProperty(value = "ServiceManifestName")
    private String serviceManifestName;

    /*
     * Name of the node where this service package is deployed.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

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
     * @return the DeployedServicePackageHealth object itself.
     */
    public DeployedServicePackageHealth setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the serviceManifestName property: Name of the service manifest.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: Name of the service manifest.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the DeployedServicePackageHealth object itself.
     */
    public DeployedServicePackageHealth setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the nodeName property: Name of the node where this service package is deployed.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Name of the node where this service package is deployed.
     *
     * @param nodeName the nodeName value to set.
     * @return the DeployedServicePackageHealth object itself.
     */
    public DeployedServicePackageHealth setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
}
