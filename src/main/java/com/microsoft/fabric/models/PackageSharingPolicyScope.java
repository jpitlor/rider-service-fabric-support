package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PackageSharingPolicyScope. */
public final class PackageSharingPolicyScope extends ExpandableStringEnum<PackageSharingPolicyScope> {
    /** Static value None for PackageSharingPolicyScope. */
    public static final PackageSharingPolicyScope NONE = fromString("None");

    /** Static value All for PackageSharingPolicyScope. */
    public static final PackageSharingPolicyScope ALL = fromString("All");

    /** Static value Code for PackageSharingPolicyScope. */
    public static final PackageSharingPolicyScope CODE = fromString("Code");

    /** Static value Config for PackageSharingPolicyScope. */
    public static final PackageSharingPolicyScope CONFIG = fromString("Config");

    /** Static value Data for PackageSharingPolicyScope. */
    public static final PackageSharingPolicyScope DATA = fromString("Data");

    /**
     * Creates or finds a PackageSharingPolicyScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PackageSharingPolicyScope.
     */
    @JsonCreator
    public static PackageSharingPolicyScope fromString(String name) {
        return fromString(name, PackageSharingPolicyScope.class);
    }

    /**
     * Gets known PackageSharingPolicyScope values.
     *
     * @return known PackageSharingPolicyScope values.
     */
    public static Collection<PackageSharingPolicyScope> values() {
        return values(PackageSharingPolicyScope.class);
    }
}
