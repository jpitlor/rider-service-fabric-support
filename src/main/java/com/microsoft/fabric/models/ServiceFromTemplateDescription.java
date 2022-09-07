package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines description for creating a Service Fabric service from a template defined in the application manifest. */
@Fluent
public final class ServiceFromTemplateDescription {
    /*
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "ApplicationName", required = true)
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
     * The initialization data for the newly created service instance.
     */
    @JsonProperty(value = "InitializationData")
    private List<Integer> initializationData;

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
     * @return the ServiceFromTemplateDescription object itself.
     */
    public ServiceFromTemplateDescription setApplicationName(String applicationName) {
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
     * @return the ServiceFromTemplateDescription object itself.
     */
    public ServiceFromTemplateDescription setServiceName(String serviceName) {
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
     * @return the ServiceFromTemplateDescription object itself.
     */
    public ServiceFromTemplateDescription setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the initializationData property: The initialization data for the newly created service instance.
     *
     * @return the initializationData value.
     */
    public List<Integer> getInitializationData() {
        return this.initializationData;
    }

    /**
     * Set the initializationData property: The initialization data for the newly created service instance.
     *
     * @param initializationData the initializationData value to set.
     * @return the ServiceFromTemplateDescription object itself.
     */
    public ServiceFromTemplateDescription setInitializationData(List<Integer> initializationData) {
        this.initializationData = initializationData;
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
     * @return the ServiceFromTemplateDescription object itself.
     */
    public ServiceFromTemplateDescription setServicePackageActivationMode(
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
     * @return the ServiceFromTemplateDescription object itself.
     */
    public ServiceFromTemplateDescription setServiceDnsName(String serviceDnsName) {
        this.serviceDnsName = serviceDnsName;
        return this;
    }
}
