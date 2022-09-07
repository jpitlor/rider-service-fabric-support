package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EntityKind. */
public final class EntityKind extends ExpandableStringEnum<EntityKind> {
    /** Static value Invalid for EntityKind. */
    public static final EntityKind INVALID = fromString("Invalid");

    /** Static value Node for EntityKind. */
    public static final EntityKind NODE = fromString("Node");

    /** Static value Partition for EntityKind. */
    public static final EntityKind PARTITION = fromString("Partition");

    /** Static value Service for EntityKind. */
    public static final EntityKind SERVICE = fromString("Service");

    /** Static value Application for EntityKind. */
    public static final EntityKind APPLICATION = fromString("Application");

    /** Static value Replica for EntityKind. */
    public static final EntityKind REPLICA = fromString("Replica");

    /** Static value DeployedApplication for EntityKind. */
    public static final EntityKind DEPLOYED_APPLICATION = fromString("DeployedApplication");

    /** Static value DeployedServicePackage for EntityKind. */
    public static final EntityKind DEPLOYED_SERVICE_PACKAGE = fromString("DeployedServicePackage");

    /** Static value Cluster for EntityKind. */
    public static final EntityKind CLUSTER = fromString("Cluster");

    /**
     * Creates or finds a EntityKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityKind.
     */
    @JsonCreator
    public static EntityKind fromString(String name) {
        return fromString(name, EntityKind.class);
    }

    /**
     * Gets known EntityKind values.
     *
     * @return known EntityKind values.
     */
    public static Collection<EntityKind> values() {
        return values(EntityKind.class);
    }
}
