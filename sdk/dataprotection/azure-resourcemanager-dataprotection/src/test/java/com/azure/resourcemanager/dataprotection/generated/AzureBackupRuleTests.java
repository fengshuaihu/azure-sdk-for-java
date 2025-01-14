// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRule;
import com.azure.resourcemanager.dataprotection.models.BackupParameters;
import com.azure.resourcemanager.dataprotection.models.DataStoreInfoBase;
import com.azure.resourcemanager.dataprotection.models.DataStoreTypes;
import com.azure.resourcemanager.dataprotection.models.TriggerContext;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupRule model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureBackupRule\",\"backupParameters\":{\"objectType\":\"BackupParameters\"},\"dataStore\":{\"dataStoreType\":\"ArchiveStore\",\"objectType\":\"qxvcxgfrpdsofb\"},\"trigger\":{\"objectType\":\"TriggerContext\"},\"name\":\"hrnsvbu\"}")
                .toObject(AzureBackupRule.class);
        Assertions.assertEquals("hrnsvbu", model.name());
        Assertions.assertEquals(DataStoreTypes.ARCHIVE_STORE, model.dataStore().dataStoreType());
        Assertions.assertEquals("qxvcxgfrpdsofb", model.dataStore().objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupRule model =
            new AzureBackupRule()
                .withName("hrnsvbu")
                .withBackupParameters(new BackupParameters())
                .withDataStore(
                    new DataStoreInfoBase()
                        .withDataStoreType(DataStoreTypes.ARCHIVE_STORE)
                        .withObjectType("qxvcxgfrpdsofb"))
                .withTrigger(new TriggerContext());
        model = BinaryData.fromObject(model).toObject(AzureBackupRule.class);
        Assertions.assertEquals("hrnsvbu", model.name());
        Assertions.assertEquals(DataStoreTypes.ARCHIVE_STORE, model.dataStore().dataStoreType());
        Assertions.assertEquals("qxvcxgfrpdsofb", model.dataStore().objectType());
    }
}
