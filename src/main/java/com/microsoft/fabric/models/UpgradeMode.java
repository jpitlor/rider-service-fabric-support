package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpgradeMode. */
public final class UpgradeMode extends ExpandableStringEnum<UpgradeMode> {
    /** Static value Invalid for UpgradeMode. */
    public static final UpgradeMode INVALID = fromString("Invalid");

    /** Static value UnmonitoredAuto for UpgradeMode. */
    public static final UpgradeMode UNMONITORED_AUTO = fromString("UnmonitoredAuto");

    /** Static value UnmonitoredManual for UpgradeMode. */
    public static final UpgradeMode UNMONITORED_MANUAL = fromString("UnmonitoredManual");

    /** Static value Monitored for UpgradeMode. */
    public static final UpgradeMode MONITORED = fromString("Monitored");

    /** Static value UnmonitoredDeferred for UpgradeMode. */
    public static final UpgradeMode UNMONITORED_DEFERRED = fromString("UnmonitoredDeferred");

    /**
     * Creates or finds a UpgradeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeMode.
     */
    @JsonCreator
    public static UpgradeMode fromString(String name) {
        return fromString(name, UpgradeMode.class);
    }

    /**
     * Gets known UpgradeMode values.
     *
     * @return known UpgradeMode values.
     */
    public static Collection<UpgradeMode> values() {
        return values(UpgradeMode.class);
    }
}
