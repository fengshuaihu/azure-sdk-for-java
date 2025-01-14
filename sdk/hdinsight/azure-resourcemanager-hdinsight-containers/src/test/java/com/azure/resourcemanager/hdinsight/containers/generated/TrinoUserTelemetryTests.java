// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.TrinoTelemetryConfig;
import com.azure.resourcemanager.hdinsight.containers.models.TrinoUserTelemetry;
import org.junit.jupiter.api.Assertions;

public final class TrinoUserTelemetryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrinoUserTelemetry model =
            BinaryData
                .fromString(
                    "{\"storage\":{\"hivecatalogName\":\"mtsavjcbpwxqp\",\"hivecatalogSchema\":\"knftguvriuh\",\"partitionRetentionInDays\":499230067,\"path\":\"dyvxqtayriww\"}}")
                .toObject(TrinoUserTelemetry.class);
        Assertions.assertEquals("mtsavjcbpwxqp", model.storage().hivecatalogName());
        Assertions.assertEquals("knftguvriuh", model.storage().hivecatalogSchema());
        Assertions.assertEquals(499230067, model.storage().partitionRetentionInDays());
        Assertions.assertEquals("dyvxqtayriww", model.storage().path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrinoUserTelemetry model =
            new TrinoUserTelemetry()
                .withStorage(
                    new TrinoTelemetryConfig()
                        .withHivecatalogName("mtsavjcbpwxqp")
                        .withHivecatalogSchema("knftguvriuh")
                        .withPartitionRetentionInDays(499230067)
                        .withPath("dyvxqtayriww"));
        model = BinaryData.fromObject(model).toObject(TrinoUserTelemetry.class);
        Assertions.assertEquals("mtsavjcbpwxqp", model.storage().hivecatalogName());
        Assertions.assertEquals("knftguvriuh", model.storage().hivecatalogSchema());
        Assertions.assertEquals(499230067, model.storage().partitionRetentionInDays());
        Assertions.assertEquals("dyvxqtayriww", model.storage().path());
    }
}
