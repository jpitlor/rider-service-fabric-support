package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePartitionKind. */
public final class ServicePartitionKind extends ExpandableStringEnum<ServicePartitionKind> {
    /** Static value Invalid for ServicePartitionKind. */
    public static final ServicePartitionKind INVALID = fromString("Invalid");

    /** Static value Singleton for ServicePartitionKind. */
    public static final ServicePartitionKind SINGLETON = fromString("Singleton");

    /** Static value Int64Range for ServicePartitionKind. */
    public static final ServicePartitionKind INT64RANGE = fromString("Int64Range");

    /** Static value Named for ServicePartitionKind. */
    public static final ServicePartitionKind NAMED = fromString("Named");

    /**
     * Creates or finds a ServicePartitionKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePartitionKind.
     */
    @JsonCreator
    public static ServicePartitionKind fromString(String name) {
        return fromString(name, ServicePartitionKind.class);
    }

    /**
     * Gets known ServicePartitionKind values.
     *
     * @return known ServicePartitionKind values.
     */
    public static Collection<ServicePartitionKind> values() {
        return values(ServicePartitionKind.class);
    }
}
