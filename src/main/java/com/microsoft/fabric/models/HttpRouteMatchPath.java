package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Path to match for routing. */
@Fluent
public final class HttpRouteMatchPath {
    /*
     * Uri path to match for request.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * replacement string for matched part of the Uri.
     */
    @JsonProperty(value = "rewrite")
    private String rewrite;

    /*
     * how to match value in the Uri
     */
    @JsonProperty(value = "type", required = true)
    private PathMatchType type;

    /**
     * Get the value property: Uri path to match for request.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: Uri path to match for request.
     *
     * @param value the value value to set.
     * @return the HttpRouteMatchPath object itself.
     */
    public HttpRouteMatchPath setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the rewrite property: replacement string for matched part of the Uri.
     *
     * @return the rewrite value.
     */
    public String getRewrite() {
        return this.rewrite;
    }

    /**
     * Set the rewrite property: replacement string for matched part of the Uri.
     *
     * @param rewrite the rewrite value to set.
     * @return the HttpRouteMatchPath object itself.
     */
    public HttpRouteMatchPath setRewrite(String rewrite) {
        this.rewrite = rewrite;
        return this;
    }

    /**
     * Get the type property: how to match value in the Uri.
     *
     * @return the type value.
     */
    public PathMatchType getType() {
        return this.type;
    }

    /**
     * Set the type property: how to match value in the Uri.
     *
     * @param type the type value to set.
     * @return the HttpRouteMatchPath object itself.
     */
    public HttpRouteMatchPath setType(PathMatchType type) {
        this.type = type;
        return this;
    }
}
