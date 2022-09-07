package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpgradeKind. */
public final class UpgradeKind extends ExpandableStringEnum<UpgradeKind> {
    /** Static value Invalid for UpgradeKind. */
    public static final UpgradeKind INVALID = fromString("Invalid");

    /** Static value Rolling for UpgradeKind. */
    public static final UpgradeKind ROLLING = fromString("Rolling");

    /**
     * Creates or finds a UpgradeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeKind.
     */
    @JsonCreator
    public static UpgradeKind fromString(String name) {
        return fromString(name, UpgradeKind.class);
    }

    /**
     * Gets known UpgradeKind values.
     *
     * @return known UpgradeKind values.
     */
    public static Collection<UpgradeKind> values() {
        return values(UpgradeKind.class);
    }
}
