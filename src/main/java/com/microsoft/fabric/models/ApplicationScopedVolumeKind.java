package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationScopedVolumeKind. */
public final class ApplicationScopedVolumeKind extends ExpandableStringEnum<ApplicationScopedVolumeKind> {
    /** Static value ServiceFabricVolumeDisk for ApplicationScopedVolumeKind. */
    public static final ApplicationScopedVolumeKind SERVICE_FABRIC_VOLUME_DISK = fromString("ServiceFabricVolumeDisk");

    /**
     * Creates or finds a ApplicationScopedVolumeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationScopedVolumeKind.
     */
    @JsonCreator
    public static ApplicationScopedVolumeKind fromString(String name) {
        return fromString(name, ApplicationScopedVolumeKind.class);
    }

    /**
     * Gets known ApplicationScopedVolumeKind values.
     *
     * @return known ApplicationScopedVolumeKind values.
     */
    public static Collection<ApplicationScopedVolumeKind> values() {
        return values(ApplicationScopedVolumeKind.class);
    }
}
