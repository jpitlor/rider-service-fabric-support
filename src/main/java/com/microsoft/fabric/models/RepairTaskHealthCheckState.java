package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RepairTaskHealthCheckState. */
public final class RepairTaskHealthCheckState extends ExpandableStringEnum<RepairTaskHealthCheckState> {
    /** Static value NotStarted for RepairTaskHealthCheckState. */
    public static final RepairTaskHealthCheckState NOT_STARTED = fromString("NotStarted");

    /** Static value InProgress for RepairTaskHealthCheckState. */
    public static final RepairTaskHealthCheckState IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for RepairTaskHealthCheckState. */
    public static final RepairTaskHealthCheckState SUCCEEDED = fromString("Succeeded");

    /** Static value Skipped for RepairTaskHealthCheckState. */
    public static final RepairTaskHealthCheckState SKIPPED = fromString("Skipped");

    /** Static value TimedOut for RepairTaskHealthCheckState. */
    public static final RepairTaskHealthCheckState TIMED_OUT = fromString("TimedOut");

    /**
     * Creates or finds a RepairTaskHealthCheckState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RepairTaskHealthCheckState.
     */
    @JsonCreator
    public static RepairTaskHealthCheckState fromString(String name) {
        return fromString(name, RepairTaskHealthCheckState.class);
    }

    /**
     * Gets known RepairTaskHealthCheckState values.
     *
     * @return known RepairTaskHealthCheckState values.
     */
    public static Collection<RepairTaskHealthCheckState> values() {
        return values(RepairTaskHealthCheckState.class);
    }
}
