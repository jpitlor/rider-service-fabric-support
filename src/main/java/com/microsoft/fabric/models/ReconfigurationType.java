package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReconfigurationType. */
public final class ReconfigurationType extends ExpandableStringEnum<ReconfigurationType> {
    /** Static value Unknown for ReconfigurationType. */
    public static final ReconfigurationType UNKNOWN = fromString("Unknown");

    /** Static value SwapPrimary for ReconfigurationType. */
    public static final ReconfigurationType SWAP_PRIMARY = fromString("SwapPrimary");

    /** Static value Failover for ReconfigurationType. */
    public static final ReconfigurationType FAILOVER = fromString("Failover");

    /** Static value Other for ReconfigurationType. */
    public static final ReconfigurationType OTHER = fromString("Other");

    /**
     * Creates or finds a ReconfigurationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReconfigurationType.
     */
    @JsonCreator
    public static ReconfigurationType fromString(String name) {
        return fromString(name, ReconfigurationType.class);
    }

    /**
     * Gets known ReconfigurationType values.
     *
     * @return known ReconfigurationType values.
     */
    public static Collection<ReconfigurationType> values() {
        return values(ReconfigurationType.class);
    }
}
