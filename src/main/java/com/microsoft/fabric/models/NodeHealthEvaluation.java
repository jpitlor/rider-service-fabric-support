package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Represents health evaluation for a node, containing information about the data and the algorithm used by health store
 * to evaluate health. The evaluation is returned only when the aggregated health state is either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Node")
@Fluent
public final class NodeHealthEvaluation extends HealthEvaluation {
    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * List of unhealthy evaluations that led to the current aggregated health
     * state of the node. The types of the unhealthy evaluations can be
     * EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the nodeName property: The name of a Service Fabric node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set.
     * @return the NodeHealthEvaluation object itself.
     */
    public NodeHealthEvaluation setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the node. The types of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value.
     */
    public List<HealthEvaluationWrapper> getUnhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations property: List of unhealthy evaluations that led to the current aggregated health
     * state of the node. The types of the unhealthy evaluations can be EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set.
     * @return the NodeHealthEvaluation object itself.
     */
    public NodeHealthEvaluation setUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }
}
