// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.EndpointRangeDescription;
import org.junit.jupiter.api.Assertions;

public final class EndpointRangeDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointRangeDescription model =
            BinaryData
                .fromString("{\"startPort\":1629282531,\"endPort\":850212440}")
                .toObject(EndpointRangeDescription.class);
        Assertions.assertEquals(1629282531, model.startPort());
        Assertions.assertEquals(850212440, model.endPort());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointRangeDescription model =
            new EndpointRangeDescription().withStartPort(1629282531).withEndPort(850212440);
        model = BinaryData.fromObject(model).toObject(EndpointRangeDescription.class);
        Assertions.assertEquals(1629282531, model.startPort());
        Assertions.assertEquals(850212440, model.endPort());
    }
}
