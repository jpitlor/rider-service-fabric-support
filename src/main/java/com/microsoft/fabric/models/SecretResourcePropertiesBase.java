package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** This type describes the properties of a secret resource, including its kind. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = SecretResourcePropertiesBase.class)
@JsonTypeName("SecretResourcePropertiesBase")
@JsonSubTypes({@JsonSubTypes.Type(name = "SecretResourceProperties", value = SecretResourceProperties.class)})
@Immutable
public class SecretResourcePropertiesBase {}
