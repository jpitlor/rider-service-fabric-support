package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NodeStatusFilter. */
public final class NodeStatusFilter extends ExpandableStringEnum<NodeStatusFilter> {
    /** Static value default for NodeStatusFilter. */
    public static final NodeStatusFilter DEFAULT = fromString("default");

    /** Static value all for NodeStatusFilter. */
    public static final NodeStatusFilter ALL = fromString("all");

    /** Static value up for NodeStatusFilter. */
    public static final NodeStatusFilter UP = fromString("up");

    /** Static value down for NodeStatusFilter. */
    public static final NodeStatusFilter DOWN = fromString("down");

    /** Static value enabling for NodeStatusFilter. */
    public static final NodeStatusFilter ENABLING = fromString("enabling");

    /** Static value disabling for NodeStatusFilter. */
    public static final NodeStatusFilter DISABLING = fromString("disabling");

    /** Static value disabled for NodeStatusFilter. */
    public static final NodeStatusFilter DISABLED = fromString("disabled");

    /** Static value unknown for NodeStatusFilter. */
    public static final NodeStatusFilter UNKNOWN = fromString("unknown");

    /** Static value removed for NodeStatusFilter. */
    public static final NodeStatusFilter REMOVED = fromString("removed");

    /**
     * Creates or finds a NodeStatusFilter from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeStatusFilter.
     */
    @JsonCreator
    public static NodeStatusFilter fromString(String name) {
        return fromString(name, NodeStatusFilter.class);
    }

    /**
     * Gets known NodeStatusFilter values.
     *
     * @return known NodeStatusFilter values.
     */
    public static Collection<NodeStatusFilter> values() {
        return values(NodeStatusFilter.class);
    }
}
