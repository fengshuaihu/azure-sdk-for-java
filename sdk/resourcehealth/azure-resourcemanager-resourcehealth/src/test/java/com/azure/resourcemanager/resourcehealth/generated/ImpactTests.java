// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.EventStatusValues;
import com.azure.resourcemanager.resourcehealth.models.Impact;
import com.azure.resourcemanager.resourcehealth.models.ImpactedServiceRegion;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ImpactTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Impact model =
            BinaryData
                .fromString(
                    "{\"impactedService\":\"klbb\",\"impactedRegions\":[{\"impactedRegion\":\"wzbhvgyugu\",\"status\":\"Resolved\",\"impactedSubscriptions\":[\"fssxqukkfplg\",\"gsxnkjzkdeslpv\",\"opwi\"],\"impactedTenants\":[\"hxpkd\",\"zb\"],\"lastUpdateTime\":\"2021-04-02T11:03:50Z\",\"updates\":[]},{\"impactedRegion\":\"a\",\"status\":\"Resolved\",\"impactedSubscriptions\":[\"upedeojnabckhs\",\"txp\",\"ie\"],\"impactedTenants\":[\"hvpesapskrdqm\",\"jjdhtld\",\"kyzxuutk\"],\"lastUpdateTime\":\"2021-06-12T03:44:06Z\",\"updates\":[]},{\"impactedRegion\":\"svlxotogtwrup\",\"status\":\"Resolved\",\"impactedSubscriptions\":[\"micykvceoveilo\"],\"impactedTenants\":[\"tyfjfcnjbkcnxdhb\"],\"lastUpdateTime\":\"2021-07-22T04:13:03Z\",\"updates\":[]}]}")
                .toObject(Impact.class);
        Assertions.assertEquals("klbb", model.impactedService());
        Assertions.assertEquals("wzbhvgyugu", model.impactedRegions().get(0).impactedRegion());
        Assertions.assertEquals(EventStatusValues.RESOLVED, model.impactedRegions().get(0).status());
        Assertions.assertEquals("fssxqukkfplg", model.impactedRegions().get(0).impactedSubscriptions().get(0));
        Assertions.assertEquals("hxpkd", model.impactedRegions().get(0).impactedTenants().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-02T11:03:50Z"), model.impactedRegions().get(0).lastUpdateTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Impact model =
            new Impact()
                .withImpactedService("klbb")
                .withImpactedRegions(
                    Arrays
                        .asList(
                            new ImpactedServiceRegion()
                                .withImpactedRegion("wzbhvgyugu")
                                .withStatus(EventStatusValues.RESOLVED)
                                .withImpactedSubscriptions(Arrays.asList("fssxqukkfplg", "gsxnkjzkdeslpv", "opwi"))
                                .withImpactedTenants(Arrays.asList("hxpkd", "zb"))
                                .withLastUpdateTime(OffsetDateTime.parse("2021-04-02T11:03:50Z"))
                                .withUpdates(Arrays.asList()),
                            new ImpactedServiceRegion()
                                .withImpactedRegion("a")
                                .withStatus(EventStatusValues.RESOLVED)
                                .withImpactedSubscriptions(Arrays.asList("upedeojnabckhs", "txp", "ie"))
                                .withImpactedTenants(Arrays.asList("hvpesapskrdqm", "jjdhtld", "kyzxuutk"))
                                .withLastUpdateTime(OffsetDateTime.parse("2021-06-12T03:44:06Z"))
                                .withUpdates(Arrays.asList()),
                            new ImpactedServiceRegion()
                                .withImpactedRegion("svlxotogtwrup")
                                .withStatus(EventStatusValues.RESOLVED)
                                .withImpactedSubscriptions(Arrays.asList("micykvceoveilo"))
                                .withImpactedTenants(Arrays.asList("tyfjfcnjbkcnxdhb"))
                                .withLastUpdateTime(OffsetDateTime.parse("2021-07-22T04:13:03Z"))
                                .withUpdates(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(Impact.class);
        Assertions.assertEquals("klbb", model.impactedService());
        Assertions.assertEquals("wzbhvgyugu", model.impactedRegions().get(0).impactedRegion());
        Assertions.assertEquals(EventStatusValues.RESOLVED, model.impactedRegions().get(0).status());
        Assertions.assertEquals("fssxqukkfplg", model.impactedRegions().get(0).impactedSubscriptions().get(0));
        Assertions.assertEquals("hxpkd", model.impactedRegions().get(0).impactedTenants().get(0));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-02T11:03:50Z"), model.impactedRegions().get(0).lastUpdateTime());
    }
}
