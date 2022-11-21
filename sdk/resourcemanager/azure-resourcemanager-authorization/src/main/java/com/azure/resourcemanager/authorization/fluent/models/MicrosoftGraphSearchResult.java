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
import java.util.Map;

/** searchResult. */
@Fluent
public final class MicrosoftGraphSearchResult {
    /*
     * A callback URL that can be used to record telemetry information. The application should issue a GET on this URL
     * if the user interacts with this item to improve the quality of results.
     */
    @JsonProperty(value = "onClickTelemetryUrl")
    private String onClickTelemetryUrl;

    /*
     * searchResult
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphSearchResult class. */
    public MicrosoftGraphSearchResult() {
    }

    /**
     * Get the onClickTelemetryUrl property: A callback URL that can be used to record telemetry information. The
     * application should issue a GET on this URL if the user interacts with this item to improve the quality of
     * results.
     *
     * @return the onClickTelemetryUrl value.
     */
    public String onClickTelemetryUrl() {
        return this.onClickTelemetryUrl;
    }

    /**
     * Set the onClickTelemetryUrl property: A callback URL that can be used to record telemetry information. The
     * application should issue a GET on this URL if the user interacts with this item to improve the quality of
     * results.
     *
     * @param onClickTelemetryUrl the onClickTelemetryUrl value to set.
     * @return the MicrosoftGraphSearchResult object itself.
     */
    public MicrosoftGraphSearchResult withOnClickTelemetryUrl(String onClickTelemetryUrl) {
        this.onClickTelemetryUrl = onClickTelemetryUrl;
        return this;
    }

    /**
     * Get the additionalProperties property: searchResult.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: searchResult.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSearchResult object itself.
     */
    public MicrosoftGraphSearchResult withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
