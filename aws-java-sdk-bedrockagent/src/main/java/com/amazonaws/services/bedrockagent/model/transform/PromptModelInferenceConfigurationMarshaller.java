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
 * PromptModelInferenceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PromptModelInferenceConfigurationMarshaller {

    private static final MarshallingInfo<Integer> MAXTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxTokens").build();
    private static final MarshallingInfo<List> STOPSEQUENCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stopSequences").build();
    private static final MarshallingInfo<Float> TEMPERATURE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("temperature").build();
    private static final MarshallingInfo<Integer> TOPK_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("topK").build();
    private static final MarshallingInfo<Float> TOPP_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("topP").build();

    private static final PromptModelInferenceConfigurationMarshaller instance = new PromptModelInferenceConfigurationMarshaller();

    public static PromptModelInferenceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PromptModelInferenceConfiguration promptModelInferenceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (promptModelInferenceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(promptModelInferenceConfiguration.getMaxTokens(), MAXTOKENS_BINDING);
            protocolMarshaller.marshall(promptModelInferenceConfiguration.getStopSequences(), STOPSEQUENCES_BINDING);
            protocolMarshaller.marshall(promptModelInferenceConfiguration.getTemperature(), TEMPERATURE_BINDING);
            protocolMarshaller.marshall(promptModelInferenceConfiguration.getTopK(), TOPK_BINDING);
            protocolMarshaller.marshall(promptModelInferenceConfiguration.getTopP(), TOPP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
