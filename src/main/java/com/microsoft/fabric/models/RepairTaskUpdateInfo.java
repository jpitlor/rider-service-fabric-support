package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the result of an operation that created or updated a repair task.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@Fluent
public final class RepairTaskUpdateInfo {
    /*
     * The new version of the repair task.
     */
    @JsonProperty(value = "Version", required = true)
    private String version;

    /**
     * Get the version property: The new version of the repair task.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The new version of the repair task.
     *
     * @param version the version value to set.
     * @return the RepairTaskUpdateInfo object itself.
     */
    public RepairTaskUpdateInfo setVersion(String version) {
        this.version = version;
        return this;
    }
}
