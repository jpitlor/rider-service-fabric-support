package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about load on a Service Fabric node. It holds a summary of all metrics and their load on a node. */
@Fluent
public final class NodeLoadInfo {
    /*
     * Name of the node for which the load information is provided by this
     * object.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /*
     * List that contains metrics and their load information on this node.
     */
    @JsonProperty(value = "NodeLoadMetricInformation")
    private List<NodeLoadMetricInformation> nodeLoadMetricInformation;

    /**
     * Get the nodeName property: Name of the node for which the load information is provided by this object.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: Name of the node for which the load information is provided by this object.
     *
     * @param nodeName the nodeName value to set.
     * @return the NodeLoadInfo object itself.
     */
    public NodeLoadInfo setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the nodeLoadMetricInformation property: List that contains metrics and their load information on this node.
     *
     * @return the nodeLoadMetricInformation value.
     */
    public List<NodeLoadMetricInformation> getNodeLoadMetricInformation() {
        return this.nodeLoadMetricInformation;
    }

    /**
     * Set the nodeLoadMetricInformation property: List that contains metrics and their load information on this node.
     *
     * @param nodeLoadMetricInformation the nodeLoadMetricInformation value to set.
     * @return the NodeLoadInfo object itself.
     */
    public NodeLoadInfo setNodeLoadMetricInformation(List<NodeLoadMetricInformation> nodeLoadMetricInformation) {
        this.nodeLoadMetricInformation = nodeLoadMetricInformation;
        return this;
    }
}
