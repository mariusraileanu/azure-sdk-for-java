// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for SubscriptionFeatureRegistrations Delete. */
public final class SubscriptionFeatureRegistrationsDeleteSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Features/stable/2021-07-01/examples/FeatureRegistration/SubscriptionFeatureRegistrationDELETE.json
     */
    /**
     * Sample code: Deletes a feature registration.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletesAFeatureRegistration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .featureClient()
            .getSubscriptionFeatureRegistrations()
            .deleteWithResponse("subscriptionFeatureRegistrationGroupTestRG", "testFeature", Context.NONE);
    }
}
