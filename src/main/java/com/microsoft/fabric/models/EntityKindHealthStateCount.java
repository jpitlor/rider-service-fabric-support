package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents health state count for entities of the specified entity kind. */
@Fluent
public final class EntityKindHealthStateCount {
    /*
     * The entity kind for which health states are evaluated.
     */
    @JsonProperty(value = "EntityKind")
    private EntityKind entityKind;

    /*
     * The health state count for the entities of the specified kind.
     */
    @JsonProperty(value = "HealthStateCount")
    private HealthStateCount healthStateCount;

    /**
     * Get the entityKind property: The entity kind for which health states are evaluated.
     *
     * @return the entityKind value.
     */
    public EntityKind getEntityKind() {
        return this.entityKind;
    }

    /**
     * Set the entityKind property: The entity kind for which health states are evaluated.
     *
     * @param entityKind the entityKind value to set.
     * @return the EntityKindHealthStateCount object itself.
     */
    public EntityKindHealthStateCount setEntityKind(EntityKind entityKind) {
        this.entityKind = entityKind;
        return this;
    }

    /**
     * Get the healthStateCount property: The health state count for the entities of the specified kind.
     *
     * @return the healthStateCount value.
     */
    public HealthStateCount getHealthStateCount() {
        return this.healthStateCount;
    }

    /**
     * Set the healthStateCount property: The health state count for the entities of the specified kind.
     *
     * @param healthStateCount the healthStateCount value to set.
     * @return the EntityKindHealthStateCount object itself.
     */
    public EntityKindHealthStateCount setHealthStateCount(HealthStateCount healthStateCount) {
        this.healthStateCount = healthStateCount;
        return this;
    }
}
