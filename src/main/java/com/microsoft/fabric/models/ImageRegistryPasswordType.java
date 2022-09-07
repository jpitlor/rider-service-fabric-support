package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImageRegistryPasswordType. */
public final class ImageRegistryPasswordType extends ExpandableStringEnum<ImageRegistryPasswordType> {
    /** Static value ClearText for ImageRegistryPasswordType. */
    public static final ImageRegistryPasswordType CLEAR_TEXT = fromString("ClearText");

    /** Static value KeyVaultReference for ImageRegistryPasswordType. */
    public static final ImageRegistryPasswordType KEY_VAULT_REFERENCE = fromString("KeyVaultReference");

    /** Static value SecretValueReference for ImageRegistryPasswordType. */
    public static final ImageRegistryPasswordType SECRET_VALUE_REFERENCE = fromString("SecretValueReference");

    /**
     * Creates or finds a ImageRegistryPasswordType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageRegistryPasswordType.
     */
    @JsonCreator
    public static ImageRegistryPasswordType fromString(String name) {
        return fromString(name, ImageRegistryPasswordType.class);
    }

    /**
     * Gets known ImageRegistryPasswordType values.
     *
     * @return known ImageRegistryPasswordType values.
     */
    public static Collection<ImageRegistryPasswordType> values() {
        return values(ImageRegistryPasswordType.class);
    }
}
