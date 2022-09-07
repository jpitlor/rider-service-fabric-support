package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the cluster manifest. */
@Fluent
public final class ClusterManifest {
    /*
     * The contents of the cluster manifest file.
     */
    @JsonProperty(value = "Manifest")
    private String manifest;

    /**
     * Get the manifest property: The contents of the cluster manifest file.
     *
     * @return the manifest value.
     */
    public String getManifest() {
        return this.manifest;
    }

    /**
     * Set the manifest property: The contents of the cluster manifest file.
     *
     * @param manifest the manifest value to set.
     * @return the ClusterManifest object itself.
     */
    public ClusterManifest setManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
}
