package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the policy to be used for placement of a Service Fabric service where two replicas from the same partition
 * should never be placed in the same fault or upgrade domain.
 *
 * <p>While this is not common it can expose the service to an increased risk of concurrent failures due to unplanned
 * outages or other cases of subsequent/concurrent failures. As an example, consider a case where replicas are deployed
 * across different data center, with one replica per location. In the event that one of the datacenters goes offline,
 * normally the replica that was placed in that datacenter will be packed into one of the remaining datacenters. If this
 * is not desirable then this policy should be set.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Type")
@JsonTypeName("RequireDomainDistribution")
@Fluent
public final class ServicePlacementRequireDomainDistributionPolicyDescription
        extends ServicePlacementPolicyDescription {
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
     * @return the ServicePlacementRequireDomainDistributionPolicyDescription object itself.
     */
    public ServicePlacementRequireDomainDistributionPolicyDescription setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
}
