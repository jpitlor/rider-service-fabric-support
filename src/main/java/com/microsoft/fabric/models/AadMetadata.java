package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Active Directory metadata used for secured connection to cluster. */
@Fluent
public final class AadMetadata {
    /*
     * The AAD authority url.
     */
    @JsonProperty(value = "authority")
    private String authority;

    /*
     * The AAD client application Id.
     */
    @JsonProperty(value = "client")
    private String client;

    /*
     * The AAD cluster application Id.
     */
    @JsonProperty(value = "cluster")
    private String cluster;

    /*
     * The AAD login url.
     */
    @JsonProperty(value = "login")
    private String login;

    /*
     * The client application redirect address.
     */
    @JsonProperty(value = "redirect")
    private String redirect;

    /*
     * The AAD tenant Id.
     */
    @JsonProperty(value = "tenant")
    private String tenant;

    /**
     * Get the authority property: The AAD authority url.
     *
     * @return the authority value.
     */
    public String getAuthority() {
        return this.authority;
    }

    /**
     * Set the authority property: The AAD authority url.
     *
     * @param authority the authority value to set.
     * @return the AadMetadata object itself.
     */
    public AadMetadata setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Get the client property: The AAD client application Id.
     *
     * @return the client value.
     */
    public String getClient() {
        return this.client;
    }

    /**
     * Set the client property: The AAD client application Id.
     *
     * @param client the client value to set.
     * @return the AadMetadata object itself.
     */
    public AadMetadata setClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * Get the cluster property: The AAD cluster application Id.
     *
     * @return the cluster value.
     */
    public String getCluster() {
        return this.cluster;
    }

    /**
     * Set the cluster property: The AAD cluster application Id.
     *
     * @param cluster the cluster value to set.
     * @return the AadMetadata object itself.
     */
    public AadMetadata setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get the login property: The AAD login url.
     *
     * @return the login value.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Set the login property: The AAD login url.
     *
     * @param login the login value to set.
     * @return the AadMetadata object itself.
     */
    public AadMetadata setLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the redirect property: The client application redirect address.
     *
     * @return the redirect value.
     */
    public String getRedirect() {
        return this.redirect;
    }

    /**
     * Set the redirect property: The client application redirect address.
     *
     * @param redirect the redirect value to set.
     * @return the AadMetadata object itself.
     */
    public AadMetadata setRedirect(String redirect) {
        this.redirect = redirect;
        return this;
    }

    /**
     * Get the tenant property: The AAD tenant Id.
     *
     * @return the tenant value.
     */
    public String getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The AAD tenant Id.
     *
     * @param tenant the tenant value to set.
     * @return the AadMetadata object itself.
     */
    public AadMetadata setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
}
