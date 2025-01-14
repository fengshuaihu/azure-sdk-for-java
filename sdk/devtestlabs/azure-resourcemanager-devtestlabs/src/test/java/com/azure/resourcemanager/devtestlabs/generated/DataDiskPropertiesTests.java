// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.AttachNewDataDiskOptions;
import com.azure.resourcemanager.devtestlabs.models.DataDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.HostCachingOptions;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import org.junit.jupiter.api.Assertions;

public final class DataDiskPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataDiskProperties model =
            BinaryData
                .fromString(
                    "{\"attachNewDataDiskOptions\":{\"diskSizeGiB\":299337354,\"diskName\":\"ltha\",\"diskType\":\"Standard\"},\"existingLabDiskId\":\"smwutwbdsrezpd\",\"hostCaching\":\"ReadWrite\"}")
                .toObject(DataDiskProperties.class);
        Assertions.assertEquals(299337354, model.attachNewDataDiskOptions().diskSizeGiB());
        Assertions.assertEquals("ltha", model.attachNewDataDiskOptions().diskName());
        Assertions.assertEquals(StorageType.STANDARD, model.attachNewDataDiskOptions().diskType());
        Assertions.assertEquals("smwutwbdsrezpd", model.existingLabDiskId());
        Assertions.assertEquals(HostCachingOptions.READ_WRITE, model.hostCaching());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataDiskProperties model =
            new DataDiskProperties()
                .withAttachNewDataDiskOptions(
                    new AttachNewDataDiskOptions()
                        .withDiskSizeGiB(299337354)
                        .withDiskName("ltha")
                        .withDiskType(StorageType.STANDARD))
                .withExistingLabDiskId("smwutwbdsrezpd")
                .withHostCaching(HostCachingOptions.READ_WRITE);
        model = BinaryData.fromObject(model).toObject(DataDiskProperties.class);
        Assertions.assertEquals(299337354, model.attachNewDataDiskOptions().diskSizeGiB());
        Assertions.assertEquals("ltha", model.attachNewDataDiskOptions().diskName());
        Assertions.assertEquals(StorageType.STANDARD, model.attachNewDataDiskOptions().diskType());
        Assertions.assertEquals("smwutwbdsrezpd", model.existingLabDiskId());
        Assertions.assertEquals(HostCachingOptions.READ_WRITE, model.hostCaching());
    }
}
