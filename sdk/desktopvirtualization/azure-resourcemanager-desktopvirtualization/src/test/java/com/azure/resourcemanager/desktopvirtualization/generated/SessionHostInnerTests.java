// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostInner;
import com.azure.resourcemanager.desktopvirtualization.models.Status;
import com.azure.resourcemanager.desktopvirtualization.models.UpdateState;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SessionHostInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SessionHostInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"objectId\":\"ltdtbnnhad\",\"lastHeartBeat\":\"2021-04-24T13:40:54Z\",\"sessions\":948301726,\"agentVersion\":\"cikhnv\",\"allowNewSession\":false,\"virtualMachineId\":\"gxqquezik\",\"resourceId\":\"ggxkallatmelwuip\",\"assignedUser\":\"cjzkzivgvvcna\",\"friendlyName\":\"hyrnxxmu\",\"status\":\"FSLogixNotHealthy\",\"statusTimestamp\":\"2021-01-14T05:54:01Z\",\"osVersion\":\"dvstkw\",\"sxSStackVersion\":\"tchealmf\",\"updateState\":\"Pending\",\"lastUpdateTime\":\"2021-06-02T22:58:14Z\",\"updateErrorMessage\":\"gdv\",\"sessionHostHealthCheckResults\":[{\"healthCheckName\":\"WebRTCRedirectorCheck\",\"healthCheckResult\":\"HealthCheckFailed\"},{\"healthCheckName\":\"MetaDataServiceCheck\",\"healthCheckResult\":\"HealthCheckSucceeded\"},{\"healthCheckName\":\"AppAttachHealthCheck\",\"healthCheckResult\":\"HealthCheckFailed\"},{\"healthCheckName\":\"WebRTCRedirectorCheck\",\"healthCheckResult\":\"HealthCheckSucceeded\"}]},\"id\":\"gvr\",\"name\":\"mnpkukghimdblxg\",\"type\":\"imfnjhfjx\"}")
                .toObject(SessionHostInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-24T13:40:54Z"), model.lastHeartBeat());
        Assertions.assertEquals(948301726, model.sessions());
        Assertions.assertEquals("cikhnv", model.agentVersion());
        Assertions.assertEquals(false, model.allowNewSession());
        Assertions.assertEquals("cjzkzivgvvcna", model.assignedUser());
        Assertions.assertEquals("hyrnxxmu", model.friendlyName());
        Assertions.assertEquals(Status.FSLOGIX_NOT_HEALTHY, model.status());
        Assertions.assertEquals("dvstkw", model.osVersion());
        Assertions.assertEquals("tchealmf", model.sxSStackVersion());
        Assertions.assertEquals(UpdateState.PENDING, model.updateState());
        Assertions.assertEquals("gdv", model.updateErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SessionHostInner model =
            new SessionHostInner()
                .withLastHeartBeat(OffsetDateTime.parse("2021-04-24T13:40:54Z"))
                .withSessions(948301726)
                .withAgentVersion("cikhnv")
                .withAllowNewSession(false)
                .withAssignedUser("cjzkzivgvvcna")
                .withFriendlyName("hyrnxxmu")
                .withStatus(Status.FSLOGIX_NOT_HEALTHY)
                .withOsVersion("dvstkw")
                .withSxSStackVersion("tchealmf")
                .withUpdateState(UpdateState.PENDING)
                .withUpdateErrorMessage("gdv");
        model = BinaryData.fromObject(model).toObject(SessionHostInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-24T13:40:54Z"), model.lastHeartBeat());
        Assertions.assertEquals(948301726, model.sessions());
        Assertions.assertEquals("cikhnv", model.agentVersion());
        Assertions.assertEquals(false, model.allowNewSession());
        Assertions.assertEquals("cjzkzivgvvcna", model.assignedUser());
        Assertions.assertEquals("hyrnxxmu", model.friendlyName());
        Assertions.assertEquals(Status.FSLOGIX_NOT_HEALTHY, model.status());
        Assertions.assertEquals("dvstkw", model.osVersion());
        Assertions.assertEquals("tchealmf", model.sxSStackVersion());
        Assertions.assertEquals(UpdateState.PENDING, model.updateState());
        Assertions.assertEquals("gdv", model.updateErrorMessage());
    }
}
