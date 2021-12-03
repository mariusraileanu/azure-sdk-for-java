// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP configuration. */
@Fluent
public final class IpConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpConfigurationInner.class);

    /*
     * Properties of the IP configuration
     */
    @JsonProperty(value = "properties")
    private IpConfigurationPropertiesFormatInner innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Properties of the IP configuration.
     *
     * @return the innerProperties value.
     */
    private IpConfigurationPropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withPrivateIpAddress(String privateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP allocation method. Possible values are 'Static' and
     * 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP allocation method. Possible values are 'Static' and
     * 'Dynamic'.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the subnet property: The reference of the subnet resource.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The reference of the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withSubnet(SubnetInner subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference of the public IP resource.
     *
     * @return the publicIpAddress value.
     */
    public PublicIpAddressInner publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: The reference of the public IP resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the IpConfigurationInner object itself.
     */
    public IpConfigurationInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}