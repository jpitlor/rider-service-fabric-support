package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines an item in NodeTypeHealthPolicyMap. */
@Fluent
public final class NodeTypeHealthPolicyMapItem {
    /*
     * The key of the node type health policy map item. This is the name of the
     * node type.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /*
     * The value of the node type health policy map item.
     * If the percentage is respected but there is at least one unhealthy node
     * in the node type, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy nodes
     * over the total number of nodes in the node type.
     * The computation rounds up to tolerate one failure on small numbers of
     * nodes.
     * The max percent unhealthy nodes allowed for the node type. Must be
     * between zero and 100.
     */
    @JsonProperty(value = "Value", required = true)
    private int value;

    /**
     * Get the key property: The key of the node type health policy map item. This is the name of the node type.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key of the node type health policy map item. This is the name of the node type.
     *
     * @param key the key value to set.
     * @return the NodeTypeHealthPolicyMapItem object itself.
     */
    public NodeTypeHealthPolicyMapItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value of the node type health policy map item. If the percentage is respected but
     * there is at least one unhealthy node in the node type, the health is evaluated as Warning. The percentage is
     * calculated by dividing the number of unhealthy nodes over the total number of nodes in the node type. The
     * computation rounds up to tolerate one failure on small numbers of nodes. The max percent unhealthy nodes allowed
     * for the node type. Must be between zero and 100.
     *
     * @return the value value.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the node type health policy map item. If the percentage is respected but
     * there is at least one unhealthy node in the node type, the health is evaluated as Warning. The percentage is
     * calculated by dividing the number of unhealthy nodes over the total number of nodes in the node type. The
     * computation rounds up to tolerate one failure on small numbers of nodes. The max percent unhealthy nodes allowed
     * for the node type. Must be between zero and 100.
     *
     * @param value the value value to set.
     * @return the NodeTypeHealthPolicyMapItem object itself.
     */
    public NodeTypeHealthPolicyMapItem setValue(int value) {
        this.value = value;
        return this;
    }
}
