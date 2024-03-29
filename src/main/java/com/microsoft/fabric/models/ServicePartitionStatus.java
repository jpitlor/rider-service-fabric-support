package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePartitionStatus. */
public final class ServicePartitionStatus extends ExpandableStringEnum<ServicePartitionStatus> {
    /** Static value Invalid for ServicePartitionStatus. */
    public static final ServicePartitionStatus INVALID = fromString("Invalid");

    /** Static value Ready for ServicePartitionStatus. */
    public static final ServicePartitionStatus READY = fromString("Ready");

    /** Static value NotReady for ServicePartitionStatus. */
    public static final ServicePartitionStatus NOT_READY = fromString("NotReady");

    /** Static value InQuorumLoss for ServicePartitionStatus. */
    public static final ServicePartitionStatus IN_QUORUM_LOSS = fromString("InQuorumLoss");

    /** Static value Reconfiguring for ServicePartitionStatus. */
    public static final ServicePartitionStatus RECONFIGURING = fromString("Reconfiguring");

    /** Static value Deleting for ServicePartitionStatus. */
    public static final ServicePartitionStatus DELETING = fromString("Deleting");

    /**
     * Creates or finds a ServicePartitionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePartitionStatus.
     */
    @JsonCreator
    public static ServicePartitionStatus fromString(String name) {
        return fromString(name, ServicePartitionStatus.class);
    }

    /**
     * Gets known ServicePartitionStatus values.
     *
     * @return known ServicePartitionStatus values.
     */
    public static Collection<ServicePartitionStatus> values() {
        return values(ServicePartitionStatus.class);
    }
}
