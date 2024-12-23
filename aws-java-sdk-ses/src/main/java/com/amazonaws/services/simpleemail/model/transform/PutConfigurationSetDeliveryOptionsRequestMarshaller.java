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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PutConfigurationSetDeliveryOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationSetDeliveryOptionsRequestMarshaller implements
        Marshaller<Request<PutConfigurationSetDeliveryOptionsRequest>, PutConfigurationSetDeliveryOptionsRequest> {

    public Request<PutConfigurationSetDeliveryOptionsRequest> marshall(PutConfigurationSetDeliveryOptionsRequest putConfigurationSetDeliveryOptionsRequest) {

        if (putConfigurationSetDeliveryOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutConfigurationSetDeliveryOptionsRequest> request = new DefaultRequest<PutConfigurationSetDeliveryOptionsRequest>(
                putConfigurationSetDeliveryOptionsRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "PutConfigurationSetDeliveryOptions");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putConfigurationSetDeliveryOptionsRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(putConfigurationSetDeliveryOptionsRequest.getConfigurationSetName()));
        }

        {
            DeliveryOptions deliveryOptions = putConfigurationSetDeliveryOptionsRequest.getDeliveryOptions();
            if (deliveryOptions != null) {

                if (deliveryOptions.getTlsPolicy() != null) {
                    request.addParameter("DeliveryOptions.TlsPolicy", StringUtils.fromString(deliveryOptions.getTlsPolicy()));
                }
            }
        }

        return request;
    }

}
