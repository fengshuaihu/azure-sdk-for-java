// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.NotificationChannel;
import com.azure.resourcemanager.servicefabric.models.NotificationTarget;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NotificationTargetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NotificationTarget model =
            BinaryData
                .fromString(
                    "{\"notificationChannel\":\"EmailUser\",\"receivers\":[\"ebvmgxsabkyqd\",\"ujitcjcz\",\"zevndhkrwpdappds\"]}")
                .toObject(NotificationTarget.class);
        Assertions.assertEquals(NotificationChannel.EMAIL_USER, model.notificationChannel());
        Assertions.assertEquals("ebvmgxsabkyqd", model.receivers().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NotificationTarget model =
            new NotificationTarget()
                .withNotificationChannel(NotificationChannel.EMAIL_USER)
                .withReceivers(Arrays.asList("ebvmgxsabkyqd", "ujitcjcz", "zevndhkrwpdappds"));
        model = BinaryData.fromObject(model).toObject(NotificationTarget.class);
        Assertions.assertEquals(NotificationChannel.EMAIL_USER, model.notificationChannel());
        Assertions.assertEquals("ebvmgxsabkyqd", model.receivers().get(0));
    }
}
