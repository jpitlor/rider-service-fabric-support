package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NodeStatus. */
public final class NodeStatus extends ExpandableStringEnum<NodeStatus> {
    /** Static value Invalid for NodeStatus. */
    public static final NodeStatus INVALID = fromString("Invalid");

    /** Static value Up for NodeStatus. */
    public static final NodeStatus UP = fromString("Up");

    /** Static value Down for NodeStatus. */
    public static final NodeStatus DOWN = fromString("Down");

    /** Static value Enabling for NodeStatus. */
    public static final NodeStatus ENABLING = fromString("Enabling");

    /** Static value Disabling for NodeStatus. */
    public static final NodeStatus DISABLING = fromString("Disabling");

    /** Static value Disabled for NodeStatus. */
    public static final NodeStatus DISABLED = fromString("Disabled");

    /** Static value Unknown for NodeStatus. */
    public static final NodeStatus UNKNOWN = fromString("Unknown");

    /** Static value Removed for NodeStatus. */
    public static final NodeStatus REMOVED = fromString("Removed");

    /**
     * Creates or finds a NodeStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeStatus.
     */
    @JsonCreator
    public static NodeStatus fromString(String name) {
        return fromString(name, NodeStatus.class);
    }

    /**
     * Gets known NodeStatus values.
     *
     * @return known NodeStatus values.
     */
    public static Collection<NodeStatus> values() {
        return values(NodeStatus.class);
    }
}
