// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.models.AttestationEvidence;
import com.azure.resourcemanager.policyinsights.models.ComplianceState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The properties of an attestation resource. */
@Fluent
public final class AttestationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AttestationProperties.class);

    /*
     * The resource ID of the policy assignment that the attestation is setting
     * the state for.
     */
    @JsonProperty(value = "policyAssignmentId", required = true)
    private String policyAssignmentId;

    /*
     * The policy definition reference ID from a policy set definition that the
     * attestation is setting the state for. If the policy assignment assigns a
     * policy set definition the attestation can choose a definition within the
     * set definition with this property or omit this and set the state for the
     * entire set definition.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /*
     * The compliance state that should be set on the resource.
     */
    @JsonProperty(value = "complianceState")
    private ComplianceState complianceState;

    /*
     * The time the compliance state should expire.
     */
    @JsonProperty(value = "expiresOn")
    private OffsetDateTime expiresOn;

    /*
     * The person responsible for setting the state of the resource. This value
     * is typically an Azure Active Directory object ID.
     */
    @JsonProperty(value = "owner")
    private String owner;

    /*
     * Comments describing why this attestation was created.
     */
    @JsonProperty(value = "comments")
    private String comments;

    /*
     * The evidence supporting the compliance state set in this attestation.
     */
    @JsonProperty(value = "evidence")
    private List<AttestationEvidence> evidence;

    /*
     * The status of the attestation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The time the compliance state was last changed in this attestation.
     */
    @JsonProperty(value = "lastComplianceStateChangeAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastComplianceStateChangeAt;

    /**
     * Get the policyAssignmentId property: The resource ID of the policy assignment that the attestation is setting the
     * state for.
     *
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set the policyAssignmentId property: The resource ID of the policy assignment that the attestation is setting the
     * state for.
     *
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the AttestationProperties object itself.
     */
    public AttestationProperties withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: The policy definition reference ID from a policy set definition
     * that the attestation is setting the state for. If the policy assignment assigns a policy set definition the
     * attestation can choose a definition within the set definition with this property or omit this and set the state
     * for the entire set definition.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: The policy definition reference ID from a policy set definition
     * that the attestation is setting the state for. If the policy assignment assigns a policy set definition the
     * attestation can choose a definition within the set definition with this property or omit this and set the state
     * for the entire set definition.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the AttestationProperties object itself.
     */
    public AttestationProperties withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Get the complianceState property: The compliance state that should be set on the resource.
     *
     * @return the complianceState value.
     */
    public ComplianceState complianceState() {
        return this.complianceState;
    }

    /**
     * Set the complianceState property: The compliance state that should be set on the resource.
     *
     * @param complianceState the complianceState value to set.
     * @return the AttestationProperties object itself.
     */
    public AttestationProperties withComplianceState(ComplianceState complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /**
     * Get the expiresOn property: The time the compliance state should expire.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime expiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: The time the compliance state should expire.
     *
     * @param expiresOn the expiresOn value to set.
     * @return the AttestationProperties object itself.
     */
    public AttestationProperties withExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the owner property: The person responsible for setting the state of the resource. This value is typically an
     * Azure Active Directory object ID.
     *
     * @return the owner value.
     */
    public String owner() {
        return this.owner;
    }

    /**
     * Set the owner property: The person responsible for setting the state of the resource. This value is typically an
     * Azure Active Directory object ID.
     *
     * @param owner the owner value to set.
     * @return the AttestationProperties object itself.
     */
    public AttestationProperties withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the comments property: Comments describing why this attestation was created.
     *
     * @return the comments value.
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set the comments property: Comments describing why this attestation was created.
     *
     * @param comments the comments value to set.
     * @return the AttestationProperties object itself.
     */
    public AttestationProperties withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get the evidence property: The evidence supporting the compliance state set in this attestation.
     *
     * @return the evidence value.
     */
    public List<AttestationEvidence> evidence() {
        return this.evidence;
    }

    /**
     * Set the evidence property: The evidence supporting the compliance state set in this attestation.
     *
     * @param evidence the evidence value to set.
     * @return the AttestationProperties object itself.
     */
    public AttestationProperties withEvidence(List<AttestationEvidence> evidence) {
        this.evidence = evidence;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the attestation.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the lastComplianceStateChangeAt property: The time the compliance state was last changed in this attestation.
     *
     * @return the lastComplianceStateChangeAt value.
     */
    public OffsetDateTime lastComplianceStateChangeAt() {
        return this.lastComplianceStateChangeAt;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyAssignmentId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property policyAssignmentId in model AttestationProperties"));
        }
        if (evidence() != null) {
            evidence().forEach(e -> e.validate());
        }
    }
}