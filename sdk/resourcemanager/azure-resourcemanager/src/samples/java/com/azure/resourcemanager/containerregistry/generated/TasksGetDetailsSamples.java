// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for Tasks GetDetails. */
public final class TasksGetDetailsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksGetDetails.json
     */
    /**
     * Sample code: Tasks_GetDetails.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void tasksGetDetails(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getTasks()
            .getDetailsWithResponse("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE);
    }
}
