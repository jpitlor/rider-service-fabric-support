package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Container Exited event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationContainerInstanceExited")
@Fluent
public final class ApplicationContainerInstanceExitedEvent extends ApplicationEvent {
    /*
     * Name of Service.
     */
    @JsonProperty(value = "ServiceName", required = true)
    private String serviceName;

    /*
     * Name of Service package.
     */
    @JsonProperty(value = "ServicePackageName", required = true)
    private String servicePackageName;

    /*
     * Activation Id of Service package.
     */
    @JsonProperty(value = "ServicePackageActivationId", required = true)
    private String servicePackageActivationId;

    /*
     * Indicates IsExclusive flag.
     */
    @JsonProperty(value = "IsExclusive", required = true)
    private boolean isExclusive;

    /*
     * Name of Code package.
     */
    @JsonProperty(value = "CodePackageName", required = true)
    private String codePackageName;

    /*
     * Type of EntryPoint.
     */
    @JsonProperty(value = "EntryPointType", required = true)
    private String entryPointType;

    /*
     * Name of Container image.
     */
    @JsonProperty(value = "ImageName", required = true)
    private String imageName;

    /*
     * Name of Container.
     */
    @JsonProperty(value = "ContainerName", required = true)
    private String containerName;

    /*
     * Host Id.
     */
    @JsonProperty(value = "HostId", required = true)
    private String hostId;

    /*
     * Exit code of process.
     */
    @JsonProperty(value = "ExitCode", required = true)
    private long exitCode;

    /*
     * Indicates if termination is unexpected.
     */
    @JsonProperty(value = "UnexpectedTermination", required = true)
    private boolean unexpectedTermination;

    /*
     * Start time of process.
     */
    @JsonProperty(value = "StartTime", required = true)
    private OffsetDateTime startTime;

    /**
     * Get the serviceName property: Name of Service.
     *
     * @return the serviceName value.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: Name of Service.
     *
     * @param serviceName the serviceName value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the servicePackageName property: Name of Service package.
     *
     * @return the servicePackageName value.
     */
    public String getServicePackageName() {
        return this.servicePackageName;
    }

    /**
     * Set the servicePackageName property: Name of Service package.
     *
     * @param servicePackageName the servicePackageName value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setServicePackageName(String servicePackageName) {
        this.servicePackageName = servicePackageName;
        return this;
    }

    /**
     * Get the servicePackageActivationId property: Activation Id of Service package.
     *
     * @return the servicePackageActivationId value.
     */
    public String getServicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId property: Activation Id of Service package.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

    /**
     * Get the isExclusive property: Indicates IsExclusive flag.
     *
     * @return the isExclusive value.
     */
    public boolean isExclusive() {
        return this.isExclusive;
    }

    /**
     * Set the isExclusive property: Indicates IsExclusive flag.
     *
     * @param isExclusive the isExclusive value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setIsExclusive(boolean isExclusive) {
        this.isExclusive = isExclusive;
        return this;
    }

    /**
     * Get the codePackageName property: Name of Code package.
     *
     * @return the codePackageName value.
     */
    public String getCodePackageName() {
        return this.codePackageName;
    }

    /**
     * Set the codePackageName property: Name of Code package.
     *
     * @param codePackageName the codePackageName value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setCodePackageName(String codePackageName) {
        this.codePackageName = codePackageName;
        return this;
    }

    /**
     * Get the entryPointType property: Type of EntryPoint.
     *
     * @return the entryPointType value.
     */
    public String getEntryPointType() {
        return this.entryPointType;
    }

    /**
     * Set the entryPointType property: Type of EntryPoint.
     *
     * @param entryPointType the entryPointType value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setEntryPointType(String entryPointType) {
        this.entryPointType = entryPointType;
        return this;
    }

    /**
     * Get the imageName property: Name of Container image.
     *
     * @return the imageName value.
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * Set the imageName property: Name of Container image.
     *
     * @param imageName the imageName value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get the containerName property: Name of Container.
     *
     * @return the containerName value.
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Name of Container.
     *
     * @param containerName the containerName value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the hostId property: Host Id.
     *
     * @return the hostId value.
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * Set the hostId property: Host Id.
     *
     * @param hostId the hostId value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * Get the exitCode property: Exit code of process.
     *
     * @return the exitCode value.
     */
    public long getExitCode() {
        return this.exitCode;
    }

    /**
     * Set the exitCode property: Exit code of process.
     *
     * @param exitCode the exitCode value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setExitCode(long exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get the unexpectedTermination property: Indicates if termination is unexpected.
     *
     * @return the unexpectedTermination value.
     */
    public boolean isUnexpectedTermination() {
        return this.unexpectedTermination;
    }

    /**
     * Set the unexpectedTermination property: Indicates if termination is unexpected.
     *
     * @param unexpectedTermination the unexpectedTermination value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setUnexpectedTermination(boolean unexpectedTermination) {
        this.unexpectedTermination = unexpectedTermination;
        return this;
    }

    /**
     * Get the startTime property: Start time of process.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of process.
     *
     * @param startTime the startTime value to set.
     * @return the ApplicationContainerInstanceExitedEvent object itself.
     */
    public ApplicationContainerInstanceExitedEvent setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
}
