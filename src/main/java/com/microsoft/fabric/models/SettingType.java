package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SettingType. */
public final class SettingType extends ExpandableStringEnum<SettingType> {
    /** Static value ClearText for SettingType. */
    public static final SettingType CLEAR_TEXT = fromString("ClearText");

    /** Static value KeyVaultReference for SettingType. */
    public static final SettingType KEY_VAULT_REFERENCE = fromString("KeyVaultReference");

    /** Static value SecretValueReference for SettingType. */
    public static final SettingType SECRET_VALUE_REFERENCE = fromString("SecretValueReference");

    /**
     * Creates or finds a SettingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SettingType.
     */
    @JsonCreator
    public static SettingType fromString(String name) {
        return fromString(name, SettingType.class);
    }

    /**
     * Gets known SettingType values.
     *
     * @return known SettingType values.
     */
    public static Collection<SettingType> values() {
        return values(SettingType.class);
    }
}
