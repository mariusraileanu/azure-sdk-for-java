// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.models.StaticSitePatchResource;

/** Samples for StaticSites UpdateStaticSite. */
public final class StaticSitesUpdateStaticSiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/PatchStaticSite.json
     */
    /**
     * Sample code: Patch a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .updateStaticSiteWithResponse("rg", "testStaticSite0", new StaticSitePatchResource(), Context.NONE);
    }
}