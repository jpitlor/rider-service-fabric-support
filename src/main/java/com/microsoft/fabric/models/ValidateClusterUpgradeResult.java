package com.microsoft.fabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies result of validating a cluster upgrade. */
@Fluent
public final class ValidateClusterUpgradeResult {
    /*
     * The expected impact of the upgrade.
     */
    @JsonProperty(value = "ServiceHostUpgradeImpact")
    private ServiceHostUpgradeImpact serviceHostUpgradeImpact;

    /*
     * A string containing additional details for the Fabric upgrade validation
     * result.
     */
    @JsonProperty(value = "ValidationDetails")
    private String validationDetails;

    /**
     * Get the serviceHostUpgradeImpact property: The expected impact of the upgrade.
     *
     * @return the serviceHostUpgradeImpact value.
     */
    public ServiceHostUpgradeImpact getServiceHostUpgradeImpact() {
        return this.serviceHostUpgradeImpact;
    }

    /**
     * Set the serviceHostUpgradeImpact property: The expected impact of the upgrade.
     *
     * @param serviceHostUpgradeImpact the serviceHostUpgradeImpact value to set.
     * @return the ValidateClusterUpgradeResult object itself.
     */
    public ValidateClusterUpgradeResult setServiceHostUpgradeImpact(ServiceHostUpgradeImpact serviceHostUpgradeImpact) {
        this.serviceHostUpgradeImpact = serviceHostUpgradeImpact;
        return this;
    }

    /**
     * Get the validationDetails property: A string containing additional details for the Fabric upgrade validation
     * result.
     *
     * @return the validationDetails value.
     */
    public String getValidationDetails() {
        return this.validationDetails;
    }

    /**
     * Set the validationDetails property: A string containing additional details for the Fabric upgrade validation
     * result.
     *
     * @param validationDetails the validationDetails value to set.
     * @return the ValidateClusterUpgradeResult object itself.
     */
    public ValidateClusterUpgradeResult setValidationDetails(String validationDetails) {
        this.validationDetails = validationDetails;
        return this;
    }
}
