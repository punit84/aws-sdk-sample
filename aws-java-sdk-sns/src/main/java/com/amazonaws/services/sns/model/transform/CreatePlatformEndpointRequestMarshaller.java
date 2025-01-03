/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sns.model.transform;

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreatePlatformEndpointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlatformEndpointRequestMarshaller implements Marshaller<Request<CreatePlatformEndpointRequest>, CreatePlatformEndpointRequest> {

    public Request<CreatePlatformEndpointRequest> marshall(CreatePlatformEndpointRequest createPlatformEndpointRequest) {

        if (createPlatformEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePlatformEndpointRequest> request = new DefaultRequest<CreatePlatformEndpointRequest>(createPlatformEndpointRequest, "AmazonSNS");
        request.addParameter("Action", "CreatePlatformEndpoint");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createPlatformEndpointRequest.getPlatformApplicationArn() != null) {
            request.addParameter("PlatformApplicationArn", StringUtils.fromString(createPlatformEndpointRequest.getPlatformApplicationArn()));
        }

        if (createPlatformEndpointRequest.getToken() != null) {
            request.addParameter("Token", StringUtils.fromString(createPlatformEndpointRequest.getToken()));
        }

        if (createPlatformEndpointRequest.getCustomUserData() != null) {
            request.addParameter("CustomUserData", StringUtils.fromString(createPlatformEndpointRequest.getCustomUserData()));
        }

        java.util.Map<String, String> attributes = createPlatformEndpointRequest.getAttributes();
        int attributesListIndex = 1;
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            if (entry != null && entry.getKey() != null) {
                request.addParameter("Attributes.entry." + attributesListIndex + ".key", StringUtils.fromString(entry.getKey()));
            }
            if (entry != null && entry.getValue() != null) {
                request.addParameter("Attributes.entry." + attributesListIndex + ".value", StringUtils.fromString(entry.getValue()));
            }
            attributesListIndex++;
        }

        return request;
    }

}
