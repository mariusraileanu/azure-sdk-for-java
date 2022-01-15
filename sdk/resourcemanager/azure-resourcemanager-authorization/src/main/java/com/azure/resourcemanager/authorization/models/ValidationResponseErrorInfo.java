// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Failed validation result details. */
@Immutable
public final class ValidationResponseErrorInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidationResponseErrorInfo.class);

    /*
     * Error code indicating why validation failed
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Message indicating why validation failed
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the code property: Error code indicating why validation failed.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: Message indicating why validation failed.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}