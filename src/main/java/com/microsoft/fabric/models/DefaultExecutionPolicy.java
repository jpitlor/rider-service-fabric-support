package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The default execution policy. Always restart the service if an exit occurs. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Default")
@Immutable
public final class DefaultExecutionPolicy extends ExecutionPolicy {}
