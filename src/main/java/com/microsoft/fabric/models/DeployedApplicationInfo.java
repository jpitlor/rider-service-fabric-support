package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about application deployed on the node. */
@Fluent
public final class DeployedApplicationInfo {
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
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "TypeName")
    private String typeName;

    /*
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "TypeVersion")
    private String typeVersion;

    /*
     * The status of the application deployed on the node. Following are the
     * possible values.
     */
    @JsonProperty(value = "Status")
    private DeployedApplicationStatus status;

    /*
     * The work directory of the application on the node. The work directory
     * can be used to store application data.
     */
    @JsonProperty(value = "WorkDirectory")
    private String workDirectory;

    /*
     * The log directory of the application on the node. The log directory can
     * be used to store application logs.
     */
    @JsonProperty(value = "LogDirectory")
    private String logDirectory;

    /*
     * The temp directory of the application on the node. The code packages
     * belonging to the application are forked with this directory set as their
     * temporary directory.
     */
    @JsonProperty(value = "TempDirectory")
    private String tempDirectory;

    /*
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

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
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the application, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set.
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the typeName property: The application type name as defined in the application manifest.
     *
     * @return the typeName value.
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The application type name as defined in the application manifest.
     *
     * @param typeName the typeName value to set.
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the typeVersion property: The version of the application type as defined in the application manifest.
     *
     * @return the typeVersion value.
     */
    public String getTypeVersion() {
        return this.typeVersion;
    }

    /**
     * Set the typeVersion property: The version of the application type as defined in the application manifest.
     *
     * @param typeVersion the typeVersion value to set.
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setTypeVersion(String typeVersion) {
        this.typeVersion = typeVersion;
        return this;
    }

    /**
     * Get the status property: The status of the application deployed on the node. Following are the possible values.
     *
     * @return the status value.
     */
    public DeployedApplicationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the application deployed on the node. Following are the possible values.
     *
     * @param status the status value to set.
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setStatus(DeployedApplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the workDirectory property: The work directory of the application on the node. The work directory can be used
     * to store application data.
     *
     * @return the workDirectory value.
     */
    public String getWorkDirectory() {
        return this.workDirectory;
    }

    /**
     * Set the workDirectory property: The work directory of the application on the node. The work directory can be used
     * to store application data.
     *
     * @param workDirectory the workDirectory value to set.
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setWorkDirectory(String workDirectory) {
        this.workDirectory = workDirectory;
        return this;
    }

    /**
     * Get the logDirectory property: The log directory of the application on the node. The log directory can be used to
     * store application logs.
     *
     * @return the logDirectory value.
     */
    public String getLogDirectory() {
        return this.logDirectory;
    }

    /**
     * Set the logDirectory property: The log directory of the application on the node. The log directory can be used to
     * store application logs.
     *
     * @param logDirectory the logDirectory value to set.
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setLogDirectory(String logDirectory) {
        this.logDirectory = logDirectory;
        return this;
    }

    /**
     * Get the tempDirectory property: The temp directory of the application on the node. The code packages belonging to
     * the application are forked with this directory set as their temporary directory.
     *
     * @return the tempDirectory value.
     */
    public String getTempDirectory() {
        return this.tempDirectory;
    }

    /**
     * Set the tempDirectory property: The temp directory of the application on the node. The code packages belonging to
     * the application are forked with this directory set as their temporary directory.
     *
     * @param tempDirectory the tempDirectory value to set.
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setTempDirectory(String tempDirectory) {
        this.tempDirectory = tempDirectory;
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
     * @return the DeployedApplicationInfo object itself.
     */
    public DeployedApplicationInfo setHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }
}
