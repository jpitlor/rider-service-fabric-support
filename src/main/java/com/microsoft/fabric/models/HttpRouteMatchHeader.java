package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes header information for http route matching. */
@Fluent
public final class HttpRouteMatchHeader {
    /*
     * Name of header to match in request.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Value of header to match in request.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * how to match header value
     */
    @JsonProperty(value = "type")
    private HeaderMatchType type;

    /**
     * Get the name property: Name of header to match in request.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of header to match in request.
     *
     * @param name the name value to set.
     * @return the HttpRouteMatchHeader object itself.
     */
    public HttpRouteMatchHeader setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of header to match in request.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: Value of header to match in request.
     *
     * @param value the value value to set.
     * @return the HttpRouteMatchHeader object itself.
     */
    public HttpRouteMatchHeader setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the type property: how to match header value.
     *
     * @return the type value.
     */
    public HeaderMatchType getType() {
        return this.type;
    }

    /**
     * Set the type property: how to match header value.
     *
     * @param type the type value to set.
     * @return the HttpRouteMatchHeader object itself.
     */
    public HttpRouteMatchHeader setType(HeaderMatchType type) {
        this.type = type;
        return this;
    }
}
