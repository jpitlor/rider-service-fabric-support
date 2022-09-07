package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A ServiceUpdateDescription contains all of the information necessary to update a service. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = ServiceUpdateDescription.class)
@JsonTypeName("ServiceUpdateDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceUpdateDescription.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceUpdateDescription.class)
})
@Fluent
public class ServiceUpdateDescription {
    /*
     * Flags indicating whether other properties are set. Each of the
     * associated properties corresponds to a flag, specified below, which, if
     * set, indicate that the property is specified.
     * This property can be a combination of those flags obtained using bitwise
     * 'OR' operator.
     * For example, if the provided value is 6 then the flags for
     * ReplicaRestartWaitDuration (2) and QuorumLossWaitDuration (4) are set.
     *
     * - None - Does not indicate any other properties are set. The value is
     * zero.
     * - TargetReplicaSetSize/InstanceCount - Indicates whether the
     * TargetReplicaSetSize property (for Stateful services) or the
     * InstanceCount property (for Stateless services) is set. The value is 1.
     * - ReplicaRestartWaitDuration - Indicates the ReplicaRestartWaitDuration
     * property is set. The value is  2.
     * - QuorumLossWaitDuration - Indicates the QuorumLossWaitDuration property
     * is set. The value is 4.
     * - StandByReplicaKeepDuration - Indicates the StandByReplicaKeepDuration
     * property is set. The value is 8.
     * - MinReplicaSetSize - Indicates the MinReplicaSetSize property is set.
     * The value is 16.
     * - PlacementConstraints - Indicates the PlacementConstraints property is
     * set. The value is 32.
     * - PlacementPolicyList - Indicates the ServicePlacementPolicies property
     * is set. The value is 64.
     * - Correlation - Indicates the CorrelationScheme property is set. The
     * value is 128.
     * - Metrics - Indicates the ServiceLoadMetrics property is set. The value
     * is 256.
     * - DefaultMoveCost - Indicates the DefaultMoveCost property is set. The
     * value is 512.
     * - ScalingPolicy - Indicates the ScalingPolicies property is set. The
     * value is 1024.
     * - ServicePlacementTimeLimit - Indicates the ServicePlacementTimeLimit
     * property is set. The value is 2048.
     * - MinInstanceCount - Indicates the MinInstanceCount property is set. The
     * value is 4096.
     * - MinInstancePercentage - Indicates the MinInstancePercentage property
     * is set. The value is 8192.
     * - InstanceCloseDelayDuration - Indicates the InstanceCloseDelayDuration
     * property is set. The value is 16384.
     * - InstanceRestartWaitDuration - Indicates the InstanceCloseDelayDuration
     * property is set. The value is 32768.
     * - DropSourceReplicaOnMove - Indicates the DropSourceReplicaOnMove
     * property is set. The value is 65536.
     * - ServiceDnsName - Indicates the ServiceDnsName property is set. The
     * value is 131072.
     * - TagsForPlacement - Indicates the TagsForPlacement property is set. The
     * value is 1048576.
     * - TagsForRunning - Indicates the TagsForRunning property is set. The
     * value is 2097152.
     */
    @JsonProperty(value = "Flags")
    private String flags;

    /*
     * The placement constraints as a string. Placement constraints are boolean
     * expressions on node properties and allow for restricting a service to
     * particular nodes based on the service requirements. For example, to
     * place a service on nodes where NodeType is blue specify the following:
     * "NodeColor == blue)".
     */
    @JsonProperty(value = "PlacementConstraints")
    private String placementConstraints;

    /*
     * The correlation scheme.
     */
    @JsonProperty(value = "CorrelationScheme")
    private List<ServiceCorrelationDescription> correlationScheme;

    /*
     * The service load metrics.
     */
    @JsonProperty(value = "LoadMetrics")
    private List<ServiceLoadMetricDescription> loadMetrics;

    /*
     * The service placement policies.
     */
    @JsonProperty(value = "ServicePlacementPolicies")
    private List<ServicePlacementPolicyDescription> servicePlacementPolicies;

    /*
     * The move cost for the service.
     */
    @JsonProperty(value = "DefaultMoveCost")
    private MoveCost defaultMoveCost;

    /*
     * Scaling policies for this service.
     */
    @JsonProperty(value = "ScalingPolicies")
    private List<ScalingPolicyDescription> scalingPolicies;

    /*
     * The DNS name of the service.
     */
    @JsonProperty(value = "ServiceDnsName")
    private String serviceDnsName;

    /*
     * Tags for placement of this service.
     */
    @JsonProperty(value = "TagsForPlacement")
    private NodeTagsDescription tagsForPlacement;

    /*
     * Tags for running of this service.
     */
    @JsonProperty(value = "TagsForRunning")
    private NodeTagsDescription tagsForRunning;

    /**
     * Get the flags property: Flags indicating whether other properties are set. Each of the associated properties
     * corresponds to a flag, specified below, which, if set, indicate that the property is specified. This property can
     * be a combination of those flags obtained using bitwise 'OR' operator. For example, if the provided value is 6
     * then the flags for ReplicaRestartWaitDuration (2) and QuorumLossWaitDuration (4) are set.
     *
     * <p>- None - Does not indicate any other properties are set. The value is zero. -
     * TargetReplicaSetSize/InstanceCount - Indicates whether the TargetReplicaSetSize property (for Stateful services)
     * or the InstanceCount property (for Stateless services) is set. The value is 1. - ReplicaRestartWaitDuration -
     * Indicates the ReplicaRestartWaitDuration property is set. The value is 2. - QuorumLossWaitDuration - Indicates
     * the QuorumLossWaitDuration property is set. The value is 4. - StandByReplicaKeepDuration - Indicates the
     * StandByReplicaKeepDuration property is set. The value is 8. - MinReplicaSetSize - Indicates the MinReplicaSetSize
     * property is set. The value is 16. - PlacementConstraints - Indicates the PlacementConstraints property is set.
     * The value is 32. - PlacementPolicyList - Indicates the ServicePlacementPolicies property is set. The value is 64.
     * - Correlation - Indicates the CorrelationScheme property is set. The value is 128. - Metrics - Indicates the
     * ServiceLoadMetrics property is set. The value is 256. - DefaultMoveCost - Indicates the DefaultMoveCost property
     * is set. The value is 512. - ScalingPolicy - Indicates the ScalingPolicies property is set. The value is 1024. -
     * ServicePlacementTimeLimit - Indicates the ServicePlacementTimeLimit property is set. The value is 2048. -
     * MinInstanceCount - Indicates the MinInstanceCount property is set. The value is 4096. - MinInstancePercentage -
     * Indicates the MinInstancePercentage property is set. The value is 8192. - InstanceCloseDelayDuration - Indicates
     * the InstanceCloseDelayDuration property is set. The value is 16384. - InstanceRestartWaitDuration - Indicates the
     * InstanceCloseDelayDuration property is set. The value is 32768. - DropSourceReplicaOnMove - Indicates the
     * DropSourceReplicaOnMove property is set. The value is 65536. - ServiceDnsName - Indicates the ServiceDnsName
     * property is set. The value is 131072. - TagsForPlacement - Indicates the TagsForPlacement property is set. The
     * value is 1048576. - TagsForRunning - Indicates the TagsForRunning property is set. The value is 2097152.
     *
     * @return the flags value.
     */
    public String getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: Flags indicating whether other properties are set. Each of the associated properties
     * corresponds to a flag, specified below, which, if set, indicate that the property is specified. This property can
     * be a combination of those flags obtained using bitwise 'OR' operator. For example, if the provided value is 6
     * then the flags for ReplicaRestartWaitDuration (2) and QuorumLossWaitDuration (4) are set.
     *
     * <p>- None - Does not indicate any other properties are set. The value is zero. -
     * TargetReplicaSetSize/InstanceCount - Indicates whether the TargetReplicaSetSize property (for Stateful services)
     * or the InstanceCount property (for Stateless services) is set. The value is 1. - ReplicaRestartWaitDuration -
     * Indicates the ReplicaRestartWaitDuration property is set. The value is 2. - QuorumLossWaitDuration - Indicates
     * the QuorumLossWaitDuration property is set. The value is 4. - StandByReplicaKeepDuration - Indicates the
     * StandByReplicaKeepDuration property is set. The value is 8. - MinReplicaSetSize - Indicates the MinReplicaSetSize
     * property is set. The value is 16. - PlacementConstraints - Indicates the PlacementConstraints property is set.
     * The value is 32. - PlacementPolicyList - Indicates the ServicePlacementPolicies property is set. The value is 64.
     * - Correlation - Indicates the CorrelationScheme property is set. The value is 128. - Metrics - Indicates the
     * ServiceLoadMetrics property is set. The value is 256. - DefaultMoveCost - Indicates the DefaultMoveCost property
     * is set. The value is 512. - ScalingPolicy - Indicates the ScalingPolicies property is set. The value is 1024. -
     * ServicePlacementTimeLimit - Indicates the ServicePlacementTimeLimit property is set. The value is 2048. -
     * MinInstanceCount - Indicates the MinInstanceCount property is set. The value is 4096. - MinInstancePercentage -
     * Indicates the MinInstancePercentage property is set. The value is 8192. - InstanceCloseDelayDuration - Indicates
     * the InstanceCloseDelayDuration property is set. The value is 16384. - InstanceRestartWaitDuration - Indicates the
     * InstanceCloseDelayDuration property is set. The value is 32768. - DropSourceReplicaOnMove - Indicates the
     * DropSourceReplicaOnMove property is set. The value is 65536. - ServiceDnsName - Indicates the ServiceDnsName
     * property is set. The value is 131072. - TagsForPlacement - Indicates the TagsForPlacement property is set. The
     * value is 1048576. - TagsForRunning - Indicates the TagsForRunning property is set. The value is 2097152.
     *
     * @param flags the flags value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setFlags(String flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the placementConstraints property: The placement constraints as a string. Placement constraints are boolean
     * expressions on node properties and allow for restricting a service to particular nodes based on the service
     * requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor
     * == blue)".
     *
     * @return the placementConstraints value.
     */
    public String getPlacementConstraints() {
        return this.placementConstraints;
    }

    /**
     * Set the placementConstraints property: The placement constraints as a string. Placement constraints are boolean
     * expressions on node properties and allow for restricting a service to particular nodes based on the service
     * requirements. For example, to place a service on nodes where NodeType is blue specify the following: "NodeColor
     * == blue)".
     *
     * @param placementConstraints the placementConstraints value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setPlacementConstraints(String placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * Get the correlationScheme property: The correlation scheme.
     *
     * @return the correlationScheme value.
     */
    public List<ServiceCorrelationDescription> getCorrelationScheme() {
        return this.correlationScheme;
    }

    /**
     * Set the correlationScheme property: The correlation scheme.
     *
     * @param correlationScheme the correlationScheme value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setCorrelationScheme(List<ServiceCorrelationDescription> correlationScheme) {
        this.correlationScheme = correlationScheme;
        return this;
    }

    /**
     * Get the loadMetrics property: The service load metrics.
     *
     * @return the loadMetrics value.
     */
    public List<ServiceLoadMetricDescription> getLoadMetrics() {
        return this.loadMetrics;
    }

    /**
     * Set the loadMetrics property: The service load metrics.
     *
     * @param loadMetrics the loadMetrics value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setLoadMetrics(List<ServiceLoadMetricDescription> loadMetrics) {
        this.loadMetrics = loadMetrics;
        return this;
    }

    /**
     * Get the servicePlacementPolicies property: The service placement policies.
     *
     * @return the servicePlacementPolicies value.
     */
    public List<ServicePlacementPolicyDescription> getServicePlacementPolicies() {
        return this.servicePlacementPolicies;
    }

    /**
     * Set the servicePlacementPolicies property: The service placement policies.
     *
     * @param servicePlacementPolicies the servicePlacementPolicies value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setServicePlacementPolicies(
            List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        this.servicePlacementPolicies = servicePlacementPolicies;
        return this;
    }

    /**
     * Get the defaultMoveCost property: The move cost for the service.
     *
     * @return the defaultMoveCost value.
     */
    public MoveCost getDefaultMoveCost() {
        return this.defaultMoveCost;
    }

    /**
     * Set the defaultMoveCost property: The move cost for the service.
     *
     * @param defaultMoveCost the defaultMoveCost value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setDefaultMoveCost(MoveCost defaultMoveCost) {
        this.defaultMoveCost = defaultMoveCost;
        return this;
    }

    /**
     * Get the scalingPolicies property: Scaling policies for this service.
     *
     * @return the scalingPolicies value.
     */
    public List<ScalingPolicyDescription> getScalingPolicies() {
        return this.scalingPolicies;
    }

    /**
     * Set the scalingPolicies property: Scaling policies for this service.
     *
     * @param scalingPolicies the scalingPolicies value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setScalingPolicies(List<ScalingPolicyDescription> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
        return this;
    }

    /**
     * Get the serviceDnsName property: The DNS name of the service.
     *
     * @return the serviceDnsName value.
     */
    public String getServiceDnsName() {
        return this.serviceDnsName;
    }

    /**
     * Set the serviceDnsName property: The DNS name of the service.
     *
     * @param serviceDnsName the serviceDnsName value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setServiceDnsName(String serviceDnsName) {
        this.serviceDnsName = serviceDnsName;
        return this;
    }

    /**
     * Get the tagsForPlacement property: Tags for placement of this service.
     *
     * @return the tagsForPlacement value.
     */
    public NodeTagsDescription getTagsForPlacement() {
        return this.tagsForPlacement;
    }

    /**
     * Set the tagsForPlacement property: Tags for placement of this service.
     *
     * @param tagsForPlacement the tagsForPlacement value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setTagsForPlacement(NodeTagsDescription tagsForPlacement) {
        this.tagsForPlacement = tagsForPlacement;
        return this;
    }

    /**
     * Get the tagsForRunning property: Tags for running of this service.
     *
     * @return the tagsForRunning value.
     */
    public NodeTagsDescription getTagsForRunning() {
        return this.tagsForRunning;
    }

    /**
     * Set the tagsForRunning property: Tags for running of this service.
     *
     * @param tagsForRunning the tagsForRunning value to set.
     * @return the ServiceUpdateDescription object itself.
     */
    public ServiceUpdateDescription setTagsForRunning(NodeTagsDescription tagsForRunning) {
        this.tagsForRunning = tagsForRunning;
        return this;
    }
}
