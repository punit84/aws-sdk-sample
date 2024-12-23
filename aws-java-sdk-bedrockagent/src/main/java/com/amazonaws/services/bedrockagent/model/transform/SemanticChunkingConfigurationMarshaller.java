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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SemanticChunkingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SemanticChunkingConfigurationMarshaller {

    private static final MarshallingInfo<Integer> BREAKPOINTPERCENTILETHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("breakpointPercentileThreshold").build();
    private static final MarshallingInfo<Integer> BUFFERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bufferSize").build();
    private static final MarshallingInfo<Integer> MAXTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxTokens").build();

    private static final SemanticChunkingConfigurationMarshaller instance = new SemanticChunkingConfigurationMarshaller();

    public static SemanticChunkingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SemanticChunkingConfiguration semanticChunkingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (semanticChunkingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(semanticChunkingConfiguration.getBreakpointPercentileThreshold(), BREAKPOINTPERCENTILETHRESHOLD_BINDING);
            protocolMarshaller.marshall(semanticChunkingConfiguration.getBufferSize(), BUFFERSIZE_BINDING);
            protocolMarshaller.marshall(semanticChunkingConfiguration.getMaxTokens(), MAXTOKENS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
