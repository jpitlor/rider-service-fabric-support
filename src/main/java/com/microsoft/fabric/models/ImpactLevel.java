package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImpactLevel. */
public final class ImpactLevel extends ExpandableStringEnum<ImpactLevel> {
    /** Static value Invalid for ImpactLevel. */
    public static final ImpactLevel INVALID = fromString("Invalid");

    /** Static value None for ImpactLevel. */
    public static final ImpactLevel NONE = fromString("None");

    /** Static value Restart for ImpactLevel. */
    public static final ImpactLevel RESTART = fromString("Restart");

    /** Static value RemoveData for ImpactLevel. */
    public static final ImpactLevel REMOVE_DATA = fromString("RemoveData");

    /** Static value RemoveNode for ImpactLevel. */
    public static final ImpactLevel REMOVE_NODE = fromString("RemoveNode");

    /**
     * Creates or finds a ImpactLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImpactLevel.
     */
    @JsonCreator
    public static ImpactLevel fromString(String name) {
        return fromString(name, ImpactLevel.class);
    }

    /**
     * Gets known ImpactLevel values.
     *
     * @return known ImpactLevel values.
     */
    public static Collection<ImpactLevel> values() {
        return values(ImpactLevel.class);
    }
}
