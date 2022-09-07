package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Contains the OperationId, OperationState, and OperationType for user-induced operations. */
@Fluent
public final class OperationStatus {
    /*
     * A GUID that identifies a call to this API.  This is also passed into the
     * corresponding GetProgress API.
     */
    @JsonProperty(value = "OperationId")
    private UUID operationId;

    /*
     * The state of the operation.
     */
    @JsonProperty(value = "State")
    private OperationState state;

    /*
     * The type of the operation.
     */
    @JsonProperty(value = "Type")
    private OperationType type;

    /**
     * Get the operationId property: A GUID that identifies a call to this API. This is also passed into the
     * corresponding GetProgress API.
     *
     * @return the operationId value.
     */
    public UUID getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: A GUID that identifies a call to this API. This is also passed into the
     * corresponding GetProgress API.
     *
     * @param operationId the operationId value to set.
     * @return the OperationStatus object itself.
     */
    public OperationStatus setOperationId(UUID operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the state property: The state of the operation.
     *
     * @return the state value.
     */
    public OperationState getState() {
        return this.state;
    }

    /**
     * Set the state property: The state of the operation.
     *
     * @param state the state value to set.
     * @return the OperationStatus object itself.
     */
    public OperationStatus setState(OperationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the type property: The type of the operation.
     *
     * @return the type value.
     */
    public OperationType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the operation.
     *
     * @param type the type value to set.
     * @return the OperationStatus object itself.
     */
    public OperationStatus setType(OperationType type) {
        this.type = type;
        return this;
    }
}
