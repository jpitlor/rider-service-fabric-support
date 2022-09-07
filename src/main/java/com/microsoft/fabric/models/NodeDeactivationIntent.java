package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NodeDeactivationIntent. */
public final class NodeDeactivationIntent extends ExpandableStringEnum<NodeDeactivationIntent> {
    /** Static value Invalid for NodeDeactivationIntent. */
    public static final NodeDeactivationIntent INVALID = fromString("Invalid");

    /** Static value Pause for NodeDeactivationIntent. */
    public static final NodeDeactivationIntent PAUSE = fromString("Pause");

    /** Static value Restart for NodeDeactivationIntent. */
    public static final NodeDeactivationIntent RESTART = fromString("Restart");

    /** Static value RemoveData for NodeDeactivationIntent. */
    public static final NodeDeactivationIntent REMOVE_DATA = fromString("RemoveData");

    /** Static value RemoveNode for NodeDeactivationIntent. */
    public static final NodeDeactivationIntent REMOVE_NODE = fromString("RemoveNode");

    /**
     * Creates or finds a NodeDeactivationIntent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeDeactivationIntent.
     */
    @JsonCreator
    public static NodeDeactivationIntent fromString(String name) {
        return fromString(name, NodeDeactivationIntent.class);
    }

    /**
     * Gets known NodeDeactivationIntent values.
     *
     * @return known NodeDeactivationIntent values.
     */
    public static Collection<NodeDeactivationIntent> values() {
        return values(NodeDeactivationIntent.class);
    }
}
