package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The cluster version. */
@Fluent
public final class ClusterVersion {
    /*
     * The Service Fabric cluster runtime version.
     */
    @JsonProperty(value = "Version")
    private String version;

    /**
     * Get the version property: The Service Fabric cluster runtime version.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The Service Fabric cluster runtime version.
     *
     * @param version the version value to set.
     * @return the ClusterVersion object itself.
     */
    public ClusterVersion setVersion(String version) {
        this.version = version;
        return this;
    }
}
