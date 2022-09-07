package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes a service type defined in the service manifest of a provisioned application type. The properties the ones
 * defined in the service manifest.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ServiceTypeDescription.class)
@JsonTypeName("ServiceTypeDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceTypeDescription.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceTypeDescription.class)
})
@Fluent
public class ServiceTypeDescription {
    /*
     * Indicates whether the service type is a stateful service type or a
     * stateless service type. This property is true if the service type is a
     * stateful service type, false otherwise.
     */
    @JsonProperty(value = "IsStateful")
    private Boolean isStateful;

    /*
     * Name of the service type as specified in the service manifest.
     */
    @JsonProperty(value = "ServiceTypeName")
    private String serviceTypeName;

    /*
     * The placement constraint to be used when instantiating this service in a
     * Service Fabric cluster.
     */
    @JsonProperty(value = "PlacementConstraints")
    private String placementConstraints;

    /*
     * The service load metrics is given as an array of
     * ServiceLoadMetricDescription objects.
     */
    @JsonProperty(value = "LoadMetrics")
    private List<ServiceLoadMetricDescription> loadMetrics;

    /*
     * List of service placement policy descriptions.
     */
    @JsonProperty(value = "ServicePlacementPolicies")
    private List<ServicePlacementPolicyDescription> servicePlacementPolicies;

    /*
     * List of service type extensions.
     */
    @JsonProperty(value = "Extensions")
    private List<ServiceTypeExtensionDescription> extensions;

    /**
     * Get the isStateful property: Indicates whether the service type is a stateful service type or a stateless service
     * type. This property is true if the service type is a stateful service type, false otherwise.
     *
     * @return the isStateful value.
     */
    public Boolean isStateful() {
        return this.isStateful;
    }

    /**
     * Set the isStateful property: Indicates whether the service type is a stateful service type or a stateless service
     * type. This property is true if the service type is a stateful service type, false otherwise.
     *
     * @param isStateful the isStateful value to set.
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription setIsStateful(Boolean isStateful) {
        this.isStateful = isStateful;
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
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the placementConstraints property: The placement constraint to be used when instantiating this service in a
     * Service Fabric cluster.
     *
     * @return the placementConstraints value.
     */
    public String getPlacementConstraints() {
        return this.placementConstraints;
    }

    /**
     * Set the placementConstraints property: The placement constraint to be used when instantiating this service in a
     * Service Fabric cluster.
     *
     * @param placementConstraints the placementConstraints value to set.
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription setPlacementConstraints(String placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * Get the loadMetrics property: The service load metrics is given as an array of ServiceLoadMetricDescription
     * objects.
     *
     * @return the loadMetrics value.
     */
    public List<ServiceLoadMetricDescription> getLoadMetrics() {
        return this.loadMetrics;
    }

    /**
     * Set the loadMetrics property: The service load metrics is given as an array of ServiceLoadMetricDescription
     * objects.
     *
     * @param loadMetrics the loadMetrics value to set.
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription setLoadMetrics(List<ServiceLoadMetricDescription> loadMetrics) {
        this.loadMetrics = loadMetrics;
        return this;
    }

    /**
     * Get the servicePlacementPolicies property: List of service placement policy descriptions.
     *
     * @return the servicePlacementPolicies value.
     */
    public List<ServicePlacementPolicyDescription> getServicePlacementPolicies() {
        return this.servicePlacementPolicies;
    }

    /**
     * Set the servicePlacementPolicies property: List of service placement policy descriptions.
     *
     * @param servicePlacementPolicies the servicePlacementPolicies value to set.
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription setServicePlacementPolicies(
            List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        this.servicePlacementPolicies = servicePlacementPolicies;
        return this;
    }

    /**
     * Get the extensions property: List of service type extensions.
     *
     * @return the extensions value.
     */
    public List<ServiceTypeExtensionDescription> getExtensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: List of service type extensions.
     *
     * @param extensions the extensions value to set.
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription setExtensions(List<ServiceTypeExtensionDescription> extensions) {
        this.extensions = extensions;
        return this;
    }
}
