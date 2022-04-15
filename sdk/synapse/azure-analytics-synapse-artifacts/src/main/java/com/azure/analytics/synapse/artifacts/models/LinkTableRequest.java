// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkTableRequest model. */
@Fluent
public final class LinkTableRequest {
    /*
     * Link table id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Source table properties for link table request
     */
    @JsonProperty(value = "source")
    private LinkTableRequestSource source;

    /*
     * Target table properties for link table request
     */
    @JsonProperty(value = "target")
    private LinkTableRequestTarget target;

    /*
     * Link table operation type
     */
    @JsonProperty(value = "operationType")
    private String operationType;

    /**
     * Get the id property: Link table id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Link table id.
     *
     * @param id the id value to set.
     * @return the LinkTableRequest object itself.
     */
    public LinkTableRequest setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the source property: Source table properties for link table request.
     *
     * @return the source value.
     */
    public LinkTableRequestSource getSource() {
        return this.source;
    }

    /**
     * Set the source property: Source table properties for link table request.
     *
     * @param source the source value to set.
     * @return the LinkTableRequest object itself.
     */
    public LinkTableRequest setSource(LinkTableRequestSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the target property: Target table properties for link table request.
     *
     * @return the target value.
     */
    public LinkTableRequestTarget getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Target table properties for link table request.
     *
     * @param target the target value to set.
     * @return the LinkTableRequest object itself.
     */
    public LinkTableRequest setTarget(LinkTableRequestTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get the operationType property: Link table operation type.
     *
     * @return the operationType value.
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * Set the operationType property: Link table operation type.
     *
     * @param operationType the operationType value to set.
     * @return the LinkTableRequest object itself.
     */
    public LinkTableRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
}