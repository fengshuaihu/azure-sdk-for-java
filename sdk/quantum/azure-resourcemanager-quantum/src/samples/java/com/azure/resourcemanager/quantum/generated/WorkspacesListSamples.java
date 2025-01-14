// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

/** Samples for Workspaces List. */
public final class WorkspacesListSamples {
    /*
     * x-ms-original-file: specification/quantum/resource-manager/Microsoft.Quantum/preview/2022-01-10-preview/examples/quantumWorkspacesListSubscription.json
     */
    /**
     * Sample code: QuantumWorkspacesListBySubscription.
     *
     * @param manager Entry point to AzureQuantumManager.
     */
    public static void quantumWorkspacesListBySubscription(
        com.azure.resourcemanager.quantum.AzureQuantumManager manager) {
        manager.workspaces().list(com.azure.core.util.Context.NONE);
    }
}
