package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a PropertyBatchOperation that deletes a specified property if it exists. Note that if one
 * PropertyBatchOperation in a PropertyBatch fails, the entire batch fails and cannot be committed in a transactional
 * manner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Delete")
@Fluent
public final class DeletePropertyBatchOperation extends PropertyBatchOperation {}
