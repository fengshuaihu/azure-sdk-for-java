// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Describes a condition that must be met against a set of labels for queue selection. */
@Fluent
public final class RouterQueueSelector {
    /**
     * Creates an instance of RouterQueueSelector class.
     *
     * @param key The label key to query against
     * @param labelOperator Describes how the value of the label is compared to the value defined on the queue selector
     * @param value The value to compare against the actual label value with the given operator
     */
    public RouterQueueSelector(String key, LabelOperator labelOperator, LabelValue value) {
        this.key = Objects.requireNonNull(key, "'key' cannot be null.");
        this.labelOperator = Objects.requireNonNull(labelOperator, "'labelOperator' cannot be null.");
        this.value = value;
    }

    /*
     * The label key to query against
     */
    @JsonProperty(value = "key", required = true)
    private final String key;

    /*
     * Describes how the value of the label is compared to the value defined on
     * the label selector
     */
    @JsonProperty(value = "labelOperator", required = true)
    private final LabelOperator labelOperator;

    /*
     * The value to compare against the actual label value with the given
     * operator
     */
    @JsonProperty(value = "value")
    private final LabelValue value;

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value defined on the
     * label selector.
     *
     * @return the labelOperator value.
     */
    public LabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Get the value property: The value to compare against the actual label value with the given operator.
     *
     * @return the LabelValue value.
     */
    public LabelValue getValue() {
        return this.value;
    }
}
