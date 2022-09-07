package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a stateful service type defined in the service manifest of a provisioned application type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServiceTypeDescription extends ServiceTypeDescription {
    /*
     * A flag indicating whether this is a persistent service which stores
     * states on the local disk. If it is then the value of this property is
     * true, if not it is false.
     */
    @JsonProperty(value = "HasPersistedState")
    private Boolean hasPersistedState;

    /**
     * Get the hasPersistedState property: A flag indicating whether this is a persistent service which stores states on
     * the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @return the hasPersistedState value.
     */
    public Boolean isHasPersistedState() {
        return this.hasPersistedState;
    }

    /**
     * Set the hasPersistedState property: A flag indicating whether this is a persistent service which stores states on
     * the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @param hasPersistedState the hasPersistedState value to set.
     * @return the StatefulServiceTypeDescription object itself.
     */
    public StatefulServiceTypeDescription setHasPersistedState(Boolean hasPersistedState) {
        this.hasPersistedState = hasPersistedState;
        return this;
    }
}
