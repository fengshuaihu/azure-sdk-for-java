// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Backup type. */
public final class Origin extends ExpandableStringEnum<Origin> {
    /** Static value Full for Origin. */
    public static final Origin FULL = fromString("Full");

    /**
     * Creates a new instance of Origin value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Origin() {
    }

    /**
     * Creates or finds a Origin from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Origin.
     */
    @JsonCreator
    public static Origin fromString(String name) {
        return fromString(name, Origin.class);
    }

    /**
     * Gets known Origin values.
     *
     * @return known Origin values.
     */
    public static Collection<Origin> values() {
        return values(Origin.class);
    }
}
