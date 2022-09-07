package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a managed application identity. */
@Fluent
public final class ManagedApplicationIdentity {
    /*
     * The name of the identity.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The identity's PrincipalId.
     */
    @JsonProperty(value = "PrincipalId")
    private String principalId;

    /**
     * Get the name property: The name of the identity.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the identity.
     *
     * @param name the name value to set.
     * @return the ManagedApplicationIdentity object itself.
     */
    public ManagedApplicationIdentity setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the principalId property: The identity's PrincipalId.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The identity's PrincipalId.
     *
     * @param principalId the principalId value to set.
     * @return the ManagedApplicationIdentity object itself.
     */
    public ManagedApplicationIdentity setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
}
