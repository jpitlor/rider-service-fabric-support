package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EntryPointStatus. */
public final class EntryPointStatus extends ExpandableStringEnum<EntryPointStatus> {
    /** Static value Invalid for EntryPointStatus. */
    public static final EntryPointStatus INVALID = fromString("Invalid");

    /** Static value Pending for EntryPointStatus. */
    public static final EntryPointStatus PENDING = fromString("Pending");

    /** Static value Starting for EntryPointStatus. */
    public static final EntryPointStatus STARTING = fromString("Starting");

    /** Static value Started for EntryPointStatus. */
    public static final EntryPointStatus STARTED = fromString("Started");

    /** Static value Stopping for EntryPointStatus. */
    public static final EntryPointStatus STOPPING = fromString("Stopping");

    /** Static value Stopped for EntryPointStatus. */
    public static final EntryPointStatus STOPPED = fromString("Stopped");

    /**
     * Creates or finds a EntryPointStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntryPointStatus.
     */
    @JsonCreator
    public static EntryPointStatus fromString(String name) {
        return fromString(name, EntryPointStatus.class);
    }

    /**
     * Gets known EntryPointStatus values.
     *
     * @return known EntryPointStatus values.
     */
    public static Collection<EntryPointStatus> values() {
        return values(EntryPointStatus.class);
    }
}
