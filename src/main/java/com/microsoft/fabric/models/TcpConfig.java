package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the tcp configuration for external connectivity for this network. */
@Fluent
public final class TcpConfig {
    /*
     * tcp gateway config name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Specifies the port at which the service endpoint below needs to be
     * exposed.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /*
     * Describes destination endpoint for routing traffic.
     */
    @JsonProperty(value = "destination", required = true)
    private GatewayDestination destination;

    /**
     * Get the name property: tcp gateway config name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: tcp gateway config name.
     *
     * @param name the name value to set.
     * @return the TcpConfig object itself.
     */
    public TcpConfig setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the port property: Specifies the port at which the service endpoint below needs to be exposed.
     *
     * @return the port value.
     */
    public int getPort() {
        return this.port;
    }

    /**
     * Set the port property: Specifies the port at which the service endpoint below needs to be exposed.
     *
     * @param port the port value to set.
     * @return the TcpConfig object itself.
     */
    public TcpConfig setPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the destination property: Describes destination endpoint for routing traffic.
     *
     * @return the destination value.
     */
    public GatewayDestination getDestination() {
        return this.destination;
    }

    /**
     * Set the destination property: Describes destination endpoint for routing traffic.
     *
     * @param destination the destination value to set.
     * @return the TcpConfig object itself.
     */
    public TcpConfig setDestination(GatewayDestination destination) {
        this.destination = destination;
        return this;
    }
}
