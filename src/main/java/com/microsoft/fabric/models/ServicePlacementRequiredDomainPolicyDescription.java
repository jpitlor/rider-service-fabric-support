package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the policy to be used for placement of a Service Fabric service where the instances or replicas of that
 * service must be placed in a particular domain.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Type")
@JsonTypeName("RequireDomain")
@Fluent
public final class ServicePlacementRequiredDomainPolicyDescription extends ServicePlacementPolicyDescription {
    /*
     * The name of the domain that should used for placement as per this
     * policy.
     */
    @JsonProperty(value = "DomainName")
    private String domainName;

    /**
     * Get the domainName property: The name of the domain that should used for placement as per this policy.
     *
     * @return the domainName value.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The name of the domain that should used for placement as per this policy.
     *
     * @param domainName the domainName value to set.
     * @return the ServicePlacementRequiredDomainPolicyDescription object itself.
     */
    public ServicePlacementRequiredDomainPolicyDescription setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
}
