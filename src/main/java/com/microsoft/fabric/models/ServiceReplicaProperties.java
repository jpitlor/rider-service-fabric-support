package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the properties of a service replica. */
@Fluent
public class ServiceReplicaProperties {
    /*
     * The operation system required by the code in service.
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemType osType;

    /*
     * Describes the set of code packages that forms the service. A code
     * package describes the container and the properties for running it. All
     * the code packages are started together on the same host and share the
     * same context (network, process etc.).
     */
    @JsonProperty(value = "codePackages", required = true)
    private List<ContainerCodePackageProperties> codePackages;

    /*
     * The names of the private networks that this service needs to be part of.
     */
    @JsonProperty(value = "networkRefs")
    private List<NetworkRef> networkRefs;

    /*
     * Reference to sinks in DiagnosticsDescription.
     */
    @JsonProperty(value = "diagnostics")
    private DiagnosticsRef diagnostics;

    /**
     * Get the osType property: The operation system required by the code in service.
     *
     * @return the osType value.
     */
    public OperatingSystemType getOsType() {
        return this.osType;
    }

    /**
     * Set the osType property: The operation system required by the code in service.
     *
     * @param osType the osType value to set.
     * @return the ServiceReplicaProperties object itself.
     */
    public ServiceReplicaProperties setOsType(OperatingSystemType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the codePackages property: Describes the set of code packages that forms the service. A code package
     * describes the container and the properties for running it. All the code packages are started together on the same
     * host and share the same context (network, process etc.).
     *
     * @return the codePackages value.
     */
    public List<ContainerCodePackageProperties> getCodePackages() {
        return this.codePackages;
    }

    /**
     * Set the codePackages property: Describes the set of code packages that forms the service. A code package
     * describes the container and the properties for running it. All the code packages are started together on the same
     * host and share the same context (network, process etc.).
     *
     * @param codePackages the codePackages value to set.
     * @return the ServiceReplicaProperties object itself.
     */
    public ServiceReplicaProperties setCodePackages(List<ContainerCodePackageProperties> codePackages) {
        this.codePackages = codePackages;
        return this;
    }

    /**
     * Get the networkRefs property: The names of the private networks that this service needs to be part of.
     *
     * @return the networkRefs value.
     */
    public List<NetworkRef> getNetworkRefs() {
        return this.networkRefs;
    }

    /**
     * Set the networkRefs property: The names of the private networks that this service needs to be part of.
     *
     * @param networkRefs the networkRefs value to set.
     * @return the ServiceReplicaProperties object itself.
     */
    public ServiceReplicaProperties setNetworkRefs(List<NetworkRef> networkRefs) {
        this.networkRefs = networkRefs;
        return this;
    }

    /**
     * Get the diagnostics property: Reference to sinks in DiagnosticsDescription.
     *
     * @return the diagnostics value.
     */
    public DiagnosticsRef getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * Set the diagnostics property: Reference to sinks in DiagnosticsDescription.
     *
     * @param diagnostics the diagnostics value to set.
     * @return the ServiceReplicaProperties object itself.
     */
    public ServiceReplicaProperties setDiagnostics(DiagnosticsRef diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }
}
