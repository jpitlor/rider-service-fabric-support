package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the intent or reason for deactivating the node. */
@Fluent
public final class DeactivationIntentDescription {
    /*
     * Describes the intent or reason for deactivating the node. The possible
     * values are following.
     */
    @JsonProperty(value = "DeactivationIntent")
    private DeactivationIntent deactivationIntent;

    /**
     * Get the deactivationIntent property: Describes the intent or reason for deactivating the node. The possible
     * values are following.
     *
     * @return the deactivationIntent value.
     */
    public DeactivationIntent getDeactivationIntent() {
        return this.deactivationIntent;
    }

    /**
     * Set the deactivationIntent property: Describes the intent or reason for deactivating the node. The possible
     * values are following.
     *
     * @param deactivationIntent the deactivationIntent value to set.
     * @return the DeactivationIntentDescription object itself.
     */
    public DeactivationIntentDescription setDeactivationIntent(DeactivationIntent deactivationIntent) {
        this.deactivationIntent = deactivationIntent;
        return this;
    }
}
