package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a network reference in a service. */
@Fluent
public final class NetworkRef {
    /*
     * Name of the network
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A list of endpoints that are exposed on this network.
     */
    @JsonProperty(value = "endpointRefs")
    private List<EndpointRef> endpointRefs;

    /**
     * Get the name property: Name of the network.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the network.
     *
     * @param name the name value to set.
     * @return the NetworkRef object itself.
     */
    public NetworkRef setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpointRefs property: A list of endpoints that are exposed on this network.
     *
     * @return the endpointRefs value.
     */
    public List<EndpointRef> getEndpointRefs() {
        return this.endpointRefs;
    }

    /**
     * Set the endpointRefs property: A list of endpoints that are exposed on this network.
     *
     * @param endpointRefs the endpointRefs value to set.
     * @return the NetworkRef object itself.
     */
    public NetworkRef setEndpointRefs(List<EndpointRef> endpointRefs) {
        this.endpointRefs = endpointRefs;
        return this;
    }
}
