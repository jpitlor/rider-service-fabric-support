package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the expected impact of a repair to a particular node.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@Fluent
public final class NodeImpact {
    /*
     * The name of the impacted node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /*
     * The level of impact expected.
     */
    @JsonProperty(value = "ImpactLevel")
    private ImpactLevel impactLevel;

    /**
     * Get the nodeName property: The name of the impacted node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of the impacted node.
     *
     * @param nodeName the nodeName value to set.
     * @return the NodeImpact object itself.
     */
    public NodeImpact setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the impactLevel property: The level of impact expected.
     *
     * @return the impactLevel value.
     */
    public ImpactLevel getImpactLevel() {
        return this.impactLevel;
    }

    /**
     * Set the impactLevel property: The level of impact expected.
     *
     * @param impactLevel the impactLevel value to set.
     * @return the NodeImpact object itself.
     */
    public NodeImpact setImpactLevel(ImpactLevel impactLevel) {
        this.impactLevel = impactLevel;
        return this;
    }
}
