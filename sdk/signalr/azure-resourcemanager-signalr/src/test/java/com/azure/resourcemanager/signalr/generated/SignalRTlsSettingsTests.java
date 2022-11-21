// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.SignalRTlsSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SignalRTlsSettingsTests {
    @Test
    public void testDeserialize() {
        SignalRTlsSettings model =
            BinaryData.fromString("{\"clientCertEnabled\":true}").toObject(SignalRTlsSettings.class);
        Assertions.assertEquals(true, model.clientCertEnabled());
    }

    @Test
    public void testSerialize() {
        SignalRTlsSettings model = new SignalRTlsSettings().withClientCertEnabled(true);
        model = BinaryData.fromObject(model).toObject(SignalRTlsSettings.class);
        Assertions.assertEquals(true, model.clientCertEnabled());
    }
}
