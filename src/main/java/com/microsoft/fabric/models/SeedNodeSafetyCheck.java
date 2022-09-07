package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a safety check for the seed nodes being performed by service fabric before continuing with node level
 * operations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("EnsureSeedNodeQuorum")
@Immutable
public final class SeedNodeSafetyCheck extends SafetyCheck {}
