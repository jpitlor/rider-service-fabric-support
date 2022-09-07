package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type describes a volume provided by an Azure Files file share. */
@Fluent
public final class VolumeProviderParametersAzureFile {
    /*
     * Name of the Azure storage account for the File Share.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /*
     * Access key of the Azure storage account for the File Share.
     */
    @JsonProperty(value = "accountKey")
    private String accountKey;

    /*
     * Name of the Azure Files file share that provides storage for the volume.
     */
    @JsonProperty(value = "shareName", required = true)
    private String shareName;

    /**
     * Get the accountName property: Name of the Azure storage account for the File Share.
     *
     * @return the accountName value.
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Name of the Azure storage account for the File Share.
     *
     * @param accountName the accountName value to set.
     * @return the VolumeProviderParametersAzureFile object itself.
     */
    public VolumeProviderParametersAzureFile setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the accountKey property: Access key of the Azure storage account for the File Share.
     *
     * @return the accountKey value.
     */
    public String getAccountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: Access key of the Azure storage account for the File Share.
     *
     * @param accountKey the accountKey value to set.
     * @return the VolumeProviderParametersAzureFile object itself.
     */
    public VolumeProviderParametersAzureFile setAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the shareName property: Name of the Azure Files file share that provides storage for the volume.
     *
     * @return the shareName value.
     */
    public String getShareName() {
        return this.shareName;
    }

    /**
     * Set the shareName property: Name of the Azure Files file share that provides storage for the volume.
     *
     * @param shareName the shareName value to set.
     * @return the VolumeProviderParametersAzureFile object itself.
     */
    public VolumeProviderParametersAzureFile setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
}
