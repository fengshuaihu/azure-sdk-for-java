// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.LocationBasedCapabilitiesClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.FlexibleServerCapabilityInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LocationBasedCapabilities;

public final class LocationBasedCapabilitiesImpl implements LocationBasedCapabilities {
    private static final ClientLogger LOGGER = new ClientLogger(LocationBasedCapabilitiesImpl.class);

    private final LocationBasedCapabilitiesClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public LocationBasedCapabilitiesImpl(
        LocationBasedCapabilitiesClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FlexibleServerCapability> execute(String locationName) {
        PagedIterable<FlexibleServerCapabilityInner> inner = this.serviceClient().execute(locationName);
        return Utils.mapPage(inner, inner1 -> new FlexibleServerCapabilityImpl(inner1, this.manager()));
    }

    public PagedIterable<FlexibleServerCapability> execute(String locationName, Context context) {
        PagedIterable<FlexibleServerCapabilityInner> inner = this.serviceClient().execute(locationName, context);
        return Utils.mapPage(inner, inner1 -> new FlexibleServerCapabilityImpl(inner1, this.manager()));
    }

    private LocationBasedCapabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
