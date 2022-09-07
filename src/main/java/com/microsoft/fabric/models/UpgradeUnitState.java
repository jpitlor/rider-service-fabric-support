package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpgradeUnitState. */
public final class UpgradeUnitState extends ExpandableStringEnum<UpgradeUnitState> {
    /** Static value Invalid for UpgradeUnitState. */
    public static final UpgradeUnitState INVALID = fromString("Invalid");

    /** Static value Pending for UpgradeUnitState. */
    public static final UpgradeUnitState PENDING = fromString("Pending");

    /** Static value InProgress for UpgradeUnitState. */
    public static final UpgradeUnitState IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for UpgradeUnitState. */
    public static final UpgradeUnitState COMPLETED = fromString("Completed");

    /** Static value Failed for UpgradeUnitState. */
    public static final UpgradeUnitState FAILED = fromString("Failed");

    /**
     * Creates or finds a UpgradeUnitState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeUnitState.
     */
    @JsonCreator
    public static UpgradeUnitState fromString(String name) {
        return fromString(name, UpgradeUnitState.class);
    }

    /**
     * Gets known UpgradeUnitState values.
     *
     * @return known UpgradeUnitState values.
     */
    public static Collection<UpgradeUnitState> values() {
        return values(UpgradeUnitState.class);
    }
}
