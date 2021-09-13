// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for WorkspaceManagedSqlServerUsages List. */
public final class WorkspaceManagedSqlServerUsagesListSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/ListWorkspaceManagedSqlServerUsages.json
     */
    /**
     * Sample code: List usages metric for the workspace managed sql server.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listUsagesMetricForTheWorkspaceManagedSqlServer(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.workspaceManagedSqlServerUsages().list("wsg-7398", "testWorkspace", Context.NONE);
    }
}