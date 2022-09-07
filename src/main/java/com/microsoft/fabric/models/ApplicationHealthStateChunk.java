package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state chunk of a application. The application health state chunk contains the application name,
 * its aggregated health state and any children services and deployed applications that respect the filters in cluster
 * health chunk query description.
 */
@Fluent
public final class ApplicationHealthStateChunk extends EntityHealthStateChunk {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "ApplicationTypeName")
    private String applicationTypeName;

    /*
     * The list of service health state chunks in the cluster that respect the
     * filters in the cluster health chunk query description.
     */
    @JsonProperty(value = "ServiceHealthStateChunks")
    private ServiceHealthStateChunkList serviceHealthStateChunks;

    /*
     * The list of deployed application health state chunks in the cluster that
     * respect the filters in the cluster health chunk query description.
     */
    @JsonProperty(value = "DeployedApplicationHealthStateChunks")
    private DeployedApplicationHealthStateChunkList deployedApplicationHealthStateChunks;

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
     * @return the ApplicationHealthStateChunk object itself.
     */
    public ApplicationHealthStateChunk setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

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
     * @return the ApplicationHealthStateChunk object itself.
     */
    public ApplicationHealthStateChunk setApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get the serviceHealthStateChunks property: The list of service health state chunks in the cluster that respect
     * the filters in the cluster health chunk query description.
     *
     * @return the serviceHealthStateChunks value.
     */
    public ServiceHealthStateChunkList getServiceHealthStateChunks() {
        return this.serviceHealthStateChunks;
    }

    /**
     * Set the serviceHealthStateChunks property: The list of service health state chunks in the cluster that respect
     * the filters in the cluster health chunk query description.
     *
     * @param serviceHealthStateChunks the serviceHealthStateChunks value to set.
     * @return the ApplicationHealthStateChunk object itself.
     */
    public ApplicationHealthStateChunk setServiceHealthStateChunks(
            ServiceHealthStateChunkList serviceHealthStateChunks) {
        this.serviceHealthStateChunks = serviceHealthStateChunks;
        return this;
    }

    /**
     * Get the deployedApplicationHealthStateChunks property: The list of deployed application health state chunks in
     * the cluster that respect the filters in the cluster health chunk query description.
     *
     * @return the deployedApplicationHealthStateChunks value.
     */
    public DeployedApplicationHealthStateChunkList getDeployedApplicationHealthStateChunks() {
        return this.deployedApplicationHealthStateChunks;
    }

    /**
     * Set the deployedApplicationHealthStateChunks property: The list of deployed application health state chunks in
     * the cluster that respect the filters in the cluster health chunk query description.
     *
     * @param deployedApplicationHealthStateChunks the deployedApplicationHealthStateChunks value to set.
     * @return the ApplicationHealthStateChunk object itself.
     */
    public ApplicationHealthStateChunk setDeployedApplicationHealthStateChunks(
            DeployedApplicationHealthStateChunkList deployedApplicationHealthStateChunks) {
        this.deployedApplicationHealthStateChunks = deployedApplicationHealthStateChunks;
        return this;
    }
}
