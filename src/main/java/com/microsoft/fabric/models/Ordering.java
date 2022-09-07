package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Ordering. */
public final class Ordering extends ExpandableStringEnum<Ordering> {
    /** Static value Desc for Ordering. */
    public static final Ordering DESC = fromString("Desc");

    /** Static value Asc for Ordering. */
    public static final Ordering ASC = fromString("Asc");

    /**
     * Creates or finds a Ordering from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Ordering.
     */
    @JsonCreator
    public static Ordering fromString(String name) {
        return fromString(name, Ordering.class);
    }

    /**
     * Gets known Ordering values.
     *
     * @return known Ordering values.
     */
    public static Collection<Ordering> values() {
        return values(Ordering.class);
    }
}
