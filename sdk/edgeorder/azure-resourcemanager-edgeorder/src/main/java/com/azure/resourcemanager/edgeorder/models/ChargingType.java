// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChargingType. */
public final class ChargingType extends ExpandableStringEnum<ChargingType> {
    /** Static value PerOrder for ChargingType. */
    public static final ChargingType PER_ORDER = fromString("PerOrder");

    /** Static value PerDevice for ChargingType. */
    public static final ChargingType PER_DEVICE = fromString("PerDevice");

    /**
     * Creates or finds a ChargingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChargingType.
     */
    @JsonCreator
    public static ChargingType fromString(String name) {
        return fromString(name, ChargingType.class);
    }

    /** @return known ChargingType values. */
    public static Collection<ChargingType> values() {
        return values(ChargingType.class);
    }
}