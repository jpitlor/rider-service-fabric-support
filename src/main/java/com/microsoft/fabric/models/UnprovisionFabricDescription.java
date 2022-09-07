package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters for unprovisioning a cluster. */
@Fluent
public final class UnprovisionFabricDescription {
    /*
     * The cluster code package version.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /*
     * The cluster manifest version.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * Get the codeVersion property: The cluster code package version.
     *
     * @return the codeVersion value.
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the codeVersion property: The cluster code package version.
     *
     * @param codeVersion the codeVersion value to set.
     * @return the UnprovisionFabricDescription object itself.
     */
    public UnprovisionFabricDescription setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the configVersion property: The cluster manifest version.
     *
     * @return the configVersion value.
     */
    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * Set the configVersion property: The cluster manifest version.
     *
     * @param configVersion the configVersion value to set.
     * @return the UnprovisionFabricDescription object itself.
     */
    public UnprovisionFabricDescription setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }
}
