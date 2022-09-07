package com.microsoft.fabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the entities targeted by a repair action.
 *
 * <p>This type supports the Service Fabric platform; it is not meant to be used directly from your code.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = RepairTargetDescriptionBase.class)
@JsonTypeName("RepairTargetDescriptionBase")
@JsonSubTypes({@JsonSubTypes.Type(name = "Node", value = NodeRepairTargetDescription.class)})
@Immutable
public class RepairTargetDescriptionBase {}
