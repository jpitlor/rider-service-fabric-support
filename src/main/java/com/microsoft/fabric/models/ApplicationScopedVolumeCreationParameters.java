package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes parameters for creating application-scoped volumes. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = ApplicationScopedVolumeCreationParameters.class)
@JsonTypeName("ApplicationScopedVolumeCreationParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "ServiceFabricVolumeDisk",
            value = ApplicationScopedVolumeCreationParametersServiceFabricVolumeDisk.class)
})
@Fluent
public class ApplicationScopedVolumeCreationParameters {
    /*
     * User readable description of the volume.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the description property: User readable description of the volume.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: User readable description of the volume.
     *
     * @param description the description value to set.
     * @return the ApplicationScopedVolumeCreationParameters object itself.
     */
    public ApplicationScopedVolumeCreationParameters setDescription(String description) {
        this.description = description;
        return this;
    }
}
