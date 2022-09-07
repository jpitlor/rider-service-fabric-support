package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the hostname properties for http routing. */
@Fluent
public final class HttpRouteConfig {
    /*
     * http route name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes a rule for http route matching.
     */
    @JsonProperty(value = "match", required = true)
    private HttpRouteMatchRule match;

    /*
     * Describes destination endpoint for routing traffic.
     */
    @JsonProperty(value = "destination", required = true)
    private GatewayDestination destination;

    /**
     * Get the name property: http route name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: http route name.
     *
     * @param name the name value to set.
     * @return the HttpRouteConfig object itself.
     */
    public HttpRouteConfig setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the match property: Describes a rule for http route matching.
     *
     * @return the match value.
     */
    public HttpRouteMatchRule getMatch() {
        return this.match;
    }

    /**
     * Set the match property: Describes a rule for http route matching.
     *
     * @param match the match value to set.
     * @return the HttpRouteConfig object itself.
     */
    public HttpRouteConfig setMatch(HttpRouteMatchRule match) {
        this.match = match;
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
     * @return the HttpRouteConfig object itself.
     */
    public HttpRouteConfig setDestination(GatewayDestination destination) {
        this.destination = destination;
        return this;
    }
}
