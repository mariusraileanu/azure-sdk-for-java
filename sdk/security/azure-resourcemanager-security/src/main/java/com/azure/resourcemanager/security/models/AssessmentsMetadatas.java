// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AssessmentsMetadatas. */
public interface AssessmentsMetadatas {
    /**
     * Get metadata information on all assessment types.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityAssessmentMetadataResponse> list();

    /**
     * Get metadata information on all assessment types.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityAssessmentMetadataResponse> list(Context context);

    /**
     * Get metadata information on an assessment type.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type along with {@link Response}.
     */
    Response<SecurityAssessmentMetadataResponse> getWithResponse(String assessmentMetadataName, Context context);

    /**
     * Get metadata information on an assessment type.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type.
     */
    SecurityAssessmentMetadataResponse get(String assessmentMetadataName);

    /**
     * Get metadata information on all assessment types in a specific subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types in a specific subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<SecurityAssessmentMetadataResponse> listBySubscription();

    /**
     * Get metadata information on all assessment types in a specific subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types in a specific subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<SecurityAssessmentMetadataResponse> listBySubscription(Context context);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription along with {@link Response}.
     */
    Response<SecurityAssessmentMetadataResponse> getInSubscriptionWithResponse(
        String assessmentMetadataName, Context context);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription.
     */
    SecurityAssessmentMetadataResponse getInSubscription(String assessmentMetadataName);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteInSubscriptionWithResponse(String assessmentMetadataName, Context context);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteInSubscription(String assessmentMetadataName);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription along with {@link Response}.
     */
    SecurityAssessmentMetadataResponse getInSubscriptionById(String id);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription along with {@link Response}.
     */
    Response<SecurityAssessmentMetadataResponse> getInSubscriptionByIdWithResponse(String id, Context context);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteInSubscriptionById(String id);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteInSubscriptionByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SecurityAssessmentMetadataResponse resource.
     *
     * @param name resource name.
     * @return the first stage of the new SecurityAssessmentMetadataResponse definition.
     */
    SecurityAssessmentMetadataResponse.DefinitionStages.Blank define(String name);
}
