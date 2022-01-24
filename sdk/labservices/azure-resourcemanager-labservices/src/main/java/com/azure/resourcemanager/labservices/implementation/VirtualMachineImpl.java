// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.labservices.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.labservices.models.ProvisioningState;
import com.azure.resourcemanager.labservices.models.VirtualMachine;
import com.azure.resourcemanager.labservices.models.VirtualMachineConnectionProfile;
import com.azure.resourcemanager.labservices.models.VirtualMachineState;
import com.azure.resourcemanager.labservices.models.VirtualMachineType;

public final class VirtualMachineImpl implements VirtualMachine {
    private VirtualMachineInner innerObject;

    private final com.azure.resourcemanager.labservices.LabServicesManager serviceManager;

    VirtualMachineImpl(
        VirtualMachineInner innerObject, com.azure.resourcemanager.labservices.LabServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualMachineState state() {
        return this.innerModel().state();
    }

    public VirtualMachineConnectionProfile connectionProfile() {
        return this.innerModel().connectionProfile();
    }

    public String claimedByUserId() {
        return this.innerModel().claimedByUserId();
    }

    public VirtualMachineType vmType() {
        return this.innerModel().vmType();
    }

    public VirtualMachineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.labservices.LabServicesManager manager() {
        return this.serviceManager;
    }
}