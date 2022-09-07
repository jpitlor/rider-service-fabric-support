package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Node Removed event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeRemovedFromCluster")
@Fluent
public final class NodeRemovedFromClusterEvent extends NodeEvent {
    /*
     * Id of Node.
     */
    @JsonProperty(value = "NodeId", required = true)
    private String nodeId;

    /*
     * Id of Node instance.
     */
    @JsonProperty(value = "NodeInstance", required = true)
    private long nodeInstance;

    /*
     * Type of Node.
     */
    @JsonProperty(value = "NodeType", required = true)
    private String nodeType;

    /*
     * Fabric version.
     */
    @JsonProperty(value = "FabricVersion", required = true)
    private String fabricVersion;

    /*
     * IP address or FQDN.
     */
    @JsonProperty(value = "IpAddressOrFQDN", required = true)
    private String ipAddressOrFqdn;

    /*
     * Capacities.
     */
    @JsonProperty(value = "NodeCapacities", required = true)
    private String nodeCapacities;

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
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

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
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent setNodeInstance(long nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }

    /**
     * Get the nodeType property: Type of Node.
     *
     * @return the nodeType value.
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * Set the nodeType property: Type of Node.
     *
     * @param nodeType the nodeType value to set.
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * Get the fabricVersion property: Fabric version.
     *
     * @return the fabricVersion value.
     */
    public String getFabricVersion() {
        return this.fabricVersion;
    }

    /**
     * Set the fabricVersion property: Fabric version.
     *
     * @param fabricVersion the fabricVersion value to set.
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent setFabricVersion(String fabricVersion) {
        this.fabricVersion = fabricVersion;
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
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent setIpAddressOrFqdn(String ipAddressOrFqdn) {
        this.ipAddressOrFqdn = ipAddressOrFqdn;
        return this;
    }

    /**
     * Get the nodeCapacities property: Capacities.
     *
     * @return the nodeCapacities value.
     */
    public String getNodeCapacities() {
        return this.nodeCapacities;
    }

    /**
     * Set the nodeCapacities property: Capacities.
     *
     * @param nodeCapacities the nodeCapacities value to set.
     * @return the NodeRemovedFromClusterEvent object itself.
     */
    public NodeRemovedFromClusterEvent setNodeCapacities(String nodeCapacities) {
        this.nodeCapacities = nodeCapacities;
        return this;
    }
}
