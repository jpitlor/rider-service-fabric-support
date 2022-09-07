package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Backup configuration information for a specific Service Fabric service specifying what backup policy is being applied
 * and suspend description, if any.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Service")
@Fluent
public final class ServiceBackupConfigurationInfo extends BackupConfigurationInfo {
    /*
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /**
     * Get the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceBackupConfigurationInfo object itself.
     */
    public ServiceBackupConfigurationInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
}
