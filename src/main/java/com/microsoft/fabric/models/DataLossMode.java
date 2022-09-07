package com.microsoft.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataLossMode. */
public final class DataLossMode extends ExpandableStringEnum<DataLossMode> {
    /** Static value Invalid for DataLossMode. */
    public static final DataLossMode INVALID = fromString("Invalid");

    /** Static value PartialDataLoss for DataLossMode. */
    public static final DataLossMode PARTIAL_DATA_LOSS = fromString("PartialDataLoss");

    /** Static value FullDataLoss for DataLossMode. */
    public static final DataLossMode FULL_DATA_LOSS = fromString("FullDataLoss");

    /**
     * Creates or finds a DataLossMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataLossMode.
     */
    @JsonCreator
    public static DataLossMode fromString(String name) {
        return fromString(name, DataLossMode.class);
    }

    /**
     * Gets known DataLossMode values.
     *
     * @return known DataLossMode values.
     */
    public static Collection<DataLossMode> values() {
        return values(DataLossMode.class);
    }
}
