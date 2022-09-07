package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body that wraps container API result. */
@Fluent
public final class ContainerApiResponse {
    /*
     * Container API result.
     */
    @JsonProperty(value = "ContainerApiResult", required = true)
    private ContainerApiResult containerApiResult;

    /**
     * Get the containerApiResult property: Container API result.
     *
     * @return the containerApiResult value.
     */
    public ContainerApiResult getContainerApiResult() {
        return this.containerApiResult;
    }

    /**
     * Set the containerApiResult property: Container API result.
     *
     * @param containerApiResult the containerApiResult value to set.
     * @return the ContainerApiResponse object itself.
     */
    public ContainerApiResponse setContainerApiResult(ContainerApiResult containerApiResult) {
        this.containerApiResult = containerApiResult;
        return this;
    }
}
