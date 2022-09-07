package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A ServiceDescription contains all of the information necessary to create a service. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = ServiceDescription.class)
@JsonTypeName("ServiceDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceDescription.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceDescription.class)
})
@Fluent
public class ServiceDescription {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName")
    private String applicationName;

    /*
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ServiceName", required = true)
    private String serviceName;

    /*
     * Name of the service type as specified in the service manifest.
     */
    @JsonProperty(value = "ServiceTypeName", required = true)
    private String serviceTypeName;

    /*
     * The initialization data as an array of bytes. Initialization data is
     * passed to service instances or replicas when they are created.
     */
    @JsonProperty(value = "InitializationData")
    private List<Integer> initializationData;

    /*
     * The partition description as an object.
     */
    @JsonProperty(value = "PartitionDescription", required = true)
    private PartitionSchemeDescription partitionDescription;

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
    @JsonProperty(value = "ServiceLoadMetrics")
    private List<ServiceLoadMetricDescription> serviceLoadMetrics;

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
     * Indicates if the DefaultMoveCost property is specified.
     */
    @JsonProperty(value = "IsDefaultMoveCostSpecified")
    private Boolean isDefaultMoveCostSpecified;

    /*
     * The activation mode of service package to be used for a service.
     */
    @JsonProperty(value = "ServicePackageActivationMode")
    private ServicePackageActivationMode servicePackageActivationMode;

    /*
     * The DNS name of the service. It requires the DNS system service to be
     * enabled in Service Fabric cluster.
     */
    @JsonProperty(value = "ServiceDnsName")
    private String serviceDnsName;

    /*
     * Scaling policies for this service.
     */
    @JsonProperty(value = "ScalingPolicies")
    private List<ScalingPolicyDescription> scalingPolicies;

    /*
     * Tags for placement of this service.
     */
    @JsonProperty(value = "TagsRequiredToPlace")
    private NodeTagsDescription tagsRequiredToPlace;

    /*
     * Tags for running of this service.
     */
    @JsonProperty(value = "TagsRequiredToRun")
    private NodeTagsDescription tagsRequiredToRun;

    /**
     * Get the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the applicationName value.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param applicationName the applicationName value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The full name of the service with 'fabric:' URI scheme.
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the serviceTypeName property: Name of the service type as specified in the service manifest.
     *
     * @return the serviceTypeName value.
     */
    public String getServiceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set the serviceTypeName property: Name of the service type as specified in the service manifest.
     *
     * @param serviceTypeName the serviceTypeName value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the initializationData property: The initialization data as an array of bytes. Initialization data is passed
     * to service instances or replicas when they are created.
     *
     * @return the initializationData value.
     */
    public List<Integer> getInitializationData() {
        return this.initializationData;
    }

    /**
     * Set the initializationData property: The initialization data as an array of bytes. Initialization data is passed
     * to service instances or replicas when they are created.
     *
     * @param initializationData the initializationData value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setInitializationData(List<Integer> initializationData) {
        this.initializationData = initializationData;
        return this;
    }

    /**
     * Get the partitionDescription property: The partition description as an object.
     *
     * @return the partitionDescription value.
     */
    public PartitionSchemeDescription getPartitionDescription() {
        return this.partitionDescription;
    }

    /**
     * Set the partitionDescription property: The partition description as an object.
     *
     * @param partitionDescription the partitionDescription value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setPartitionDescription(PartitionSchemeDescription partitionDescription) {
        this.partitionDescription = partitionDescription;
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
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setPlacementConstraints(String placementConstraints) {
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
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setCorrelationScheme(List<ServiceCorrelationDescription> correlationScheme) {
        this.correlationScheme = correlationScheme;
        return this;
    }

    /**
     * Get the serviceLoadMetrics property: The service load metrics.
     *
     * @return the serviceLoadMetrics value.
     */
    public List<ServiceLoadMetricDescription> getServiceLoadMetrics() {
        return this.serviceLoadMetrics;
    }

    /**
     * Set the serviceLoadMetrics property: The service load metrics.
     *
     * @param serviceLoadMetrics the serviceLoadMetrics value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setServiceLoadMetrics(List<ServiceLoadMetricDescription> serviceLoadMetrics) {
        this.serviceLoadMetrics = serviceLoadMetrics;
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
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setServicePlacementPolicies(
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
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setDefaultMoveCost(MoveCost defaultMoveCost) {
        this.defaultMoveCost = defaultMoveCost;
        return this;
    }

    /**
     * Get the isDefaultMoveCostSpecified property: Indicates if the DefaultMoveCost property is specified.
     *
     * @return the isDefaultMoveCostSpecified value.
     */
    public Boolean isDefaultMoveCostSpecified() {
        return this.isDefaultMoveCostSpecified;
    }

    /**
     * Set the isDefaultMoveCostSpecified property: Indicates if the DefaultMoveCost property is specified.
     *
     * @param isDefaultMoveCostSpecified the isDefaultMoveCostSpecified value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setIsDefaultMoveCostSpecified(Boolean isDefaultMoveCostSpecified) {
        this.isDefaultMoveCostSpecified = isDefaultMoveCostSpecified;
        return this;
    }

    /**
     * Get the servicePackageActivationMode property: The activation mode of service package to be used for a service.
     *
     * @return the servicePackageActivationMode value.
     */
    public ServicePackageActivationMode getServicePackageActivationMode() {
        return this.servicePackageActivationMode;
    }

    /**
     * Set the servicePackageActivationMode property: The activation mode of service package to be used for a service.
     *
     * @param servicePackageActivationMode the servicePackageActivationMode value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setServicePackageActivationMode(
            ServicePackageActivationMode servicePackageActivationMode) {
        this.servicePackageActivationMode = servicePackageActivationMode;
        return this;
    }

    /**
     * Get the serviceDnsName property: The DNS name of the service. It requires the DNS system service to be enabled in
     * Service Fabric cluster.
     *
     * @return the serviceDnsName value.
     */
    public String getServiceDnsName() {
        return this.serviceDnsName;
    }

    /**
     * Set the serviceDnsName property: The DNS name of the service. It requires the DNS system service to be enabled in
     * Service Fabric cluster.
     *
     * @param serviceDnsName the serviceDnsName value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setServiceDnsName(String serviceDnsName) {
        this.serviceDnsName = serviceDnsName;
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
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setScalingPolicies(List<ScalingPolicyDescription> scalingPolicies) {
        this.scalingPolicies = scalingPolicies;
        return this;
    }

    /**
     * Get the tagsRequiredToPlace property: Tags for placement of this service.
     *
     * @return the tagsRequiredToPlace value.
     */
    public NodeTagsDescription getTagsRequiredToPlace() {
        return this.tagsRequiredToPlace;
    }

    /**
     * Set the tagsRequiredToPlace property: Tags for placement of this service.
     *
     * @param tagsRequiredToPlace the tagsRequiredToPlace value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setTagsRequiredToPlace(NodeTagsDescription tagsRequiredToPlace) {
        this.tagsRequiredToPlace = tagsRequiredToPlace;
        return this;
    }

    /**
     * Get the tagsRequiredToRun property: Tags for running of this service.
     *
     * @return the tagsRequiredToRun value.
     */
    public NodeTagsDescription getTagsRequiredToRun() {
        return this.tagsRequiredToRun;
    }

    /**
     * Set the tagsRequiredToRun property: Tags for running of this service.
     *
     * @param tagsRequiredToRun the tagsRequiredToRun value to set.
     * @return the ServiceDescription object itself.
     */
    public ServiceDescription setTagsRequiredToRun(NodeTagsDescription tagsRequiredToRun) {
        this.tagsRequiredToRun = tagsRequiredToRun;
        return this;
    }
}
