package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Active Directory metadata object used for secured connection to cluster. */
@Fluent
public final class AadMetadataObject {
    /*
     * The client authentication method.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Azure Active Directory metadata used for secured connection to cluster.
     */
    @JsonProperty(value = "metadata")
    private AadMetadata metadata;

    /**
     * Get the type property: The client authentication method.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The client authentication method.
     *
     * @param type the type value to set.
     * @return the AadMetadataObject object itself.
     */
    public AadMetadataObject setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the metadata property: Azure Active Directory metadata used for secured connection to cluster.
     *
     * @return the metadata value.
     */
    public AadMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Azure Active Directory metadata used for secured connection to cluster.
     *
     * @param metadata the metadata value to set.
     * @return the AadMetadataObject object itself.
     */
    public AadMetadataObject setMetadata(AadMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
}
