package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the http configuration for external connectivity for this network. */
@Fluent
public final class HttpConfig {
    /*
     * http gateway config name.
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
     * description for routing.
     */
    @JsonProperty(value = "hosts", required = true)
    private List<HttpHostConfig> hosts;

    /**
     * Get the name property: http gateway config name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: http gateway config name.
     *
     * @param name the name value to set.
     * @return the HttpConfig object itself.
     */
    public HttpConfig setName(String name) {
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
     * @return the HttpConfig object itself.
     */
    public HttpConfig setPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the hosts property: description for routing.
     *
     * @return the hosts value.
     */
    public List<HttpHostConfig> getHosts() {
        return this.hosts;
    }

    /**
     * Set the hosts property: description for routing.
     *
     * @param hosts the hosts value to set.
     * @return the HttpConfig object itself.
     */
    public HttpConfig setHosts(List<HttpHostConfig> hosts) {
        this.hosts = hosts;
        return this;
    }
}
