package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for provisioning a cluster. */
@Fluent
public final class ProvisionFabricDescription {
    /*
     * The cluster code package file path.
     */
    @JsonProperty(value = "CodeFilePath")
    private String codeFilePath;

    /*
     * The cluster manifest file path.
     */
    @JsonProperty(value = "ClusterManifestFilePath")
    private String clusterManifestFilePath;

    /**
     * Get the codeFilePath property: The cluster code package file path.
     *
     * @return the codeFilePath value.
     */
    public String getCodeFilePath() {
        return this.codeFilePath;
    }

    /**
     * Set the codeFilePath property: The cluster code package file path.
     *
     * @param codeFilePath the codeFilePath value to set.
     * @return the ProvisionFabricDescription object itself.
     */
    public ProvisionFabricDescription setCodeFilePath(String codeFilePath) {
        this.codeFilePath = codeFilePath;
        return this;
    }

    /**
     * Get the clusterManifestFilePath property: The cluster manifest file path.
     *
     * @return the clusterManifestFilePath value.
     */
    public String getClusterManifestFilePath() {
        return this.clusterManifestFilePath;
    }

    /**
     * Set the clusterManifestFilePath property: The cluster manifest file path.
     *
     * @param clusterManifestFilePath the clusterManifestFilePath value to set.
     * @return the ProvisionFabricDescription object itself.
     */
    public ProvisionFabricDescription setClusterManifestFilePath(String clusterManifestFilePath) {
        this.clusterManifestFilePath = clusterManifestFilePath;
        return this;
    }
}
