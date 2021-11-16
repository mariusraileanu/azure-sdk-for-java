// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PipelineSourceTriggerProperties model. */
@Fluent
public final class PipelineSourceTriggerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelineSourceTriggerProperties.class);

    /*
     * The current status of the source trigger.
     */
    @JsonProperty(value = "status", required = true)
    private TriggerStatus status;

    /**
     * Get the status property: The current status of the source trigger.
     *
     * @return the status value.
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the source trigger.
     *
     * @param status the status value to set.
     * @return the PipelineSourceTriggerProperties object itself.
     */
    public PipelineSourceTriggerProperties withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property status in model PipelineSourceTriggerProperties"));
        }
    }
}