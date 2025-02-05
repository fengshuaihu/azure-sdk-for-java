// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The identity information for the resource. */
@Fluent
public final class IdentityInfo {
    /*
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created
     * identity and a set of user-assigned identities. The type 'None' will remove any identity.
     */
    @JsonProperty(value = "type")
    private IdentityType type;

    /*
     * The principal ID of resource identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The tenant ID of resource.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The list of user identities associated with the resource. The user identity dictionary key references will be
     * ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserIdentityProperties> userAssignedIdentities;

    /** Creates an instance of IdentityInfo class. */
    public IdentityInfo() {
    }

    /**
     * Get the type property: The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both
     * an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both
     * an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     *
     * @param type the type value to set.
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: The principal ID of resource identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID of resource identity.
     *
     * @param principalId the principalId value to set.
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId property: The tenant ID of resource.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant ID of resource.
     *
     * @param tenantId the tenantId value to set.
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the resource. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserIdentityProperties> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the resource. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withUserAssignedIdentities(Map<String, UserIdentityProperties> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
