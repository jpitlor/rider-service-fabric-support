package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QuorumLossMode. */
public final class QuorumLossMode extends ExpandableStringEnum<QuorumLossMode> {
    /** Static value Invalid for QuorumLossMode. */
    public static final QuorumLossMode INVALID = fromString("Invalid");

    /** Static value QuorumReplicas for QuorumLossMode. */
    public static final QuorumLossMode QUORUM_REPLICAS = fromString("QuorumReplicas");

    /** Static value AllReplicas for QuorumLossMode. */
    public static final QuorumLossMode ALL_REPLICAS = fromString("AllReplicas");

    /**
     * Creates or finds a QuorumLossMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QuorumLossMode.
     */
    @JsonCreator
    public static QuorumLossMode fromString(String name) {
        return fromString(name, QuorumLossMode.class);
    }

    /**
     * Gets known QuorumLossMode values.
     *
     * @return known QuorumLossMode values.
     */
    public static Collection<QuorumLossMode> values() {
        return values(QuorumLossMode.class);
    }
}
