// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for BuildService ListBuildServices. */
public final class BuildServiceListBuildServicesSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/BuildService_ListBuildServices.json
     */
    /**
     * Sample code: BuildService_ListBuildServices.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceListBuildServices(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getBuildServices()
            .listBuildServices("myResourceGroup", "myservice", Context.NONE);
    }
}
