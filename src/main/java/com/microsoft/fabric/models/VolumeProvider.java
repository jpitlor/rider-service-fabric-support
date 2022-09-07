package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VolumeProvider. */
public final class VolumeProvider extends ExpandableStringEnum<VolumeProvider> {
    /** Static value SFAzureFile for VolumeProvider. */
    public static final VolumeProvider SFAZURE_FILE = fromString("SFAzureFile");

    /**
     * Creates or finds a VolumeProvider from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VolumeProvider.
     */
    @JsonCreator
    public static VolumeProvider fromString(String name) {
        return fromString(name, VolumeProvider.class);
    }

    /**
     * Gets known VolumeProvider values.
     *
     * @return known VolumeProvider values.
     */
    public static Collection<VolumeProvider> values() {
        return values(VolumeProvider.class);
    }
}
