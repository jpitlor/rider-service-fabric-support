package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the policy to be used for placement of a Service Fabric service allowing multiple stateless instances of a
 * partition of the service to be placed on a node.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Type")
@JsonTypeName("AllowMultipleStatelessInstancesOnNode")
@Fluent
public final class ServicePlacementAllowMultipleStatelessInstancesOnNodePolicyDescription
        extends ServicePlacementPolicyDescription {
    /*
     * Holdover from other policy descriptions, not used for this policy,
     * values are ignored by runtime. Keeping it for any
     * backwards-compatibility with clients.
     */
    @JsonProperty(value = "DomainName")
    private String domainName;

    /**
     * Get the domainName property: Holdover from other policy descriptions, not used for this policy, values are
     * ignored by runtime. Keeping it for any backwards-compatibility with clients.
     *
     * @return the domainName value.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: Holdover from other policy descriptions, not used for this policy, values are
     * ignored by runtime. Keeping it for any backwards-compatibility with clients.
     *
     * @param domainName the domainName value to set.
     * @return the ServicePlacementAllowMultipleStatelessInstancesOnNodePolicyDescription object itself.
     */
    public ServicePlacementAllowMultipleStatelessInstancesOnNodePolicyDescription setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
}
