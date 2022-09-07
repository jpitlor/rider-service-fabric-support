package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NodeDeactivationTaskType. */
public final class NodeDeactivationTaskType extends ExpandableStringEnum<NodeDeactivationTaskType> {
    /** Static value Invalid for NodeDeactivationTaskType. */
    public static final NodeDeactivationTaskType INVALID = fromString("Invalid");

    /** Static value Infrastructure for NodeDeactivationTaskType. */
    public static final NodeDeactivationTaskType INFRASTRUCTURE = fromString("Infrastructure");

    /** Static value Repair for NodeDeactivationTaskType. */
    public static final NodeDeactivationTaskType REPAIR = fromString("Repair");

    /** Static value Client for NodeDeactivationTaskType. */
    public static final NodeDeactivationTaskType CLIENT = fromString("Client");

    /**
     * Creates or finds a NodeDeactivationTaskType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeDeactivationTaskType.
     */
    @JsonCreator
    public static NodeDeactivationTaskType fromString(String name) {
        return fromString(name, NodeDeactivationTaskType.class);
    }

    /**
     * Gets known NodeDeactivationTaskType values.
     *
     * @return known NodeDeactivationTaskType values.
     */
    public static Collection<NodeDeactivationTaskType> values() {
        return values(NodeDeactivationTaskType.class);
    }
}
