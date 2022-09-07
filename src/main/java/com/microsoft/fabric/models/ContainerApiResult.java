package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Container API result. */
@Fluent
public final class ContainerApiResult {
    /*
     * HTTP status code returned by the target container API
     */
    @JsonProperty(value = "Status", required = true)
    private int status;

    /*
     * HTTP content type
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * HTTP content encoding
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * container API result body
     */
    @JsonProperty(value = "Body")
    private String body;

    /**
     * Get the status property: HTTP status code returned by the target container API.
     *
     * @return the status value.
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Set the status property: HTTP status code returned by the target container API.
     *
     * @param status the status value to set.
     * @return the ContainerApiResult object itself.
     */
    public ContainerApiResult setStatus(int status) {
        this.status = status;
        return this;
    }

    /**
     * Get the contentType property: HTTP content type.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: HTTP content type.
     *
     * @param contentType the contentType value to set.
     * @return the ContainerApiResult object itself.
     */
    public ContainerApiResult setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentEncoding property: HTTP content encoding.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: HTTP content encoding.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the ContainerApiResult object itself.
     */
    public ContainerApiResult setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the body property: container API result body.
     *
     * @return the body value.
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Set the body property: container API result body.
     *
     * @param body the body value to set.
     * @return the ContainerApiResult object itself.
     */
    public ContainerApiResult setBody(String body) {
        this.body = body;
        return this;
    }
}
