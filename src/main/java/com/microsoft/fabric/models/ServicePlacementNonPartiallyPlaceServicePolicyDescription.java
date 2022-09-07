package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the policy to be used for placement of a Service Fabric service where all replicas must be able to be
 * placed in order for any replicas to be created.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Type")
@JsonTypeName("NonPartiallyPlaceService")
@Immutable
public final class ServicePlacementNonPartiallyPlaceServicePolicyDescription
        extends ServicePlacementPolicyDescription {}
