package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state chunk of a deployed application, which contains the node where the application is
 * deployed, the aggregated health state and any deployed service packages that respect the chunk query description
 * filters.
 */
@Fluent
public final class DeployedApplicationHealthStateChunk extends EntityHealthStateChunk {
    /*
     * The name of node where the application is deployed.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * The list of deployed service package health state chunks belonging to
     * the deployed application that respect the filters in the cluster health
     * chunk query description.
     */
    @JsonProperty(value = "DeployedServicePackageHealthStateChunks")
    private DeployedServicePackageHealthStateChunkList deployedServicePackageHealthStateChunks;

    /**
     * Get the nodeName property: The name of node where the application is deployed.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of node where the application is deployed.
     *
     * @param nodeName the nodeName value to set.
     * @return the DeployedApplicationHealthStateChunk object itself.
     */
    public DeployedApplicationHealthStateChunk setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the deployedServicePackageHealthStateChunks property: The list of deployed service package health state
     * chunks belonging to the deployed application that respect the filters in the cluster health chunk query
     * description.
     *
     * @return the deployedServicePackageHealthStateChunks value.
     */
    public DeployedServicePackageHealthStateChunkList getDeployedServicePackageHealthStateChunks() {
        return this.deployedServicePackageHealthStateChunks;
    }

    /**
     * Set the deployedServicePackageHealthStateChunks property: The list of deployed service package health state
     * chunks belonging to the deployed application that respect the filters in the cluster health chunk query
     * description.
     *
     * @param deployedServicePackageHealthStateChunks the deployedServicePackageHealthStateChunks value to set.
     * @return the DeployedApplicationHealthStateChunk object itself.
     */
    public DeployedApplicationHealthStateChunk setDeployedServicePackageHealthStateChunks(
            DeployedServicePackageHealthStateChunkList deployedServicePackageHealthStateChunks) {
        this.deployedServicePackageHealthStateChunks = deployedServicePackageHealthStateChunks;
        return this;
    }
}
