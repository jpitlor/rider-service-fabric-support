package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type represents the unencrypted value of the secret. */
@Fluent
public final class SecretValue {
    /*
     * The actual value of the secret.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: The actual value of the secret.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The actual value of the secret.
     *
     * @param value the value value to set.
     * @return the SecretValue object itself.
     */
    public SecretValue setValue(String value) {
        this.value = value;
        return this;
    }
}
