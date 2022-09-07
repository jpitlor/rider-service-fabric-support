package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a service partition and its associated endpoints. */
@Fluent
public final class ResolvedServicePartition {
    /*
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * A representation of the resolved partition.
     */
    @JsonProperty(value = "PartitionInformation", required = true)
    private PartitionInformation partitionInformation;

    /*
     * List of resolved service endpoints of a service partition.
     */
    @JsonProperty(value = "Endpoints", required = true)
    private List<ResolvedServiceEndpoint> endpoints;

    /*
     * The version of this resolved service partition result. This version
     * should be passed in the next time the ResolveService call is made via
     * the PreviousRspVersion query parameter.
     */
    @JsonProperty(value = "Version", required = true)
    private String version;

    /**
     * Get the name property: The full name of the service with 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The full name of the service with 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ResolvedServicePartition object itself.
     */
    public ResolvedServicePartition setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the partitionInformation property: A representation of the resolved partition.
     *
     * @return the partitionInformation value.
     */
    public PartitionInformation getPartitionInformation() {
        return this.partitionInformation;
    }

    /**
     * Set the partitionInformation property: A representation of the resolved partition.
     *
     * @param partitionInformation the partitionInformation value to set.
     * @return the ResolvedServicePartition object itself.
     */
    public ResolvedServicePartition setPartitionInformation(PartitionInformation partitionInformation) {
        this.partitionInformation = partitionInformation;
        return this;
    }

    /**
     * Get the endpoints property: List of resolved service endpoints of a service partition.
     *
     * @return the endpoints value.
     */
    public List<ResolvedServiceEndpoint> getEndpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: List of resolved service endpoints of a service partition.
     *
     * @param endpoints the endpoints value to set.
     * @return the ResolvedServicePartition object itself.
     */
    public ResolvedServicePartition setEndpoints(List<ResolvedServiceEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the version property: The version of this resolved service partition result. This version should be passed in
     * the next time the ResolveService call is made via the PreviousRspVersion query parameter.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of this resolved service partition result. This version should be passed in
     * the next time the ResolveService call is made via the PreviousRspVersion query parameter.
     *
     * @param version the version value to set.
     * @return the ResolvedServicePartition object itself.
     */
    public ResolvedServicePartition setVersion(String version) {
        this.version = version;
        return this;
    }
}
