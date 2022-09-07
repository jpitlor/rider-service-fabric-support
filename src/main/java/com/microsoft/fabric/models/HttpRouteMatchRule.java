package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a rule for http route matching. */
@Fluent
public final class HttpRouteMatchRule {
    /*
     * Path to match for routing.
     */
    @JsonProperty(value = "path", required = true)
    private HttpRouteMatchPath path;

    /*
     * headers and their values to match in request.
     */
    @JsonProperty(value = "headers")
    private List<HttpRouteMatchHeader> headers;

    /**
     * Get the path property: Path to match for routing.
     *
     * @return the path value.
     */
    public HttpRouteMatchPath getPath() {
        return this.path;
    }

    /**
     * Set the path property: Path to match for routing.
     *
     * @param path the path value to set.
     * @return the HttpRouteMatchRule object itself.
     */
    public HttpRouteMatchRule setPath(HttpRouteMatchPath path) {
        this.path = path;
        return this;
    }

    /**
     * Get the headers property: headers and their values to match in request.
     *
     * @return the headers value.
     */
    public List<HttpRouteMatchHeader> getHeaders() {
        return this.headers;
    }

    /**
     * Set the headers property: headers and their values to match in request.
     *
     * @param headers the headers value to set.
     * @return the HttpRouteMatchRule object itself.
     */
    public HttpRouteMatchRule setHeaders(List<HttpRouteMatchHeader> headers) {
        this.headers = headers;
        return this;
    }
}
