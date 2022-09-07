package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePackageActivationMode. */
public final class ServicePackageActivationMode extends ExpandableStringEnum<ServicePackageActivationMode> {
    /** Static value SharedProcess for ServicePackageActivationMode. */
    public static final ServicePackageActivationMode SHARED_PROCESS = fromString("SharedProcess");

    /** Static value ExclusiveProcess for ServicePackageActivationMode. */
    public static final ServicePackageActivationMode EXCLUSIVE_PROCESS = fromString("ExclusiveProcess");

    /**
     * Creates or finds a ServicePackageActivationMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePackageActivationMode.
     */
    @JsonCreator
    public static ServicePackageActivationMode fromString(String name) {
        return fromString(name, ServicePackageActivationMode.class);
    }

    /**
     * Gets known ServicePackageActivationMode values.
     *
     * @return known ServicePackageActivationMode values.
     */
    public static Collection<ServicePackageActivationMode> values() {
        return values(ServicePackageActivationMode.class);
    }
}
