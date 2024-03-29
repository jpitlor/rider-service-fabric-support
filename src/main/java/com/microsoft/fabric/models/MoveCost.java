package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MoveCost. */
public final class MoveCost extends ExpandableStringEnum<MoveCost> {
    /** Static value Zero for MoveCost. */
    public static final MoveCost ZERO = fromString("Zero");

    /** Static value Low for MoveCost. */
    public static final MoveCost LOW = fromString("Low");

    /** Static value Medium for MoveCost. */
    public static final MoveCost MEDIUM = fromString("Medium");

    /** Static value High for MoveCost. */
    public static final MoveCost HIGH = fromString("High");

    /** Static value VeryHigh for MoveCost. */
    public static final MoveCost VERY_HIGH = fromString("VeryHigh");

    /**
     * Creates or finds a MoveCost from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MoveCost.
     */
    @JsonCreator
    public static MoveCost fromString(String name) {
        return fromString(name, MoveCost.class);
    }

    /**
     * Gets known MoveCost values.
     *
     * @return known MoveCost values.
     */
    public static Collection<MoveCost> values() {
        return values(MoveCost.class);
    }
}
