package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceKind. */
public final class ServiceKind extends ExpandableStringEnum<ServiceKind> {
    /** Static value Invalid for ServiceKind. */
    public static final ServiceKind INVALID = fromString("Invalid");

    /** Static value Stateless for ServiceKind. */
    public static final ServiceKind STATELESS = fromString("Stateless");

    /** Static value Stateful for ServiceKind. */
    public static final ServiceKind STATEFUL = fromString("Stateful");

    /**
     * Creates or finds a ServiceKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceKind.
     */
    @JsonCreator
    public static ServiceKind fromString(String name) {
        return fromString(name, ServiceKind.class);
    }

    /**
     * Gets known ServiceKind values.
     *
     * @return known ServiceKind values.
     */
    public static Collection<ServiceKind> values() {
        return values(ServiceKind.class);
    }
}
