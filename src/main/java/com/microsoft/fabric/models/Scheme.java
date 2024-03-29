package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Scheme. */
public final class Scheme extends ExpandableStringEnum<Scheme> {
    /** Static value http for Scheme. */
    public static final Scheme HTTP = fromString("http");

    /** Static value https for Scheme. */
    public static final Scheme HTTPS = fromString("https");

    /**
     * Creates or finds a Scheme from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Scheme.
     */
    @JsonCreator
    public static Scheme fromString(String name) {
        return fromString(name, Scheme.class);
    }

    /**
     * Gets known Scheme values.
     *
     * @return known Scheme values.
     */
    public static Collection<Scheme> values() {
        return values(Scheme.class);
    }
}
