package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedIdentityType. */
public final class ManagedIdentityType extends ExpandableStringEnum<ManagedIdentityType> {
    /** Static value Invalid for ManagedIdentityType. */
    public static final ManagedIdentityType INVALID = fromString("Invalid");

    /** Static value VMSS for ManagedIdentityType. */
    public static final ManagedIdentityType VMSS = fromString("VMSS");

    /** Static value Cluster for ManagedIdentityType. */
    public static final ManagedIdentityType CLUSTER = fromString("Cluster");

    /**
     * Creates or finds a ManagedIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedIdentityType.
     */
    @JsonCreator
    public static ManagedIdentityType fromString(String name) {
        return fromString(name, ManagedIdentityType.class);
    }

    /**
     * Gets known ManagedIdentityType values.
     *
     * @return known ManagedIdentityType values.
     */
    public static Collection<ManagedIdentityType> values() {
        return values(ManagedIdentityType.class);
    }
}
