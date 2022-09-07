package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NodeTransitionType. */
public final class NodeTransitionType extends ExpandableStringEnum<NodeTransitionType> {
    /** Static value Invalid for NodeTransitionType. */
    public static final NodeTransitionType INVALID = fromString("Invalid");

    /** Static value Start for NodeTransitionType. */
    public static final NodeTransitionType START = fromString("Start");

    /** Static value Stop for NodeTransitionType. */
    public static final NodeTransitionType STOP = fromString("Stop");

    /**
     * Creates or finds a NodeTransitionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeTransitionType.
     */
    @JsonCreator
    public static NodeTransitionType fromString(String name) {
        return fromString(name, NodeTransitionType.class);
    }

    /**
     * Gets known NodeTransitionType values.
     *
     * @return known NodeTransitionType values.
     */
    public static Collection<NodeTransitionType> values() {
        return values(NodeTransitionType.class);
    }
}
