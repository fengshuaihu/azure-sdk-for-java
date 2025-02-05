// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Whether the pool permits direct communication between nodes.
 *
 * <p>This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of
 * the requested number of nodes to be allocated in the pool. If not specified, this value defaults to 'Disabled'.
 */
public enum InterNodeCommunicationState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a InterNodeCommunicationState instance. */
    private final String value;

    InterNodeCommunicationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InterNodeCommunicationState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InterNodeCommunicationState object, or null if unable to parse.
     */
    @JsonCreator
    public static InterNodeCommunicationState fromString(String value) {
        if (value == null) {
            return null;
        }
        InterNodeCommunicationState[] items = InterNodeCommunicationState.values();
        for (InterNodeCommunicationState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
