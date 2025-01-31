// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.HealthCheckStatusDetailsProperties;
import org.junit.jupiter.api.Test;

public final class HealthCheckStatusDetailsPropertiesTests {
    @Test
    public void testDeserialize() {
        HealthCheckStatusDetailsProperties model =
            BinaryData
                .fromString(
                    "{\"startDateTime\":\"2021-02-25T10:39:49Z\",\"endDateTime\":\"2021-09-15T16:26:55Z\",\"healthChecks\":[{\"status\":\"Running\",\"displayName\":\"gamv\",\"startDateTime\":\"2021-01-23T15:49:27Z\",\"endDateTime\":\"2021-06-13T23:33:12Z\",\"errorType\":\"qzudphq\",\"recommendedAction\":\"vdkfwynwcvtbvk\",\"additionalDetails\":\"hmtnvy\"},{\"status\":\"Warning\",\"displayName\":\"kzwpcnpw\",\"startDateTime\":\"2021-02-07T21:37:46Z\",\"endDateTime\":\"2021-05-22T23:16:36Z\",\"errorType\":\"gvvs\",\"recommendedAction\":\"yajguqfhwygzlv\",\"additionalDetails\":\"kfxu\"},{\"status\":\"Warning\",\"displayName\":\"wzrmuh\",\"startDateTime\":\"2021-06-24T01:56:05Z\",\"endDateTime\":\"2021-10-20T17:35:42Z\",\"errorType\":\"psqxq\",\"recommendedAction\":\"svuo\",\"additionalDetails\":\"gc\"}]}")
                .toObject(HealthCheckStatusDetailsProperties.class);
    }

    @Test
    public void testSerialize() {
        HealthCheckStatusDetailsProperties model = new HealthCheckStatusDetailsProperties();
        model = BinaryData.fromObject(model).toObject(HealthCheckStatusDetailsProperties.class);
    }
}
