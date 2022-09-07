package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Image registry credential. */
@Fluent
public final class ImageRegistryCredential {
    /*
     * Docker image registry server, without protocol such as `http` and
     * `https`.
     */
    @JsonProperty(value = "server", required = true)
    private String server;

    /*
     * The username for the private registry.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * The type of the image registry password being given in password
     */
    @JsonProperty(value = "passwordType")
    private ImageRegistryPasswordType passwordType;

    /*
     * The password for the private registry. The password is required for
     * create or update operations, however it is not returned in the get or
     * list operations. Will be processed based on the type provided.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the server property: Docker image registry server, without protocol such as `http` and `https`.
     *
     * @return the server value.
     */
    public String getServer() {
        return this.server;
    }

    /**
     * Set the server property: Docker image registry server, without protocol such as `http` and `https`.
     *
     * @param server the server value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential setServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username property: The username for the private registry.
     *
     * @return the username value.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The username for the private registry.
     *
     * @param username the username value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the passwordType property: The type of the image registry password being given in password.
     *
     * @return the passwordType value.
     */
    public ImageRegistryPasswordType getPasswordType() {
        return this.passwordType;
    }

    /**
     * Set the passwordType property: The type of the image registry password being given in password.
     *
     * @param passwordType the passwordType value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential setPasswordType(ImageRegistryPasswordType passwordType) {
        this.passwordType = passwordType;
        return this;
    }

    /**
     * Get the password property: The password for the private registry. The password is required for create or update
     * operations, however it is not returned in the get or list operations. Will be processed based on the type
     * provided.
     *
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password for the private registry. The password is required for create or update
     * operations, however it is not returned in the get or list operations. Will be processed based on the type
     * provided.
     *
     * @param password the password value to set.
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential setPassword(String password) {
        this.password = password;
        return this;
    }
}
