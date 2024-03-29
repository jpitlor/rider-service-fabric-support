package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines all filters for targeted Chaos faults, for example, faulting only certain node types or faulting only certain
 * applications. If ChaosTargetFilter is not used, Chaos faults all cluster entities. If ChaosTargetFilter is used,
 * Chaos faults only the entities that meet the ChaosTargetFilter specification. NodeTypeInclusionList and
 * ApplicationInclusionList allow a union semantics only. It is not possible to specify an intersection of
 * NodeTypeInclusionList and ApplicationInclusionList. For example, it is not possible to specify "fault this
 * application only when it is on that node type." Once an entity is included in either NodeTypeInclusionList or
 * ApplicationInclusionList, that entity cannot be excluded using ChaosTargetFilter. Even if applicationX does not
 * appear in ApplicationInclusionList, in some Chaos iteration applicationX can be faulted because it happens to be on a
 * node of nodeTypeY that is included in NodeTypeInclusionList. If both NodeTypeInclusionList and
 * ApplicationInclusionList are null or empty, an ArgumentException is thrown.
 */
@Fluent
public final class ChaosTargetFilter {
    /*
     * A list of node types to include in Chaos faults.
     * All types of faults (restart node, restart code package, remove replica,
     * restart replica, move primary, and move secondary) are enabled for the
     * nodes of these node types.
     * If a node type (say NodeTypeX) does not appear in the
     * NodeTypeInclusionList, then node level faults (like NodeRestart) will
     * never be enabled for the nodes of
     * NodeTypeX, but code package and replica faults can still be enabled for
     * NodeTypeX if an application in the ApplicationInclusionList.
     * happens to reside on a node of NodeTypeX.
     * At most 100 node type names can be included in this list, to increase
     * this number, a config upgrade is required for
     * MaxNumberOfNodeTypesInChaosEntityFilter configuration.
     */
    @JsonProperty(value = "NodeTypeInclusionList")
    private List<String> nodeTypeInclusionList;

    /*
     * A list of application URIs to include in Chaos faults.
     * All replicas belonging to services of these applications are amenable to
     * replica faults (restart replica, remove replica, move primary, and move
     * secondary) by Chaos.
     * Chaos may restart a code package only if the code package hosts replicas
     * of these applications only.
     * If an application does not appear in this list, it can still be faulted
     * in some Chaos iteration if the application ends up on a node of a node
     * type that is included in NodeTypeInclusionList.
     * However, if applicationX is tied to nodeTypeY through placement
     * constraints and applicationX is absent from ApplicationInclusionList and
     * nodeTypeY is absent from NodeTypeInclusionList, then applicationX will
     * never be faulted.
     * At most 1000 application names can be included in this list, to increase
     * this number, a config upgrade is required for
     * MaxNumberOfApplicationsInChaosEntityFilter configuration.
     */
    @JsonProperty(value = "ApplicationInclusionList")
    private List<String> applicationInclusionList;

    /**
     * Get the nodeTypeInclusionList property: A list of node types to include in Chaos faults. All types of faults
     * (restart node, restart code package, remove replica, restart replica, move primary, and move secondary) are
     * enabled for the nodes of these node types. If a node type (say NodeTypeX) does not appear in the
     * NodeTypeInclusionList, then node level faults (like NodeRestart) will never be enabled for the nodes of
     * NodeTypeX, but code package and replica faults can still be enabled for NodeTypeX if an application in the
     * ApplicationInclusionList. happens to reside on a node of NodeTypeX. At most 100 node type names can be included
     * in this list, to increase this number, a config upgrade is required for MaxNumberOfNodeTypesInChaosEntityFilter
     * configuration.
     *
     * @return the nodeTypeInclusionList value.
     */
    public List<String> getNodeTypeInclusionList() {
        return this.nodeTypeInclusionList;
    }

    /**
     * Set the nodeTypeInclusionList property: A list of node types to include in Chaos faults. All types of faults
     * (restart node, restart code package, remove replica, restart replica, move primary, and move secondary) are
     * enabled for the nodes of these node types. If a node type (say NodeTypeX) does not appear in the
     * NodeTypeInclusionList, then node level faults (like NodeRestart) will never be enabled for the nodes of
     * NodeTypeX, but code package and replica faults can still be enabled for NodeTypeX if an application in the
     * ApplicationInclusionList. happens to reside on a node of NodeTypeX. At most 100 node type names can be included
     * in this list, to increase this number, a config upgrade is required for MaxNumberOfNodeTypesInChaosEntityFilter
     * configuration.
     *
     * @param nodeTypeInclusionList the nodeTypeInclusionList value to set.
     * @return the ChaosTargetFilter object itself.
     */
    public ChaosTargetFilter setNodeTypeInclusionList(List<String> nodeTypeInclusionList) {
        this.nodeTypeInclusionList = nodeTypeInclusionList;
        return this;
    }

    /**
     * Get the applicationInclusionList property: A list of application URIs to include in Chaos faults. All replicas
     * belonging to services of these applications are amenable to replica faults (restart replica, remove replica, move
     * primary, and move secondary) by Chaos. Chaos may restart a code package only if the code package hosts replicas
     * of these applications only. If an application does not appear in this list, it can still be faulted in some Chaos
     * iteration if the application ends up on a node of a node type that is included in NodeTypeInclusionList. However,
     * if applicationX is tied to nodeTypeY through placement constraints and applicationX is absent from
     * ApplicationInclusionList and nodeTypeY is absent from NodeTypeInclusionList, then applicationX will never be
     * faulted. At most 1000 application names can be included in this list, to increase this number, a config upgrade
     * is required for MaxNumberOfApplicationsInChaosEntityFilter configuration.
     *
     * @return the applicationInclusionList value.
     */
    public List<String> getApplicationInclusionList() {
        return this.applicationInclusionList;
    }

    /**
     * Set the applicationInclusionList property: A list of application URIs to include in Chaos faults. All replicas
     * belonging to services of these applications are amenable to replica faults (restart replica, remove replica, move
     * primary, and move secondary) by Chaos. Chaos may restart a code package only if the code package hosts replicas
     * of these applications only. If an application does not appear in this list, it can still be faulted in some Chaos
     * iteration if the application ends up on a node of a node type that is included in NodeTypeInclusionList. However,
     * if applicationX is tied to nodeTypeY through placement constraints and applicationX is absent from
     * ApplicationInclusionList and nodeTypeY is absent from NodeTypeInclusionList, then applicationX will never be
     * faulted. At most 1000 application names can be included in this list, to increase this number, a config upgrade
     * is required for MaxNumberOfApplicationsInChaosEntityFilter configuration.
     *
     * @param applicationInclusionList the applicationInclusionList value to set.
     * @return the ChaosTargetFilter object itself.
     */
    public ChaosTargetFilter setApplicationInclusionList(List<String> applicationInclusionList) {
        this.applicationInclusionList = applicationInclusionList;
        return this;
    }
}
