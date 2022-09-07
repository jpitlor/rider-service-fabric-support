package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** This type describes the properties of a network resource, including its kind. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = NetworkResourcePropertiesBase.class)
@JsonTypeName("NetworkResourcePropertiesBase")
@JsonSubTypes({@JsonSubTypes.Type(name = "NetworkResourceProperties", value = NetworkResourceProperties.class)})
@Immutable
public class NetworkResourcePropertiesBase {}
