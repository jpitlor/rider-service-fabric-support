package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PropertyBatchOperationKind. */
public final class PropertyBatchOperationKind extends ExpandableStringEnum<PropertyBatchOperationKind> {
    /** Static value Invalid for PropertyBatchOperationKind. */
    public static final PropertyBatchOperationKind INVALID = fromString("Invalid");

    /** Static value Put for PropertyBatchOperationKind. */
    public static final PropertyBatchOperationKind PUT = fromString("Put");

    /** Static value Get for PropertyBatchOperationKind. */
    public static final PropertyBatchOperationKind GET = fromString("Get");

    /** Static value CheckExists for PropertyBatchOperationKind. */
    public static final PropertyBatchOperationKind CHECK_EXISTS = fromString("CheckExists");

    /** Static value CheckSequence for PropertyBatchOperationKind. */
    public static final PropertyBatchOperationKind CHECK_SEQUENCE = fromString("CheckSequence");

    /** Static value Delete for PropertyBatchOperationKind. */
    public static final PropertyBatchOperationKind DELETE = fromString("Delete");

    /** Static value CheckValue for PropertyBatchOperationKind. */
    public static final PropertyBatchOperationKind CHECK_VALUE = fromString("CheckValue");

    /**
     * Creates or finds a PropertyBatchOperationKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PropertyBatchOperationKind.
     */
    @JsonCreator
    public static PropertyBatchOperationKind fromString(String name) {
        return fromString(name, PropertyBatchOperationKind.class);
    }

    /**
     * Gets known PropertyBatchOperationKind values.
     *
     * @return known PropertyBatchOperationKind values.
     */
    public static Collection<PropertyBatchOperationKind> values() {
        return values(PropertyBatchOperationKind.class);
    }
}
