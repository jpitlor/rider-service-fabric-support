package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PathMatchType. */
public final class PathMatchType extends ExpandableStringEnum<PathMatchType> {
    /** Static value prefix for PathMatchType. */
    public static final PathMatchType PREFIX = fromString("prefix");

    /**
     * Creates or finds a PathMatchType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PathMatchType.
     */
    @JsonCreator
    public static PathMatchType fromString(String name) {
        return fromString(name, PathMatchType.class);
    }

    /**
     * Gets known PathMatchType values.
     *
     * @return known PathMatchType values.
     */
    public static Collection<PathMatchType> values() {
        return values(PathMatchType.class);
    }
}
