package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes properties of a network resource. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = NetworkResourceProperties.class)
@JsonTypeName("NetworkResourceProperties")
@JsonSubTypes({@JsonSubTypes.Type(name = "Local", value = LocalNetworkResourceProperties.class)})
@Fluent
public class NetworkResourceProperties extends NetworkResourcePropertiesBase {
    /*
     * User readable description of the network.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Status of the network.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /*
     * Gives additional information about the current status of the network.
     */
    @JsonProperty(value = "statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /**
     * Get the description property: User readable description of the network.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: User readable description of the network.
     *
     * @param description the description value to set.
     * @return the NetworkResourceProperties object itself.
     */
    public NetworkResourceProperties setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the status property: Status of the network.
     *
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetails property: Gives additional information about the current status of the network.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }
}
