package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state of a deployed application, which contains the entity identifier and the aggregated health
 * state.
 */
@Fluent
public final class DeployedApplicationHealthState extends EntityHealthState {
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
     * @return the DeployedApplicationHealthState object itself.
     */
    public DeployedApplicationHealthState setNodeName(String nodeName) {
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
     * @return the DeployedApplicationHealthState object itself.
     */
    public DeployedApplicationHealthState setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
}
