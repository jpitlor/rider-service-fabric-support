package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a Service Fabric code version. */
@Fluent
public final class FabricCodeVersionInfo {
    /*
     * The product version of Service Fabric.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /**
     * Get the codeVersion property: The product version of Service Fabric.
     *
     * @return the codeVersion value.
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the codeVersion property: The product version of Service Fabric.
     *
     * @param codeVersion the codeVersion value to set.
     * @return the FabricCodeVersionInfo object itself.
     */
    public FabricCodeVersionInfo setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
}
