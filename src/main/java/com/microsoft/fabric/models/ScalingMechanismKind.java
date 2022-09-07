package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScalingMechanismKind. */
public final class ScalingMechanismKind extends ExpandableStringEnum<ScalingMechanismKind> {
    /** Static value Invalid for ScalingMechanismKind. */
    public static final ScalingMechanismKind INVALID = fromString("Invalid");

    /** Static value PartitionInstanceCount for ScalingMechanismKind. */
    public static final ScalingMechanismKind PARTITION_INSTANCE_COUNT = fromString("PartitionInstanceCount");

    /** Static value AddRemoveIncrementalNamedPartition for ScalingMechanismKind. */
    public static final ScalingMechanismKind ADD_REMOVE_INCREMENTAL_NAMED_PARTITION =
            fromString("AddRemoveIncrementalNamedPartition");

    /**
     * Creates or finds a ScalingMechanismKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScalingMechanismKind.
     */
    @JsonCreator
    public static ScalingMechanismKind fromString(String name) {
        return fromString(name, ScalingMechanismKind.class);
    }

    /**
     * Gets known ScalingMechanismKind values.
     *
     * @return known ScalingMechanismKind values.
     */
    public static Collection<ScalingMechanismKind> values() {
        return values(ScalingMechanismKind.class);
    }
}
