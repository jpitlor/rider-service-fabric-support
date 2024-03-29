package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutoScalingMechanismKind. */
public final class AutoScalingMechanismKind extends ExpandableStringEnum<AutoScalingMechanismKind> {
    /** Static value AddRemoveReplica for AutoScalingMechanismKind. */
    public static final AutoScalingMechanismKind ADD_REMOVE_REPLICA = fromString("AddRemoveReplica");

    /**
     * Creates or finds a AutoScalingMechanismKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoScalingMechanismKind.
     */
    @JsonCreator
    public static AutoScalingMechanismKind fromString(String name) {
        return fromString(name, AutoScalingMechanismKind.class);
    }

    /**
     * Gets known AutoScalingMechanismKind values.
     *
     * @return known AutoScalingMechanismKind values.
     */
    public static Collection<AutoScalingMechanismKind> values() {
        return values(AutoScalingMechanismKind.class);
    }
}
