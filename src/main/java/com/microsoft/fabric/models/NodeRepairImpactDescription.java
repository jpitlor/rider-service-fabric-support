package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes the expected impact of a repair on a set of nodes.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Node")
@Fluent
public final class NodeRepairImpactDescription extends RepairImpactDescriptionBase {
    /*
     * The list of nodes impacted by a repair action and their respective
     * expected impact.
     */
    @JsonProperty(value = "NodeImpactList")
    private List<NodeImpact> nodeImpactList;

    /**
     * Get the nodeImpactList property: The list of nodes impacted by a repair action and their respective expected
     * impact.
     *
     * @return the nodeImpactList value.
     */
    public List<NodeImpact> getNodeImpactList() {
        return this.nodeImpactList;
    }

    /**
     * Set the nodeImpactList property: The list of nodes impacted by a repair action and their respective expected
     * impact.
     *
     * @param nodeImpactList the nodeImpactList value to set.
     * @return the NodeRepairImpactDescription object itself.
     */
    public NodeRepairImpactDescription setNodeImpactList(List<NodeImpact> nodeImpactList) {
        this.nodeImpactList = nodeImpactList;
        return this;
    }
}
