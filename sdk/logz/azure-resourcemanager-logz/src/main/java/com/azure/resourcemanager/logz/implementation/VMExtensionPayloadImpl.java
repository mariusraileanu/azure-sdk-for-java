// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.implementation;

import com.azure.resourcemanager.logz.fluent.models.VMExtensionPayloadInner;
import com.azure.resourcemanager.logz.models.VMExtensionPayload;

public final class VMExtensionPayloadImpl implements VMExtensionPayload {
    private VMExtensionPayloadInner innerObject;

    private final com.azure.resourcemanager.logz.LogzManager serviceManager;

    VMExtensionPayloadImpl(
        VMExtensionPayloadInner innerObject, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String apiKey() {
        return this.innerModel().apiKey();
    }

    public String region() {
        return this.innerModel().region();
    }

    public VMExtensionPayloadInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logz.LogzManager manager() {
        return this.serviceManager;
    }
}