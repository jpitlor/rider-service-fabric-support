package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EnvironmentVariableType. */
public final class EnvironmentVariableType extends ExpandableStringEnum<EnvironmentVariableType> {
    /** Static value ClearText for EnvironmentVariableType. */
    public static final EnvironmentVariableType CLEAR_TEXT = fromString("ClearText");

    /** Static value KeyVaultReference for EnvironmentVariableType. */
    public static final EnvironmentVariableType KEY_VAULT_REFERENCE = fromString("KeyVaultReference");

    /** Static value SecretValueReference for EnvironmentVariableType. */
    public static final EnvironmentVariableType SECRET_VALUE_REFERENCE = fromString("SecretValueReference");

    /**
     * Creates or finds a EnvironmentVariableType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnvironmentVariableType.
     */
    @JsonCreator
    public static EnvironmentVariableType fromString(String name) {
        return fromString(name, EnvironmentVariableType.class);
    }

    /**
     * Gets known EnvironmentVariableType values.
     *
     * @return known EnvironmentVariableType values.
     */
    public static Collection<EnvironmentVariableType> values() {
        return values(EnvironmentVariableType.class);
    }
}
