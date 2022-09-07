package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Creates a particular correlation between services. */
@Fluent
public final class ServiceCorrelationDescription {
    /*
     * The ServiceCorrelationScheme which describes the relationship between
     * this service and the service specified via ServiceName.
     */
    @JsonProperty(value = "Scheme", required = true)
    private ServiceCorrelationScheme scheme;

    /*
     * The name of the service that the correlation relationship is established
     * with.
     */
    @JsonProperty(value = "ServiceName", required = true)
    private String serviceName;

    /**
     * Get the scheme property: The ServiceCorrelationScheme which describes the relationship between this service and
     * the service specified via ServiceName.
     *
     * @return the scheme value.
     */
    public ServiceCorrelationScheme getScheme() {
        return this.scheme;
    }

    /**
     * Set the scheme property: The ServiceCorrelationScheme which describes the relationship between this service and
     * the service specified via ServiceName.
     *
     * @param scheme the scheme value to set.
     * @return the ServiceCorrelationDescription object itself.
     */
    public ServiceCorrelationDescription setScheme(ServiceCorrelationScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Get the serviceName property: The name of the service that the correlation relationship is established with.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service that the correlation relationship is established with.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceCorrelationDescription object itself.
     */
    public ServiceCorrelationDescription setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
}
