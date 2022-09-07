package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the operation to unregister or unprovision an application type and its version that was registered with the
 * Service Fabric.
 */
@Fluent
public final class UnprovisionApplicationTypeDescriptionInfo {
    /*
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /*
     * The flag indicating whether or not unprovision should occur
     * asynchronously. When set to true, the unprovision operation returns when
     * the request is accepted by the system, and the unprovision operation
     * continues without any timeout limit. The default value is false.
     * However, we recommend setting it to true for large application packages
     * that were provisioned.
     */
    @JsonProperty(value = "Async")
    private Boolean async;

    /**
     * Get the applicationTypeVersion property: The version of the application type as defined in the application
     * manifest.
     *
     * @return the applicationTypeVersion value.
     */
    public String getApplicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set the applicationTypeVersion property: The version of the application type as defined in the application
     * manifest.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set.
     * @return the UnprovisionApplicationTypeDescriptionInfo object itself.
     */
    public UnprovisionApplicationTypeDescriptionInfo setApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get the async property: The flag indicating whether or not unprovision should occur asynchronously. When set to
     * true, the unprovision operation returns when the request is accepted by the system, and the unprovision operation
     * continues without any timeout limit. The default value is false. However, we recommend setting it to true for
     * large application packages that were provisioned.
     *
     * @return the async value.
     */
    public Boolean isAsync() {
        return this.async;
    }

    /**
     * Set the async property: The flag indicating whether or not unprovision should occur asynchronously. When set to
     * true, the unprovision operation returns when the request is accepted by the system, and the unprovision operation
     * continues without any timeout limit. The default value is false. However, we recommend setting it to true for
     * large application packages that were provisioned.
     *
     * @param async the async value to set.
     * @return the UnprovisionApplicationTypeDescriptionInfo object itself.
     */
    public UnprovisionApplicationTypeDescriptionInfo setAsync(Boolean async) {
        this.async = async;
        return this;
    }
}
