// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.models.PolicyAssignmentProperties;
import com.azure.resourcemanager.authorization.models.RoleManagementPolicyRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Role management policy. */
@Fluent
public final class RoleManagementPolicyAssignmentInner {
    /*
     * The role management policy Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The role management policy name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The role management policy type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Role management policy properties.
     */
    @JsonProperty(value = "properties")
    private RoleManagementPolicyAssignmentProperties innerProperties;

    /** Creates an instance of RoleManagementPolicyAssignmentInner class. */
    public RoleManagementPolicyAssignmentInner() {
    }

    /**
     * Get the id property: The role management policy Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The role management policy name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The role management policy type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Role management policy properties.
     *
     * @return the innerProperties value.
     */
    private RoleManagementPolicyAssignmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the scope property: The role management policy scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: The role management policy scope.
     *
     * @param scope the scope value to set.
     * @return the RoleManagementPolicyAssignmentInner object itself.
     */
    public RoleManagementPolicyAssignmentInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleManagementPolicyAssignmentProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition of management policy assignment.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: The role definition of management policy assignment.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleManagementPolicyAssignmentInner object itself.
     */
    public RoleManagementPolicyAssignmentInner withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleManagementPolicyAssignmentProperties();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the policyId property: The policy id role management policy assignment.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.innerProperties() == null ? null : this.innerProperties().policyId();
    }

    /**
     * Set the policyId property: The policy id role management policy assignment.
     *
     * @param policyId the policyId value to set.
     * @return the RoleManagementPolicyAssignmentInner object itself.
     */
    public RoleManagementPolicyAssignmentInner withPolicyId(String policyId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleManagementPolicyAssignmentProperties();
        }
        this.innerProperties().withPolicyId(policyId);
        return this;
    }

    /**
     * Get the effectiveRules property: The readonly computed rule applied to the policy.
     *
     * @return the effectiveRules value.
     */
    public List<RoleManagementPolicyRule> effectiveRules() {
        return this.innerProperties() == null ? null : this.innerProperties().effectiveRules();
    }

    /**
     * Get the policyAssignmentProperties property: Additional properties of scope, role definition and policy.
     *
     * @return the policyAssignmentProperties value.
     */
    public PolicyAssignmentProperties policyAssignmentProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().policyAssignmentProperties();
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
