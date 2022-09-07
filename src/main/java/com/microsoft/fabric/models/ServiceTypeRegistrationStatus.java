package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceTypeRegistrationStatus. */
public final class ServiceTypeRegistrationStatus extends ExpandableStringEnum<ServiceTypeRegistrationStatus> {
    /** Static value Invalid for ServiceTypeRegistrationStatus. */
    public static final ServiceTypeRegistrationStatus INVALID = fromString("Invalid");

    /** Static value Disabled for ServiceTypeRegistrationStatus. */
    public static final ServiceTypeRegistrationStatus DISABLED = fromString("Disabled");

    /** Static value Enabled for ServiceTypeRegistrationStatus. */
    public static final ServiceTypeRegistrationStatus ENABLED = fromString("Enabled");

    /** Static value Registered for ServiceTypeRegistrationStatus. */
    public static final ServiceTypeRegistrationStatus REGISTERED = fromString("Registered");

    /**
     * Creates or finds a ServiceTypeRegistrationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceTypeRegistrationStatus.
     */
    @JsonCreator
    public static ServiceTypeRegistrationStatus fromString(String name) {
        return fromString(name, ServiceTypeRegistrationStatus.class);
    }

    /**
     * Gets known ServiceTypeRegistrationStatus values.
     *
     * @return known ServiceTypeRegistrationStatus values.
     */
    public static Collection<ServiceTypeRegistrationStatus> values() {
        return values(ServiceTypeRegistrationStatus.class);
    }
}
