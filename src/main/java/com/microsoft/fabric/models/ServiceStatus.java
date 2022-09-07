package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceStatus. */
public final class ServiceStatus extends ExpandableStringEnum<ServiceStatus> {
    /** Static value Unknown for ServiceStatus. */
    public static final ServiceStatus UNKNOWN = fromString("Unknown");

    /** Static value Active for ServiceStatus. */
    public static final ServiceStatus ACTIVE = fromString("Active");

    /** Static value Upgrading for ServiceStatus. */
    public static final ServiceStatus UPGRADING = fromString("Upgrading");

    /** Static value Deleting for ServiceStatus. */
    public static final ServiceStatus DELETING = fromString("Deleting");

    /** Static value Creating for ServiceStatus. */
    public static final ServiceStatus CREATING = fromString("Creating");

    /** Static value Failed for ServiceStatus. */
    public static final ServiceStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ServiceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceStatus.
     */
    @JsonCreator
    public static ServiceStatus fromString(String name) {
        return fromString(name, ServiceStatus.class);
    }

    /**
     * Gets known ServiceStatus values.
     *
     * @return known ServiceStatus values.
     */
    public static Collection<ServiceStatus> values() {
        return values(ServiceStatus.class);
    }
}
