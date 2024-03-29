package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SizeTypes. */
public final class SizeTypes extends ExpandableStringEnum<SizeTypes> {
    /** Static value Small for SizeTypes. */
    public static final SizeTypes SMALL = fromString("Small");

    /** Static value Medium for SizeTypes. */
    public static final SizeTypes MEDIUM = fromString("Medium");

    /** Static value Large for SizeTypes. */
    public static final SizeTypes LARGE = fromString("Large");

    /**
     * Creates or finds a SizeTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SizeTypes.
     */
    @JsonCreator
    public static SizeTypes fromString(String name) {
        return fromString(name, SizeTypes.class);
    }

    /**
     * Gets known SizeTypes values.
     *
     * @return known SizeTypes values.
     */
    public static Collection<SizeTypes> values() {
        return values(SizeTypes.class);
    }
}
