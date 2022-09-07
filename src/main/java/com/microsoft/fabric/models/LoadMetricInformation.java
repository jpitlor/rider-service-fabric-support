package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents data structure that contains load information for a certain metric in a cluster. */
@Fluent
public final class LoadMetricInformation {
    /*
     * Name of the metric for which this load information is provided.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * Value that indicates whether the metrics is balanced or not before
     * resource balancer run
     */
    @JsonProperty(value = "IsBalancedBefore")
    private Boolean isBalancedBefore;

    /*
     * Value that indicates whether the metrics is balanced or not after
     * resource balancer run.
     */
    @JsonProperty(value = "IsBalancedAfter")
    private Boolean isBalancedAfter;

    /*
     * The standard average deviation of the metrics before resource balancer
     * run.
     */
    @JsonProperty(value = "DeviationBefore")
    private String deviationBefore;

    /*
     * The standard average deviation of the metrics after resource balancer
     * run.
     */
    @JsonProperty(value = "DeviationAfter")
    private String deviationAfter;

    /*
     * The balancing threshold for a certain metric.
     */
    @JsonProperty(value = "BalancingThreshold")
    private String balancingThreshold;

    /*
     * The current action being taken with regard to this metric
     */
    @JsonProperty(value = "Action")
    private String action;

    /*
     * The Activity Threshold specified for this metric in the system Cluster
     * Manifest.
     */
    @JsonProperty(value = "ActivityThreshold")
    private String activityThreshold;

    /*
     * The total cluster capacity for a given metric
     */
    @JsonProperty(value = "ClusterCapacity")
    private String clusterCapacity;

    /*
     * The total cluster load. In future releases of Service Fabric this
     * parameter will be deprecated in favor of CurrentClusterLoad.
     */
    @JsonProperty(value = "ClusterLoad")
    private String clusterLoad;

    /*
     * The total cluster load.
     */
    @JsonProperty(value = "CurrentClusterLoad")
    private String currentClusterLoad;

    /*
     * The remaining capacity for the metric in the cluster. In future releases
     * of Service Fabric this parameter will be deprecated in favor of
     * ClusterCapacityRemaining.
     */
    @JsonProperty(value = "ClusterRemainingCapacity")
    private String clusterRemainingCapacity;

    /*
     * The remaining capacity for the metric in the cluster.
     */
    @JsonProperty(value = "ClusterCapacityRemaining")
    private String clusterCapacityRemaining;

    /*
     * Indicates that the metric is currently over capacity in the cluster.
     */
    @JsonProperty(value = "IsClusterCapacityViolation")
    private Boolean isClusterCapacityViolation;

    /*
     * The reserved percentage of total node capacity for this metric.
     */
    @JsonProperty(value = "NodeBufferPercentage")
    private String nodeBufferPercentage;

    /*
     * Remaining capacity in the cluster excluding the reserved space. In
     * future releases of Service Fabric this parameter will be deprecated in
     * favor of BufferedClusterCapacityRemaining.
     */
    @JsonProperty(value = "ClusterBufferedCapacity")
    private String clusterBufferedCapacity;

    /*
     * Remaining capacity in the cluster excluding the reserved space.
     */
    @JsonProperty(value = "BufferedClusterCapacityRemaining")
    private String bufferedClusterCapacityRemaining;

    /*
     * The remaining percentage of cluster total capacity for this metric.
     */
    @JsonProperty(value = "ClusterRemainingBufferedCapacity")
    private String clusterRemainingBufferedCapacity;

    /*
     * The minimum load on any node for this metric. In future releases of
     * Service Fabric this parameter will be deprecated in favor of
     * MinimumNodeLoad.
     */
    @JsonProperty(value = "MinNodeLoadValue")
    private String minNodeLoadValue;

    /*
     * The minimum load on any node for this metric.
     */
    @JsonProperty(value = "MinimumNodeLoad")
    private String minimumNodeLoad;

    /*
     * The node id of the node with the minimum load for this metric.
     */
    @JsonProperty(value = "MinNodeLoadNodeId")
    private NodeId minNodeLoadNodeId;

    /*
     * The maximum load on any node for this metric. In future releases of
     * Service Fabric this parameter will be deprecated in favor of
     * MaximumNodeLoad.
     */
    @JsonProperty(value = "MaxNodeLoadValue")
    private String maxNodeLoadValue;

    /*
     * The maximum load on any node for this metric.
     */
    @JsonProperty(value = "MaximumNodeLoad")
    private String maximumNodeLoad;

    /*
     * The node id of the node with the maximum load for this metric.
     */
    @JsonProperty(value = "MaxNodeLoadNodeId")
    private NodeId maxNodeLoadNodeId;

    /*
     * This value represents the load of the replicas that are planned to be
     * removed in the future within the cluster.
     * This kind of load is reported for replicas that are currently being
     * moving to other nodes and for replicas that are currently being dropped
     * but still use the load on the source node.
     */
    @JsonProperty(value = "PlannedLoadRemoval")
    private String plannedLoadRemoval;

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
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isBalancedBefore property: Value that indicates whether the metrics is balanced or not before resource
     * balancer run.
     *
     * @return the isBalancedBefore value.
     */
    public Boolean isBalancedBefore() {
        return this.isBalancedBefore;
    }

    /**
     * Set the isBalancedBefore property: Value that indicates whether the metrics is balanced or not before resource
     * balancer run.
     *
     * @param isBalancedBefore the isBalancedBefore value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setIsBalancedBefore(Boolean isBalancedBefore) {
        this.isBalancedBefore = isBalancedBefore;
        return this;
    }

    /**
     * Get the isBalancedAfter property: Value that indicates whether the metrics is balanced or not after resource
     * balancer run.
     *
     * @return the isBalancedAfter value.
     */
    public Boolean isBalancedAfter() {
        return this.isBalancedAfter;
    }

    /**
     * Set the isBalancedAfter property: Value that indicates whether the metrics is balanced or not after resource
     * balancer run.
     *
     * @param isBalancedAfter the isBalancedAfter value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setIsBalancedAfter(Boolean isBalancedAfter) {
        this.isBalancedAfter = isBalancedAfter;
        return this;
    }

    /**
     * Get the deviationBefore property: The standard average deviation of the metrics before resource balancer run.
     *
     * @return the deviationBefore value.
     */
    public String getDeviationBefore() {
        return this.deviationBefore;
    }

    /**
     * Set the deviationBefore property: The standard average deviation of the metrics before resource balancer run.
     *
     * @param deviationBefore the deviationBefore value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setDeviationBefore(String deviationBefore) {
        this.deviationBefore = deviationBefore;
        return this;
    }

    /**
     * Get the deviationAfter property: The standard average deviation of the metrics after resource balancer run.
     *
     * @return the deviationAfter value.
     */
    public String getDeviationAfter() {
        return this.deviationAfter;
    }

    /**
     * Set the deviationAfter property: The standard average deviation of the metrics after resource balancer run.
     *
     * @param deviationAfter the deviationAfter value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setDeviationAfter(String deviationAfter) {
        this.deviationAfter = deviationAfter;
        return this;
    }

    /**
     * Get the balancingThreshold property: The balancing threshold for a certain metric.
     *
     * @return the balancingThreshold value.
     */
    public String getBalancingThreshold() {
        return this.balancingThreshold;
    }

    /**
     * Set the balancingThreshold property: The balancing threshold for a certain metric.
     *
     * @param balancingThreshold the balancingThreshold value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setBalancingThreshold(String balancingThreshold) {
        this.balancingThreshold = balancingThreshold;
        return this;
    }

    /**
     * Get the action property: The current action being taken with regard to this metric.
     *
     * @return the action value.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Set the action property: The current action being taken with regard to this metric.
     *
     * @param action the action value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the activityThreshold property: The Activity Threshold specified for this metric in the system Cluster
     * Manifest.
     *
     * @return the activityThreshold value.
     */
    public String getActivityThreshold() {
        return this.activityThreshold;
    }

    /**
     * Set the activityThreshold property: The Activity Threshold specified for this metric in the system Cluster
     * Manifest.
     *
     * @param activityThreshold the activityThreshold value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setActivityThreshold(String activityThreshold) {
        this.activityThreshold = activityThreshold;
        return this;
    }

    /**
     * Get the clusterCapacity property: The total cluster capacity for a given metric.
     *
     * @return the clusterCapacity value.
     */
    public String getClusterCapacity() {
        return this.clusterCapacity;
    }

    /**
     * Set the clusterCapacity property: The total cluster capacity for a given metric.
     *
     * @param clusterCapacity the clusterCapacity value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setClusterCapacity(String clusterCapacity) {
        this.clusterCapacity = clusterCapacity;
        return this;
    }

    /**
     * Get the clusterLoad property: The total cluster load. In future releases of Service Fabric this parameter will be
     * deprecated in favor of CurrentClusterLoad.
     *
     * @return the clusterLoad value.
     */
    public String getClusterLoad() {
        return this.clusterLoad;
    }

    /**
     * Set the clusterLoad property: The total cluster load. In future releases of Service Fabric this parameter will be
     * deprecated in favor of CurrentClusterLoad.
     *
     * @param clusterLoad the clusterLoad value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setClusterLoad(String clusterLoad) {
        this.clusterLoad = clusterLoad;
        return this;
    }

    /**
     * Get the currentClusterLoad property: The total cluster load.
     *
     * @return the currentClusterLoad value.
     */
    public String getCurrentClusterLoad() {
        return this.currentClusterLoad;
    }

    /**
     * Set the currentClusterLoad property: The total cluster load.
     *
     * @param currentClusterLoad the currentClusterLoad value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setCurrentClusterLoad(String currentClusterLoad) {
        this.currentClusterLoad = currentClusterLoad;
        return this;
    }

    /**
     * Get the clusterRemainingCapacity property: The remaining capacity for the metric in the cluster. In future
     * releases of Service Fabric this parameter will be deprecated in favor of ClusterCapacityRemaining.
     *
     * @return the clusterRemainingCapacity value.
     */
    public String getClusterRemainingCapacity() {
        return this.clusterRemainingCapacity;
    }

    /**
     * Set the clusterRemainingCapacity property: The remaining capacity for the metric in the cluster. In future
     * releases of Service Fabric this parameter will be deprecated in favor of ClusterCapacityRemaining.
     *
     * @param clusterRemainingCapacity the clusterRemainingCapacity value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setClusterRemainingCapacity(String clusterRemainingCapacity) {
        this.clusterRemainingCapacity = clusterRemainingCapacity;
        return this;
    }

    /**
     * Get the clusterCapacityRemaining property: The remaining capacity for the metric in the cluster.
     *
     * @return the clusterCapacityRemaining value.
     */
    public String getClusterCapacityRemaining() {
        return this.clusterCapacityRemaining;
    }

    /**
     * Set the clusterCapacityRemaining property: The remaining capacity for the metric in the cluster.
     *
     * @param clusterCapacityRemaining the clusterCapacityRemaining value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setClusterCapacityRemaining(String clusterCapacityRemaining) {
        this.clusterCapacityRemaining = clusterCapacityRemaining;
        return this;
    }

    /**
     * Get the isClusterCapacityViolation property: Indicates that the metric is currently over capacity in the cluster.
     *
     * @return the isClusterCapacityViolation value.
     */
    public Boolean isClusterCapacityViolation() {
        return this.isClusterCapacityViolation;
    }

    /**
     * Set the isClusterCapacityViolation property: Indicates that the metric is currently over capacity in the cluster.
     *
     * @param isClusterCapacityViolation the isClusterCapacityViolation value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setIsClusterCapacityViolation(Boolean isClusterCapacityViolation) {
        this.isClusterCapacityViolation = isClusterCapacityViolation;
        return this;
    }

    /**
     * Get the nodeBufferPercentage property: The reserved percentage of total node capacity for this metric.
     *
     * @return the nodeBufferPercentage value.
     */
    public String getNodeBufferPercentage() {
        return this.nodeBufferPercentage;
    }

    /**
     * Set the nodeBufferPercentage property: The reserved percentage of total node capacity for this metric.
     *
     * @param nodeBufferPercentage the nodeBufferPercentage value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setNodeBufferPercentage(String nodeBufferPercentage) {
        this.nodeBufferPercentage = nodeBufferPercentage;
        return this;
    }

    /**
     * Get the clusterBufferedCapacity property: Remaining capacity in the cluster excluding the reserved space. In
     * future releases of Service Fabric this parameter will be deprecated in favor of BufferedClusterCapacityRemaining.
     *
     * @return the clusterBufferedCapacity value.
     */
    public String getClusterBufferedCapacity() {
        return this.clusterBufferedCapacity;
    }

    /**
     * Set the clusterBufferedCapacity property: Remaining capacity in the cluster excluding the reserved space. In
     * future releases of Service Fabric this parameter will be deprecated in favor of BufferedClusterCapacityRemaining.
     *
     * @param clusterBufferedCapacity the clusterBufferedCapacity value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setClusterBufferedCapacity(String clusterBufferedCapacity) {
        this.clusterBufferedCapacity = clusterBufferedCapacity;
        return this;
    }

    /**
     * Get the bufferedClusterCapacityRemaining property: Remaining capacity in the cluster excluding the reserved
     * space.
     *
     * @return the bufferedClusterCapacityRemaining value.
     */
    public String getBufferedClusterCapacityRemaining() {
        return this.bufferedClusterCapacityRemaining;
    }

    /**
     * Set the bufferedClusterCapacityRemaining property: Remaining capacity in the cluster excluding the reserved
     * space.
     *
     * @param bufferedClusterCapacityRemaining the bufferedClusterCapacityRemaining value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setBufferedClusterCapacityRemaining(String bufferedClusterCapacityRemaining) {
        this.bufferedClusterCapacityRemaining = bufferedClusterCapacityRemaining;
        return this;
    }

    /**
     * Get the clusterRemainingBufferedCapacity property: The remaining percentage of cluster total capacity for this
     * metric.
     *
     * @return the clusterRemainingBufferedCapacity value.
     */
    public String getClusterRemainingBufferedCapacity() {
        return this.clusterRemainingBufferedCapacity;
    }

    /**
     * Set the clusterRemainingBufferedCapacity property: The remaining percentage of cluster total capacity for this
     * metric.
     *
     * @param clusterRemainingBufferedCapacity the clusterRemainingBufferedCapacity value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setClusterRemainingBufferedCapacity(String clusterRemainingBufferedCapacity) {
        this.clusterRemainingBufferedCapacity = clusterRemainingBufferedCapacity;
        return this;
    }

    /**
     * Get the minNodeLoadValue property: The minimum load on any node for this metric. In future releases of Service
     * Fabric this parameter will be deprecated in favor of MinimumNodeLoad.
     *
     * @return the minNodeLoadValue value.
     */
    public String getMinNodeLoadValue() {
        return this.minNodeLoadValue;
    }

    /**
     * Set the minNodeLoadValue property: The minimum load on any node for this metric. In future releases of Service
     * Fabric this parameter will be deprecated in favor of MinimumNodeLoad.
     *
     * @param minNodeLoadValue the minNodeLoadValue value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setMinNodeLoadValue(String minNodeLoadValue) {
        this.minNodeLoadValue = minNodeLoadValue;
        return this;
    }

    /**
     * Get the minimumNodeLoad property: The minimum load on any node for this metric.
     *
     * @return the minimumNodeLoad value.
     */
    public String getMinimumNodeLoad() {
        return this.minimumNodeLoad;
    }

    /**
     * Set the minimumNodeLoad property: The minimum load on any node for this metric.
     *
     * @param minimumNodeLoad the minimumNodeLoad value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setMinimumNodeLoad(String minimumNodeLoad) {
        this.minimumNodeLoad = minimumNodeLoad;
        return this;
    }

    /**
     * Get the minNodeLoadNodeId property: The node id of the node with the minimum load for this metric.
     *
     * @return the minNodeLoadNodeId value.
     */
    public NodeId getMinNodeLoadNodeId() {
        return this.minNodeLoadNodeId;
    }

    /**
     * Set the minNodeLoadNodeId property: The node id of the node with the minimum load for this metric.
     *
     * @param minNodeLoadNodeId the minNodeLoadNodeId value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setMinNodeLoadNodeId(NodeId minNodeLoadNodeId) {
        this.minNodeLoadNodeId = minNodeLoadNodeId;
        return this;
    }

    /**
     * Get the maxNodeLoadValue property: The maximum load on any node for this metric. In future releases of Service
     * Fabric this parameter will be deprecated in favor of MaximumNodeLoad.
     *
     * @return the maxNodeLoadValue value.
     */
    public String getMaxNodeLoadValue() {
        return this.maxNodeLoadValue;
    }

    /**
     * Set the maxNodeLoadValue property: The maximum load on any node for this metric. In future releases of Service
     * Fabric this parameter will be deprecated in favor of MaximumNodeLoad.
     *
     * @param maxNodeLoadValue the maxNodeLoadValue value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setMaxNodeLoadValue(String maxNodeLoadValue) {
        this.maxNodeLoadValue = maxNodeLoadValue;
        return this;
    }

    /**
     * Get the maximumNodeLoad property: The maximum load on any node for this metric.
     *
     * @return the maximumNodeLoad value.
     */
    public String getMaximumNodeLoad() {
        return this.maximumNodeLoad;
    }

    /**
     * Set the maximumNodeLoad property: The maximum load on any node for this metric.
     *
     * @param maximumNodeLoad the maximumNodeLoad value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setMaximumNodeLoad(String maximumNodeLoad) {
        this.maximumNodeLoad = maximumNodeLoad;
        return this;
    }

    /**
     * Get the maxNodeLoadNodeId property: The node id of the node with the maximum load for this metric.
     *
     * @return the maxNodeLoadNodeId value.
     */
    public NodeId getMaxNodeLoadNodeId() {
        return this.maxNodeLoadNodeId;
    }

    /**
     * Set the maxNodeLoadNodeId property: The node id of the node with the maximum load for this metric.
     *
     * @param maxNodeLoadNodeId the maxNodeLoadNodeId value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setMaxNodeLoadNodeId(NodeId maxNodeLoadNodeId) {
        this.maxNodeLoadNodeId = maxNodeLoadNodeId;
        return this;
    }

    /**
     * Get the plannedLoadRemoval property: This value represents the load of the replicas that are planned to be
     * removed in the future within the cluster. This kind of load is reported for replicas that are currently being
     * moving to other nodes and for replicas that are currently being dropped but still use the load on the source
     * node.
     *
     * @return the plannedLoadRemoval value.
     */
    public String getPlannedLoadRemoval() {
        return this.plannedLoadRemoval;
    }

    /**
     * Set the plannedLoadRemoval property: This value represents the load of the replicas that are planned to be
     * removed in the future within the cluster. This kind of load is reported for replicas that are currently being
     * moving to other nodes and for replicas that are currently being dropped but still use the load on the source
     * node.
     *
     * @param plannedLoadRemoval the plannedLoadRemoval value to set.
     * @return the LoadMetricInformation object itself.
     */
    public LoadMetricInformation setPlannedLoadRemoval(String plannedLoadRemoval) {
        this.plannedLoadRemoval = plannedLoadRemoval;
        return this;
    }
}
