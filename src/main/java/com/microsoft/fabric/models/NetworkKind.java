package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkKind. */
public final class NetworkKind extends ExpandableStringEnum<NetworkKind> {
    /** Static value Local for NetworkKind. */
    public static final NetworkKind LOCAL = fromString("Local");

    /**
     * Creates or finds a NetworkKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkKind.
     */
    @JsonCreator
    public static NetworkKind fromString(String name) {
        return fromString(name, NetworkKind.class);
    }

    /**
     * Gets known NetworkKind values.
     *
     * @return known NetworkKind values.
     */
    public static Collection<NetworkKind> values() {
        return values(NetworkKind.class);
    }
}
