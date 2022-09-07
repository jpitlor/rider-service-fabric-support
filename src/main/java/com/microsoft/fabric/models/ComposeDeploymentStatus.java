package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ComposeDeploymentStatus. */
public final class ComposeDeploymentStatus extends ExpandableStringEnum<ComposeDeploymentStatus> {
    /** Static value Invalid for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus INVALID = fromString("Invalid");

    /** Static value Provisioning for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus PROVISIONING = fromString("Provisioning");

    /** Static value Creating for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus CREATING = fromString("Creating");

    /** Static value Ready for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus READY = fromString("Ready");

    /** Static value Unprovisioning for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus UNPROVISIONING = fromString("Unprovisioning");

    /** Static value Deleting for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus DELETING = fromString("Deleting");

    /** Static value Failed for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus FAILED = fromString("Failed");

    /** Static value Upgrading for ComposeDeploymentStatus. */
    public static final ComposeDeploymentStatus UPGRADING = fromString("Upgrading");

    /**
     * Creates or finds a ComposeDeploymentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ComposeDeploymentStatus.
     */
    @JsonCreator
    public static ComposeDeploymentStatus fromString(String name) {
        return fromString(name, ComposeDeploymentStatus.class);
    }

    /**
     * Gets known ComposeDeploymentStatus values.
     *
     * @return known ComposeDeploymentStatus values.
     */
    public static Collection<ComposeDeploymentStatus> values() {
        return values(ComposeDeploymentStatus.class);
    }
}
