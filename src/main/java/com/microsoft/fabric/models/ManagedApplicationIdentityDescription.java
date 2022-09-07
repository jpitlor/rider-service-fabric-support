package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Managed application identity description. */
@Fluent
public final class ManagedApplicationIdentityDescription {
    /*
     * Token service endpoint.
     */
    @JsonProperty(value = "TokenServiceEndpoint")
    private String tokenServiceEndpoint;

    /*
     * A list of managed application identity objects.
     */
    @JsonProperty(value = "ManagedIdentities")
    private List<ManagedApplicationIdentity> managedIdentities;

    /**
     * Get the tokenServiceEndpoint property: Token service endpoint.
     *
     * @return the tokenServiceEndpoint value.
     */
    public String getTokenServiceEndpoint() {
        return this.tokenServiceEndpoint;
    }

    /**
     * Set the tokenServiceEndpoint property: Token service endpoint.
     *
     * @param tokenServiceEndpoint the tokenServiceEndpoint value to set.
     * @return the ManagedApplicationIdentityDescription object itself.
     */
    public ManagedApplicationIdentityDescription setTokenServiceEndpoint(String tokenServiceEndpoint) {
        this.tokenServiceEndpoint = tokenServiceEndpoint;
        return this;
    }

    /**
     * Get the managedIdentities property: A list of managed application identity objects.
     *
     * @return the managedIdentities value.
     */
    public List<ManagedApplicationIdentity> getManagedIdentities() {
        return this.managedIdentities;
    }

    /**
     * Set the managedIdentities property: A list of managed application identity objects.
     *
     * @param managedIdentities the managedIdentities value to set.
     * @return the ManagedApplicationIdentityDescription object itself.
     */
    public ManagedApplicationIdentityDescription setManagedIdentities(
            List<ManagedApplicationIdentity> managedIdentities) {
        this.managedIdentities = managedIdentities;
        return this;
    }
}
