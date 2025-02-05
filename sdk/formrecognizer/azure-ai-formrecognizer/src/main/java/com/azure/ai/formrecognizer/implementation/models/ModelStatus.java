// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Status of the model. */
public enum ModelStatus {
    /** Enum value creating. */
    CREATING("creating"),

    /** Enum value ready. */
    READY("ready"),

    /** Enum value invalid. */
    INVALID("invalid");

    /** The actual serialized value for a ModelStatus instance. */
    private final String value;

    ModelStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ModelStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ModelStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static ModelStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        ModelStatus[] items = ModelStatus.values();
        for (ModelStatus item : items) {
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
