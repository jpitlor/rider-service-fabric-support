package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Path description for the application package in the image store specified during the prior copy operation. */
@Fluent
public final class ApplicationTypeImageStorePath {
    /*
     * The relative image store path to the application package.
     */
    @JsonProperty(value = "ApplicationTypeBuildPath", required = true)
    private String applicationTypeBuildPath;

    /**
     * Get the applicationTypeBuildPath property: The relative image store path to the application package.
     *
     * @return the applicationTypeBuildPath value.
     */
    public String getApplicationTypeBuildPath() {
        return this.applicationTypeBuildPath;
    }

    /**
     * Set the applicationTypeBuildPath property: The relative image store path to the application package.
     *
     * @param applicationTypeBuildPath the applicationTypeBuildPath value to set.
     * @return the ApplicationTypeImageStorePath object itself.
     */
    public ApplicationTypeImageStorePath setApplicationTypeBuildPath(String applicationTypeBuildPath) {
        this.applicationTypeBuildPath = applicationTypeBuildPath;
        return this;
    }
}
