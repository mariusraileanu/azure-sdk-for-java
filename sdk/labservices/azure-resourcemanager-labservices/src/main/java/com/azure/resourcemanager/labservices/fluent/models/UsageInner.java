// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.models.UsageName;
import com.azure.resourcemanager.labservices.models.UsageUnit;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The core usage details. */
@Fluent
public final class UsageInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsageInner.class);

    /*
     * The current usage.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /*
     * The limit integer.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /*
     * The unit details.
     */
    @JsonProperty(value = "unit")
    private UsageUnit unit;

    /*
     * The name.
     */
    @JsonProperty(value = "name")
    private UsageName name;

    /*
     * The fully qualified arm resource id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the currentValue property: The current usage.
     *
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current usage.
     *
     * @param currentValue the currentValue value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The limit integer.
     *
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The limit integer.
     *
     * @param limit the limit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the unit property: The unit details.
     *
     * @return the unit value.
     */
    public UsageUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit details.
     *
     * @param unit the unit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(UsageUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the name property: The name.
     *
     * @return the name value.
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     *
     * @param name the name value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The fully qualified arm resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The fully qualified arm resource id.
     *
     * @param id the id value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}