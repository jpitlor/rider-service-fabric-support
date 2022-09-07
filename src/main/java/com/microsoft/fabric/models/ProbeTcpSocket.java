package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tcp port to probe inside the container. */
@Fluent
public final class ProbeTcpSocket {
    /*
     * Port to access for probe.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Get the port property: Port to access for probe.
     *
     * @return the port value.
     */
    public int getPort() {
        return this.port;
    }

    /**
     * Set the port property: Port to access for probe.
     *
     * @param port the port value to set.
     * @return the ProbeTcpSocket object itself.
     */
    public ProbeTcpSocket setPort(int port) {
        this.port = port;
        return this;
    }
}
