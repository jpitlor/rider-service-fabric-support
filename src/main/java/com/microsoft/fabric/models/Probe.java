package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Probes have a number of fields that you can use to control their behavior. */
@Fluent
public final class Probe {
    /*
     * The initial delay in seconds to start executing probe once codepackage
     * has started.
     */
    @JsonProperty(value = "initialDelaySeconds")
    private Integer initialDelaySeconds;

    /*
     * Periodic seconds to execute probe.
     */
    @JsonProperty(value = "periodSeconds")
    private Integer periodSeconds;

    /*
     * Period after which probe is considered as failed if it hasn't completed
     * successfully.
     */
    @JsonProperty(value = "timeoutSeconds")
    private Integer timeoutSeconds;

    /*
     * The count of successful probe executions after which probe is considered
     * success.
     */
    @JsonProperty(value = "successThreshold")
    private Integer successThreshold;

    /*
     * The count of failures after which probe is considered failed.
     */
    @JsonProperty(value = "failureThreshold")
    private Integer failureThreshold;

    /*
     * Exec command to run inside the container.
     */
    @JsonProperty(value = "exec")
    private ProbeExec exec;

    /*
     * Http probe for the container.
     */
    @JsonProperty(value = "httpGet")
    private ProbeHttpGet httpGet;

    /*
     * Tcp port to probe inside the container.
     */
    @JsonProperty(value = "tcpSocket")
    private ProbeTcpSocket tcpSocket;

    /**
     * Get the initialDelaySeconds property: The initial delay in seconds to start executing probe once codepackage has
     * started.
     *
     * @return the initialDelaySeconds value.
     */
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * Set the initialDelaySeconds property: The initial delay in seconds to start executing probe once codepackage has
     * started.
     *
     * @param initialDelaySeconds the initialDelaySeconds value to set.
     * @return the Probe object itself.
     */
    public Probe setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * Get the periodSeconds property: Periodic seconds to execute probe.
     *
     * @return the periodSeconds value.
     */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    /**
     * Set the periodSeconds property: Periodic seconds to execute probe.
     *
     * @param periodSeconds the periodSeconds value to set.
     * @return the Probe object itself.
     */
    public Probe setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * Get the timeoutSeconds property: Period after which probe is considered as failed if it hasn't completed
     * successfully.
     *
     * @return the timeoutSeconds value.
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set the timeoutSeconds property: Period after which probe is considered as failed if it hasn't completed
     * successfully.
     *
     * @param timeoutSeconds the timeoutSeconds value to set.
     * @return the Probe object itself.
     */
    public Probe setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * Get the successThreshold property: The count of successful probe executions after which probe is considered
     * success.
     *
     * @return the successThreshold value.
     */
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold property: The count of successful probe executions after which probe is considered
     * success.
     *
     * @param successThreshold the successThreshold value to set.
     * @return the Probe object itself.
     */
    public Probe setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * Get the failureThreshold property: The count of failures after which probe is considered failed.
     *
     * @return the failureThreshold value.
     */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Set the failureThreshold property: The count of failures after which probe is considered failed.
     *
     * @param failureThreshold the failureThreshold value to set.
     * @return the Probe object itself.
     */
    public Probe setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * Get the exec property: Exec command to run inside the container.
     *
     * @return the exec value.
     */
    public ProbeExec getExec() {
        return this.exec;
    }

    /**
     * Set the exec property: Exec command to run inside the container.
     *
     * @param exec the exec value to set.
     * @return the Probe object itself.
     */
    public Probe setExec(ProbeExec exec) {
        this.exec = exec;
        return this;
    }

    /**
     * Get the httpGet property: Http probe for the container.
     *
     * @return the httpGet value.
     */
    public ProbeHttpGet getHttpGet() {
        return this.httpGet;
    }

    /**
     * Set the httpGet property: Http probe for the container.
     *
     * @param httpGet the httpGet value to set.
     * @return the Probe object itself.
     */
    public Probe setHttpGet(ProbeHttpGet httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    /**
     * Get the tcpSocket property: Tcp port to probe inside the container.
     *
     * @return the tcpSocket value.
     */
    public ProbeTcpSocket getTcpSocket() {
        return this.tcpSocket;
    }

    /**
     * Set the tcpSocket property: Tcp port to probe inside the container.
     *
     * @param tcpSocket the tcpSocket value to set.
     * @return the Probe object itself.
     */
    public Probe setTcpSocket(ProbeTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }
}
