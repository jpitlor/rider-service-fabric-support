package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the partition scheme of a singleton-partitioned, or non-partitioned service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "PartitionScheme")
@JsonTypeName("Singleton")
@Immutable
public final class SingletonPartitionSchemeDescription extends PartitionSchemeDescription {}
