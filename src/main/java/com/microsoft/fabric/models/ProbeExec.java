package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Exec command to run inside the container. */
@Fluent
public final class ProbeExec {
    /*
     * Comma separated command to run inside the container for example "sh, -c,
     * echo hello world".
     */
    @JsonProperty(value = "command", required = true)
    private String command;

    /**
     * Get the command property: Comma separated command to run inside the container for example "sh, -c, echo hello
     * world".
     *
     * @return the command value.
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * Set the command property: Comma separated command to run inside the container for example "sh, -c, echo hello
     * world".
     *
     * @param command the command value to set.
     * @return the ProbeExec object itself.
     */
    public ProbeExec setCommand(String command) {
        this.command = command;
        return this;
    }
}
