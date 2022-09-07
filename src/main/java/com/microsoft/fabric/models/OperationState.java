package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationState. */
public final class OperationState extends ExpandableStringEnum<OperationState> {
    /** Static value Invalid for OperationState. */
    public static final OperationState INVALID = fromString("Invalid");

    /** Static value Running for OperationState. */
    public static final OperationState RUNNING = fromString("Running");

    /** Static value RollingBack for OperationState. */
    public static final OperationState ROLLING_BACK = fromString("RollingBack");

    /** Static value Completed for OperationState. */
    public static final OperationState COMPLETED = fromString("Completed");

    /** Static value Faulted for OperationState. */
    public static final OperationState FAULTED = fromString("Faulted");

    /** Static value Cancelled for OperationState. */
    public static final OperationState CANCELLED = fromString("Cancelled");

    /** Static value ForceCancelled for OperationState. */
    public static final OperationState FORCE_CANCELLED = fromString("ForceCancelled");

    /**
     * Creates or finds a OperationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationState.
     */
    @JsonCreator
    public static OperationState fromString(String name) {
        return fromString(name, OperationState.class);
    }

    /**
     * Gets known OperationState values.
     *
     * @return known OperationState values.
     */
    public static Collection<OperationState> values() {
        return values(OperationState.class);
    }
}
