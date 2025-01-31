// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/**
 * Specifies the clip time as a Utc time position in the media file. The Utc time can point to a different position
 * depending on whether the media file starts from a timestamp of zero or not.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.UtcClipTime")
@Fluent
public final class UtcClipTime extends ClipTime {
    /*
     * The time position on the timeline of the input media based on Utc time.
     */
    @JsonProperty(value = "time", required = true)
    private OffsetDateTime time;

    /**
     * Get the time property: The time position on the timeline of the input media based on Utc time.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Set the time property: The time position on the timeline of the input media based on Utc time.
     *
     * @param time the time value to set.
     * @return the UtcClipTime object itself.
     */
    public UtcClipTime withTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (time() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property time in model UtcClipTime"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UtcClipTime.class);
}
