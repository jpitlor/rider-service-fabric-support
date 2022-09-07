package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the properties of a secret resource whose value is provided explicitly as plaintext. The secret resource
 * may have multiple values, each being uniquely versioned. The secret value of each version is stored encrypted, and
 * delivered as plaintext into the context of applications referencing it.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("inlinedValue")
@Fluent
public final class InlinedValueSecretResourceProperties extends SecretResourceProperties {}
