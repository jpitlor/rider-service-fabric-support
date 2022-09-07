package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChaosStatus. */
public final class ChaosStatus extends ExpandableStringEnum<ChaosStatus> {
    /** Static value Invalid for ChaosStatus. */
    public static final ChaosStatus INVALID = fromString("Invalid");

    /** Static value Running for ChaosStatus. */
    public static final ChaosStatus RUNNING = fromString("Running");

    /** Static value Stopped for ChaosStatus. */
    public static final ChaosStatus STOPPED = fromString("Stopped");

    /**
     * Creates or finds a ChaosStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChaosStatus.
     */
    @JsonCreator
    public static ChaosStatus fromString(String name) {
        return fromString(name, ChaosStatus.class);
    }

    /**
     * Gets known ChaosStatus values.
     *
     * @return known ChaosStatus values.
     */
    public static Collection<ChaosStatus> values() {
        return values(ChaosStatus.class);
    }
}
