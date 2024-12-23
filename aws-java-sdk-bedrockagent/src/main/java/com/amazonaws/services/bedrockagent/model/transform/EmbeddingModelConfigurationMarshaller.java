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
 * EmbeddingModelConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EmbeddingModelConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> BEDROCKEMBEDDINGMODELCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bedrockEmbeddingModelConfiguration").build();

    private static final EmbeddingModelConfigurationMarshaller instance = new EmbeddingModelConfigurationMarshaller();

    public static EmbeddingModelConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EmbeddingModelConfiguration embeddingModelConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (embeddingModelConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(embeddingModelConfiguration.getBedrockEmbeddingModelConfiguration(), BEDROCKEMBEDDINGMODELCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
