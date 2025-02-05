// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AsyncOperationStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AsyncOperationStatusInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"uaodsfcpk\",\"name\":\"odpuozmyzydag\",\"status\":\"uaxbezyiuokkt\",\"resourceId\":\"rdxwzywqsm\",\"startTime\":\"2021-02-03T23:59:34Z\",\"endTime\":\"2021-11-03T13:13:31Z\",\"percentComplete\":85.49606321618805,\"properties\":\"dataryocfsfksymdd\"}")
                .toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("uaodsfcpk", model.id());
        Assertions.assertEquals("odpuozmyzydag", model.name());
        Assertions.assertEquals("uaxbezyiuokkt", model.status());
        Assertions.assertEquals("rdxwzywqsm", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-03T23:59:34Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-03T13:13:31Z"), model.endTime());
        Assertions.assertEquals(85.49606321618805D, model.percentComplete());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AsyncOperationStatusInner model =
            new AsyncOperationStatusInner()
                .withId("uaodsfcpk")
                .withName("odpuozmyzydag")
                .withStatus("uaxbezyiuokkt")
                .withResourceId("rdxwzywqsm")
                .withStartTime(OffsetDateTime.parse("2021-02-03T23:59:34Z"))
                .withEndTime(OffsetDateTime.parse("2021-11-03T13:13:31Z"))
                .withPercentComplete(85.49606321618805D)
                .withProperties("dataryocfsfksymdd");
        model = BinaryData.fromObject(model).toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("uaodsfcpk", model.id());
        Assertions.assertEquals("odpuozmyzydag", model.name());
        Assertions.assertEquals("uaxbezyiuokkt", model.status());
        Assertions.assertEquals("rdxwzywqsm", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-03T23:59:34Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-03T13:13:31Z"), model.endTime());
        Assertions.assertEquals(85.49606321618805D, model.percentComplete());
    }
}
