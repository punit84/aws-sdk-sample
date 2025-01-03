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
package com.amazonaws.services.bedrock.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GuardrailRegexMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GuardrailRegexMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> PATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pattern").build();
    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("action").build();

    private static final GuardrailRegexMarshaller instance = new GuardrailRegexMarshaller();

    public static GuardrailRegexMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GuardrailRegex guardrailRegex, ProtocolMarshaller protocolMarshaller) {

        if (guardrailRegex == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(guardrailRegex.getName(), NAME_BINDING);
            protocolMarshaller.marshall(guardrailRegex.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(guardrailRegex.getPattern(), PATTERN_BINDING);
            protocolMarshaller.marshall(guardrailRegex.getAction(), ACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
