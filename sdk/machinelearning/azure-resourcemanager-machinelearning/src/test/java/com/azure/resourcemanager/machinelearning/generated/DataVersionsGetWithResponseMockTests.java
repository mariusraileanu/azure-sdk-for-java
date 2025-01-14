// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.DataVersionBase;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DataVersionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"dataType\":\"DataVersionBaseProperties\",\"dataUri\":\"mtznpaxwfqtyyqi\",\"isAnonymous\":true,\"isArchived\":true,\"description\":\"ngbso\",\"properties\":{\"zbkuckgkdsksw\":\"kmii\",\"woykdnonaaxwm\":\"iiqqcqikclsmalns\"},\"tags\":{\"q\":\"ujlqcwnynlle\"}},\"id\":\"bgvsbtsertoxadh\",\"name\":\"uvjhxmnrqstjc\",\"type\":\"etwmlgicvnp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DataVersionBase response =
            manager.dataVersions().getWithResponse("x", "mdbgi", "ehfgsm", "rjuqbpxtokl", Context.NONE).getValue();

        Assertions.assertEquals("ngbso", response.properties().description());
        Assertions.assertEquals("kmii", response.properties().properties().get("zbkuckgkdsksw"));
        Assertions.assertEquals("ujlqcwnynlle", response.properties().tags().get("q"));
        Assertions.assertEquals(true, response.properties().isAnonymous());
        Assertions.assertEquals(true, response.properties().isArchived());
        Assertions.assertEquals("mtznpaxwfqtyyqi", response.properties().dataUri());
    }
}
