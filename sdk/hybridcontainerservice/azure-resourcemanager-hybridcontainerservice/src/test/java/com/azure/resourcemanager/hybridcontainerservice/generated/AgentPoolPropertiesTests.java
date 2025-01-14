// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.AgentPoolProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatusProvisioningStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfileInfraNetworkProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfileInfraStorageProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AgentPoolPropertiesTests {
    @Test
    public void testDeserialize() {
        AgentPoolProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Succeeded\",\"status\":{\"errorMessage\":\"ylgqgitxmedjvcsl\",\"provisioningStatus\":{\"operationId\":\"wncwzzhxgktrmg\",\"phase\":\"napkteoellw\",\"status\":\"fdygpfqbuaceopz\"},\"readyReplicas\":1355653581,\"replicas\":1863472171},\"count\":350693240,\"availabilityZones\":[\"ppcqeqxolz\",\"ahzxctobgbk\",\"moizpos\"],\"maxCount\":1176728044,\"maxPods\":919813735,\"minCount\":661321063,\"mode\":\"User\",\"nodeLabels\":{\"xxjyngudivkrtsw\":\"fqjhhkxbpvjymj\",\"vjfdx\":\"xqzvszjfa\",\"qtdo\":\"ivetvtcq\"},\"nodeTaints\":[\"bxvwv\",\"yslqbhsfx\",\"blytk\",\"lmpewwwfbkr\"],\"osType\":\"Linux\",\"nodeImageVersion\":\"vshqjohxcr\",\"vmSize\":\"fovasr\",\"cloudProviderProfile\":{\"infraNetworkProfile\":{\"vnetSubnetIds\":[\"hsqfsubcgjbirxbp\",\"bsrfbj\",\"dtws\",\"otftpvjzbexilz\"]},\"infraStorageProfile\":{\"storageSpaceIds\":[\"q\",\"vwpm\"]}}}")
                .toObject(AgentPoolProperties.class);
        Assertions.assertEquals(350693240, model.count());
        Assertions.assertEquals("ppcqeqxolz", model.availabilityZones().get(0));
        Assertions.assertEquals(1176728044, model.maxCount());
        Assertions.assertEquals(919813735, model.maxPods());
        Assertions.assertEquals(661321063, model.minCount());
        Assertions.assertEquals(Mode.USER, model.mode());
        Assertions.assertEquals("fqjhhkxbpvjymj", model.nodeLabels().get("xxjyngudivkrtsw"));
        Assertions.assertEquals("bxvwv", model.nodeTaints().get(0));
        Assertions.assertEquals(OsType.LINUX, model.osType());
        Assertions.assertEquals("vshqjohxcr", model.nodeImageVersion());
        Assertions.assertEquals("fovasr", model.vmSize());
        Assertions
            .assertEquals(
                "hsqfsubcgjbirxbp", model.cloudProviderProfile().infraNetworkProfile().vnetSubnetIds().get(0));
        Assertions.assertEquals("q", model.cloudProviderProfile().infraStorageProfile().storageSpaceIds().get(0));
        Assertions.assertEquals("ylgqgitxmedjvcsl", model.status().errorMessage());
        Assertions.assertEquals("wncwzzhxgktrmg", model.status().provisioningStatus().operationId());
        Assertions.assertEquals("napkteoellw", model.status().provisioningStatus().phase());
        Assertions.assertEquals("fdygpfqbuaceopz", model.status().provisioningStatus().status());
        Assertions.assertEquals(1355653581, model.status().readyReplicas());
        Assertions.assertEquals(1863472171, model.status().replicas());
    }

    @Test
    public void testSerialize() {
        AgentPoolProperties model =
            new AgentPoolProperties()
                .withCount(350693240)
                .withAvailabilityZones(Arrays.asList("ppcqeqxolz", "ahzxctobgbk", "moizpos"))
                .withMaxCount(1176728044)
                .withMaxPods(919813735)
                .withMinCount(661321063)
                .withMode(Mode.USER)
                .withNodeLabels(mapOf("xxjyngudivkrtsw", "fqjhhkxbpvjymj", "vjfdx", "xqzvszjfa", "qtdo", "ivetvtcq"))
                .withNodeTaints(Arrays.asList("bxvwv", "yslqbhsfx", "blytk", "lmpewwwfbkr"))
                .withOsType(OsType.LINUX)
                .withNodeImageVersion("vshqjohxcr")
                .withVmSize("fovasr")
                .withCloudProviderProfile(
                    new CloudProviderProfile()
                        .withInfraNetworkProfile(
                            new CloudProviderProfileInfraNetworkProfile()
                                .withVnetSubnetIds(
                                    Arrays.asList("hsqfsubcgjbirxbp", "bsrfbj", "dtws", "otftpvjzbexilz")))
                        .withInfraStorageProfile(
                            new CloudProviderProfileInfraStorageProfile()
                                .withStorageSpaceIds(Arrays.asList("q", "vwpm"))))
                .withStatus(
                    new AgentPoolProvisioningStatusStatus()
                        .withErrorMessage("ylgqgitxmedjvcsl")
                        .withProvisioningStatus(
                            new AgentPoolProvisioningStatusStatusProvisioningStatus()
                                .withOperationId("wncwzzhxgktrmg")
                                .withPhase("napkteoellw")
                                .withStatus("fdygpfqbuaceopz"))
                        .withReadyReplicas(1355653581)
                        .withReplicas(1863472171));
        model = BinaryData.fromObject(model).toObject(AgentPoolProperties.class);
        Assertions.assertEquals(350693240, model.count());
        Assertions.assertEquals("ppcqeqxolz", model.availabilityZones().get(0));
        Assertions.assertEquals(1176728044, model.maxCount());
        Assertions.assertEquals(919813735, model.maxPods());
        Assertions.assertEquals(661321063, model.minCount());
        Assertions.assertEquals(Mode.USER, model.mode());
        Assertions.assertEquals("fqjhhkxbpvjymj", model.nodeLabels().get("xxjyngudivkrtsw"));
        Assertions.assertEquals("bxvwv", model.nodeTaints().get(0));
        Assertions.assertEquals(OsType.LINUX, model.osType());
        Assertions.assertEquals("vshqjohxcr", model.nodeImageVersion());
        Assertions.assertEquals("fovasr", model.vmSize());
        Assertions
            .assertEquals(
                "hsqfsubcgjbirxbp", model.cloudProviderProfile().infraNetworkProfile().vnetSubnetIds().get(0));
        Assertions.assertEquals("q", model.cloudProviderProfile().infraStorageProfile().storageSpaceIds().get(0));
        Assertions.assertEquals("ylgqgitxmedjvcsl", model.status().errorMessage());
        Assertions.assertEquals("wncwzzhxgktrmg", model.status().provisioningStatus().operationId());
        Assertions.assertEquals("napkteoellw", model.status().provisioningStatus().phase());
        Assertions.assertEquals("fdygpfqbuaceopz", model.status().provisioningStatus().status());
        Assertions.assertEquals(1355653581, model.status().readyReplicas());
        Assertions.assertEquals(1863472171, model.status().replicas());
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
