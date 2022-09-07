package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FabricErrorCodes. */
public final class FabricErrorCodes extends ExpandableStringEnum<FabricErrorCodes> {
    /** Static value FABRIC_E_INVALID_PARTITION_KEY for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINVALID_PARTITION_KEY = fromString("FABRIC_E_INVALID_PARTITION_KEY");

    /** Static value FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EIMAGEBUILDER_VALIDATION_ERROR =
            fromString("FABRIC_E_IMAGEBUILDER_VALIDATION_ERROR");

    /** Static value FABRIC_E_INVALID_ADDRESS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINVALID_ADDRESS = fromString("FABRIC_E_INVALID_ADDRESS");

    /** Static value FABRIC_E_APPLICATION_NOT_UPGRADING for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_NOTUPGRADING =
            fromString("FABRIC_E_APPLICATION_NOT_UPGRADING");

    /** Static value FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_UPGRADE_VALIDATION_ERROR =
            fromString("FABRIC_E_APPLICATION_UPGRADE_VALIDATION_ERROR");

    /** Static value FABRIC_E_FABRIC_NOT_UPGRADING for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFABRIC_NOTUPGRADING = fromString("FABRIC_E_FABRIC_NOT_UPGRADING");

    /** Static value FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFABRIC_UPGRADE_VALIDATION_ERROR =
            fromString("FABRIC_E_FABRIC_UPGRADE_VALIDATION_ERROR");

    /** Static value FABRIC_E_INVALID_CONFIGURATION for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINVALID_CONFIGURATION = fromString("FABRIC_E_INVALID_CONFIGURATION");

    /** Static value FABRIC_E_INVALID_NAME_URI for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINVALID_NAME_URI = fromString("FABRIC_E_INVALID_NAME_URI");

    /** Static value FABRIC_E_PATH_TOO_LONG for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EPATH_TOOLONG = fromString("FABRIC_E_PATH_TOO_LONG");

    /** Static value FABRIC_E_KEY_TOO_LARGE for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EKEYTOOLARGE = fromString("FABRIC_E_KEY_TOO_LARGE");

    /** Static value FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_AFFINITY_CHAIN_NOTSUPPORTED =
            fromString("FABRIC_E_SERVICE_AFFINITY_CHAIN_NOT_SUPPORTED");

    /** Static value FABRIC_E_INVALID_ATOMIC_GROUP for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINVALID_ATOMIC_GROUP = fromString("FABRIC_E_INVALID_ATOMIC_GROUP");

    /** Static value FABRIC_E_VALUE_EMPTY for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EVALUE_EMPTY = fromString("FABRIC_E_VALUE_EMPTY");

    /** Static value FABRIC_E_NODE_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENODE_NOTFOUND = fromString("FABRIC_E_NODE_NOT_FOUND");

    /** Static value FABRIC_E_APPLICATION_TYPE_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_TYPE_NOTFOUND =
            fromString("FABRIC_E_APPLICATION_TYPE_NOT_FOUND");

    /** Static value FABRIC_E_APPLICATION_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_NOTFOUND = fromString("FABRIC_E_APPLICATION_NOT_FOUND");

    /** Static value FABRIC_E_SERVICE_TYPE_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_TYPE_NOTFOUND = fromString("FABRIC_E_SERVICE_TYPE_NOT_FOUND");

    /** Static value FABRIC_E_SERVICE_DOES_NOT_EXIST for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_DOES_NOTEXIST = fromString("FABRIC_E_SERVICE_DOES_NOT_EXIST");

    /** Static value FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_TYPE_TEMPLATE_NOTFOUND =
            fromString("FABRIC_E_SERVICE_TYPE_TEMPLATE_NOT_FOUND");

    /** Static value FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ECONFIGURATION_SECTION_NOTFOUND =
            fromString("FABRIC_E_CONFIGURATION_SECTION_NOT_FOUND");

    /** Static value FABRIC_E_PARTITION_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EPARTITION_NOTFOUND = fromString("FABRIC_E_PARTITION_NOT_FOUND");

    /** Static value FABRIC_E_REPLICA_DOES_NOT_EXIST for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EREPLICA_DOES_NOTEXIST = fromString("FABRIC_E_REPLICA_DOES_NOT_EXIST");

    /** Static value FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_GROUP_DOES_NOTEXIST =
            fromString("FABRIC_E_SERVICE_GROUP_DOES_NOT_EXIST");

    /** Static value FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ECONFIGURATION_PARAMETER_NOTFOUND =
            fromString("FABRIC_E_CONFIGURATION_PARAMETER_NOT_FOUND");

    /** Static value FABRIC_E_DIRECTORY_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EDIRECTORY_NOTFOUND = fromString("FABRIC_E_DIRECTORY_NOT_FOUND");

    /** Static value FABRIC_E_FABRIC_VERSION_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFABRIC_VERSION_NOTFOUND =
            fromString("FABRIC_E_FABRIC_VERSION_NOT_FOUND");

    /** Static value FABRIC_E_FILE_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFILE_NOTFOUND = fromString("FABRIC_E_FILE_NOT_FOUND");

    /** Static value FABRIC_E_NAME_DOES_NOT_EXIST for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENAME_DOES_NOTEXIST = fromString("FABRIC_E_NAME_DOES_NOT_EXIST");

    /** Static value FABRIC_E_PROPERTY_DOES_NOT_EXIST for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EPROPERTY_DOES_NOTEXIST =
            fromString("FABRIC_E_PROPERTY_DOES_NOT_EXIST");

    /** Static value FABRIC_E_ENUMERATION_COMPLETED for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EENUMERATION_COMPLETED = fromString("FABRIC_E_ENUMERATION_COMPLETED");

    /** Static value FABRIC_E_SERVICE_MANIFEST_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_MANIFEST_NOTFOUND =
            fromString("FABRIC_E_SERVICE_MANIFEST_NOT_FOUND");

    /** Static value FABRIC_E_KEY_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EKEYNOTFOUND = fromString("FABRIC_E_KEY_NOT_FOUND");

    /** Static value FABRIC_E_HEALTH_ENTITY_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EHEALTH_ENTITY_NOTFOUND =
            fromString("FABRIC_E_HEALTH_ENTITY_NOT_FOUND");

    /** Static value FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_TYPE_ALREADY_EXISTS =
            fromString("FABRIC_E_APPLICATION_TYPE_ALREADY_EXISTS");

    /** Static value FABRIC_E_APPLICATION_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_ALREADY_EXISTS =
            fromString("FABRIC_E_APPLICATION_ALREADY_EXISTS");

    /** Static value FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_ALREADY_INTARGET_VERSION =
            fromString("FABRIC_E_APPLICATION_ALREADY_IN_TARGET_VERSION");

    /** Static value FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_TYPE_PROVISION_INPROGRESS =
            fromString("FABRIC_E_APPLICATION_TYPE_PROVISION_IN_PROGRESS");

    /** Static value FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_UPGRADE_INPROGRESS =
            fromString("FABRIC_E_APPLICATION_UPGRADE_IN_PROGRESS");

    /** Static value FABRIC_E_SERVICE_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_ALREADY_EXISTS = fromString("FABRIC_E_SERVICE_ALREADY_EXISTS");

    /** Static value FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_GROUP_ALREADY_EXISTS =
            fromString("FABRIC_E_SERVICE_GROUP_ALREADY_EXISTS");

    /** Static value FABRIC_E_APPLICATION_TYPE_IN_USE for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EAPPLICATION_TYPE_INUSE =
            fromString("FABRIC_E_APPLICATION_TYPE_IN_USE");

    /** Static value FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFABRIC_ALREADY_INTARGET_VERSION =
            fromString("FABRIC_E_FABRIC_ALREADY_IN_TARGET_VERSION");

    /** Static value FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFABRIC_VERSION_ALREADY_EXISTS =
            fromString("FABRIC_E_FABRIC_VERSION_ALREADY_EXISTS");

    /** Static value FABRIC_E_FABRIC_VERSION_IN_USE for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFABRIC_VERSION_INUSE = fromString("FABRIC_E_FABRIC_VERSION_IN_USE");

    /** Static value FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFABRIC_UPGRADE_INPROGRESS =
            fromString("FABRIC_E_FABRIC_UPGRADE_IN_PROGRESS");

    /** Static value FABRIC_E_NAME_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENAME_ALREADY_EXISTS = fromString("FABRIC_E_NAME_ALREADY_EXISTS");

    /** Static value FABRIC_E_NAME_NOT_EMPTY for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENAME_NOTEMPTY = fromString("FABRIC_E_NAME_NOT_EMPTY");

    /** Static value FABRIC_E_PROPERTY_CHECK_FAILED for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EPROPERTY_CHECK_FAILED = fromString("FABRIC_E_PROPERTY_CHECK_FAILED");

    /** Static value FABRIC_E_SERVICE_METADATA_MISMATCH for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_METADATA_MISMATCH =
            fromString("FABRIC_E_SERVICE_METADATA_MISMATCH");

    /** Static value FABRIC_E_SERVICE_TYPE_MISMATCH for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_TYPE_MISMATCH = fromString("FABRIC_E_SERVICE_TYPE_MISMATCH");

    /** Static value FABRIC_E_HEALTH_STALE_REPORT for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EHEALTH_STALE_REPORT = fromString("FABRIC_E_HEALTH_STALE_REPORT");

    /** Static value FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESEQUENCE_NUMBER_CHECK_FAILED =
            fromString("FABRIC_E_SEQUENCE_NUMBER_CHECK_FAILED");

    /** Static value FABRIC_E_NODE_HAS_NOT_STOPPED_YET for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENODE_HASNOTSTOPPED_YET =
            fromString("FABRIC_E_NODE_HAS_NOT_STOPPED_YET");

    /** Static value FABRIC_E_INSTANCE_ID_MISMATCH for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINSTANCE_IDMISMATCH = fromString("FABRIC_E_INSTANCE_ID_MISMATCH");

    /** Static value FABRIC_E_VALUE_TOO_LARGE for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EVALUE_TOOLARGE = fromString("FABRIC_E_VALUE_TOO_LARGE");

    /** Static value FABRIC_E_NO_WRITE_QUORUM for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENOWRITE_QUORUM = fromString("FABRIC_E_NO_WRITE_QUORUM");

    /** Static value FABRIC_E_NOT_PRIMARY for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENOTPRIMARY = fromString("FABRIC_E_NOT_PRIMARY");

    /** Static value FABRIC_E_NOT_READY for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENOTREADY = fromString("FABRIC_E_NOT_READY");

    /** Static value FABRIC_E_RECONFIGURATION_PENDING for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ERECONFIGURATION_PENDING =
            fromString("FABRIC_E_RECONFIGURATION_PENDING");

    /** Static value FABRIC_E_SERVICE_OFFLINE for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESERVICE_OFFLINE = fromString("FABRIC_E_SERVICE_OFFLINE");

    /** Static value E_ABORT for FabricErrorCodes. */
    public static final FabricErrorCodes EABORT = fromString("E_ABORT");

    /** Static value FABRIC_E_COMMUNICATION_ERROR for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ECOMMUNICATION_ERROR = fromString("FABRIC_E_COMMUNICATION_ERROR");

    /** Static value FABRIC_E_OPERATION_NOT_COMPLETE for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EOPERATION_NOTCOMPLETE = fromString("FABRIC_E_OPERATION_NOT_COMPLETE");

    /** Static value FABRIC_E_TIMEOUT for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ETIMEOUT = fromString("FABRIC_E_TIMEOUT");

    /** Static value FABRIC_E_NODE_IS_UP for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ENODE_ISUP = fromString("FABRIC_E_NODE_IS_UP");

    /** Static value E_FAIL for FabricErrorCodes. */
    public static final FabricErrorCodes EFAIL = fromString("E_FAIL");

    /** Static value FABRIC_E_BACKUP_IS_ENABLED for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EBACKUP_ISENABLED = fromString("FABRIC_E_BACKUP_IS_ENABLED");

    /** Static value FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ERESTORE_SOURCE_TARGET_PARTITION_MISMATCH =
            fromString("FABRIC_E_RESTORE_SOURCE_TARGET_PARTITION_MISMATCH");

    /** Static value FABRIC_E_INVALID_FOR_STATELESS_SERVICES for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINVALID_FORSTATELESS_SERVICES =
            fromString("FABRIC_E_INVALID_FOR_STATELESS_SERVICES");

    /** Static value FABRIC_E_BACKUP_NOT_ENABLED for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EBACKUP_NOTENABLED = fromString("FABRIC_E_BACKUP_NOT_ENABLED");

    /** Static value FABRIC_E_BACKUP_POLICY_NOT_EXISTING for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EBACKUP_POLICY_NOTEXISTING =
            fromString("FABRIC_E_BACKUP_POLICY_NOT_EXISTING");

    /** Static value FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EFAULT_ANALYSIS_SERVICE_NOTEXISTING =
            fromString("FABRIC_E_FAULT_ANALYSIS_SERVICE_NOT_EXISTING");

    /** Static value FABRIC_E_BACKUP_IN_PROGRESS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EBACKUP_INPROGRESS = fromString("FABRIC_E_BACKUP_IN_PROGRESS");

    /** Static value FABRIC_E_RESTORE_IN_PROGRESS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ERESTORE_INPROGRESS = fromString("FABRIC_E_RESTORE_IN_PROGRESS");

    /** Static value FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EBACKUP_POLICY_ALREADY_EXISTING =
            fromString("FABRIC_E_BACKUP_POLICY_ALREADY_EXISTING");

    /** Static value FABRIC_E_INVALID_SERVICE_SCALING_POLICY for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EINVALID_SERVICE_SCALING_POLICY =
            fromString("FABRIC_E_INVALID_SERVICE_SCALING_POLICY");

    /** Static value E_INVALIDARG for FabricErrorCodes. */
    public static final FabricErrorCodes EINVALIDARG = fromString("E_INVALIDARG");

    /** Static value FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS =
            fromString("FABRIC_E_SINGLE_INSTANCE_APPLICATION_ALREADY_EXISTS");

    /** Static value FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_ESINGLE_INSTANCE_APPLICATION_NOTFOUND =
            fromString("FABRIC_E_SINGLE_INSTANCE_APPLICATION_NOT_FOUND");

    /** Static value FABRIC_E_VOLUME_ALREADY_EXISTS for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EVOLUME_ALREADY_EXISTS = fromString("FABRIC_E_VOLUME_ALREADY_EXISTS");

    /** Static value FABRIC_E_VOLUME_NOT_FOUND for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EVOLUME_NOTFOUND = fromString("FABRIC_E_VOLUME_NOT_FOUND");

    /** Static value SerializationError for FabricErrorCodes. */
    public static final FabricErrorCodes SERIALIZATION_ERROR = fromString("SerializationError");

    /** Static value FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR for FabricErrorCodes. */
    public static final FabricErrorCodes FABRIC_EIMAGEBUILDER_RESERVED_DIRECTORY_ERROR =
            fromString("FABRIC_E_IMAGEBUILDER_RESERVED_DIRECTORY_ERROR");

    /**
     * Creates or finds a FabricErrorCodes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FabricErrorCodes.
     */
    @JsonCreator
    public static FabricErrorCodes fromString(String name) {
        return fromString(name, FabricErrorCodes.class);
    }

    /**
     * Gets known FabricErrorCodes values.
     *
     * @return known FabricErrorCodes values.
     */
    public static Collection<FabricErrorCodes> values() {
        return values(FabricErrorCodes.class);
    }
}
