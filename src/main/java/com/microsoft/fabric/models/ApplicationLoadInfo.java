package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Load Information about a Service Fabric application. */
@Fluent
public final class ApplicationLoadInfo {
    /*
     * The identity of the application. This is an encoded representation of
     * the application name. This is used in the REST APIs to identify the
     * application resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the application name is "fabric:/myapp/app1",
     * the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1"
     * in previous versions.
     */
    @JsonProperty(value = "Id")
    private String id;

    /*
     * The minimum number of nodes for this application.
     * It is the number of nodes where Service Fabric will reserve Capacity in
     * the cluster which equals to ReservedLoad * MinimumNodes for this
     * Application instance.
     * For applications that do not have application capacity defined this
     * value will be zero.
     */
    @JsonProperty(value = "MinimumNodes")
    private Long minimumNodes;

    /*
     * The maximum number of nodes where this application can be instantiated.
     * It is the number of nodes this application is allowed to span.
     * For applications that do not have application capacity defined this
     * value will be zero.
     */
    @JsonProperty(value = "MaximumNodes")
    private Long maximumNodes;

    /*
     * The number of nodes on which this application is instantiated.
     * For applications that do not have application capacity defined this
     * value will be zero.
     */
    @JsonProperty(value = "NodeCount")
    private Long nodeCount;

    /*
     * List of application load metric information.
     */
    @JsonProperty(value = "ApplicationLoadMetricInformation")
    private List<ApplicationLoadMetricInformation> applicationLoadMetricInformation;

    /**
     * Get the id property: The identity of the application. This is an encoded representation of the application name.
     * This is used in the REST APIs to identify the application resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the application name is "fabric:/myapp/app1", the
     * application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous versions.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The identity of the application. This is an encoded representation of the application name.
     * This is used in the REST APIs to identify the application resource. Starting in version 6.0, hierarchical names
     * are delimited with the "\~" character. For example, if the application name is "fabric:/myapp/app1", the
     * application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous versions.
     *
     * @param id the id value to set.
     * @return the ApplicationLoadInfo object itself.
     */
    public ApplicationLoadInfo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the minimumNodes property: The minimum number of nodes for this application. It is the number of nodes where
     * Service Fabric will reserve Capacity in the cluster which equals to ReservedLoad * MinimumNodes for this
     * Application instance. For applications that do not have application capacity defined this value will be zero.
     *
     * @return the minimumNodes value.
     */
    public Long getMinimumNodes() {
        return this.minimumNodes;
    }

    /**
     * Set the minimumNodes property: The minimum number of nodes for this application. It is the number of nodes where
     * Service Fabric will reserve Capacity in the cluster which equals to ReservedLoad * MinimumNodes for this
     * Application instance. For applications that do not have application capacity defined this value will be zero.
     *
     * @param minimumNodes the minimumNodes value to set.
     * @return the ApplicationLoadInfo object itself.
     */
    public ApplicationLoadInfo setMinimumNodes(Long minimumNodes) {
        this.minimumNodes = minimumNodes;
        return this;
    }

    /**
     * Get the maximumNodes property: The maximum number of nodes where this application can be instantiated. It is the
     * number of nodes this application is allowed to span. For applications that do not have application capacity
     * defined this value will be zero.
     *
     * @return the maximumNodes value.
     */
    public Long getMaximumNodes() {
        return this.maximumNodes;
    }

    /**
     * Set the maximumNodes property: The maximum number of nodes where this application can be instantiated. It is the
     * number of nodes this application is allowed to span. For applications that do not have application capacity
     * defined this value will be zero.
     *
     * @param maximumNodes the maximumNodes value to set.
     * @return the ApplicationLoadInfo object itself.
     */
    public ApplicationLoadInfo setMaximumNodes(Long maximumNodes) {
        this.maximumNodes = maximumNodes;
        return this;
    }

    /**
     * Get the nodeCount property: The number of nodes on which this application is instantiated. For applications that
     * do not have application capacity defined this value will be zero.
     *
     * @return the nodeCount value.
     */
    public Long getNodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount property: The number of nodes on which this application is instantiated. For applications that
     * do not have application capacity defined this value will be zero.
     *
     * @param nodeCount the nodeCount value to set.
     * @return the ApplicationLoadInfo object itself.
     */
    public ApplicationLoadInfo setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the applicationLoadMetricInformation property: List of application load metric information.
     *
     * @return the applicationLoadMetricInformation value.
     */
    public List<ApplicationLoadMetricInformation> getApplicationLoadMetricInformation() {
        return this.applicationLoadMetricInformation;
    }

    /**
     * Set the applicationLoadMetricInformation property: List of application load metric information.
     *
     * @param applicationLoadMetricInformation the applicationLoadMetricInformation value to set.
     * @return the ApplicationLoadInfo object itself.
     */
    public ApplicationLoadInfo setApplicationLoadMetricInformation(
            List<ApplicationLoadMetricInformation> applicationLoadMetricInformation) {
        this.applicationLoadMetricInformation = applicationLoadMetricInformation;
        return this;
    }
}
