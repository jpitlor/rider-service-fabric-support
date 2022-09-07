package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HostIsolationMode. */
public final class HostIsolationMode extends ExpandableStringEnum<HostIsolationMode> {
    /** Static value None for HostIsolationMode. */
    public static final HostIsolationMode NONE = fromString("None");

    /** Static value Process for HostIsolationMode. */
    public static final HostIsolationMode PROCESS = fromString("Process");

    /** Static value HyperV for HostIsolationMode. */
    public static final HostIsolationMode HYPERV = fromString("HyperV");

    /**
     * Creates or finds a HostIsolationMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HostIsolationMode.
     */
    @JsonCreator
    public static HostIsolationMode fromString(String name) {
        return fromString(name, HostIsolationMode.class);
    }

    /**
     * Gets known HostIsolationMode values.
     *
     * @return known HostIsolationMode values.
     */
    public static Collection<HostIsolationMode> values() {
        return values(HostIsolationMode.class);
    }
}
