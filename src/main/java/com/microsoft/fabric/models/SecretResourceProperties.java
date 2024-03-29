package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the properties of a secret resource. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = SecretResourceProperties.class)
@JsonTypeName("SecretResourceProperties")
@JsonSubTypes({@JsonSubTypes.Type(name = "inlinedValue", value = InlinedValueSecretResourceProperties.class)})
@Fluent
public class SecretResourceProperties extends SecretResourcePropertiesBase {
    /*
     * User readable description of the secret.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Status of the resource.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceStatus status;

    /*
     * Gives additional information about the current status of the secret.
     */
    @JsonProperty(value = "statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * The type of the content stored in the secret value. The value of this
     * property is opaque to Service Fabric. Once set, the value of this
     * property cannot be changed.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * Get the description property: User readable description of the secret.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: User readable description of the secret.
     *
     * @param description the description value to set.
     * @return the SecretResourceProperties object itself.
     */
    public SecretResourceProperties setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the status property: Status of the resource.
     *
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetails property: Gives additional information about the current status of the secret.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the contentType property: The type of the content stored in the secret value. The value of this property is
     * opaque to Service Fabric. Once set, the value of this property cannot be changed.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The type of the content stored in the secret value. The value of this property is
     * opaque to Service Fabric. Once set, the value of this property cannot be changed.
     *
     * @param contentType the contentType value to set.
     * @return the SecretResourceProperties object itself.
     */
    public SecretResourceProperties setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
