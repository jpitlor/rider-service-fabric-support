package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the health state of a service, which contains the service identifier and its aggregated health state. */
@Fluent
public final class ServiceHealthState extends EntityHealthState {
    /*
     * Name of the service whose health state is represented by this object.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /**
     * Get the serviceName property: Name of the service whose health state is represented by this object.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Name of the service whose health state is represented by this object.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceHealthState object itself.
     */
    public ServiceHealthState setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
}
