package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceEndpointRole. */
public final class ServiceEndpointRole extends ExpandableStringEnum<ServiceEndpointRole> {
    /** Static value Invalid for ServiceEndpointRole. */
    public static final ServiceEndpointRole INVALID = fromString("Invalid");

    /** Static value Stateless for ServiceEndpointRole. */
    public static final ServiceEndpointRole STATELESS = fromString("Stateless");

    /** Static value StatefulPrimary for ServiceEndpointRole. */
    public static final ServiceEndpointRole STATEFUL_PRIMARY = fromString("StatefulPrimary");

    /** Static value StatefulSecondary for ServiceEndpointRole. */
    public static final ServiceEndpointRole STATEFUL_SECONDARY = fromString("StatefulSecondary");

    /**
     * Creates or finds a ServiceEndpointRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceEndpointRole.
     */
    @JsonCreator
    public static ServiceEndpointRole fromString(String name) {
        return fromString(name, ServiceEndpointRole.class);
    }

    /**
     * Gets known ServiceEndpointRole values.
     *
     * @return known ServiceEndpointRole values.
     */
    public static Collection<ServiceEndpointRole> values() {
        return values(ServiceEndpointRole.class);
    }
}
