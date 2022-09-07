package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties of a DiagnosticsSink. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = DiagnosticsSinkProperties.class)
@JsonTypeName("DiagnosticsSinkProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "AzureInternalMonitoringPipeline",
            value = AzureInternalMonitoringPipelineSinkDescription.class)
})
@Fluent
public class DiagnosticsSinkProperties {
    /*
     * Name of the sink. This value is referenced by
     * DiagnosticsReferenceDescription
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A description of the sink.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the name property: Name of the sink. This value is referenced by DiagnosticsReferenceDescription.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the sink. This value is referenced by DiagnosticsReferenceDescription.
     *
     * @param name the name value to set.
     * @return the DiagnosticsSinkProperties object itself.
     */
    public DiagnosticsSinkProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: A description of the sink.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A description of the sink.
     *
     * @param description the description value to set.
     * @return the DiagnosticsSinkProperties object itself.
     */
    public DiagnosticsSinkProperties setDescription(String description) {
        this.description = description;
        return this;
    }
}
