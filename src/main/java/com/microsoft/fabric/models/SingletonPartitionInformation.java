package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Information about a partition that is singleton. The services with singleton partitioning scheme are effectively
 * non-partitioned. They only have one partition.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServicePartitionKind")
@JsonTypeName("Singleton")
@Fluent
public final class SingletonPartitionInformation extends PartitionInformation {}
