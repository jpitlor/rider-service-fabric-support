package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a container and its runtime properties. */
@Fluent
public final class ContainerCodePackageProperties {
    /*
     * The name of the code package.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The Container image to use.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /*
     * Image registry credential.
     */
    @JsonProperty(value = "imageRegistryCredential")
    private ImageRegistryCredential imageRegistryCredential;

    /*
     * Override for the default entry point in the container.
     */
    @JsonProperty(value = "entryPoint")
    private String entryPoint;

    /*
     * Command array to execute within the container in exec form.
     */
    @JsonProperty(value = "commands")
    private List<String> commands;

    /*
     * The environment variables to set in this container
     */
    @JsonProperty(value = "environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /*
     * The settings to set in this container. The setting file path can be
     * fetched from environment variable "Fabric_SettingPath". The path for
     * Windows container is "C:\\secrets". The path for Linux container is
     * "/var/secrets".
     */
    @JsonProperty(value = "settings")
    private List<Setting> settings;

    /*
     * The labels to set in this container.
     */
    @JsonProperty(value = "labels")
    private List<ContainerLabel> labels;

    /*
     * The endpoints exposed by this container.
     */
    @JsonProperty(value = "endpoints")
    private List<EndpointProperties> endpoints;

    /*
     * The resources required by this container.
     */
    @JsonProperty(value = "resources", required = true)
    private ResourceRequirements resources;

    /*
     * Volumes to be attached to the container. The lifetime of these volumes
     * is independent of the application's lifetime.
     */
    @JsonProperty(value = "volumeRefs")
    private List<VolumeReference> volumeRefs;

    /*
     * Volumes to be attached to the container. The lifetime of these volumes
     * is scoped to the application's lifetime.
     */
    @JsonProperty(value = "volumes")
    private List<ApplicationScopedVolume> volumes;

    /*
     * Reference to sinks in DiagnosticsDescription.
     */
    @JsonProperty(value = "diagnostics")
    private DiagnosticsRef diagnostics;

    /*
     * A list of ReliableCollection resources used by this particular code
     * package. Please refer to ReliableCollectionsRef for more details.
     */
    @JsonProperty(value = "reliableCollectionsRefs")
    private List<ReliableCollectionsRef> reliableCollectionsRefs;

    /*
     * Runtime information of a container instance.
     */
    @JsonProperty(value = "instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerInstanceView instanceView;

    /*
     * An array of liveness probes for a code package. It determines when to
     * restart a code package.
     */
    @JsonProperty(value = "livenessProbe")
    private List<Probe> livenessProbe;

    /*
     * An array of readiness probes for a code package. It determines when to
     * unpublish an endpoint.
     */
    @JsonProperty(value = "readinessProbe")
    private List<Probe> readinessProbe;

    /**
     * Get the name property: The name of the code package.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the code package.
     *
     * @param name the name value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the image property: The Container image to use.
     *
     * @return the image value.
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Set the image property: The Container image to use.
     *
     * @param image the image value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the imageRegistryCredential property: Image registry credential.
     *
     * @return the imageRegistryCredential value.
     */
    public ImageRegistryCredential getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    /**
     * Set the imageRegistryCredential property: Image registry credential.
     *
     * @param imageRegistryCredential the imageRegistryCredential value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setImageRegistryCredential(ImageRegistryCredential imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }

    /**
     * Get the entryPoint property: Override for the default entry point in the container.
     *
     * @return the entryPoint value.
     */
    public String getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * Set the entryPoint property: Override for the default entry point in the container.
     *
     * @param entryPoint the entryPoint value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    /**
     * Get the commands property: Command array to execute within the container in exec form.
     *
     * @return the commands value.
     */
    public List<String> getCommands() {
        return this.commands;
    }

    /**
     * Set the commands property: Command array to execute within the container in exec form.
     *
     * @param commands the commands value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    /**
     * Get the environmentVariables property: The environment variables to set in this container.
     *
     * @return the environmentVariables value.
     */
    public List<EnvironmentVariable> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: The environment variables to set in this container.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the settings property: The settings to set in this container. The setting file path can be fetched from
     * environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux
     * container is "/var/secrets".
     *
     * @return the settings value.
     */
    public List<Setting> getSettings() {
        return this.settings;
    }

    /**
     * Set the settings property: The settings to set in this container. The setting file path can be fetched from
     * environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux
     * container is "/var/secrets".
     *
     * @param settings the settings value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setSettings(List<Setting> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the labels property: The labels to set in this container.
     *
     * @return the labels value.
     */
    public List<ContainerLabel> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: The labels to set in this container.
     *
     * @param labels the labels value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setLabels(List<ContainerLabel> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints exposed by this container.
     *
     * @return the endpoints value.
     */
    public List<EndpointProperties> getEndpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints exposed by this container.
     *
     * @param endpoints the endpoints value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setEndpoints(List<EndpointProperties> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the resources property: The resources required by this container.
     *
     * @return the resources value.
     */
    public ResourceRequirements getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The resources required by this container.
     *
     * @param resources the resources value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the volumeRefs property: Volumes to be attached to the container. The lifetime of these volumes is
     * independent of the application's lifetime.
     *
     * @return the volumeRefs value.
     */
    public List<VolumeReference> getVolumeRefs() {
        return this.volumeRefs;
    }

    /**
     * Set the volumeRefs property: Volumes to be attached to the container. The lifetime of these volumes is
     * independent of the application's lifetime.
     *
     * @param volumeRefs the volumeRefs value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setVolumeRefs(List<VolumeReference> volumeRefs) {
        this.volumeRefs = volumeRefs;
        return this;
    }

    /**
     * Get the volumes property: Volumes to be attached to the container. The lifetime of these volumes is scoped to the
     * application's lifetime.
     *
     * @return the volumes value.
     */
    public List<ApplicationScopedVolume> getVolumes() {
        return this.volumes;
    }

    /**
     * Set the volumes property: Volumes to be attached to the container. The lifetime of these volumes is scoped to the
     * application's lifetime.
     *
     * @param volumes the volumes value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setVolumes(List<ApplicationScopedVolume> volumes) {
        this.volumes = volumes;
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
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setDiagnostics(DiagnosticsRef diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    /**
     * Get the reliableCollectionsRefs property: A list of ReliableCollection resources used by this particular code
     * package. Please refer to ReliableCollectionsRef for more details.
     *
     * @return the reliableCollectionsRefs value.
     */
    public List<ReliableCollectionsRef> getReliableCollectionsRefs() {
        return this.reliableCollectionsRefs;
    }

    /**
     * Set the reliableCollectionsRefs property: A list of ReliableCollection resources used by this particular code
     * package. Please refer to ReliableCollectionsRef for more details.
     *
     * @param reliableCollectionsRefs the reliableCollectionsRefs value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setReliableCollectionsRefs(
            List<ReliableCollectionsRef> reliableCollectionsRefs) {
        this.reliableCollectionsRefs = reliableCollectionsRefs;
        return this;
    }

    /**
     * Get the instanceView property: Runtime information of a container instance.
     *
     * @return the instanceView value.
     */
    public ContainerInstanceView getInstanceView() {
        return this.instanceView;
    }

    /**
     * Get the livenessProbe property: An array of liveness probes for a code package. It determines when to restart a
     * code package.
     *
     * @return the livenessProbe value.
     */
    public List<Probe> getLivenessProbe() {
        return this.livenessProbe;
    }

    /**
     * Set the livenessProbe property: An array of liveness probes for a code package. It determines when to restart a
     * code package.
     *
     * @param livenessProbe the livenessProbe value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setLivenessProbe(List<Probe> livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    /**
     * Get the readinessProbe property: An array of readiness probes for a code package. It determines when to unpublish
     * an endpoint.
     *
     * @return the readinessProbe value.
     */
    public List<Probe> getReadinessProbe() {
        return this.readinessProbe;
    }

    /**
     * Set the readinessProbe property: An array of readiness probes for a code package. It determines when to unpublish
     * an endpoint.
     *
     * @param readinessProbe the readinessProbe value to set.
     * @return the ContainerCodePackageProperties object itself.
     */
    public ContainerCodePackageProperties setReadinessProbe(List<Probe> readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }
}
