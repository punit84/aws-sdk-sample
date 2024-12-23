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
 * ChunkingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChunkingConfigurationMarshaller {

    private static final MarshallingInfo<String> CHUNKINGSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("chunkingStrategy").build();
    private static final MarshallingInfo<StructuredPojo> FIXEDSIZECHUNKINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixedSizeChunkingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HIERARCHICALCHUNKINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hierarchicalChunkingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SEMANTICCHUNKINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("semanticChunkingConfiguration").build();

    private static final ChunkingConfigurationMarshaller instance = new ChunkingConfigurationMarshaller();

    public static ChunkingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChunkingConfiguration chunkingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (chunkingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(chunkingConfiguration.getChunkingStrategy(), CHUNKINGSTRATEGY_BINDING);
            protocolMarshaller.marshall(chunkingConfiguration.getFixedSizeChunkingConfiguration(), FIXEDSIZECHUNKINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(chunkingConfiguration.getHierarchicalChunkingConfiguration(), HIERARCHICALCHUNKINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(chunkingConfiguration.getSemanticChunkingConfiguration(), SEMANTICCHUNKINGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
