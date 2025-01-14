// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScheduleActionType. */
public final class ScheduleActionType extends ExpandableStringEnum<ScheduleActionType> {
    /** Static value CreateJob for ScheduleActionType. */
    public static final ScheduleActionType CREATE_JOB = fromString("CreateJob");

    /** Static value InvokeBatchEndpoint for ScheduleActionType. */
    public static final ScheduleActionType INVOKE_BATCH_ENDPOINT = fromString("InvokeBatchEndpoint");

    /**
     * Creates or finds a ScheduleActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScheduleActionType.
     */
    @JsonCreator
    public static ScheduleActionType fromString(String name) {
        return fromString(name, ScheduleActionType.class);
    }

    /**
     * Gets known ScheduleActionType values.
     *
     * @return known ScheduleActionType values.
     */
    public static Collection<ScheduleActionType> values() {
        return values(ScheduleActionType.class);
    }
}
