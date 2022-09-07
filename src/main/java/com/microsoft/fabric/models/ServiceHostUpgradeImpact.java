package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceHostUpgradeImpact. */
public final class ServiceHostUpgradeImpact extends ExpandableStringEnum<ServiceHostUpgradeImpact> {
    /** Static value Invalid for ServiceHostUpgradeImpact. */
    public static final ServiceHostUpgradeImpact INVALID = fromString("Invalid");

    /** Static value None for ServiceHostUpgradeImpact. */
    public static final ServiceHostUpgradeImpact NONE = fromString("None");

    /** Static value ServiceHostRestart for ServiceHostUpgradeImpact. */
    public static final ServiceHostUpgradeImpact SERVICE_HOST_RESTART = fromString("ServiceHostRestart");

    /** Static value UnexpectedServiceHostRestart for ServiceHostUpgradeImpact. */
    public static final ServiceHostUpgradeImpact UNEXPECTED_SERVICE_HOST_RESTART =
            fromString("UnexpectedServiceHostRestart");

    /**
     * Creates or finds a ServiceHostUpgradeImpact from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceHostUpgradeImpact.
     */
    @JsonCreator
    public static ServiceHostUpgradeImpact fromString(String name) {
        return fromString(name, ServiceHostUpgradeImpact.class);
    }

    /**
     * Gets known ServiceHostUpgradeImpact values.
     *
     * @return known ServiceHostUpgradeImpact values.
     */
    public static Collection<ServiceHostUpgradeImpact> values() {
        return values(ServiceHostUpgradeImpact.class);
    }
}
