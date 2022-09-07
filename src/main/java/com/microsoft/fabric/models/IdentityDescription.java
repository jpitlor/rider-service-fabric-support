package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Information describing the identities associated with this application. */
@Fluent
public final class IdentityDescription {
    /*
     * the endpoint for the token service managing this identity
     */
    @JsonProperty(value = "tokenServiceEndpoint")
    private String tokenServiceEndpoint;

    /*
     * the types of identities associated with this resource; currently
     * restricted to 'SystemAssigned and UserAssigned'
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * the identifier of the tenant containing the application's identity.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * the object identifier of the Service Principal of the identity
     * associated with this resource.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * represents user assigned identities map.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, IdentityItemDescription> userAssignedIdentities;

    /**
     * Get the tokenServiceEndpoint property: the endpoint for the token service managing this identity.
     *
     * @return the tokenServiceEndpoint value.
     */
    public String getTokenServiceEndpoint() {
        return this.tokenServiceEndpoint;
    }

    /**
     * Set the tokenServiceEndpoint property: the endpoint for the token service managing this identity.
     *
     * @param tokenServiceEndpoint the tokenServiceEndpoint value to set.
     * @return the IdentityDescription object itself.
     */
    public IdentityDescription setTokenServiceEndpoint(String tokenServiceEndpoint) {
        this.tokenServiceEndpoint = tokenServiceEndpoint;
        return this;
    }

    /**
     * Get the type property: the types of identities associated with this resource; currently restricted to
     * 'SystemAssigned and UserAssigned'.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: the types of identities associated with this resource; currently restricted to
     * 'SystemAssigned and UserAssigned'.
     *
     * @param type the type value to set.
     * @return the IdentityDescription object itself.
     */
    public IdentityDescription setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the tenantId property: the identifier of the tenant containing the application's identity.
     *
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: the identifier of the tenant containing the application's identity.
     *
     * @param tenantId the tenantId value to set.
     * @return the IdentityDescription object itself.
     */
    public IdentityDescription setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the principalId property: the object identifier of the Service Principal of the identity associated with this
     * resource.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: the object identifier of the Service Principal of the identity associated with this
     * resource.
     *
     * @param principalId the principalId value to set.
     * @return the IdentityDescription object itself.
     */
    public IdentityDescription setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: represents user assigned identities map.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, IdentityItemDescription> getUserAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: represents user assigned identities map.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the IdentityDescription object itself.
     */
    public IdentityDescription setUserAssignedIdentities(Map<String, IdentityItemDescription> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }
}
