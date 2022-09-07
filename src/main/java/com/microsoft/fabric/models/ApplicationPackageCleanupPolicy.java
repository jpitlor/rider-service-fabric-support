package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationPackageCleanupPolicy. */
public final class ApplicationPackageCleanupPolicy extends ExpandableStringEnum<ApplicationPackageCleanupPolicy> {
    /** Static value Invalid for ApplicationPackageCleanupPolicy. */
    public static final ApplicationPackageCleanupPolicy INVALID = fromString("Invalid");

    /** Static value Default for ApplicationPackageCleanupPolicy. */
    public static final ApplicationPackageCleanupPolicy DEFAULT = fromString("Default");

    /** Static value Automatic for ApplicationPackageCleanupPolicy. */
    public static final ApplicationPackageCleanupPolicy AUTOMATIC = fromString("Automatic");

    /** Static value Manual for ApplicationPackageCleanupPolicy. */
    public static final ApplicationPackageCleanupPolicy MANUAL = fromString("Manual");

    /**
     * Creates or finds a ApplicationPackageCleanupPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationPackageCleanupPolicy.
     */
    @JsonCreator
    public static ApplicationPackageCleanupPolicy fromString(String name) {
        return fromString(name, ApplicationPackageCleanupPolicy.class);
    }

    /**
     * Gets known ApplicationPackageCleanupPolicy values.
     *
     * @return known ApplicationPackageCleanupPolicy values.
     */
    public static Collection<ApplicationPackageCleanupPolicy> values() {
        return values(ApplicationPackageCleanupPolicy.class);
    }
}
