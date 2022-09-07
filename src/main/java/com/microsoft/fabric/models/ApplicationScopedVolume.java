package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a volume whose lifetime is scoped to the application's lifetime. */
@Fluent
public final class ApplicationScopedVolume extends VolumeReference {
    /*
     * Describes parameters for creating application-scoped volumes.
     */
    @JsonProperty(value = "creationParameters", required = true)
    private ApplicationScopedVolumeCreationParameters creationParameters;

    /**
     * Get the creationParameters property: Describes parameters for creating application-scoped volumes.
     *
     * @return the creationParameters value.
     */
    public ApplicationScopedVolumeCreationParameters getCreationParameters() {
        return this.creationParameters;
    }

    /**
     * Set the creationParameters property: Describes parameters for creating application-scoped volumes.
     *
     * @param creationParameters the creationParameters value to set.
     * @return the ApplicationScopedVolume object itself.
     */
    public ApplicationScopedVolume setCreationParameters(ApplicationScopedVolumeCreationParameters creationParameters) {
        this.creationParameters = creationParameters;
        return this;
    }
}
