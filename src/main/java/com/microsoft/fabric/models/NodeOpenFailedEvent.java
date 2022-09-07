package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Node Open Failed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeOpenFailed")
@Fluent
public final class NodeOpenFailedEvent extends NodeEvent {
    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /*
     * Id of Node.
     */
    @JsonProperty(value = "NodeId", required = true)
    private String nodeId;

    /*
     * Upgrade domain of Node.
     */
    @JsonProperty(value = "UpgradeDomain", required = true)
    private String upgradeDomain;

    /*
     * Fault domain of Node.
     */
    @JsonProperty(value = "FaultDomain", required = true)
    private String faultDomain;

    /*
     * IP address or FQDN.
     */
    @JsonProperty(value = "IpAddressOrFQDN", required = true)
    private String ipAddressOrFqdn;

    /*
     * Name of Host.
     */
    @JsonProperty(value = "Hostname", required = true)
    private String hostname;

    /*
     * Indicates if it is seed node.
     */
    @JsonProperty(value = "IsSeedNode", required = true)
    private boolean isSeedNode;

    /*
     * Version of Node.
     */
    @JsonProperty(value = "NodeVersion", required = true)
    private String nodeVersion;

    /*
     * Describes the error.
     */
    @JsonProperty(value = "Error", required = true)
    private String error;

    /**
     * Get the nodeInstance property: Id of Node instance.
     *
     * @return the nodeInstance value.
     */
    public long getNodeInstance() {
        return this.nodeInstance;
    }

    /**
     * Set the nodeInstance property: Id of Node instance.
     *
     * @param nodeInstance the nodeInstance value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the nodeId property: Id of Node.
     *
     * @return the nodeId value.
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * Set the nodeId property: Id of Node.
     *
     * @param nodeId the nodeId value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get the upgradeDomain property: Upgrade domain of Node.
     *
     * @return the upgradeDomain value.
     */
    public String getUpgradeDomain() {
        return this.upgradeDomain;
    }

    /**
     * Set the upgradeDomain property: Upgrade domain of Node.
     *
     * @param upgradeDomain the upgradeDomain value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setUpgradeDomain(String upgradeDomain) {
        this.upgradeDomain = upgradeDomain;
        return this;
    }

    /**
     * Get the faultDomain property: Fault domain of Node.
     *
     * @return the faultDomain value.
     */
    public String getFaultDomain() {
        return this.faultDomain;
    }

    /**
     * Set the faultDomain property: Fault domain of Node.
     *
     * @param faultDomain the faultDomain value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
        return this;
    }

    /**
     * Get the ipAddressOrFqdn property: IP address or FQDN.
     *
     * @return the ipAddressOrFqdn value.
     */
    public String getIpAddressOrFqdn() {
        return this.ipAddressOrFqdn;
    }

    /**
     * Set the ipAddressOrFqdn property: IP address or FQDN.
     *
     * @param ipAddressOrFqdn the ipAddressOrFqdn value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setIpAddressOrFqdn(String ipAddressOrFqdn) {
        this.ipAddressOrFqdn = ipAddressOrFqdn;
        return this;
    }

    /**
     * Get the hostname property: Name of Host.
     *
     * @return the hostname value.
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Name of Host.
     *
     * @param hostname the hostname value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the isSeedNode property: Indicates if it is seed node.
     *
     * @return the isSeedNode value.
     */
    public boolean isSeedNode() {
        return this.isSeedNode;
    }

    /**
     * Set the isSeedNode property: Indicates if it is seed node.
     *
     * @param isSeedNode the isSeedNode value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setIsSeedNode(boolean isSeedNode) {
        this.isSeedNode = isSeedNode;
        return this;
    }

    /**
     * Get the nodeVersion property: Version of Node.
     *
     * @return the nodeVersion value.
     */
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    /**
     * Set the nodeVersion property: Version of Node.
     *
     * @param nodeVersion the nodeVersion value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }

    /**
     * Get the error property: Describes the error.
     *
     * @return the error value.
     */
    public String getError() {
        return this.error;
    }

    /**
     * Set the error property: Describes the error.
     *
     * @param error the error value to set.
     * @return the NodeOpenFailedEvent object itself.
     */
    public NodeOpenFailedEvent setError(String error) {
        this.error = error;
        return this;
    }
}
