package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Credential information to connect to container registry. */
@Fluent
public final class RegistryCredential {
    /*
     * The user name to connect to container registry.
     */
    @JsonProperty(value = "RegistryUserName")
    private String registryUserName;

    /*
     * The password for supplied username to connect to container registry.
     */
    @JsonProperty(value = "RegistryPassword")
    private String registryPassword;

    /*
     * Indicates that supplied container registry password is encrypted.
     */
    @JsonProperty(value = "PasswordEncrypted")
    private Boolean passwordEncrypted;

    /**
     * Get the registryUserName property: The user name to connect to container registry.
     *
     * @return the registryUserName value.
     */
    public String getRegistryUserName() {
        return this.registryUserName;
    }

    /**
     * Set the registryUserName property: The user name to connect to container registry.
     *
     * @param registryUserName the registryUserName value to set.
     * @return the RegistryCredential object itself.
     */
    public RegistryCredential setRegistryUserName(String registryUserName) {
        this.registryUserName = registryUserName;
        return this;
    }

    /**
     * Get the registryPassword property: The password for supplied username to connect to container registry.
     *
     * @return the registryPassword value.
     */
    public String getRegistryPassword() {
        return this.registryPassword;
    }

    /**
     * Set the registryPassword property: The password for supplied username to connect to container registry.
     *
     * @param registryPassword the registryPassword value to set.
     * @return the RegistryCredential object itself.
     */
    public RegistryCredential setRegistryPassword(String registryPassword) {
        this.registryPassword = registryPassword;
        return this;
    }

    /**
     * Get the passwordEncrypted property: Indicates that supplied container registry password is encrypted.
     *
     * @return the passwordEncrypted value.
     */
    public Boolean isPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    /**
     * Set the passwordEncrypted property: Indicates that supplied container registry password is encrypted.
     *
     * @param passwordEncrypted the passwordEncrypted value to set.
     * @return the RegistryCredential object itself.
     */
    public RegistryCredential setPasswordEncrypted(Boolean passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
        return this;
    }
}
