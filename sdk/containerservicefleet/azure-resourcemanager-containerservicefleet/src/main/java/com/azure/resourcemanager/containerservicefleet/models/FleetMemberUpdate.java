// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetMemberUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The type used for update operations of the FleetMember. */
@Fluent
public final class FleetMemberUpdate {
    /*
     * The updatable properties of the FleetMember.
     */
    @JsonProperty(value = "properties")
    private FleetMemberUpdateProperties innerProperties;

    /** Creates an instance of FleetMemberUpdate class. */
    public FleetMemberUpdate() {
    }

    /**
     * Get the innerProperties property: The updatable properties of the FleetMember.
     *
     * @return the innerProperties value.
     */
    private FleetMemberUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the group property: The group this member belongs to for multi-cluster update management.
     *
     * @return the group value.
     */
    public String group() {
        return this.innerProperties() == null ? null : this.innerProperties().group();
    }

    /**
     * Set the group property: The group this member belongs to for multi-cluster update management.
     *
     * @param group the group value to set.
     * @return the FleetMemberUpdate object itself.
     */
    public FleetMemberUpdate withGroup(String group) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FleetMemberUpdateProperties();
        }
        this.innerProperties().withGroup(group);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
