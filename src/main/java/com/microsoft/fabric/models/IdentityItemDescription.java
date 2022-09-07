package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a single user-assigned identity associated with the application. */
@Fluent
public final class IdentityItemDescription {
    /*
     * the object identifier of the Service Principal which this identity
     * represents.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * the client identifier of the Service Principal which this identity
     * represents.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /**
     * Get the principalId property: the object identifier of the Service Principal which this identity represents.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: the object identifier of the Service Principal which this identity represents.
     *
     * @param principalId the principalId value to set.
     * @return the IdentityItemDescription object itself.
     */
    public IdentityItemDescription setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the clientId property: the client identifier of the Service Principal which this identity represents.
     *
     * @return the clientId value.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: the client identifier of the Service Principal which this identity represents.
     *
     * @param clientId the clientId value to set.
     * @return the IdentityItemDescription object itself.
     */
    public IdentityItemDescription setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
}
