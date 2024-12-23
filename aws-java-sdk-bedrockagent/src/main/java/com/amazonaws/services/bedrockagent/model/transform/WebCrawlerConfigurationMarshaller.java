/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrockagent.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WebCrawlerConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WebCrawlerConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CRAWLERLIMITS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("crawlerLimits").build();
    private static final MarshallingInfo<List> EXCLUSIONFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exclusionFilters").build();
    private static final MarshallingInfo<List> INCLUSIONFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inclusionFilters").build();
    private static final MarshallingInfo<String> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scope").build();

    private static final WebCrawlerConfigurationMarshaller instance = new WebCrawlerConfigurationMarshaller();

    public static WebCrawlerConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WebCrawlerConfiguration webCrawlerConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (webCrawlerConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(webCrawlerConfiguration.getCrawlerLimits(), CRAWLERLIMITS_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getExclusionFilters(), EXCLUSIONFILTERS_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getInclusionFilters(), INCLUSIONFILTERS_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getScope(), SCOPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
