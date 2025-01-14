// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DiagnoseVirtualNetworkResultInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DiagnoseVirtualNetworkResultInnerTests {
    @Test
    public void testDeserialize() {
        DiagnoseVirtualNetworkResultInner model =
            BinaryData
                .fromString("{\"findings\":[\"jdeyeamdpha\",\"alpbuxwgipwhon\",\"wkgshwa\",\"kix\"]}")
                .toObject(DiagnoseVirtualNetworkResultInner.class);
        Assertions.assertEquals("jdeyeamdpha", model.findings().get(0));
    }

    @Test
    public void testSerialize() {
        DiagnoseVirtualNetworkResultInner model =
            new DiagnoseVirtualNetworkResultInner()
                .withFindings(Arrays.asList("jdeyeamdpha", "alpbuxwgipwhon", "wkgshwa", "kix"));
        model = BinaryData.fromObject(model).toObject(DiagnoseVirtualNetworkResultInner.class);
        Assertions.assertEquals("jdeyeamdpha", model.findings().get(0));
    }
}
