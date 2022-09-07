package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes the list of nodes targeted by a repair action.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Node")
@Fluent
public final class NodeRepairTargetDescription extends RepairTargetDescriptionBase {
    /*
     * The list of nodes targeted by a repair action.
     */
    @JsonProperty(value = "NodeNames")
    private List<String> nodeNames;

    /**
     * Get the nodeNames property: The list of nodes targeted by a repair action.
     *
     * @return the nodeNames value.
     */
    public List<String> getNodeNames() {
        return this.nodeNames;
    }

    /**
     * Set the nodeNames property: The list of nodes targeted by a repair action.
     *
     * @param nodeNames the nodeNames value to set.
     * @return the NodeRepairTargetDescription object itself.
     */
    public NodeRepairTargetDescription setNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
}
