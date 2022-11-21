// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** teamsApp. */
@Fluent
public final class MicrosoftGraphTeamsApp extends MicrosoftGraphEntity {
    /*
     * The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * teamsAppDistributionMethod
     */
    @JsonProperty(value = "distributionMethod")
    private MicrosoftGraphTeamsAppDistributionMethod distributionMethod;

    /*
     * The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
     */
    @JsonProperty(value = "externalId")
    private String externalId;

    /*
     * The details for each version of the app.
     */
    @JsonProperty(value = "appDefinitions")
    private List<MicrosoftGraphTeamsAppDefinition> appDefinitions;

    /*
     * teamsApp
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphTeamsApp class. */
    public MicrosoftGraphTeamsApp() {
    }

    /**
     * Get the displayName property: The name of the catalog app provided by the app developer in the Microsoft Teams
     * zip app package.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the catalog app provided by the app developer in the Microsoft Teams
     * zip app package.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphTeamsApp object itself.
     */
    public MicrosoftGraphTeamsApp withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the distributionMethod property: teamsAppDistributionMethod.
     *
     * @return the distributionMethod value.
     */
    public MicrosoftGraphTeamsAppDistributionMethod distributionMethod() {
        return this.distributionMethod;
    }

    /**
     * Set the distributionMethod property: teamsAppDistributionMethod.
     *
     * @param distributionMethod the distributionMethod value to set.
     * @return the MicrosoftGraphTeamsApp object itself.
     */
    public MicrosoftGraphTeamsApp withDistributionMethod(MicrosoftGraphTeamsAppDistributionMethod distributionMethod) {
        this.distributionMethod = distributionMethod;
        return this;
    }

    /**
     * Get the externalId property: The ID of the catalog provided by the app developer in the Microsoft Teams zip app
     * package.
     *
     * @return the externalId value.
     */
    public String externalId() {
        return this.externalId;
    }

    /**
     * Set the externalId property: The ID of the catalog provided by the app developer in the Microsoft Teams zip app
     * package.
     *
     * @param externalId the externalId value to set.
     * @return the MicrosoftGraphTeamsApp object itself.
     */
    public MicrosoftGraphTeamsApp withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get the appDefinitions property: The details for each version of the app.
     *
     * @return the appDefinitions value.
     */
    public List<MicrosoftGraphTeamsAppDefinition> appDefinitions() {
        return this.appDefinitions;
    }

    /**
     * Set the appDefinitions property: The details for each version of the app.
     *
     * @param appDefinitions the appDefinitions value to set.
     * @return the MicrosoftGraphTeamsApp object itself.
     */
    public MicrosoftGraphTeamsApp withAppDefinitions(List<MicrosoftGraphTeamsAppDefinition> appDefinitions) {
        this.appDefinitions = appDefinitions;
        return this;
    }

    /**
     * Get the additionalProperties property: teamsApp.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamsApp.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamsApp object itself.
     */
    public MicrosoftGraphTeamsApp withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTeamsApp withId(String id) {
        super.withId(id);
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
        if (appDefinitions() != null) {
            appDefinitions().forEach(e -> e.validate());
        }
    }
}
