package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the policy to be used for placement of a Service Fabric service. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Type",
        defaultImpl = ServicePlacementPolicyDescription.class)
@JsonTypeName("ServicePlacementPolicyDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "InvalidDomain", value = ServicePlacementInvalidDomainPolicyDescription.class),
    @JsonSubTypes.Type(
            name = "NonPartiallyPlaceService",
            value = ServicePlacementNonPartiallyPlaceServicePolicyDescription.class),
    @JsonSubTypes.Type(
            name = "AllowMultipleStatelessInstancesOnNode",
            value = ServicePlacementAllowMultipleStatelessInstancesOnNodePolicyDescription.class),
    @JsonSubTypes.Type(
            name = "PreferPrimaryDomain",
            value = ServicePlacementPreferPrimaryDomainPolicyDescription.class),
    @JsonSubTypes.Type(name = "RequireDomain", value = ServicePlacementRequiredDomainPolicyDescription.class),
    @JsonSubTypes.Type(
            name = "RequireDomainDistribution",
            value = ServicePlacementRequireDomainDistributionPolicyDescription.class)
})
@Immutable
public class ServicePlacementPolicyDescription {}
