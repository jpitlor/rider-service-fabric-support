package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceOperationName. */
public final class ServiceOperationName extends ExpandableStringEnum<ServiceOperationName> {
    /** Static value Unknown for ServiceOperationName. */
    public static final ServiceOperationName UNKNOWN = fromString("Unknown");

    /** Static value None for ServiceOperationName. */
    public static final ServiceOperationName NONE = fromString("None");

    /** Static value Open for ServiceOperationName. */
    public static final ServiceOperationName OPEN = fromString("Open");

    /** Static value ChangeRole for ServiceOperationName. */
    public static final ServiceOperationName CHANGE_ROLE = fromString("ChangeRole");

    /** Static value Close for ServiceOperationName. */
    public static final ServiceOperationName CLOSE = fromString("Close");

    /** Static value Abort for ServiceOperationName. */
    public static final ServiceOperationName ABORT = fromString("Abort");

    /**
     * Creates or finds a ServiceOperationName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceOperationName.
     */
    @JsonCreator
    public static ServiceOperationName fromString(String name) {
        return fromString(name, ServiceOperationName.class);
    }

    /**
     * Gets known ServiceOperationName values.
     *
     * @return known ServiceOperationName values.
     */
    public static Collection<ServiceOperationName> values() {
        return values(ServiceOperationName.class);
    }
}
