package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HostOptions. */
public final class HostOptions extends ExpandableStringEnum<HostOptions> {
    /** Static value http://localhost:19080/ for HostOptions. */
    public static final HostOptions HTTP_LOCALHOST19080 = fromString("http://localhost:19080/");

    /** Static value https://localhost:19080/ for HostOptions. */
    public static final HostOptions HTTPS_LOCALHOST19080 = fromString("https://localhost:19080/");

    /**
     * Creates or finds a HostOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HostOptions.
     */
    @JsonCreator
    public static HostOptions fromString(String name) {
        return fromString(name, HostOptions.class);
    }

    /**
     * Gets known HostOptions values.
     *
     * @return known HostOptions values.
     */
    public static Collection<HostOptions> values() {
        return values(HostOptions.class);
    }
}
