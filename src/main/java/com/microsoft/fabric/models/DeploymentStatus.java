package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeploymentStatus. */
public final class DeploymentStatus extends ExpandableStringEnum<DeploymentStatus> {
    /** Static value Invalid for DeploymentStatus. */
    public static final DeploymentStatus INVALID = fromString("Invalid");

    /** Static value Downloading for DeploymentStatus. */
    public static final DeploymentStatus DOWNLOADING = fromString("Downloading");

    /** Static value Activating for DeploymentStatus. */
    public static final DeploymentStatus ACTIVATING = fromString("Activating");

    /** Static value Active for DeploymentStatus. */
    public static final DeploymentStatus ACTIVE = fromString("Active");

    /** Static value Upgrading for DeploymentStatus. */
    public static final DeploymentStatus UPGRADING = fromString("Upgrading");

    /** Static value Deactivating for DeploymentStatus. */
    public static final DeploymentStatus DEACTIVATING = fromString("Deactivating");

    /** Static value RanToCompletion for DeploymentStatus. */
    public static final DeploymentStatus RAN_TO_COMPLETION = fromString("RanToCompletion");

    /** Static value Failed for DeploymentStatus. */
    public static final DeploymentStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a DeploymentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentStatus.
     */
    @JsonCreator
    public static DeploymentStatus fromString(String name) {
        return fromString(name, DeploymentStatus.class);
    }

    /**
     * Gets known DeploymentStatus values.
     *
     * @return known DeploymentStatus values.
     */
    public static Collection<DeploymentStatus> values() {
        return values(DeploymentStatus.class);
    }
}
