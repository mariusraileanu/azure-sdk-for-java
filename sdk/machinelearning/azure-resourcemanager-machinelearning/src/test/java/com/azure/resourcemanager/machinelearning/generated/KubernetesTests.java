// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchema;
import com.azure.resourcemanager.machinelearning.models.Kubernetes;
import com.azure.resourcemanager.machinelearning.models.KubernetesProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class KubernetesTests {
    @Test
    public void testDeserialize() {
        Kubernetes model =
            BinaryData
                .fromString(
                    "{\"computeType\":\"Kubernetes\",\"properties\":{\"relayConnectionString\":\"nfxofvcj\",\"serviceBusConnectionString\":\"dirazf\",\"extensionPrincipalId\":\"ejwabmdujtmvco\",\"extensionInstanceReleaseTrain\":\"xcmjurbu\",\"vcName\":\"lkyqltqsrog\",\"namespace\":\"wkffdjkt\",\"defaultInstanceType\":\"sidfv\",\"instanceTypes\":{\"n\":{\"nodeSelector\":{}}}},\"computeLocation\":\"ijtk\",\"provisioningState\":\"Succeeded\",\"description\":\"ogsf\",\"createdOn\":\"2021-05-31T19:57:24Z\",\"modifiedOn\":\"2021-02-04T08:33:30Z\",\"resourceId\":\"nsharujtjiqxfzyj\",\"provisioningErrors\":[],\"isAttachedCompute\":true,\"disableLocalAuth\":true}")
                .toObject(Kubernetes.class);
        Assertions.assertEquals("ijtk", model.computeLocation());
        Assertions.assertEquals("ogsf", model.description());
        Assertions.assertEquals("nsharujtjiqxfzyj", model.resourceId());
        Assertions.assertEquals(true, model.disableLocalAuth());
        Assertions.assertEquals("nfxofvcj", model.properties().relayConnectionString());
        Assertions.assertEquals("dirazf", model.properties().serviceBusConnectionString());
        Assertions.assertEquals("ejwabmdujtmvco", model.properties().extensionPrincipalId());
        Assertions.assertEquals("xcmjurbu", model.properties().extensionInstanceReleaseTrain());
        Assertions.assertEquals("lkyqltqsrog", model.properties().vcName());
        Assertions.assertEquals("wkffdjkt", model.properties().namespace());
        Assertions.assertEquals("sidfv", model.properties().defaultInstanceType());
    }

    @Test
    public void testSerialize() {
        Kubernetes model =
            new Kubernetes()
                .withComputeLocation("ijtk")
                .withDescription("ogsf")
                .withResourceId("nsharujtjiqxfzyj")
                .withDisableLocalAuth(true)
                .withProperties(
                    new KubernetesProperties()
                        .withRelayConnectionString("nfxofvcj")
                        .withServiceBusConnectionString("dirazf")
                        .withExtensionPrincipalId("ejwabmdujtmvco")
                        .withExtensionInstanceReleaseTrain("xcmjurbu")
                        .withVcName("lkyqltqsrog")
                        .withNamespace("wkffdjkt")
                        .withDefaultInstanceType("sidfv")
                        .withInstanceTypes(mapOf("n", new InstanceTypeSchema().withNodeSelector(mapOf()))));
        model = BinaryData.fromObject(model).toObject(Kubernetes.class);
        Assertions.assertEquals("ijtk", model.computeLocation());
        Assertions.assertEquals("ogsf", model.description());
        Assertions.assertEquals("nsharujtjiqxfzyj", model.resourceId());
        Assertions.assertEquals(true, model.disableLocalAuth());
        Assertions.assertEquals("nfxofvcj", model.properties().relayConnectionString());
        Assertions.assertEquals("dirazf", model.properties().serviceBusConnectionString());
        Assertions.assertEquals("ejwabmdujtmvco", model.properties().extensionPrincipalId());
        Assertions.assertEquals("xcmjurbu", model.properties().extensionInstanceReleaseTrain());
        Assertions.assertEquals("lkyqltqsrog", model.properties().vcName());
        Assertions.assertEquals("wkffdjkt", model.properties().namespace());
        Assertions.assertEquals("sidfv", model.properties().defaultInstanceType());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
