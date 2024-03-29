package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HeaderMatchType. */
public final class HeaderMatchType extends ExpandableStringEnum<HeaderMatchType> {
    /** Static value exact for HeaderMatchType. */
    public static final HeaderMatchType EXACT = fromString("exact");

    /**
     * Creates or finds a HeaderMatchType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HeaderMatchType.
     */
    @JsonCreator
    public static HeaderMatchType fromString(String name) {
        return fromString(name, HeaderMatchType.class);
    }

    /**
     * Gets known HeaderMatchType values.
     *
     * @return known HeaderMatchType values.
     */
    public static Collection<HeaderMatchType> values() {
        return values(HeaderMatchType.class);
    }
}
