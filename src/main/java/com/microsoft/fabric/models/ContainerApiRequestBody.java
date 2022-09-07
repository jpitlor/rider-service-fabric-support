package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** parameters for making container API call. */
@Fluent
public final class ContainerApiRequestBody {
    /*
     * HTTP verb of container REST API, defaults to "GET"
     */
    @JsonProperty(value = "HttpVerb")
    private String httpVerb;

    /*
     * URI path of container REST API
     */
    @JsonProperty(value = "UriPath", required = true)
    private String uriPath;

    /*
     * Content type of container REST API request, defaults to
     * "application/json"
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * HTTP request body of container REST API
     */
    @JsonProperty(value = "Body")
    private String body;

    /**
     * Get the httpVerb property: HTTP verb of container REST API, defaults to "GET".
     *
     * @return the httpVerb value.
     */
    public String getHttpVerb() {
        return this.httpVerb;
    }

    /**
     * Set the httpVerb property: HTTP verb of container REST API, defaults to "GET".
     *
     * @param httpVerb the httpVerb value to set.
     * @return the ContainerApiRequestBody object itself.
     */
    public ContainerApiRequestBody setHttpVerb(String httpVerb) {
        this.httpVerb = httpVerb;
        return this;
    }

    /**
     * Get the uriPath property: URI path of container REST API.
     *
     * @return the uriPath value.
     */
    public String getUriPath() {
        return this.uriPath;
    }

    /**
     * Set the uriPath property: URI path of container REST API.
     *
     * @param uriPath the uriPath value to set.
     * @return the ContainerApiRequestBody object itself.
     */
    public ContainerApiRequestBody setUriPath(String uriPath) {
        this.uriPath = uriPath;
        return this;
    }

    /**
     * Get the contentType property: Content type of container REST API request, defaults to "application/json".
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Content type of container REST API request, defaults to "application/json".
     *
     * @param contentType the contentType value to set.
     * @return the ContainerApiRequestBody object itself.
     */
    public ContainerApiRequestBody setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the body property: HTTP request body of container REST API.
     *
     * @return the body value.
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Set the body property: HTTP request body of container REST API.
     *
     * @param body the body value to set.
     * @return the ContainerApiRequestBody object itself.
     */
    public ContainerApiRequestBody setBody(String body) {
        this.body = body;
        return this;
    }
}
