package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SafetyCheckKind. */
public final class SafetyCheckKind extends ExpandableStringEnum<SafetyCheckKind> {
    /** Static value Invalid for SafetyCheckKind. */
    public static final SafetyCheckKind INVALID = fromString("Invalid");

    /** Static value EnsureSeedNodeQuorum for SafetyCheckKind. */
    public static final SafetyCheckKind ENSURE_SEED_NODE_QUORUM = fromString("EnsureSeedNodeQuorum");

    /** Static value EnsurePartitionQuorum for SafetyCheckKind. */
    public static final SafetyCheckKind ENSURE_PARTITION_QUORUM = fromString("EnsurePartitionQuorum");

    /** Static value WaitForPrimaryPlacement for SafetyCheckKind. */
    public static final SafetyCheckKind WAIT_FOR_PRIMARY_PLACEMENT = fromString("WaitForPrimaryPlacement");

    /** Static value WaitForPrimarySwap for SafetyCheckKind. */
    public static final SafetyCheckKind WAIT_FOR_PRIMARY_SWAP = fromString("WaitForPrimarySwap");

    /** Static value WaitForReconfiguration for SafetyCheckKind. */
    public static final SafetyCheckKind WAIT_FOR_RECONFIGURATION = fromString("WaitForReconfiguration");

    /** Static value WaitForInbuildReplica for SafetyCheckKind. */
    public static final SafetyCheckKind WAIT_FOR_INBUILD_REPLICA = fromString("WaitForInbuildReplica");

    /** Static value EnsureAvailability for SafetyCheckKind. */
    public static final SafetyCheckKind ENSURE_AVAILABILITY = fromString("EnsureAvailability");

    /**
     * Creates or finds a SafetyCheckKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SafetyCheckKind.
     */
    @JsonCreator
    public static SafetyCheckKind fromString(String name) {
        return fromString(name, SafetyCheckKind.class);
    }

    /**
     * Gets known SafetyCheckKind values.
     *
     * @return known SafetyCheckKind values.
     */
    public static Collection<SafetyCheckKind> values() {
        return values(SafetyCheckKind.class);
    }
}
