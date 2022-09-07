package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationTypeStatus. */
public final class ApplicationTypeStatus extends ExpandableStringEnum<ApplicationTypeStatus> {
    /** Static value Invalid for ApplicationTypeStatus. */
    public static final ApplicationTypeStatus INVALID = fromString("Invalid");

    /** Static value Provisioning for ApplicationTypeStatus. */
    public static final ApplicationTypeStatus PROVISIONING = fromString("Provisioning");

    /** Static value Available for ApplicationTypeStatus. */
    public static final ApplicationTypeStatus AVAILABLE = fromString("Available");

    /** Static value Unprovisioning for ApplicationTypeStatus. */
    public static final ApplicationTypeStatus UNPROVISIONING = fromString("Unprovisioning");

    /** Static value Failed for ApplicationTypeStatus. */
    public static final ApplicationTypeStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ApplicationTypeStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationTypeStatus.
     */
    @JsonCreator
    public static ApplicationTypeStatus fromString(String name) {
        return fromString(name, ApplicationTypeStatus.class);
    }

    /**
     * Gets known ApplicationTypeStatus values.
     *
     * @return known ApplicationTypeStatus values.
     */
    public static Collection<ApplicationTypeStatus> values() {
        return values(ApplicationTypeStatus.class);
    }
}
