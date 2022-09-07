package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents data structure that contains load information for a certain metric on a node. */
@Fluent
public final class NodeLoadMetricInformation {
    /*
     * Name of the metric for which this load information is provided.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * Total capacity on the node for this metric.
     */
    @JsonProperty(value = "NodeCapacity")
    private String nodeCapacity;

    /*
     * Current load on the node for this metric. In future releases of Service
     * Fabric this parameter will be deprecated in favor of CurrentNodeLoad.
     */
    @JsonProperty(value = "NodeLoad")
    private String nodeLoad;

    /*
     * The remaining capacity on the node for this metric. In future releases
     * of Service Fabric this parameter will be deprecated in favor of
     * NodeCapacityRemaining.
     */
    @JsonProperty(value = "NodeRemainingCapacity")
    private String nodeRemainingCapacity;

    /*
     * Indicates if there is a capacity violation for this metric on the node.
     */
    @JsonProperty(value = "IsCapacityViolation")
    private Boolean isCapacityViolation;

    /*
     * The value that indicates the reserved capacity for this metric on the
     * node.
     */
    @JsonProperty(value = "NodeBufferedCapacity")
    private String nodeBufferedCapacity;

    /*
     * The remaining reserved capacity for this metric on the node. In future
     * releases of Service Fabric this parameter will be deprecated in favor of
     * BufferedNodeCapacityRemaining.
     */
    @JsonProperty(value = "NodeRemainingBufferedCapacity")
    private String nodeRemainingBufferedCapacity;

    /*
     * Current load on the node for this metric.
     */
    @JsonProperty(value = "CurrentNodeLoad")
    private String currentNodeLoad;

    /*
     * The remaining capacity on the node for the metric.
     */
    @JsonProperty(value = "NodeCapacityRemaining")
    private String nodeCapacityRemaining;

    /*
     * The remaining capacity which is not reserved by NodeBufferPercentage for
     * this metric on the node.
     */
    @JsonProperty(value = "BufferedNodeCapacityRemaining")
    private String bufferedNodeCapacityRemaining;

    /*
     * This value represents the load of the replicas that are planned to be
     * removed in the future.
     * This kind of load is reported for replicas that are currently being
     * moving to other nodes and for replicas that are currently being dropped
     * but still use the load on the source node.
     */
    @JsonProperty(value = "PlannedNodeLoadRemoval")
    private String plannedNodeLoadRemoval;

    /**
     * Get the name property: Name of the metric for which this load information is provided.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the metric for which this load information is provided.
     *
     * @param name the name value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the nodeCapacity property: Total capacity on the node for this metric.
     *
     * @return the nodeCapacity value.
     */
    public String getNodeCapacity() {
        return this.nodeCapacity;
    }

    /**
     * Set the nodeCapacity property: Total capacity on the node for this metric.
     *
     * @param nodeCapacity the nodeCapacity value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setNodeCapacity(String nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
        return this;
    }

    /**
     * Get the nodeLoad property: Current load on the node for this metric. In future releases of Service Fabric this
     * parameter will be deprecated in favor of CurrentNodeLoad.
     *
     * @return the nodeLoad value.
     */
    public String getNodeLoad() {
        return this.nodeLoad;
    }

    /**
     * Set the nodeLoad property: Current load on the node for this metric. In future releases of Service Fabric this
     * parameter will be deprecated in favor of CurrentNodeLoad.
     *
     * @param nodeLoad the nodeLoad value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setNodeLoad(String nodeLoad) {
        this.nodeLoad = nodeLoad;
        return this;
    }

    /**
     * Get the nodeRemainingCapacity property: The remaining capacity on the node for this metric. In future releases of
     * Service Fabric this parameter will be deprecated in favor of NodeCapacityRemaining.
     *
     * @return the nodeRemainingCapacity value.
     */
    public String getNodeRemainingCapacity() {
        return this.nodeRemainingCapacity;
    }

    /**
     * Set the nodeRemainingCapacity property: The remaining capacity on the node for this metric. In future releases of
     * Service Fabric this parameter will be deprecated in favor of NodeCapacityRemaining.
     *
     * @param nodeRemainingCapacity the nodeRemainingCapacity value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setNodeRemainingCapacity(String nodeRemainingCapacity) {
        this.nodeRemainingCapacity = nodeRemainingCapacity;
        return this;
    }

    /**
     * Get the isCapacityViolation property: Indicates if there is a capacity violation for this metric on the node.
     *
     * @return the isCapacityViolation value.
     */
    public Boolean isCapacityViolation() {
        return this.isCapacityViolation;
    }

    /**
     * Set the isCapacityViolation property: Indicates if there is a capacity violation for this metric on the node.
     *
     * @param isCapacityViolation the isCapacityViolation value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setIsCapacityViolation(Boolean isCapacityViolation) {
        this.isCapacityViolation = isCapacityViolation;
        return this;
    }

    /**
     * Get the nodeBufferedCapacity property: The value that indicates the reserved capacity for this metric on the
     * node.
     *
     * @return the nodeBufferedCapacity value.
     */
    public String getNodeBufferedCapacity() {
        return this.nodeBufferedCapacity;
    }

    /**
     * Set the nodeBufferedCapacity property: The value that indicates the reserved capacity for this metric on the
     * node.
     *
     * @param nodeBufferedCapacity the nodeBufferedCapacity value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setNodeBufferedCapacity(String nodeBufferedCapacity) {
        this.nodeBufferedCapacity = nodeBufferedCapacity;
        return this;
    }

    /**
     * Get the nodeRemainingBufferedCapacity property: The remaining reserved capacity for this metric on the node. In
     * future releases of Service Fabric this parameter will be deprecated in favor of BufferedNodeCapacityRemaining.
     *
     * @return the nodeRemainingBufferedCapacity value.
     */
    public String getNodeRemainingBufferedCapacity() {
        return this.nodeRemainingBufferedCapacity;
    }

    /**
     * Set the nodeRemainingBufferedCapacity property: The remaining reserved capacity for this metric on the node. In
     * future releases of Service Fabric this parameter will be deprecated in favor of BufferedNodeCapacityRemaining.
     *
     * @param nodeRemainingBufferedCapacity the nodeRemainingBufferedCapacity value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setNodeRemainingBufferedCapacity(String nodeRemainingBufferedCapacity) {
        this.nodeRemainingBufferedCapacity = nodeRemainingBufferedCapacity;
        return this;
    }

    /**
     * Get the currentNodeLoad property: Current load on the node for this metric.
     *
     * @return the currentNodeLoad value.
     */
    public String getCurrentNodeLoad() {
        return this.currentNodeLoad;
    }

    /**
     * Set the currentNodeLoad property: Current load on the node for this metric.
     *
     * @param currentNodeLoad the currentNodeLoad value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setCurrentNodeLoad(String currentNodeLoad) {
        this.currentNodeLoad = currentNodeLoad;
        return this;
    }

    /**
     * Get the nodeCapacityRemaining property: The remaining capacity on the node for the metric.
     *
     * @return the nodeCapacityRemaining value.
     */
    public String getNodeCapacityRemaining() {
        return this.nodeCapacityRemaining;
    }

    /**
     * Set the nodeCapacityRemaining property: The remaining capacity on the node for the metric.
     *
     * @param nodeCapacityRemaining the nodeCapacityRemaining value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setNodeCapacityRemaining(String nodeCapacityRemaining) {
        this.nodeCapacityRemaining = nodeCapacityRemaining;
        return this;
    }

    /**
     * Get the bufferedNodeCapacityRemaining property: The remaining capacity which is not reserved by
     * NodeBufferPercentage for this metric on the node.
     *
     * @return the bufferedNodeCapacityRemaining value.
     */
    public String getBufferedNodeCapacityRemaining() {
        return this.bufferedNodeCapacityRemaining;
    }

    /**
     * Set the bufferedNodeCapacityRemaining property: The remaining capacity which is not reserved by
     * NodeBufferPercentage for this metric on the node.
     *
     * @param bufferedNodeCapacityRemaining the bufferedNodeCapacityRemaining value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setBufferedNodeCapacityRemaining(String bufferedNodeCapacityRemaining) {
        this.bufferedNodeCapacityRemaining = bufferedNodeCapacityRemaining;
        return this;
    }

    /**
     * Get the plannedNodeLoadRemoval property: This value represents the load of the replicas that are planned to be
     * removed in the future. This kind of load is reported for replicas that are currently being moving to other nodes
     * and for replicas that are currently being dropped but still use the load on the source node.
     *
     * @return the plannedNodeLoadRemoval value.
     */
    public String getPlannedNodeLoadRemoval() {
        return this.plannedNodeLoadRemoval;
    }

    /**
     * Set the plannedNodeLoadRemoval property: This value represents the load of the replicas that are planned to be
     * removed in the future. This kind of load is reported for replicas that are currently being moving to other nodes
     * and for replicas that are currently being dropped but still use the load on the source node.
     *
     * @param plannedNodeLoadRemoval the plannedNodeLoadRemoval value to set.
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation setPlannedNodeLoadRemoval(String plannedNodeLoadRemoval) {
        this.plannedNodeLoadRemoval = plannedNodeLoadRemoval;
        return this;
    }
}
