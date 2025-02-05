// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Log specification of operation. */
@Fluent
public final class LogSpecification {
    /*
     * Name of log specification.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of log specification.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Blob duration of specification.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /*
     * Pattern to filter based on name
     */
    @JsonProperty(value = "logFilterPattern")
    private String logFilterPattern;

    /**
     * Get the name property: Name of log specification.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of log specification.
     *
     * @param name the name value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of log specification.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of log specification.
     *
     * @param displayName the displayName value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the blobDuration property: Blob duration of specification.
     *
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: Blob duration of specification.
     *
     * @param blobDuration the blobDuration value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

    /**
     * Get the logFilterPattern property: Pattern to filter based on name.
     *
     * @return the logFilterPattern value.
     */
    public String logFilterPattern() {
        return this.logFilterPattern;
    }

    /**
     * Set the logFilterPattern property: Pattern to filter based on name.
     *
     * @param logFilterPattern the logFilterPattern value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withLogFilterPattern(String logFilterPattern) {
        this.logFilterPattern = logFilterPattern;
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
