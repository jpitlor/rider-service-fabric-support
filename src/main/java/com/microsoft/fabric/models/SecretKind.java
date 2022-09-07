package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecretKind. */
public final class SecretKind extends ExpandableStringEnum<SecretKind> {
    /** Static value inlinedValue for SecretKind. */
    public static final SecretKind INLINED_VALUE = fromString("inlinedValue");

    /** Static value keyVaultVersionedReference for SecretKind. */
    public static final SecretKind KEY_VAULT_VERSIONED_REFERENCE = fromString("keyVaultVersionedReference");

    /**
     * Creates or finds a SecretKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecretKind.
     */
    @JsonCreator
    public static SecretKind fromString(String name) {
        return fromString(name, SecretKind.class);
    }

    /**
     * Gets known SecretKind values.
     *
     * @return known SecretKind values.
     */
    public static Collection<SecretKind> values() {
        return values(SecretKind.class);
    }
}
