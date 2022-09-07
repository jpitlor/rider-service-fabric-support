package com.microsoft.fabric.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with FabricError information. */
public final class FabricErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the FabricErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public FabricErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the FabricErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public FabricErrorException(String message, HttpResponse response, FabricError value) {
        super(message, response, value);
    }

    @Override
    public FabricError getValue() {
        return (FabricError) super.getValue();
    }
}
