package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the policy to be used for placement of a Service Fabric service where a particular fault or upgrade domain
 * should not be used for placement of the instances or replicas of that service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Type")
@JsonTypeName("InvalidDomain")
@Fluent
public final class ServicePlacementInvalidDomainPolicyDescription extends ServicePlacementPolicyDescription {
    /*
     * The name of the domain that should not be used for placement.
     */
    @JsonProperty(value = "DomainName")
    private String domainName;

    /**
     * Get the domainName property: The name of the domain that should not be used for placement.
     *
     * @return the domainName value.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The name of the domain that should not be used for placement.
     *
     * @param domainName the domainName value to set.
     * @return the ServicePlacementInvalidDomainPolicyDescription object itself.
     */
    public ServicePlacementInvalidDomainPolicyDescription setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
}
