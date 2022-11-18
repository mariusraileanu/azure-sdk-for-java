// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.security.fluent.models.AdaptiveNetworkHardeningInner;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardeningEnforceRequest;

/** An instance of this class provides access to all the operations defined in AdaptiveNetworkHardeningsClient. */
public interface AdaptiveNetworkHardeningsClient {
    /**
     * Gets a list of Adaptive Network Hardenings resources in scope of an extended resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Adaptive Network Hardenings resources in scope of an extended resource as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AdaptiveNetworkHardeningInner> listByExtendedResource(
        String resourceGroupName, String resourceNamespace, String resourceType, String resourceName);

    /**
     * Gets a list of Adaptive Network Hardenings resources in scope of an extended resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Adaptive Network Hardenings resources in scope of an extended resource as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AdaptiveNetworkHardeningInner> listByExtendedResource(
        String resourceGroupName, String resourceNamespace, String resourceType, String resourceName, Context context);

    /**
     * Gets a single Adaptive Network Hardening resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param adaptiveNetworkHardeningResourceName The name of the Adaptive Network Hardening resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single Adaptive Network Hardening resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdaptiveNetworkHardeningInner> getWithResponse(
        String resourceGroupName,
        String resourceNamespace,
        String resourceType,
        String resourceName,
        String adaptiveNetworkHardeningResourceName,
        Context context);

    /**
     * Gets a single Adaptive Network Hardening resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param adaptiveNetworkHardeningResourceName The name of the Adaptive Network Hardening resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single Adaptive Network Hardening resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdaptiveNetworkHardeningInner get(
        String resourceGroupName,
        String resourceNamespace,
        String resourceType,
        String resourceName,
        String adaptiveNetworkHardeningResourceName);

    /**
     * Enforces the given rules on the NSG(s) listed in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param adaptiveNetworkHardeningResourceName The name of the Adaptive Network Hardening resource.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnforce(
        String resourceGroupName,
        String resourceNamespace,
        String resourceType,
        String resourceName,
        String adaptiveNetworkHardeningResourceName,
        AdaptiveNetworkHardeningEnforceRequest body);

    /**
     * Enforces the given rules on the NSG(s) listed in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param adaptiveNetworkHardeningResourceName The name of the Adaptive Network Hardening resource.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnforce(
        String resourceGroupName,
        String resourceNamespace,
        String resourceType,
        String resourceName,
        String adaptiveNetworkHardeningResourceName,
        AdaptiveNetworkHardeningEnforceRequest body,
        Context context);

    /**
     * Enforces the given rules on the NSG(s) listed in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param adaptiveNetworkHardeningResourceName The name of the Adaptive Network Hardening resource.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enforce(
        String resourceGroupName,
        String resourceNamespace,
        String resourceType,
        String resourceName,
        String adaptiveNetworkHardeningResourceName,
        AdaptiveNetworkHardeningEnforceRequest body);

    /**
     * Enforces the given rules on the NSG(s) listed in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param adaptiveNetworkHardeningResourceName The name of the Adaptive Network Hardening resource.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enforce(
        String resourceGroupName,
        String resourceNamespace,
        String resourceType,
        String resourceName,
        String adaptiveNetworkHardeningResourceName,
        AdaptiveNetworkHardeningEnforceRequest body,
        Context context);
}
