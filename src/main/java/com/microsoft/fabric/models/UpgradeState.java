package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpgradeState. */
public final class UpgradeState extends ExpandableStringEnum<UpgradeState> {
    /** Static value Invalid for UpgradeState. */
    public static final UpgradeState INVALID = fromString("Invalid");

    /** Static value RollingBackInProgress for UpgradeState. */
    public static final UpgradeState ROLLING_BACK_IN_PROGRESS = fromString("RollingBackInProgress");

    /** Static value RollingBackCompleted for UpgradeState. */
    public static final UpgradeState ROLLING_BACK_COMPLETED = fromString("RollingBackCompleted");

    /** Static value RollingForwardPending for UpgradeState. */
    public static final UpgradeState ROLLING_FORWARD_PENDING = fromString("RollingForwardPending");

    /** Static value RollingForwardInProgress for UpgradeState. */
    public static final UpgradeState ROLLING_FORWARD_IN_PROGRESS = fromString("RollingForwardInProgress");

    /** Static value RollingForwardCompleted for UpgradeState. */
    public static final UpgradeState ROLLING_FORWARD_COMPLETED = fromString("RollingForwardCompleted");

    /** Static value Failed for UpgradeState. */
    public static final UpgradeState FAILED = fromString("Failed");

    /**
     * Creates or finds a UpgradeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeState.
     */
    @JsonCreator
    public static UpgradeState fromString(String name) {
        return fromString(name, UpgradeState.class);
    }

    /**
     * Gets known UpgradeState values.
     *
     * @return known UpgradeState values.
     */
    public static Collection<UpgradeState> values() {
        return values(UpgradeState.class);
    }
}
