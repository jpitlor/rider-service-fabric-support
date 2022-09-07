package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HostType. */
public final class HostType extends ExpandableStringEnum<HostType> {
    /** Static value Invalid for HostType. */
    public static final HostType INVALID = fromString("Invalid");

    /** Static value ExeHost for HostType. */
    public static final HostType EXE_HOST = fromString("ExeHost");

    /** Static value ContainerHost for HostType. */
    public static final HostType CONTAINER_HOST = fromString("ContainerHost");

    /**
     * Creates or finds a HostType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HostType.
     */
    @JsonCreator
    public static HostType fromString(String name) {
        return fromString(name, HostType.class);
    }

    /**
     * Gets known HostType values.
     *
     * @return known HostType values.
     */
    public static Collection<HostType> values() {
        return values(HostType.class);
    }
}
