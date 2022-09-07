package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes the backup configuration information. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "Kind",
        defaultImpl = BackupConfigurationInfo.class)
@JsonTypeName("BackupConfigurationInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Partition", value = PartitionBackupConfigurationInfo.class),
    @JsonSubTypes.Type(name = "Application", value = ApplicationBackupConfigurationInfo.class),
    @JsonSubTypes.Type(name = "Service", value = ServiceBackupConfigurationInfo.class)
})
@Fluent
public class BackupConfigurationInfo {
    /*
     * The name of the backup policy which is applicable to this Service Fabric
     * application or service or partition.
     */
    @JsonProperty(value = "PolicyName")
    private String policyName;

    /*
     * Specifies the scope at which the backup policy is applied.
     */
    @JsonProperty(value = "PolicyInheritedFrom")
    private BackupPolicyScope policyInheritedFrom;

    /*
     * Describes the backup suspension details.
     */
    @JsonProperty(value = "SuspensionInfo")
    private BackupSuspensionInfo suspensionInfo;

    /**
     * Get the policyName property: The name of the backup policy which is applicable to this Service Fabric application
     * or service or partition.
     *
     * @return the policyName value.
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * Set the policyName property: The name of the backup policy which is applicable to this Service Fabric application
     * or service or partition.
     *
     * @param policyName the policyName value to set.
     * @return the BackupConfigurationInfo object itself.
     */
    public BackupConfigurationInfo setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get the policyInheritedFrom property: Specifies the scope at which the backup policy is applied.
     *
     * @return the policyInheritedFrom value.
     */
    public BackupPolicyScope getPolicyInheritedFrom() {
        return this.policyInheritedFrom;
    }

    /**
     * Set the policyInheritedFrom property: Specifies the scope at which the backup policy is applied.
     *
     * @param policyInheritedFrom the policyInheritedFrom value to set.
     * @return the BackupConfigurationInfo object itself.
     */
    public BackupConfigurationInfo setPolicyInheritedFrom(BackupPolicyScope policyInheritedFrom) {
        this.policyInheritedFrom = policyInheritedFrom;
        return this;
    }

    /**
     * Get the suspensionInfo property: Describes the backup suspension details.
     *
     * @return the suspensionInfo value.
     */
    public BackupSuspensionInfo getSuspensionInfo() {
        return this.suspensionInfo;
    }

    /**
     * Set the suspensionInfo property: Describes the backup suspension details.
     *
     * @param suspensionInfo the suspensionInfo value to set.
     * @return the BackupConfigurationInfo object itself.
     */
    public BackupConfigurationInfo setSuspensionInfo(BackupSuspensionInfo suspensionInfo) {
        this.suspensionInfo = suspensionInfo;
        return this;
    }
}
