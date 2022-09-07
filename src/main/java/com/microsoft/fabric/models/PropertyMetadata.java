package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The metadata associated with a property, including the property's name. */
@Fluent
public final class PropertyMetadata {
    /*
     * The kind of property, determined by the type of data. Following are the
     * possible values.
     */
    @JsonProperty(value = "TypeId")
    private PropertyValueKind typeId;

    /*
     * The property's custom type ID.
     */
    @JsonProperty(value = "CustomTypeId")
    private String customTypeId;

    /*
     * The name of the parent Service Fabric Name for the property. It could be
     * thought of as the name-space/table under which the property exists.
     */
    @JsonProperty(value = "Parent")
    private String parent;

    /*
     * The length of the serialized property value.
     */
    @JsonProperty(value = "SizeInBytes")
    private Integer sizeInBytes;

    /*
     * Represents when the Property was last modified. Only write operations
     * will cause this field to be updated.
     */
    @JsonProperty(value = "LastModifiedUtcTimestamp")
    private OffsetDateTime lastModifiedUtcTimestamp;

    /*
     * The version of the property. Every time a property is modified, its
     * sequence number is increased.
     */
    @JsonProperty(value = "SequenceNumber")
    private String sequenceNumber;

    /**
     * Get the typeId property: The kind of property, determined by the type of data. Following are the possible values.
     *
     * @return the typeId value.
     */
    public PropertyValueKind getTypeId() {
        return this.typeId;
    }

    /**
     * Set the typeId property: The kind of property, determined by the type of data. Following are the possible values.
     *
     * @param typeId the typeId value to set.
     * @return the PropertyMetadata object itself.
     */
    public PropertyMetadata setTypeId(PropertyValueKind typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * Get the customTypeId property: The property's custom type ID.
     *
     * @return the customTypeId value.
     */
    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     * Set the customTypeId property: The property's custom type ID.
     *
     * @param customTypeId the customTypeId value to set.
     * @return the PropertyMetadata object itself.
     */
    public PropertyMetadata setCustomTypeId(String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     * Get the parent property: The name of the parent Service Fabric Name for the property. It could be thought of as
     * the name-space/table under which the property exists.
     *
     * @return the parent value.
     */
    public String getParent() {
        return this.parent;
    }

    /**
     * Set the parent property: The name of the parent Service Fabric Name for the property. It could be thought of as
     * the name-space/table under which the property exists.
     *
     * @param parent the parent value to set.
     * @return the PropertyMetadata object itself.
     */
    public PropertyMetadata setParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get the sizeInBytes property: The length of the serialized property value.
     *
     * @return the sizeInBytes value.
     */
    public Integer getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes property: The length of the serialized property value.
     *
     * @param sizeInBytes the sizeInBytes value to set.
     * @return the PropertyMetadata object itself.
     */
    public PropertyMetadata setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get the lastModifiedUtcTimestamp property: Represents when the Property was last modified. Only write operations
     * will cause this field to be updated.
     *
     * @return the lastModifiedUtcTimestamp value.
     */
    public OffsetDateTime getLastModifiedUtcTimestamp() {
        return this.lastModifiedUtcTimestamp;
    }

    /**
     * Set the lastModifiedUtcTimestamp property: Represents when the Property was last modified. Only write operations
     * will cause this field to be updated.
     *
     * @param lastModifiedUtcTimestamp the lastModifiedUtcTimestamp value to set.
     * @return the PropertyMetadata object itself.
     */
    public PropertyMetadata setLastModifiedUtcTimestamp(OffsetDateTime lastModifiedUtcTimestamp) {
        this.lastModifiedUtcTimestamp = lastModifiedUtcTimestamp;
        return this;
    }

    /**
     * Get the sequenceNumber property: The version of the property. Every time a property is modified, its sequence
     * number is increased.
     *
     * @return the sequenceNumber value.
     */
    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Set the sequenceNumber property: The version of the property. Every time a property is modified, its sequence
     * number is increased.
     *
     * @param sequenceNumber the sequenceNumber value to set.
     * @return the PropertyMetadata object itself.
     */
    public PropertyMetadata setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
}
