// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.RoleDefinitionInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleDefinitionsClient. */
public interface RoleDefinitionsClient extends InnerSupportsDelete<RoleDefinitionInner> {
    /**
     * Deletes a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleDefinitionInner>> deleteWithResponseAsync(String scope, String roleDefinitionId);

    /**
     * Deletes a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleDefinitionInner> deleteAsync(String scope, String roleDefinitionId);

    /**
     * Deletes a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleDefinitionInner delete(String scope, String roleDefinitionId);

    /**
     * Deletes a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleDefinitionInner> deleteWithResponse(String scope, String roleDefinitionId, Context context);

    /**
     * Get role definition by name (GUID).
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by name (GUID).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleDefinitionInner>> getWithResponseAsync(String scope, String roleDefinitionId);

    /**
     * Get role definition by name (GUID).
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by name (GUID).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleDefinitionInner> getAsync(String scope, String roleDefinitionId);

    /**
     * Get role definition by name (GUID).
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by name (GUID).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleDefinitionInner get(String scope, String roleDefinitionId);

    /**
     * Get role definition by name (GUID).
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition by name (GUID).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleDefinitionInner> getWithResponse(String scope, String roleDefinitionId, Context context);

    /**
     * Creates or updates a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param roleDefinition The values for the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleDefinitionInner>> createOrUpdateWithResponseAsync(
        String scope, String roleDefinitionId, RoleDefinitionInner roleDefinition);

    /**
     * Creates or updates a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param roleDefinition The values for the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleDefinitionInner> createOrUpdateAsync(
        String scope, String roleDefinitionId, RoleDefinitionInner roleDefinition);

    /**
     * Creates or updates a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param roleDefinition The values for the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleDefinitionInner createOrUpdate(String scope, String roleDefinitionId, RoleDefinitionInner roleDefinition);

    /**
     * Creates or updates a role definition.
     *
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param roleDefinition The values for the role definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleDefinitionInner> createOrUpdateWithResponse(
        String scope, String roleDefinitionId, RoleDefinitionInner roleDefinition, Context context);

    /**
     * Get all role definitions that are applicable at scope and above.
     *
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as
     *     well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleDefinitionInner> listAsync(String scope, String filter);

    /**
     * Get all role definitions that are applicable at scope and above.
     *
     * @param scope The scope of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleDefinitionInner> listAsync(String scope);

    /**
     * Get all role definitions that are applicable at scope and above.
     *
     * @param scope The scope of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleDefinitionInner> list(String scope);

    /**
     * Get all role definitions that are applicable at scope and above.
     *
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as
     *     well.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleDefinitionInner> list(String scope, String filter, Context context);

    /**
     * Gets a role definition by ID.
     *
     * @param roleDefinitionId The fully qualified role definition ID. Use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription
     *     level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant
     *     level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role definition by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleDefinitionInner>> getByIdWithResponseAsync(String roleDefinitionId);

    /**
     * Gets a role definition by ID.
     *
     * @param roleDefinitionId The fully qualified role definition ID. Use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription
     *     level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant
     *     level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role definition by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleDefinitionInner> getByIdAsync(String roleDefinitionId);

    /**
     * Gets a role definition by ID.
     *
     * @param roleDefinitionId The fully qualified role definition ID. Use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription
     *     level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant
     *     level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role definition by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleDefinitionInner getById(String roleDefinitionId);

    /**
     * Gets a role definition by ID.
     *
     * @param roleDefinitionId The fully qualified role definition ID. Use the format,
     *     /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription
     *     level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant
     *     level role definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role definition by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleDefinitionInner> getByIdWithResponse(String roleDefinitionId, Context context);
}