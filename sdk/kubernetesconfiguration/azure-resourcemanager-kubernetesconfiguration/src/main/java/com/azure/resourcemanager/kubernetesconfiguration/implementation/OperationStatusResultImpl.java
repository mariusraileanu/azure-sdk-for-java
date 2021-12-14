// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.OperationStatusResult;
import java.util.Collections;
import java.util.Map;

public final class OperationStatusResultImpl implements OperationStatusResult {
    private OperationStatusResultInner innerObject;

    private final com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager;

    OperationStatusResultImpl(
        OperationStatusResultInner innerObject,
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public Map<String, String> properties() {
        Map<String, String> inner = this.innerModel().properties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public OperationStatusResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager() {
        return this.serviceManager;
    }
}