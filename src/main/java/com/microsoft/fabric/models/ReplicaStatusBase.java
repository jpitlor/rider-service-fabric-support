package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information about the replica. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = ReplicaStatusBase.class)
@JsonTypeName("ReplicaStatusBase")
@JsonSubTypes({@JsonSubTypes.Type(name = "KeyValueStore", value = KeyValueStoreReplicaStatus.class)})
@Immutable
public class ReplicaStatusBase {}
