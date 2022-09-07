package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeactivationIntent. */
public final class DeactivationIntent extends ExpandableStringEnum<DeactivationIntent> {
    /** Static value Pause for DeactivationIntent. */
    public static final DeactivationIntent PAUSE = fromString("Pause");

    /** Static value Restart for DeactivationIntent. */
    public static final DeactivationIntent RESTART = fromString("Restart");

    /** Static value RemoveData for DeactivationIntent. */
    public static final DeactivationIntent REMOVE_DATA = fromString("RemoveData");

    /**
     * Creates or finds a DeactivationIntent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeactivationIntent.
     */
    @JsonCreator
    public static DeactivationIntent fromString(String name) {
        return fromString(name, DeactivationIntent.class);
    }

    /**
     * Gets known DeactivationIntent values.
     *
     * @return known DeactivationIntent values.
     */
    public static Collection<DeactivationIntent> values() {
        return values(DeactivationIntent.class);
    }
}
