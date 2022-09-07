package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for State. */
public final class State extends ExpandableStringEnum<State> {
    /** Static value Invalid for State. */
    public static final State INVALID = fromString("Invalid");

    /** Static value Created for State. */
    public static final State CREATED = fromString("Created");

    /** Static value Claimed for State. */
    public static final State CLAIMED = fromString("Claimed");

    /** Static value Preparing for State. */
    public static final State PREPARING = fromString("Preparing");

    /** Static value Approved for State. */
    public static final State APPROVED = fromString("Approved");

    /** Static value Executing for State. */
    public static final State EXECUTING = fromString("Executing");

    /** Static value Restoring for State. */
    public static final State RESTORING = fromString("Restoring");

    /** Static value Completed for State. */
    public static final State COMPLETED = fromString("Completed");

    /**
     * Creates or finds a State from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding State.
     */
    @JsonCreator
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /**
     * Gets known State values.
     *
     * @return known State values.
     */
    public static Collection<State> values() {
        return values(State.class);
    }
}
