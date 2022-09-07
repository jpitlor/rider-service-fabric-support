package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a Service Fabric compose deployment. */
@Fluent
public final class ComposeDeploymentStatusInfo {
    /*
     * The name of the deployment.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * The status of the compose deployment.
     */
    @JsonProperty(value = "Status")
    private ComposeDeploymentStatus status;

    /*
     * The status details of compose deployment including failure message.
     */
    @JsonProperty(value = "StatusDetails")
    private String statusDetails;

    /**
     * Get the name property: The name of the deployment.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the deployment.
     *
     * @param name the name value to set.
     * @return the ComposeDeploymentStatusInfo object itself.
     */
    public ComposeDeploymentStatusInfo setName(String name) {
        this.name = name;
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
     * @return the ComposeDeploymentStatusInfo object itself.
     */
    public ComposeDeploymentStatusInfo setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the status property: The status of the compose deployment.
     *
     * @return the status value.
     */
    public ComposeDeploymentStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the compose deployment.
     *
     * @param status the status value to set.
     * @return the ComposeDeploymentStatusInfo object itself.
     */
    public ComposeDeploymentStatusInfo setStatus(ComposeDeploymentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails property: The status details of compose deployment including failure message.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: The status details of compose deployment including failure message.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the ComposeDeploymentStatusInfo object itself.
     */
    public ComposeDeploymentStatusInfo setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }
}
