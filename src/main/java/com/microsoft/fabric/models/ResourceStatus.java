package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceStatus. */
public final class ResourceStatus extends ExpandableStringEnum<ResourceStatus> {
    /** Static value Unknown for ResourceStatus. */
    public static final ResourceStatus UNKNOWN = fromString("Unknown");

    /** Static value Ready for ResourceStatus. */
    public static final ResourceStatus READY = fromString("Ready");

    /** Static value Upgrading for ResourceStatus. */
    public static final ResourceStatus UPGRADING = fromString("Upgrading");

    /** Static value Creating for ResourceStatus. */
    public static final ResourceStatus CREATING = fromString("Creating");

    /** Static value Deleting for ResourceStatus. */
    public static final ResourceStatus DELETING = fromString("Deleting");

    /** Static value Failed for ResourceStatus. */
    public static final ResourceStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ResourceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceStatus.
     */
    @JsonCreator
    public static ResourceStatus fromString(String name) {
        return fromString(name, ResourceStatus.class);
    }

    /**
     * Gets known ResourceStatus values.
     *
     * @return known ResourceStatus values.
     */
    public static Collection<ResourceStatus> values() {
        return values(ResourceStatus.class);
    }
}
