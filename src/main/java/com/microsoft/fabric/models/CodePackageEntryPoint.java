package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Information about setup or main entry point of a code package deployed on a Service Fabric node. */
@Fluent
public final class CodePackageEntryPoint {
    /*
     * The location of entry point executable on the node.
     */
    @JsonProperty(value = "EntryPointLocation")
    private String entryPointLocation;

    /*
     * The process ID of the entry point.
     */
    @JsonProperty(value = "ProcessId")
    private String processId;

    /*
     * The user name under which entry point executable is run on the node.
     */
    @JsonProperty(value = "RunAsUserName")
    private String runAsUserName;

    /*
     * Statistics about setup or main entry point  of a code package deployed
     * on a Service Fabric node.
     */
    @JsonProperty(value = "CodePackageEntryPointStatistics")
    private CodePackageEntryPointStatistics codePackageEntryPointStatistics;

    /*
     * Specifies the status of the code package entry point deployed on a
     * Service Fabric node.
     */
    @JsonProperty(value = "Status")
    private EntryPointStatus status;

    /*
     * The time (in UTC) when the entry point executable will be run next.
     */
    @JsonProperty(value = "NextActivationTime")
    private OffsetDateTime nextActivationTime;

    /*
     * The instance ID for current running entry point. For a code package
     * setup entry point (if specified) runs first and after it finishes main
     * entry point is started. Each time entry point executable is run, its
     * instance id will change.
     */
    @JsonProperty(value = "InstanceId")
    private String instanceId;

    /**
     * Get the entryPointLocation property: The location of entry point executable on the node.
     *
     * @return the entryPointLocation value.
     */
    public String getEntryPointLocation() {
        return this.entryPointLocation;
    }

    /**
     * Set the entryPointLocation property: The location of entry point executable on the node.
     *
     * @param entryPointLocation the entryPointLocation value to set.
     * @return the CodePackageEntryPoint object itself.
     */
    public CodePackageEntryPoint setEntryPointLocation(String entryPointLocation) {
        this.entryPointLocation = entryPointLocation;
        return this;
    }

    /**
     * Get the processId property: The process ID of the entry point.
     *
     * @return the processId value.
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * Set the processId property: The process ID of the entry point.
     *
     * @param processId the processId value to set.
     * @return the CodePackageEntryPoint object itself.
     */
    public CodePackageEntryPoint setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    /**
     * Get the runAsUserName property: The user name under which entry point executable is run on the node.
     *
     * @return the runAsUserName value.
     */
    public String getRunAsUserName() {
        return this.runAsUserName;
    }

    /**
     * Set the runAsUserName property: The user name under which entry point executable is run on the node.
     *
     * @param runAsUserName the runAsUserName value to set.
     * @return the CodePackageEntryPoint object itself.
     */
    public CodePackageEntryPoint setRunAsUserName(String runAsUserName) {
        this.runAsUserName = runAsUserName;
        return this;
    }

    /**
     * Get the codePackageEntryPointStatistics property: Statistics about setup or main entry point of a code package
     * deployed on a Service Fabric node.
     *
     * @return the codePackageEntryPointStatistics value.
     */
    public CodePackageEntryPointStatistics getCodePackageEntryPointStatistics() {
        return this.codePackageEntryPointStatistics;
    }

    /**
     * Set the codePackageEntryPointStatistics property: Statistics about setup or main entry point of a code package
     * deployed on a Service Fabric node.
     *
     * @param codePackageEntryPointStatistics the codePackageEntryPointStatistics value to set.
     * @return the CodePackageEntryPoint object itself.
     */
    public CodePackageEntryPoint setCodePackageEntryPointStatistics(
            CodePackageEntryPointStatistics codePackageEntryPointStatistics) {
        this.codePackageEntryPointStatistics = codePackageEntryPointStatistics;
        return this;
    }

    /**
     * Get the status property: Specifies the status of the code package entry point deployed on a Service Fabric node.
     *
     * @return the status value.
     */
    public EntryPointStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Specifies the status of the code package entry point deployed on a Service Fabric node.
     *
     * @param status the status value to set.
     * @return the CodePackageEntryPoint object itself.
     */
    public CodePackageEntryPoint setStatus(EntryPointStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the nextActivationTime property: The time (in UTC) when the entry point executable will be run next.
     *
     * @return the nextActivationTime value.
     */
    public OffsetDateTime getNextActivationTime() {
        return this.nextActivationTime;
    }

    /**
     * Set the nextActivationTime property: The time (in UTC) when the entry point executable will be run next.
     *
     * @param nextActivationTime the nextActivationTime value to set.
     * @return the CodePackageEntryPoint object itself.
     */
    public CodePackageEntryPoint setNextActivationTime(OffsetDateTime nextActivationTime) {
        this.nextActivationTime = nextActivationTime;
        return this;
    }

    /**
     * Get the instanceId property: The instance ID for current running entry point. For a code package setup entry
     * point (if specified) runs first and after it finishes main entry point is started. Each time entry point
     * executable is run, its instance id will change.
     *
     * @return the instanceId value.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Set the instanceId property: The instance ID for current running entry point. For a code package setup entry
     * point (if specified) runs first and after it finishes main entry point is started. Each time entry point
     * executable is run, its instance id will change.
     *
     * @param instanceId the instanceId value to set.
     * @return the CodePackageEntryPoint object itself.
     */
    public CodePackageEntryPoint setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
}
