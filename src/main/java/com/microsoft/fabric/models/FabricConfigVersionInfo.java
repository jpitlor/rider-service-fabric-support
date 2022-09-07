package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a Service Fabric config version. */
@Fluent
public final class FabricConfigVersionInfo {
    /*
     * The config version of Service Fabric.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * Get the configVersion property: The config version of Service Fabric.
     *
     * @return the configVersion value.
     */
    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * Set the configVersion property: The config version of Service Fabric.
     *
     * @param configVersion the configVersion value to set.
     * @return the FabricConfigVersionInfo object itself.
     */
    public FabricConfigVersionInfo setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }
}
