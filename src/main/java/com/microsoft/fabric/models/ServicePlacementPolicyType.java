package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePlacementPolicyType. */
public final class ServicePlacementPolicyType extends ExpandableStringEnum<ServicePlacementPolicyType> {
    /** Static value Invalid for ServicePlacementPolicyType. */
    public static final ServicePlacementPolicyType INVALID = fromString("Invalid");

    /** Static value InvalidDomain for ServicePlacementPolicyType. */
    public static final ServicePlacementPolicyType INVALID_DOMAIN = fromString("InvalidDomain");

    /** Static value RequireDomain for ServicePlacementPolicyType. */
    public static final ServicePlacementPolicyType REQUIRE_DOMAIN = fromString("RequireDomain");

    /** Static value PreferPrimaryDomain for ServicePlacementPolicyType. */
    public static final ServicePlacementPolicyType PREFER_PRIMARY_DOMAIN = fromString("PreferPrimaryDomain");

    /** Static value RequireDomainDistribution for ServicePlacementPolicyType. */
    public static final ServicePlacementPolicyType REQUIRE_DOMAIN_DISTRIBUTION =
            fromString("RequireDomainDistribution");

    /** Static value NonPartiallyPlaceService for ServicePlacementPolicyType. */
    public static final ServicePlacementPolicyType NON_PARTIALLY_PLACE_SERVICE = fromString("NonPartiallyPlaceService");

    /** Static value AllowMultipleStatelessInstancesOnNode for ServicePlacementPolicyType. */
    public static final ServicePlacementPolicyType ALLOW_MULTIPLE_STATELESS_INSTANCES_ON_NODE =
            fromString("AllowMultipleStatelessInstancesOnNode");

    /**
     * Creates or finds a ServicePlacementPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePlacementPolicyType.
     */
    @JsonCreator
    public static ServicePlacementPolicyType fromString(String name) {
        return fromString(name, ServicePlacementPolicyType.class);
    }

    /**
     * Gets known ServicePlacementPolicyType values.
     *
     * @return known ServicePlacementPolicyType values.
     */
    public static Collection<ServicePlacementPolicyType> values() {
        return values(ServicePlacementPolicyType.class);
    }
}
