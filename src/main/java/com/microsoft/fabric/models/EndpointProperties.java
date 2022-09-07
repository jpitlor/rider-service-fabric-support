package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a container endpoint. */
@Fluent
public final class EndpointProperties {
    /*
     * The name of the endpoint.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Port used by the container.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the name property: The name of the endpoint.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the endpoint.
     *
     * @param name the name value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the port property: Port used by the container.
     *
     * @return the port value.
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * Set the port property: Port used by the container.
     *
     * @param port the port value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties setPort(Integer port) {
        this.port = port;
        return this;
    }
}
