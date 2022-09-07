package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Http probe for the container. */
@Fluent
public final class ProbeHttpGet {
    /*
     * Port to access for probe.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /*
     * Path to access on the HTTP request.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Host IP to connect to.
     */
    @JsonProperty(value = "host")
    private String host;

    /*
     * Headers to set in the request.
     */
    @JsonProperty(value = "httpHeaders")
    private List<ProbeHttpGetHeaders> httpHeaders;

    /*
     * Scheme for the http probe. Can be Http or Https.
     */
    @JsonProperty(value = "scheme")
    private Scheme scheme;

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
     * @return the ProbeHttpGet object itself.
     */
    public ProbeHttpGet setPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the path property: Path to access on the HTTP request.
     *
     * @return the path value.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path property: Path to access on the HTTP request.
     *
     * @param path the path value to set.
     * @return the ProbeHttpGet object itself.
     */
    public ProbeHttpGet setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the host property: Host IP to connect to.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Set the host property: Host IP to connect to.
     *
     * @param host the host value to set.
     * @return the ProbeHttpGet object itself.
     */
    public ProbeHttpGet setHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the httpHeaders property: Headers to set in the request.
     *
     * @return the httpHeaders value.
     */
    public List<ProbeHttpGetHeaders> getHttpHeaders() {
        return this.httpHeaders;
    }

    /**
     * Set the httpHeaders property: Headers to set in the request.
     *
     * @param httpHeaders the httpHeaders value to set.
     * @return the ProbeHttpGet object itself.
     */
    public ProbeHttpGet setHttpHeaders(List<ProbeHttpGetHeaders> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    /**
     * Get the scheme property: Scheme for the http probe. Can be Http or Https.
     *
     * @return the scheme value.
     */
    public Scheme getScheme() {
        return this.scheme;
    }

    /**
     * Set the scheme property: Scheme for the http probe. Can be Http or Https.
     *
     * @param scheme the scheme value to set.
     * @return the ProbeHttpGet object itself.
     */
    public ProbeHttpGet setScheme(Scheme scheme) {
        this.scheme = scheme;
        return this;
    }
}
