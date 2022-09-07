package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This type describes a gateway resource. */
@JsonFlatten
@Fluent
public class GatewayResourceDescription {
    /*
     * Name of the Gateway resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * User readable description of the gateway.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Network the gateway should listen on for requests.
     */
    @JsonProperty(value = "properties.sourceNetwork", required = true)
    private NetworkRef sourceNetwork;

    /*
     * Network that the Application is using.
     */
    @JsonProperty(value = "properties.destinationNetwork", required = true)
    private NetworkRef destinationNetwork;

    /*
     * Configuration for tcp connectivity for this gateway.
     */
    @JsonProperty(value = "properties.tcp")
    private List<TcpConfig> tcp;

    /*
     * Configuration for http connectivity for this gateway.
     */
    @JsonProperty(value = "properties.http")
    private List<HttpConfig> http;

    /*
     * Status of the resource.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /*
     * Gives additional information about the current status of the gateway.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * IP address of the gateway. This is populated in the response and is
     * ignored for incoming requests.
     */
    @JsonProperty(value = "properties.ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /**
     * Get the name property: Name of the Gateway resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Gateway resource.
     *
     * @param name the name value to set.
     * @return the GatewayResourceDescription object itself.
     */
    public GatewayResourceDescription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: User readable description of the gateway.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: User readable description of the gateway.
     *
     * @param description the description value to set.
     * @return the GatewayResourceDescription object itself.
     */
    public GatewayResourceDescription setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sourceNetwork property: Network the gateway should listen on for requests.
     *
     * @return the sourceNetwork value.
     */
    public NetworkRef getSourceNetwork() {
        return this.sourceNetwork;
    }

    /**
     * Set the sourceNetwork property: Network the gateway should listen on for requests.
     *
     * @param sourceNetwork the sourceNetwork value to set.
     * @return the GatewayResourceDescription object itself.
     */
    public GatewayResourceDescription setSourceNetwork(NetworkRef sourceNetwork) {
        this.sourceNetwork = sourceNetwork;
        return this;
    }

    /**
     * Get the destinationNetwork property: Network that the Application is using.
     *
     * @return the destinationNetwork value.
     */
    public NetworkRef getDestinationNetwork() {
        return this.destinationNetwork;
    }

    /**
     * Set the destinationNetwork property: Network that the Application is using.
     *
     * @param destinationNetwork the destinationNetwork value to set.
     * @return the GatewayResourceDescription object itself.
     */
    public GatewayResourceDescription setDestinationNetwork(NetworkRef destinationNetwork) {
        this.destinationNetwork = destinationNetwork;
        return this;
    }

    /**
     * Get the tcp property: Configuration for tcp connectivity for this gateway.
     *
     * @return the tcp value.
     */
    public List<TcpConfig> getTcp() {
        return this.tcp;
    }

    /**
     * Set the tcp property: Configuration for tcp connectivity for this gateway.
     *
     * @param tcp the tcp value to set.
     * @return the GatewayResourceDescription object itself.
     */
    public GatewayResourceDescription setTcp(List<TcpConfig> tcp) {
        this.tcp = tcp;
        return this;
    }

    /**
     * Get the http property: Configuration for http connectivity for this gateway.
     *
     * @return the http value.
     */
    public List<HttpConfig> getHttp() {
        return this.http;
    }

    /**
     * Set the http property: Configuration for http connectivity for this gateway.
     *
     * @param http the http value to set.
     * @return the GatewayResourceDescription object itself.
     */
    public GatewayResourceDescription setHttp(List<HttpConfig> http) {
        this.http = http;
        return this;
    }

    /**
     * Get the status property: Status of the resource.
     *
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetails property: Gives additional information about the current status of the gateway.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the ipAddress property: IP address of the gateway. This is populated in the response and is ignored for
     * incoming requests.
     *
     * @return the ipAddress value.
     */
    public String getIpAddress() {
        return this.ipAddress;
    }
}
