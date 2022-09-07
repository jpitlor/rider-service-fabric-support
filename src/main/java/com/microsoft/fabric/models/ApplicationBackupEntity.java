package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Identifies the Service Fabric application which is being backed up. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "EntityKind")
@JsonTypeName("Application")
@Fluent
public final class ApplicationBackupEntity extends BackupEntity {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /**
     * Get the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param applicationName the applicationName value to set.
     * @return the ApplicationBackupEntity object itself.
     */
    public ApplicationBackupEntity setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
}
