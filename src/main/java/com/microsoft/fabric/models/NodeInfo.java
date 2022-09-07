package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Information about a node in Service Fabric cluster. */
@Fluent
public final class NodeInfo {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The IP address or fully qualified domain name of the node.
     */
    @JsonProperty(value = "IpAddressOrFQDN")
    private String ipAddressOrFqdn;

    /*
     * The type of the node.
     */
    @JsonProperty(value = "Type")
    private String type;

    /*
     * The version of Service Fabric binaries that the node is running.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /*
     * The version of Service Fabric cluster manifest that the node is using.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /*
     * The status of the node.
     */
    @JsonProperty(value = "NodeStatus")
    private NodeStatus nodeStatus;

    /*
     * Time in seconds since the node has been in NodeStatus Up. Value zero
     * indicates that the node is not Up.
     */
    @JsonProperty(value = "NodeUpTimeInSeconds")
    private String nodeUpTimeInSeconds;

    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /*
     * Indicates if the node is a seed node or not. Returns true if the node is
     * a seed node, otherwise false. A quorum of seed nodes are required for
     * proper operation of Service Fabric cluster.
     */
    @JsonProperty(value = "IsSeedNode")
    private Boolean isSeedNode;

    /*
     * The upgrade domain of the node.
     */
    @JsonProperty(value = "UpgradeDomain")
    private String upgradeDomain;

    /*
     * The fault domain of the node.
     */
    @JsonProperty(value = "FaultDomain")
    private String faultDomain;

    /*
     * An internal ID used by Service Fabric to uniquely identify a node. Node
     * Id is deterministically generated from node name.
     */
    @JsonProperty(value = "Id")
    private NodeId id;

    /*
     * The ID representing the node instance. While the ID of the node is
     * deterministically generated from the node name and remains same across
     * restarts, the InstanceId changes every time node restarts.
     */
    @JsonProperty(value = "InstanceId")
    private String instanceId;

    /*
     * Information about the node deactivation. This information is valid for a
     * node that is undergoing deactivation or has already been deactivated.
     */
    @JsonProperty(value = "NodeDeactivationInfo")
    private NodeDeactivationInfo nodeDeactivationInfo;

    /*
     * Indicates if the node is stopped by calling stop node API or not.
     * Returns true if the node is stopped, otherwise false.
     */
    @JsonProperty(value = "IsStopped")
    private Boolean isStopped;

    /*
     * Time in seconds since the node has been in NodeStatus Down. Value zero
     * indicates node is not NodeStatus Down.
     */
    @JsonProperty(value = "NodeDownTimeInSeconds")
    private String nodeDownTimeInSeconds;

    /*
     * Date time in UTC when the node came up. If the node has never been up
     * then this value will be zero date time.
     */
    @JsonProperty(value = "NodeUpAt")
    private OffsetDateTime nodeUpAt;

    /*
     * Date time in UTC when the node went down. If node has never been down
     * then this value will be zero date time.
     */
    @JsonProperty(value = "NodeDownAt")
    private OffsetDateTime nodeDownAt;

    /*
     * List that contains tags, which will be applied to the nodes.
     */
    @JsonProperty(value = "NodeTags")
    private List<String> nodeTags;

    /*
     * Indicates if a node-by-node upgrade is currently being performed on this
     * node.
     */
    @JsonProperty(value = "IsNodeByNodeUpgradeInProgress")
    private Boolean isNodeByNodeUpgradeInProgress;

    /*
     * PlacementID used by the InfrastructureService.
     */
    @JsonProperty(value = "InfrastructurePlacementID")
    private String infrastructurePlacementID;

    /**
     * Get the name property: The name of a Service Fabric node.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of a Service Fabric node.
     *
     * @param name the name value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ipAddressOrFqdn property: The IP address or fully qualified domain name of the node.
     *
     * @return the ipAddressOrFqdn value.
     */
    public String getIpAddressOrFqdn() {
        return this.ipAddressOrFqdn;
    }

    /**
     * Set the ipAddressOrFqdn property: The IP address or fully qualified domain name of the node.
     *
     * @param ipAddressOrFqdn the ipAddressOrFqdn value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setIpAddressOrFqdn(String ipAddressOrFqdn) {
        this.ipAddressOrFqdn = ipAddressOrFqdn;
        return this;
    }

    /**
     * Get the type property: The type of the node.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the node.
     *
     * @param type the type value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the codeVersion property: The version of Service Fabric binaries that the node is running.
     *
     * @return the codeVersion value.
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the codeVersion property: The version of Service Fabric binaries that the node is running.
     *
     * @param codeVersion the codeVersion value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the configVersion property: The version of Service Fabric cluster manifest that the node is using.
     *
     * @return the configVersion value.
     */
    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * Set the configVersion property: The version of Service Fabric cluster manifest that the node is using.
     *
     * @param configVersion the configVersion value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    /**
     * Get the nodeStatus property: The status of the node.
     *
     * @return the nodeStatus value.
     */
    public NodeStatus getNodeStatus() {
        return this.nodeStatus;
    }

    /**
     * Set the nodeStatus property: The status of the node.
     *
     * @param nodeStatus the nodeStatus value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setNodeStatus(NodeStatus nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * Get the nodeUpTimeInSeconds property: Time in seconds since the node has been in NodeStatus Up. Value zero
     * indicates that the node is not Up.
     *
     * @return the nodeUpTimeInSeconds value.
     */
    public String getNodeUpTimeInSeconds() {
        return this.nodeUpTimeInSeconds;
    }

    /**
     * Set the nodeUpTimeInSeconds property: Time in seconds since the node has been in NodeStatus Up. Value zero
     * indicates that the node is not Up.
     *
     * @param nodeUpTimeInSeconds the nodeUpTimeInSeconds value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setNodeUpTimeInSeconds(String nodeUpTimeInSeconds) {
        this.nodeUpTimeInSeconds = nodeUpTimeInSeconds;
        return this;
    }

    /**
     * Get the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @param healthState the healthState value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the isSeedNode property: Indicates if the node is a seed node or not. Returns true if the node is a seed
     * node, otherwise false. A quorum of seed nodes are required for proper operation of Service Fabric cluster.
     *
     * @return the isSeedNode value.
     */
    public Boolean isSeedNode() {
        return this.isSeedNode;
    }

    /**
     * Set the isSeedNode property: Indicates if the node is a seed node or not. Returns true if the node is a seed
     * node, otherwise false. A quorum of seed nodes are required for proper operation of Service Fabric cluster.
     *
     * @param isSeedNode the isSeedNode value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setIsSeedNode(Boolean isSeedNode) {
        this.isSeedNode = isSeedNode;
        return this;
    }

    /**
     * Get the upgradeDomain property: The upgrade domain of the node.
     *
     * @return the upgradeDomain value.
     */
    public String getUpgradeDomain() {
        return this.upgradeDomain;
    }

    /**
     * Set the upgradeDomain property: The upgrade domain of the node.
     *
     * @param upgradeDomain the upgradeDomain value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setUpgradeDomain(String upgradeDomain) {
        this.upgradeDomain = upgradeDomain;
        return this;
    }

    /**
     * Get the faultDomain property: The fault domain of the node.
     *
     * @return the faultDomain value.
     */
    public String getFaultDomain() {
        return this.faultDomain;
    }

    /**
     * Set the faultDomain property: The fault domain of the node.
     *
     * @param faultDomain the faultDomain value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setFaultDomain(String faultDomain) {
        this.faultDomain = faultDomain;
        return this;
    }

    /**
     * Get the id property: An internal ID used by Service Fabric to uniquely identify a node. Node Id is
     * deterministically generated from node name.
     *
     * @return the id value.
     */
    public NodeId getId() {
        return this.id;
    }

    /**
     * Set the id property: An internal ID used by Service Fabric to uniquely identify a node. Node Id is
     * deterministically generated from node name.
     *
     * @param id the id value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setId(NodeId id) {
        this.id = id;
        return this;
    }

    /**
     * Get the instanceId property: The ID representing the node instance. While the ID of the node is deterministically
     * generated from the node name and remains same across restarts, the InstanceId changes every time node restarts.
     *
     * @return the instanceId value.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Set the instanceId property: The ID representing the node instance. While the ID of the node is deterministically
     * generated from the node name and remains same across restarts, the InstanceId changes every time node restarts.
     *
     * @param instanceId the instanceId value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get the nodeDeactivationInfo property: Information about the node deactivation. This information is valid for a
     * node that is undergoing deactivation or has already been deactivated.
     *
     * @return the nodeDeactivationInfo value.
     */
    public NodeDeactivationInfo getNodeDeactivationInfo() {
        return this.nodeDeactivationInfo;
    }

    /**
     * Set the nodeDeactivationInfo property: Information about the node deactivation. This information is valid for a
     * node that is undergoing deactivation or has already been deactivated.
     *
     * @param nodeDeactivationInfo the nodeDeactivationInfo value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setNodeDeactivationInfo(NodeDeactivationInfo nodeDeactivationInfo) {
        this.nodeDeactivationInfo = nodeDeactivationInfo;
        return this;
    }

    /**
     * Get the isStopped property: Indicates if the node is stopped by calling stop node API or not. Returns true if the
     * node is stopped, otherwise false.
     *
     * @return the isStopped value.
     */
    public Boolean isStopped() {
        return this.isStopped;
    }

    /**
     * Set the isStopped property: Indicates if the node is stopped by calling stop node API or not. Returns true if the
     * node is stopped, otherwise false.
     *
     * @param isStopped the isStopped value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setIsStopped(Boolean isStopped) {
        this.isStopped = isStopped;
        return this;
    }

    /**
     * Get the nodeDownTimeInSeconds property: Time in seconds since the node has been in NodeStatus Down. Value zero
     * indicates node is not NodeStatus Down.
     *
     * @return the nodeDownTimeInSeconds value.
     */
    public String getNodeDownTimeInSeconds() {
        return this.nodeDownTimeInSeconds;
    }

    /**
     * Set the nodeDownTimeInSeconds property: Time in seconds since the node has been in NodeStatus Down. Value zero
     * indicates node is not NodeStatus Down.
     *
     * @param nodeDownTimeInSeconds the nodeDownTimeInSeconds value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setNodeDownTimeInSeconds(String nodeDownTimeInSeconds) {
        this.nodeDownTimeInSeconds = nodeDownTimeInSeconds;
        return this;
    }

    /**
     * Get the nodeUpAt property: Date time in UTC when the node came up. If the node has never been up then this value
     * will be zero date time.
     *
     * @return the nodeUpAt value.
     */
    public OffsetDateTime getNodeUpAt() {
        return this.nodeUpAt;
    }

    /**
     * Set the nodeUpAt property: Date time in UTC when the node came up. If the node has never been up then this value
     * will be zero date time.
     *
     * @param nodeUpAt the nodeUpAt value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setNodeUpAt(OffsetDateTime nodeUpAt) {
        this.nodeUpAt = nodeUpAt;
        return this;
    }

    /**
     * Get the nodeDownAt property: Date time in UTC when the node went down. If node has never been down then this
     * value will be zero date time.
     *
     * @return the nodeDownAt value.
     */
    public OffsetDateTime getNodeDownAt() {
        return this.nodeDownAt;
    }

    /**
     * Set the nodeDownAt property: Date time in UTC when the node went down. If node has never been down then this
     * value will be zero date time.
     *
     * @param nodeDownAt the nodeDownAt value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setNodeDownAt(OffsetDateTime nodeDownAt) {
        this.nodeDownAt = nodeDownAt;
        return this;
    }

    /**
     * Get the nodeTags property: List that contains tags, which will be applied to the nodes.
     *
     * @return the nodeTags value.
     */
    public List<String> getNodeTags() {
        return this.nodeTags;
    }

    /**
     * Set the nodeTags property: List that contains tags, which will be applied to the nodes.
     *
     * @param nodeTags the nodeTags value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setNodeTags(List<String> nodeTags) {
        this.nodeTags = nodeTags;
        return this;
    }

    /**
     * Get the isNodeByNodeUpgradeInProgress property: Indicates if a node-by-node upgrade is currently being performed
     * on this node.
     *
     * @return the isNodeByNodeUpgradeInProgress value.
     */
    public Boolean isNodeByNodeUpgradeInProgress() {
        return this.isNodeByNodeUpgradeInProgress;
    }

    /**
     * Set the isNodeByNodeUpgradeInProgress property: Indicates if a node-by-node upgrade is currently being performed
     * on this node.
     *
     * @param isNodeByNodeUpgradeInProgress the isNodeByNodeUpgradeInProgress value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setIsNodeByNodeUpgradeInProgress(Boolean isNodeByNodeUpgradeInProgress) {
        this.isNodeByNodeUpgradeInProgress = isNodeByNodeUpgradeInProgress;
        return this;
    }

    /**
     * Get the infrastructurePlacementID property: PlacementID used by the InfrastructureService.
     *
     * @return the infrastructurePlacementID value.
     */
    public String getInfrastructurePlacementID() {
        return this.infrastructurePlacementID;
    }

    /**
     * Set the infrastructurePlacementID property: PlacementID used by the InfrastructureService.
     *
     * @param infrastructurePlacementID the infrastructurePlacementID value to set.
     * @return the NodeInfo object itself.
     */
    public NodeInfo setInfrastructurePlacementID(String infrastructurePlacementID) {
        this.infrastructurePlacementID = infrastructurePlacementID;
        return this;
    }
}
