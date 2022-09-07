package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the parameters to restart a Service Fabric node. */
@Fluent
public final class RestartNodeDescription {
    /*
     * The instance ID of the target node. If instance ID is specified the node
     * is restarted only if it matches with the current instance of the node. A
     * default value of "0" would match any instance ID. The instance ID can be
     * obtained using get node query.
     */
    @JsonProperty(value = "NodeInstanceId", required = true)
    private String nodeInstanceId;

    /*
     * Specify True to create a dump of the fabric node process. This is
     * case-sensitive.
     */
    @JsonProperty(value = "CreateFabricDump")
    private CreateFabricDump createFabricDump;

    /**
     * Get the nodeInstanceId property: The instance ID of the target node. If instance ID is specified the node is
     * restarted only if it matches with the current instance of the node. A default value of "0" would match any
     * instance ID. The instance ID can be obtained using get node query.
     *
     * @return the nodeInstanceId value.
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * Set the nodeInstanceId property: The instance ID of the target node. If instance ID is specified the node is
     * restarted only if it matches with the current instance of the node. A default value of "0" would match any
     * instance ID. The instance ID can be obtained using get node query.
     *
     * @param nodeInstanceId the nodeInstanceId value to set.
     * @return the RestartNodeDescription object itself.
     */
    public RestartNodeDescription setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }

    /**
     * Get the createFabricDump property: Specify True to create a dump of the fabric node process. This is
     * case-sensitive.
     *
     * @return the createFabricDump value.
     */
    public CreateFabricDump getCreateFabricDump() {
        return this.createFabricDump;
    }

    /**
     * Set the createFabricDump property: Specify True to create a dump of the fabric node process. This is
     * case-sensitive.
     *
     * @param createFabricDump the createFabricDump value to set.
     * @return the RestartNodeDescription object itself.
     */
    public RestartNodeDescription setCreateFabricDump(CreateFabricDump createFabricDump) {
        this.createFabricDump = createFabricDump;
        return this;
    }
}
