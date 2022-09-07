package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RestoreState. */
public final class RestoreState extends ExpandableStringEnum<RestoreState> {
    /** Static value Invalid for RestoreState. */
    public static final RestoreState INVALID = fromString("Invalid");

    /** Static value Accepted for RestoreState. */
    public static final RestoreState ACCEPTED = fromString("Accepted");

    /** Static value RestoreInProgress for RestoreState. */
    public static final RestoreState RESTORE_IN_PROGRESS = fromString("RestoreInProgress");

    /** Static value Success for RestoreState. */
    public static final RestoreState SUCCESS = fromString("Success");

    /** Static value Failure for RestoreState. */
    public static final RestoreState FAILURE = fromString("Failure");

    /** Static value Timeout for RestoreState. */
    public static final RestoreState TIMEOUT = fromString("Timeout");

    /**
     * Creates or finds a RestoreState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestoreState.
     */
    @JsonCreator
    public static RestoreState fromString(String name) {
        return fromString(name, RestoreState.class);
    }

    /**
     * Gets known RestoreState values.
     *
     * @return known RestoreState values.
     */
    public static Collection<RestoreState> values() {
        return values(RestoreState.class);
    }
}
