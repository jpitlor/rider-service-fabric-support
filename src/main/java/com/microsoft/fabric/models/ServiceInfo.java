package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about a Service Fabric service. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "ServiceKind",
        defaultImpl = ServiceInfo.class)
@JsonTypeName("ServiceInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceInfo.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceInfo.class)
})
@Fluent
public class ServiceInfo {
    /*
     * The identity of the service. This ID is an encoded representation of the
     * service name. This is used in the REST APIs to identify the service
     * resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the service name is
     * "fabric:/myapp/app1/svc1",
     * the service identity would be "myapp~app1\~svc1" in 6.0+ and
     * "myapp/app1/svc1" in previous versions.
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * The full name of the service with 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * Name of the service type as specified in the service manifest.
     */
    @JsonProperty(value = "TypeName")
    private String typeName;

    /*
     * The version of the service manifest.
     */
    @JsonProperty(value = "ManifestVersion")
    private String manifestVersion;

    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /*
     * The status of the application.
     */
    @JsonProperty(value = "ServiceStatus")
    private ServiceStatus serviceStatus;

    /*
     * Whether the service is in a service group.
     */
    @JsonProperty(value = "IsServiceGroup")
    private Boolean isServiceGroup;

    /**
     * Get the id property: The identity of the service. This ID is an encoded representation of the service name. This
     * is used in the REST APIs to identify the service resource. Starting in version 6.0, hierarchical names are
     * delimited with the "\~" character. For example, if the service name is "fabric:/myapp/app1/svc1", the service
     * identity would be "myapp~app1\~svc1" in 6.0+ and "myapp/app1/svc1" in previous versions.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The identity of the service. This ID is an encoded representation of the service name. This
     * is used in the REST APIs to identify the service resource. Starting in version 6.0, hierarchical names are
     * delimited with the "\~" character. For example, if the service name is "fabric:/myapp/app1/svc1", the service
     * identity would be "myapp~app1\~svc1" in 6.0+ and "myapp/app1/svc1" in previous versions.
     *
     * @param id the id value to set.
     * @return the ServiceInfo object itself.
     */
    public ServiceInfo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The full name of the service with 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The full name of the service with 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the ServiceInfo object itself.
     */
    public ServiceInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the typeName property: Name of the service type as specified in the service manifest.
     *
     * @return the typeName value.
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: Name of the service type as specified in the service manifest.
     *
     * @param typeName the typeName value to set.
     * @return the ServiceInfo object itself.
     */
    public ServiceInfo setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the manifestVersion property: The version of the service manifest.
     *
     * @return the manifestVersion value.
     */
    public String getManifestVersion() {
        return this.manifestVersion;
    }

    /**
     * Set the manifestVersion property: The version of the service manifest.
     *
     * @param manifestVersion the manifestVersion value to set.
     * @return the ServiceInfo object itself.
     */
    public ServiceInfo setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * Get the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @return the healthState value.
     */
    public HealthState getHealthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: The health state of a Service Fabric entity such as Cluster, Node, Application,
     * Service, Partition, Replica etc.
     *
     * @param healthState the healthState value to set.
     * @return the ServiceInfo object itself.
     */
    public ServiceInfo setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the serviceStatus property: The status of the application.
     *
     * @return the serviceStatus value.
     */
    public ServiceStatus getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * Set the serviceStatus property: The status of the application.
     *
     * @param serviceStatus the serviceStatus value to set.
     * @return the ServiceInfo object itself.
     */
    public ServiceInfo setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    /**
     * Get the isServiceGroup property: Whether the service is in a service group.
     *
     * @return the isServiceGroup value.
     */
    public Boolean isServiceGroup() {
        return this.isServiceGroup;
    }

    /**
     * Set the isServiceGroup property: Whether the service is in a service group.
     *
     * @param isServiceGroup the isServiceGroup value to set.
     * @return the ServiceInfo object itself.
     */
    public ServiceInfo setIsServiceGroup(Boolean isServiceGroup) {
        this.isServiceGroup = isServiceGroup;
        return this;
    }
}
