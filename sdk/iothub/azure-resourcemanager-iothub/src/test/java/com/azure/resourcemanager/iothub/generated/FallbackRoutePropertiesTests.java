// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.FallbackRouteProperties;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FallbackRoutePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FallbackRouteProperties model =
            BinaryData
                .fromString(
                    "{\"name\":\"lyaxuc\",\"source\":\"DeviceJobLifecycleEvents\",\"condition\":\"qszf\",\"endpointNames\":[\"eyp\",\"wrmjmwvvjektc\",\"senhwlrs\"],\"isEnabled\":true}")
                .toObject(FallbackRouteProperties.class);
        Assertions.assertEquals("lyaxuc", model.name());
        Assertions.assertEquals(RoutingSource.DEVICE_JOB_LIFECYCLE_EVENTS, model.source());
        Assertions.assertEquals("qszf", model.condition());
        Assertions.assertEquals("eyp", model.endpointNames().get(0));
        Assertions.assertEquals(true, model.isEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FallbackRouteProperties model =
            new FallbackRouteProperties()
                .withName("lyaxuc")
                .withSource(RoutingSource.DEVICE_JOB_LIFECYCLE_EVENTS)
                .withCondition("qszf")
                .withEndpointNames(Arrays.asList("eyp", "wrmjmwvvjektc", "senhwlrs"))
                .withIsEnabled(true);
        model = BinaryData.fromObject(model).toObject(FallbackRouteProperties.class);
        Assertions.assertEquals("lyaxuc", model.name());
        Assertions.assertEquals(RoutingSource.DEVICE_JOB_LIFECYCLE_EVENTS, model.source());
        Assertions.assertEquals("qszf", model.condition());
        Assertions.assertEquals("eyp", model.endpointNames().get(0));
        Assertions.assertEquals(true, model.isEnabled());
    }
}
