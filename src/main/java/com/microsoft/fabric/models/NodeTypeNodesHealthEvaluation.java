package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for nodes of a particular node type. The node type nodes evaluation can be returned when
 * cluster health evaluation returns unhealthy aggregated health state, either Error or Warning. It contains health
 * evaluations for each unhealthy node of the included node type that impacted current aggregated health state.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("NodeTypeNodes")
@Fluent
public final class NodeTypeNodesHealthEvaluation extends HealthEvaluation {
    /*
     * The node type name as defined in the cluster manifest.
     */
    @JsonProperty(value = "NodeTypeName")
    private String nodeTypeName;

    /*
     * Maximum allowed percentage of unhealthy nodes for the node type,
     * specified as an entry in NodeTypeHealthPolicyMap.
     */
    @JsonProperty(value = "MaxPercentUnhealthyNodes")
    private Integer maxPercentUnhealthyNodes;

    /*
     * Total number of nodes of the node type found in the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /*
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy NodeHealthEvaluation of this node type that
     * impacted the aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the nodeTypeName property: The node type name as defined in the cluster manifest.
     *
     * @return the nodeTypeName value.
     */
    public String getNodeTypeName() {
        return this.nodeTypeName;
    }

    /**
     * Set the nodeTypeName property: The node type name as defined in the cluster manifest.
     *
     * @param nodeTypeName the nodeTypeName value to set.
     * @return the NodeTypeNodesHealthEvaluation object itself.
     */
    public NodeTypeNodesHealthEvaluation setNodeTypeName(String nodeTypeName) {
        this.nodeTypeName = nodeTypeName;
        return this;
    }

    /**
     * Get the maxPercentUnhealthyNodes property: Maximum allowed percentage of unhealthy nodes for the node type,
     * specified as an entry in NodeTypeHealthPolicyMap.
     *
     * @return the maxPercentUnhealthyNodes value.
     */
    public Integer getMaxPercentUnhealthyNodes() {
        return this.maxPercentUnhealthyNodes;
    }

    /**
     * Set the maxPercentUnhealthyNodes property: Maximum allowed percentage of unhealthy nodes for the node type,
     * specified as an entry in NodeTypeHealthPolicyMap.
     *
     * @param maxPercentUnhealthyNodes the maxPercentUnhealthyNodes value to set.
     * @return the NodeTypeNodesHealthEvaluation object itself.
     */
    public NodeTypeNodesHealthEvaluation setMaxPercentUnhealthyNodes(Integer maxPercentUnhealthyNodes) {
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
        return this;
    }

    /**
     * Get the totalCount property: Total number of nodes of the node type found in the health store.
     *
     * @return the totalCount value.
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Total number of nodes of the node type found in the health store.
     *
     * @param totalCount the totalCount value to set.
     * @return the NodeTypeNodesHealthEvaluation object itself.
     */
    public NodeTypeNodesHealthEvaluation setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy NodeHealthEvaluation of this node type that impacted the aggregated health.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy NodeHealthEvaluation of this node type that impacted the aggregated health.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the NodeTypeNodesHealthEvaluation object itself.
     */
    public NodeTypeNodesHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
