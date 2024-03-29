package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes destination endpoint for routing traffic. */
@Fluent
public final class GatewayDestination {
    /*
     * Name of the service fabric Mesh application.
     */
    @JsonProperty(value = "applicationName", required = true)
    private String applicationName;

    /*
     * service that contains the endpoint.
     */
    @JsonProperty(value = "serviceName", required = true)
    private String serviceName;

    /*
     * name of the endpoint in the service.
     */
    @JsonProperty(value = "endpointName", required = true)
    private String endpointName;

    /**
     * Get the applicationName property: Name of the service fabric Mesh application.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: Name of the service fabric Mesh application.
     *
     * @param applicationName the applicationName value to set.
     * @return the GatewayDestination object itself.
     */
    public GatewayDestination setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the serviceName property: service that contains the endpoint.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: service that contains the endpoint.
     *
     * @param serviceName the serviceName value to set.
     * @return the GatewayDestination object itself.
     */
    public GatewayDestination setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the endpointName property: name of the endpoint in the service.
     *
     * @return the endpointName value.
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * Set the endpointName property: name of the endpoint in the service.
     *
     * @param endpointName the endpointName value to set.
     * @return the GatewayDestination object itself.
     */
    public GatewayDestination setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
}
