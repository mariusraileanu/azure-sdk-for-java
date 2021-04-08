/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object representing the appearance of the text line.
 */
public class Appearance {
    /**
     * An object representing the style of the text line.
     */
    @JsonProperty(value = "style", required = true)
    private Style style;

    /**
     * Get the style value.
     *
     * @return the style value
     */
    public Style style() {
        return this.style;
    }

    /**
     * Set the style value.
     *
     * @param style the style value to set
     * @return the Appearance object itself.
     */
    public Appearance withStyle(Style style) {
        this.style = style;
        return this;
    }

}
