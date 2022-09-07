package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about a Service Fabric container network local to a single Service Fabric cluster. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Local")
@Fluent
public final class LocalNetworkResourceProperties extends NetworkResourceProperties {
    /*
     * Address space for the local container network.
     */
    @JsonProperty(value = "networkAddressPrefix")
    private String networkAddressPrefix;

    /**
     * Get the networkAddressPrefix property: Address space for the local container network.
     *
     * @return the networkAddressPrefix value.
     */
    public String getNetworkAddressPrefix() {
        return this.networkAddressPrefix;
    }

    /**
     * Set the networkAddressPrefix property: Address space for the local container network.
     *
     * @param networkAddressPrefix the networkAddressPrefix value to set.
     * @return the LocalNetworkResourceProperties object itself.
     */
    public LocalNetworkResourceProperties setNetworkAddressPrefix(String networkAddressPrefix) {
        this.networkAddressPrefix = networkAddressPrefix;
        return this;
    }
}
