package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the base for all Service Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ServiceEvent.class)
@JsonTypeName("ServiceEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ServiceCreated", value = ServiceCreatedEvent.class),
    @JsonSubTypes.Type(name = "ServiceDeleted", value = ServiceDeletedEvent.class),
    @JsonSubTypes.Type(name = "ServiceNewHealthReport", value = ServiceNewHealthReportEvent.class),
    @JsonSubTypes.Type(name = "ServiceHealthReportExpired", value = ServiceHealthReportExpiredEvent.class)
})
@Fluent
public class ServiceEvent extends FabricEvent {
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
    @JsonProperty(value = "ServiceId", required = true)
    private String serviceId;

    /**
     * Get the serviceId property: The identity of the service. This ID is an encoded representation of the service
     * name. This is used in the REST APIs to identify the service resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the service name is "fabric:/myapp/app1/svc1", the service
     * identity would be "myapp~app1\~svc1" in 6.0+ and "myapp/app1/svc1" in previous versions.
     *
     * @return the serviceId value.
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * Set the serviceId property: The identity of the service. This ID is an encoded representation of the service
     * name. This is used in the REST APIs to identify the service resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the service name is "fabric:/myapp/app1/svc1", the service
     * identity would be "myapp~app1\~svc1" in 6.0+ and "myapp/app1/svc1" in previous versions.
     *
     * @param serviceId the serviceId value to set.
     * @return the ServiceEvent object itself.
     */
    public ServiceEvent setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
}
