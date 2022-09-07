package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Identifies the Service Fabric stateful service which is being backed up. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "EntityKind")
@JsonTypeName("Service")
@Fluent
public final class ServiceBackupEntity extends BackupEntity {
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
     * @return the ServiceBackupEntity object itself.
     */
    public ServiceBackupEntity setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
}
