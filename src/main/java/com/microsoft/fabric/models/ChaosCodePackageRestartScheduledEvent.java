package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Chaos Restart Code Package Fault Scheduled event. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ChaosCodePackageRestartScheduled")
@Fluent
public final class ChaosCodePackageRestartScheduledEvent extends ApplicationEvent {
    /*
     * Id of fault group.
     */
    @JsonProperty(value = "FaultGroupId", required = true)
    private UUID faultGroupId;

    /*
     * Id of fault.
     */
    @JsonProperty(value = "FaultId", required = true)
    private UUID faultId;

    /*
     * The name of a Service Fabric node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /*
     * Service manifest name.
     */
    @JsonProperty(value = "ServiceManifestName", required = true)
    private String serviceManifestName;

    /*
     * Code package name.
     */
    @JsonProperty(value = "CodePackageName", required = true)
    private String codePackageName;

    /*
     * Id of Service package activation.
     */
    @JsonProperty(value = "ServicePackageActivationId", required = true)
    private String servicePackageActivationId;

    /**
     * Get the faultGroupId property: Id of fault group.
     *
     * @return the faultGroupId value.
     */
    public UUID getFaultGroupId() {
        return this.faultGroupId;
    }

    /**
     * Set the faultGroupId property: Id of fault group.
     *
     * @param faultGroupId the faultGroupId value to set.
     * @return the ChaosCodePackageRestartScheduledEvent object itself.
     */
    public ChaosCodePackageRestartScheduledEvent setFaultGroupId(UUID faultGroupId) {
        this.faultGroupId = faultGroupId;
        return this;
    }

    /**
     * Get the faultId property: Id of fault.
     *
     * @return the faultId value.
     */
    public UUID getFaultId() {
        return this.faultId;
    }

    /**
     * Set the faultId property: Id of fault.
     *
     * @param faultId the faultId value to set.
     * @return the ChaosCodePackageRestartScheduledEvent object itself.
     */
    public ChaosCodePackageRestartScheduledEvent setFaultId(UUID faultId) {
        this.faultId = faultId;
        return this;
    }

    /**
     * Get the nodeName property: The name of a Service Fabric node.
     *
     * @return the nodeName value.
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName property: The name of a Service Fabric node.
     *
     * @param nodeName the nodeName value to set.
     * @return the ChaosCodePackageRestartScheduledEvent object itself.
     */
    public ChaosCodePackageRestartScheduledEvent setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the serviceManifestName property: Service manifest name.
     *
     * @return the serviceManifestName value.
     */
    public String getServiceManifestName() {
        return this.serviceManifestName;
    }

    /**
     * Set the serviceManifestName property: Service manifest name.
     *
     * @param serviceManifestName the serviceManifestName value to set.
     * @return the ChaosCodePackageRestartScheduledEvent object itself.
     */
    public ChaosCodePackageRestartScheduledEvent setServiceManifestName(String serviceManifestName) {
        this.serviceManifestName = serviceManifestName;
        return this;
    }

    /**
     * Get the codePackageName property: Code package name.
     *
     * @return the codePackageName value.
     */
    public String getCodePackageName() {
        return this.codePackageName;
    }

    /**
     * Set the codePackageName property: Code package name.
     *
     * @param codePackageName the codePackageName value to set.
     * @return the ChaosCodePackageRestartScheduledEvent object itself.
     */
    public ChaosCodePackageRestartScheduledEvent setCodePackageName(String codePackageName) {
        this.codePackageName = codePackageName;
        return this;
    }

    /**
     * Get the servicePackageActivationId property: Id of Service package activation.
     *
     * @return the servicePackageActivationId value.
     */
    public String getServicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId property: Id of Service package activation.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set.
     * @return the ChaosCodePackageRestartScheduledEvent object itself.
     */
    public ChaosCodePackageRestartScheduledEvent setServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }
}
