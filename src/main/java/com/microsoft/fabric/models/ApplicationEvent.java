package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents the base for all Application Events. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ApplicationEvent.class)
@JsonTypeName("ApplicationEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ApplicationCreated", value = ApplicationCreatedEvent.class),
    @JsonSubTypes.Type(name = "ApplicationDeleted", value = ApplicationDeletedEvent.class),
    @JsonSubTypes.Type(name = "ApplicationNewHealthReport", value = ApplicationNewHealthReportEvent.class),
    @JsonSubTypes.Type(name = "ApplicationHealthReportExpired", value = ApplicationHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ApplicationUpgradeCompleted", value = ApplicationUpgradeCompletedEvent.class),
    @JsonSubTypes.Type(
            name = "ApplicationUpgradeDomainCompleted",
            value = ApplicationUpgradeDomainCompletedEvent.class),
    @JsonSubTypes.Type(
            name = "ApplicationUpgradeRollbackCompleted",
            value = ApplicationUpgradeRollbackCompletedEvent.class),
    @JsonSubTypes.Type(
            name = "ApplicationUpgradeRollbackStarted",
            value = ApplicationUpgradeRollbackStartedEvent.class),
    @JsonSubTypes.Type(name = "ApplicationUpgradeStarted", value = ApplicationUpgradeStartedEvent.class),
    @JsonSubTypes.Type(
            name = "DeployedApplicationNewHealthReport",
            value = DeployedApplicationNewHealthReportEvent.class),
    @JsonSubTypes.Type(
            name = "DeployedApplicationHealthReportExpired",
            value = DeployedApplicationHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ApplicationProcessExited", value = ApplicationProcessExitedEvent.class),
    @JsonSubTypes.Type(
            name = "ApplicationContainerInstanceExited",
            value = ApplicationContainerInstanceExitedEvent.class),
    @JsonSubTypes.Type(
            name = "DeployedServicePackageNewHealthReport",
            value = DeployedServicePackageNewHealthReportEvent.class),
    @JsonSubTypes.Type(
            name = "DeployedServicePackageHealthReportExpired",
            value = DeployedServicePackageHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ChaosCodePackageRestartScheduled", value = ChaosCodePackageRestartScheduledEvent.class)
})
@Fluent
public class ApplicationEvent extends FabricEvent {
    /*
     * The identity of the application. This is an encoded representation of
     * the application name. This is used in the REST APIs to identify the
     * application resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the application name is "fabric:/myapp/app1",
     * the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1"
     * in previous versions.
     */
    @JsonProperty(value = "ApplicationId", required = true)
    private String applicationId;

    /**
     * Get the applicationId property: The identity of the application. This is an encoded representation of the
     * application name. This is used in the REST APIs to identify the application resource. Starting in version 6.0,
     * hierarchical names are delimited with the "\~" character. For example, if the application name is
     * "fabric:/myapp/app1", the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous
     * versions.
     *
     * @return the applicationId value.
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The identity of the application. This is an encoded representation of the
     * application name. This is used in the REST APIs to identify the application resource. Starting in version 6.0,
     * hierarchical names are delimited with the "\~" character. For example, if the application name is
     * "fabric:/myapp/app1", the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1" in previous
     * versions.
     *
     * @param applicationId the applicationId value to set.
     * @return the ApplicationEvent object itself.
     */
    public ApplicationEvent setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
}
