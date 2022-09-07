package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProvisionApplicationTypeKind. */
public final class ProvisionApplicationTypeKind extends ExpandableStringEnum<ProvisionApplicationTypeKind> {
    /** Static value Invalid for ProvisionApplicationTypeKind. */
    public static final ProvisionApplicationTypeKind INVALID = fromString("Invalid");

    /** Static value ImageStorePath for ProvisionApplicationTypeKind. */
    public static final ProvisionApplicationTypeKind IMAGE_STORE_PATH = fromString("ImageStorePath");

    /** Static value ExternalStore for ProvisionApplicationTypeKind. */
    public static final ProvisionApplicationTypeKind EXTERNAL_STORE = fromString("ExternalStore");

    /**
     * Creates or finds a ProvisionApplicationTypeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisionApplicationTypeKind.
     */
    @JsonCreator
    public static ProvisionApplicationTypeKind fromString(String name) {
        return fromString(name, ProvisionApplicationTypeKind.class);
    }

    /**
     * Gets known ProvisionApplicationTypeKind values.
     *
     * @return known ProvisionApplicationTypeKind values.
     */
    public static Collection<ProvisionApplicationTypeKind> values() {
        return values(ProvisionApplicationTypeKind.class);
    }
}
