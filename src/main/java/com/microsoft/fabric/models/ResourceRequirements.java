package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type describes the resource requirements for a container or a service. */
@Fluent
public final class ResourceRequirements {
    /*
     * Describes the requested resources for a given container.
     */
    @JsonProperty(value = "requests", required = true)
    private ResourceRequests requests;

    /*
     * Describes the maximum limits on the resources for a given container.
     */
    @JsonProperty(value = "limits")
    private ResourceLimits limits;

    /**
     * Get the requests property: Describes the requested resources for a given container.
     *
     * @return the requests value.
     */
    public ResourceRequests getRequests() {
        return this.requests;
    }

    /**
     * Set the requests property: Describes the requested resources for a given container.
     *
     * @param requests the requests value to set.
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements setRequests(ResourceRequests requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get the limits property: Describes the maximum limits on the resources for a given container.
     *
     * @return the limits value.
     */
    public ResourceLimits getLimits() {
        return this.limits;
    }

    /**
     * Set the limits property: Describes the maximum limits on the resources for a given container.
     *
     * @param limits the limits value to set.
     * @return the ResourceRequirements object itself.
     */
    public ResourceRequirements setLimits(ResourceLimits limits) {
        this.limits = limits;
        return this;
    }
}
