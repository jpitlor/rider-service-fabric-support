package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpgradeType. */
public final class UpgradeType extends ExpandableStringEnum<UpgradeType> {
    /** Static value Invalid for UpgradeType. */
    public static final UpgradeType INVALID = fromString("Invalid");

    /** Static value Rolling for UpgradeType. */
    public static final UpgradeType ROLLING = fromString("Rolling");

    /** Static value Rolling_ForceRestart for UpgradeType. */
    public static final UpgradeType ROLLING_FORCE_RESTART = fromString("Rolling_ForceRestart");

    /**
     * Creates or finds a UpgradeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeType.
     */
    @JsonCreator
    public static UpgradeType fromString(String name) {
        return fromString(name, UpgradeType.class);
    }

    /**
     * Gets known UpgradeType values.
     *
     * @return known UpgradeType values.
     */
    public static Collection<UpgradeType> values() {
        return values(UpgradeType.class);
    }
}
