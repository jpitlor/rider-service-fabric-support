package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FailureReason. */
public final class FailureReason extends ExpandableStringEnum<FailureReason> {
    /** Static value None for FailureReason. */
    public static final FailureReason NONE = fromString("None");

    /** Static value Interrupted for FailureReason. */
    public static final FailureReason INTERRUPTED = fromString("Interrupted");

    /** Static value HealthCheck for FailureReason. */
    public static final FailureReason HEALTH_CHECK = fromString("HealthCheck");

    /** Static value UpgradeDomainTimeout for FailureReason. */
    public static final FailureReason UPGRADE_DOMAIN_TIMEOUT = fromString("UpgradeDomainTimeout");

    /** Static value OverallUpgradeTimeout for FailureReason. */
    public static final FailureReason OVERALL_UPGRADE_TIMEOUT = fromString("OverallUpgradeTimeout");

    /**
     * Creates or finds a FailureReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FailureReason.
     */
    @JsonCreator
    public static FailureReason fromString(String name) {
        return fromString(name, FailureReason.class);
    }

    /**
     * Gets known FailureReason values.
     *
     * @return known FailureReason values.
     */
    public static Collection<FailureReason> values() {
        return values(FailureReason.class);
    }
}
