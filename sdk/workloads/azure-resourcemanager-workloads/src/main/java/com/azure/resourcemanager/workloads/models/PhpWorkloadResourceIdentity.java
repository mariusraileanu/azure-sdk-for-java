// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import java.util.Map;

/** Identity for the resource. Currently not supported. */
@Fluent
public class PhpWorkloadResourceIdentity extends UserAssignedServiceIdentity {
    /** {@inheritDoc} */
    @Override
    public PhpWorkloadResourceIdentity withType(ManagedServiceIdentityType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PhpWorkloadResourceIdentity withUserAssignedIdentities(
        Map<String, UserAssignedIdentity> userAssignedIdentities) {
        super.withUserAssignedIdentities(userAssignedIdentities);
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
    }
}
