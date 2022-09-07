package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Endpoint of a resolved service partition. */
@Fluent
public final class ResolvedServiceEndpoint {
    /*
     * The role of the replica where the endpoint is reported.
     */
    @JsonProperty(value = "Kind")
    private ServiceEndpointRole kind;

    /*
     * The address of the endpoint. If the endpoint has multiple listeners the
     * address is a JSON object with one property per listener with the value
     * as the address of that listener.
     */
    @JsonProperty(value = "Address")
    private String address;

    /**
     * Get the kind property: The role of the replica where the endpoint is reported.
     *
     * @return the kind value.
     */
    public ServiceEndpointRole getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: The role of the replica where the endpoint is reported.
     *
     * @param kind the kind value to set.
     * @return the ResolvedServiceEndpoint object itself.
     */
    public ResolvedServiceEndpoint setKind(ServiceEndpointRole kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the address property: The address of the endpoint. If the endpoint has multiple listeners the address is a
     * JSON object with one property per listener with the value as the address of that listener.
     *
     * @return the address value.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address property: The address of the endpoint. If the endpoint has multiple listeners the address is a
     * JSON object with one property per listener with the value as the address of that listener.
     *
     * @param address the address value to set.
     * @return the ResolvedServiceEndpoint object itself.
     */
    public ResolvedServiceEndpoint setAddress(String address) {
        this.address = address;
        return this;
    }
}
