// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A configuration item for source resource. */
@Fluent
public final class SourceConfiguration {
    /*
     * The name of setting.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The value of setting
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The name of setting.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of setting.
     *
     * @param name the name value to set.
     * @return the SourceConfiguration object itself.
     */
    public SourceConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of setting.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of setting.
     *
     * @param value the value value to set.
     * @return the SourceConfiguration object itself.
     */
    public SourceConfiguration withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}