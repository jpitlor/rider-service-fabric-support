package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about a stateful Service Fabric service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServiceInfo extends ServiceInfo {
    /*
     * Whether the service has persisted state.
     */
    @JsonProperty(value = "HasPersistedState")
    private Boolean hasPersistedState;

    /**
     * Get the hasPersistedState property: Whether the service has persisted state.
     *
     * @return the hasPersistedState value.
     */
    public Boolean isHasPersistedState() {
        return this.hasPersistedState;
    }

    /**
     * Set the hasPersistedState property: Whether the service has persisted state.
     *
     * @param hasPersistedState the hasPersistedState value to set.
     * @return the StatefulServiceInfo object itself.
     */
    public StatefulServiceInfo setHasPersistedState(Boolean hasPersistedState) {
        this.hasPersistedState = hasPersistedState;
        return this;
    }
}
