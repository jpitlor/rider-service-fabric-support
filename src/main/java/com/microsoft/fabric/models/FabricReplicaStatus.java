package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FabricReplicaStatus. */
public final class FabricReplicaStatus extends ExpandableStringEnum<FabricReplicaStatus> {
    /** Static value Invalid for FabricReplicaStatus. */
    public static final FabricReplicaStatus INVALID = fromString("Invalid");

    /** Static value Down for FabricReplicaStatus. */
    public static final FabricReplicaStatus DOWN = fromString("Down");

    /** Static value Up for FabricReplicaStatus. */
    public static final FabricReplicaStatus UP = fromString("Up");

    /**
     * Creates or finds a FabricReplicaStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FabricReplicaStatus.
     */
    @JsonCreator
    public static FabricReplicaStatus fromString(String name) {
        return fromString(name, FabricReplicaStatus.class);
    }

    /**
     * Gets known FabricReplicaStatus values.
     *
     * @return known FabricReplicaStatus values.
     */
    public static Collection<FabricReplicaStatus> values() {
        return values(FabricReplicaStatus.class);
    }
}
