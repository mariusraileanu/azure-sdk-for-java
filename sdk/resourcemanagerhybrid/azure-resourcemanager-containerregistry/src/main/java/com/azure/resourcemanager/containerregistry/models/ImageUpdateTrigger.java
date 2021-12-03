// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The image update trigger that caused a build. */
@Fluent
public final class ImageUpdateTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageUpdateTrigger.class);

    /*
     * The unique ID of the trigger.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The timestamp when the image update happened.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * The list of image updates that caused the build.
     */
    @JsonProperty(value = "images")
    private List<ImageDescriptor> images;

    /**
     * Get the id property: The unique ID of the trigger.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The unique ID of the trigger.
     *
     * @param id the id value to set.
     * @return the ImageUpdateTrigger object itself.
     */
    public ImageUpdateTrigger withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the timestamp property: The timestamp when the image update happened.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The timestamp when the image update happened.
     *
     * @param timestamp the timestamp value to set.
     * @return the ImageUpdateTrigger object itself.
     */
    public ImageUpdateTrigger withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the images property: The list of image updates that caused the build.
     *
     * @return the images value.
     */
    public List<ImageDescriptor> images() {
        return this.images;
    }

    /**
     * Set the images property: The list of image updates that caused the build.
     *
     * @param images the images value to set.
     * @return the ImageUpdateTrigger object itself.
     */
    public ImageUpdateTrigger withImages(List<ImageDescriptor> images) {
        this.images = images;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (images() != null) {
            images().forEach(e -> e.validate());
        }
    }
}