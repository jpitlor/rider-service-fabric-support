package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeployedApplicationStatus. */
public final class DeployedApplicationStatus extends ExpandableStringEnum<DeployedApplicationStatus> {
    /** Static value Invalid for DeployedApplicationStatus. */
    public static final DeployedApplicationStatus INVALID = fromString("Invalid");

    /** Static value Downloading for DeployedApplicationStatus. */
    public static final DeployedApplicationStatus DOWNLOADING = fromString("Downloading");

    /** Static value Activating for DeployedApplicationStatus. */
    public static final DeployedApplicationStatus ACTIVATING = fromString("Activating");

    /** Static value Active for DeployedApplicationStatus. */
    public static final DeployedApplicationStatus ACTIVE = fromString("Active");

    /** Static value Upgrading for DeployedApplicationStatus. */
    public static final DeployedApplicationStatus UPGRADING = fromString("Upgrading");

    /** Static value Deactivating for DeployedApplicationStatus. */
    public static final DeployedApplicationStatus DEACTIVATING = fromString("Deactivating");

    /**
     * Creates or finds a DeployedApplicationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeployedApplicationStatus.
     */
    @JsonCreator
    public static DeployedApplicationStatus fromString(String name) {
        return fromString(name, DeployedApplicationStatus.class);
    }

    /**
     * Gets known DeployedApplicationStatus values.
     *
     * @return known DeployedApplicationStatus values.
     */
    public static Collection<DeployedApplicationStatus> values() {
        return values(DeployedApplicationStatus.class);
    }
}
