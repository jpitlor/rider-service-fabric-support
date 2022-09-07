package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApplicationTypeDefinitionKind. */
public final class ApplicationTypeDefinitionKind extends ExpandableStringEnum<ApplicationTypeDefinitionKind> {
    /** Static value Invalid for ApplicationTypeDefinitionKind. */
    public static final ApplicationTypeDefinitionKind INVALID = fromString("Invalid");

    /** Static value ServiceFabricApplicationPackage for ApplicationTypeDefinitionKind. */
    public static final ApplicationTypeDefinitionKind SERVICE_FABRIC_APPLICATION_PACKAGE =
            fromString("ServiceFabricApplicationPackage");

    /** Static value Compose for ApplicationTypeDefinitionKind. */
    public static final ApplicationTypeDefinitionKind COMPOSE = fromString("Compose");

    /**
     * Creates or finds a ApplicationTypeDefinitionKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationTypeDefinitionKind.
     */
    @JsonCreator
    public static ApplicationTypeDefinitionKind fromString(String name) {
        return fromString(name, ApplicationTypeDefinitionKind.class);
    }

    /**
     * Gets known ApplicationTypeDefinitionKind values.
     *
     * @return known ApplicationTypeDefinitionKind values.
     */
    public static Collection<ApplicationTypeDefinitionKind> values() {
        return values(ApplicationTypeDefinitionKind.class);
    }
}
