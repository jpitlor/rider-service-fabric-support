package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReconfigurationPhase. */
public final class ReconfigurationPhase extends ExpandableStringEnum<ReconfigurationPhase> {
    /** Static value Unknown for ReconfigurationPhase. */
    public static final ReconfigurationPhase UNKNOWN = fromString("Unknown");

    /** Static value None for ReconfigurationPhase. */
    public static final ReconfigurationPhase NONE = fromString("None");

    /** Static value Phase0 for ReconfigurationPhase. */
    public static final ReconfigurationPhase PHASE0 = fromString("Phase0");

    /** Static value Phase1 for ReconfigurationPhase. */
    public static final ReconfigurationPhase PHASE1 = fromString("Phase1");

    /** Static value Phase2 for ReconfigurationPhase. */
    public static final ReconfigurationPhase PHASE2 = fromString("Phase2");

    /** Static value Phase3 for ReconfigurationPhase. */
    public static final ReconfigurationPhase PHASE3 = fromString("Phase3");

    /** Static value Phase4 for ReconfigurationPhase. */
    public static final ReconfigurationPhase PHASE4 = fromString("Phase4");

    /** Static value AbortPhaseZero for ReconfigurationPhase. */
    public static final ReconfigurationPhase ABORT_PHASE_ZERO = fromString("AbortPhaseZero");

    /**
     * Creates or finds a ReconfigurationPhase from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReconfigurationPhase.
     */
    @JsonCreator
    public static ReconfigurationPhase fromString(String name) {
        return fromString(name, ReconfigurationPhase.class);
    }

    /**
     * Gets known ReconfigurationPhase values.
     *
     * @return known ReconfigurationPhase values.
     */
    public static Collection<ReconfigurationPhase> values() {
        return values(ReconfigurationPhase.class);
    }
}
