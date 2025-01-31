// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OS image profile. */
@Fluent
public final class OsImageProfile {
    /*
     * OS image publisher
     */
    @JsonProperty(value = "publisher")
    private OSImagePublisher publisher;

    /*
     * OS image offer
     */
    @JsonProperty(value = "offer")
    private OSImageOffer offer;

    /*
     * OS image sku
     */
    @JsonProperty(value = "sku")
    private OSImageSku sku;

    /*
     * OS image version
     */
    @JsonProperty(value = "version")
    private OSImageVersion version;

    /**
     * Get the publisher property: OS image publisher.
     *
     * @return the publisher value.
     */
    public OSImagePublisher publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: OS image publisher.
     *
     * @param publisher the publisher value to set.
     * @return the OsImageProfile object itself.
     */
    public OsImageProfile withPublisher(OSImagePublisher publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: OS image offer.
     *
     * @return the offer value.
     */
    public OSImageOffer offer() {
        return this.offer;
    }

    /**
     * Set the offer property: OS image offer.
     *
     * @param offer the offer value to set.
     * @return the OsImageProfile object itself.
     */
    public OsImageProfile withOffer(OSImageOffer offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: OS image sku.
     *
     * @return the sku value.
     */
    public OSImageSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: OS image sku.
     *
     * @param sku the sku value to set.
     * @return the OsImageProfile object itself.
     */
    public OsImageProfile withSku(OSImageSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the version property: OS image version.
     *
     * @return the version value.
     */
    public OSImageVersion version() {
        return this.version;
    }

    /**
     * Set the version property: OS image version.
     *
     * @param version the version value to set.
     * @return the OsImageProfile object itself.
     */
    public OsImageProfile withVersion(OSImageVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
