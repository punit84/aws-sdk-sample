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
 * FlowNodeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FlowNodeConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> AGENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("agent").build();
    private static final MarshallingInfo<StructuredPojo> COLLECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collector").build();
    private static final MarshallingInfo<StructuredPojo> CONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("condition").build();
    private static final MarshallingInfo<StructuredPojo> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("input").build();
    private static final MarshallingInfo<StructuredPojo> ITERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iterator").build();
    private static final MarshallingInfo<StructuredPojo> KNOWLEDGEBASE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("knowledgeBase").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunction").build();
    private static final MarshallingInfo<StructuredPojo> LEX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lex").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("output").build();
    private static final MarshallingInfo<StructuredPojo> PROMPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("prompt").build();
    private static final MarshallingInfo<StructuredPojo> RETRIEVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retrieval").build();
    private static final MarshallingInfo<StructuredPojo> STORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storage").build();

    private static final FlowNodeConfigurationMarshaller instance = new FlowNodeConfigurationMarshaller();

    public static FlowNodeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FlowNodeConfiguration flowNodeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (flowNodeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(flowNodeConfiguration.getAgent(), AGENT_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getCollector(), COLLECTOR_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getCondition(), CONDITION_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getIterator(), ITERATOR_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getKnowledgeBase(), KNOWLEDGEBASE_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getLambdaFunction(), LAMBDAFUNCTION_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getLex(), LEX_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getOutput(), OUTPUT_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getPrompt(), PROMPT_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getRetrieval(), RETRIEVAL_BINDING);
            protocolMarshaller.marshall(flowNodeConfiguration.getStorage(), STORAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
