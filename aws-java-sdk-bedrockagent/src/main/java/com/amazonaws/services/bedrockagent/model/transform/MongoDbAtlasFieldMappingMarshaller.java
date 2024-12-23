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
 * MongoDbAtlasFieldMappingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MongoDbAtlasFieldMappingMarshaller {

    private static final MarshallingInfo<String> METADATAFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metadataField").build();
    private static final MarshallingInfo<String> TEXTFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("textField").build();
    private static final MarshallingInfo<String> VECTORFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vectorField").build();

    private static final MongoDbAtlasFieldMappingMarshaller instance = new MongoDbAtlasFieldMappingMarshaller();

    public static MongoDbAtlasFieldMappingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MongoDbAtlasFieldMapping mongoDbAtlasFieldMapping, ProtocolMarshaller protocolMarshaller) {

        if (mongoDbAtlasFieldMapping == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mongoDbAtlasFieldMapping.getMetadataField(), METADATAFIELD_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasFieldMapping.getTextField(), TEXTFIELD_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasFieldMapping.getVectorField(), VECTORFIELD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
