package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReplicaKind. */
public final class ReplicaKind extends ExpandableStringEnum<ReplicaKind> {
    /** Static value Invalid for ReplicaKind. */
    public static final ReplicaKind INVALID = fromString("Invalid");

    /** Static value KeyValueStore for ReplicaKind. */
    public static final ReplicaKind KEY_VALUE_STORE = fromString("KeyValueStore");

    /**
     * Creates or finds a ReplicaKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicaKind.
     */
    @JsonCreator
    public static ReplicaKind fromString(String name) {
        return fromString(name, ReplicaKind.class);
    }

    /**
     * Gets known ReplicaKind values.
     *
     * @return known ReplicaKind values.
     */
    public static Collection<ReplicaKind> values() {
        return values(ReplicaKind.class);
    }
}
