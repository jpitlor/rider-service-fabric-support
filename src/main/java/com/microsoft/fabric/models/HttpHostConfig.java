package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the hostname properties for http routing. */
@Fluent
public final class HttpHostConfig {
    /*
     * http hostname config name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Route information to use for routing. Routes are processed in the order
     * they are specified. Specify routes that are more specific before routes
     * that can handle general cases.
     */
    @JsonProperty(value = "routes", required = true)
    private List<HttpRouteConfig> routes;

    /**
     * Get the name property: http hostname config name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: http hostname config name.
     *
     * @param name the name value to set.
     * @return the HttpHostConfig object itself.
     */
    public HttpHostConfig setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the routes property: Route information to use for routing. Routes are processed in the order they are
     * specified. Specify routes that are more specific before routes that can handle general cases.
     *
     * @return the routes value.
     */
    public List<HttpRouteConfig> getRoutes() {
        return this.routes;
    }

    /**
     * Set the routes property: Route information to use for routing. Routes are processed in the order they are
     * specified. Specify routes that are more specific before routes that can handle general cases.
     *
     * @param routes the routes value to set.
     * @return the HttpHostConfig object itself.
     */
    public HttpHostConfig setRoutes(List<HttpRouteConfig> routes) {
        this.routes = routes;
        return this;
    }
}
