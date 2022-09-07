package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The REST API operations for Service Fabric return standard HTTP status codes. This type defines the additional
 * information returned from the Service Fabric API operations that are not successful.
 */
@Fluent
public final class FabricError {
    /*
     * Error object containing error code and error message.
     */
    @JsonProperty(value = "Error", required = true)
    private FabricErrorError error;

    /**
     * Get the error property: Error object containing error code and error message.
     *
     * @return the error value.
     */
    public FabricErrorError getError() {
        return this.error;
    }

    /**
     * Set the error property: Error object containing error code and error message.
     *
     * @param error the error value to set.
     * @return the FabricError object itself.
     */
    public FabricError setError(FabricErrorError error) {
        this.error = error;
        return this;
    }
}
