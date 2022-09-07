package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Compares the Sequence Number of a property with the SequenceNumber argument. A property's sequence number can be
 * thought of as that property's version. Every time the property is modified, its sequence number is increased. The
 * sequence number can be found in a property's metadata. The comparison fails if the sequence numbers are not equal.
 * CheckSequencePropertyBatchOperation is generally used as a precondition for the write operations in the batch. Note
 * that if one PropertyBatchOperation in a PropertyBatch fails, the entire batch fails and cannot be committed in a
 * transactional manner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("CheckSequence")
@Fluent
public final class CheckSequencePropertyBatchOperation extends PropertyBatchOperation {
    /*
     * The expected sequence number.
     */
    @JsonProperty(value = "SequenceNumber", required = true)
    private String sequenceNumber;

    /**
     * Get the sequenceNumber property: The expected sequence number.
     *
     * @return the sequenceNumber value.
     */
    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Set the sequenceNumber property: The expected sequence number.
     *
     * @param sequenceNumber the sequenceNumber value to set.
     * @return the CheckSequencePropertyBatchOperation object itself.
     */
    public CheckSequencePropertyBatchOperation setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
}
