// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.ResponsysObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResponsysObjectDatasetTests {
    @Test
    public void testDeserialize() {
        ResponsysObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"ResponsysObject\",\"typeProperties\":{},\"description\":\"pibkephuu\",\"linkedServiceName\":{\"referenceName\":\"ctatoyintqpbrlcy\",\"parameters\":{}},\"parameters\":{\"ofxyfsrucvcrrpc\":{\"type\":\"String\"},\"bstvje\":{\"type\":\"Int\"}},\"annotations\":[],\"folder\":{\"name\":\"vvf\"},\"\":{}}")
                .toObject(ResponsysObjectDataset.class);
        Assertions.assertEquals("pibkephuu", model.description());
        Assertions.assertEquals("ctatoyintqpbrlcy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("ofxyfsrucvcrrpc").type());
        Assertions.assertEquals("vvf", model.folder().name());
    }

    @Test
    public void testSerialize() {
        ResponsysObjectDataset model =
            new ResponsysObjectDataset()
                .withDescription("pibkephuu")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("ctatoyintqpbrlcy").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "ofxyfsrucvcrrpc",
                        new ParameterSpecification().withType(ParameterType.STRING),
                        "bstvje",
                        new ParameterSpecification().withType(ParameterType.INT)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("vvf"));
        model = BinaryData.fromObject(model).toObject(ResponsysObjectDataset.class);
        Assertions.assertEquals("pibkephuu", model.description());
        Assertions.assertEquals("ctatoyintqpbrlcy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("ofxyfsrucvcrrpc").type());
        Assertions.assertEquals("vvf", model.folder().name());
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
