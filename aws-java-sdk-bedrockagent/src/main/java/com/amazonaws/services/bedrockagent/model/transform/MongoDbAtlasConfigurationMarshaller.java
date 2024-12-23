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
 * MongoDbAtlasConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MongoDbAtlasConfigurationMarshaller {

    private static final MarshallingInfo<String> COLLECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectionName").build();
    private static final MarshallingInfo<String> CREDENTIALSSECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentialsSecretArn").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("databaseName").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endpoint").build();
    private static final MarshallingInfo<String> ENDPOINTSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endpointServiceName").build();
    private static final MarshallingInfo<StructuredPojo> FIELDMAPPING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fieldMapping").build();
    private static final MarshallingInfo<String> VECTORINDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vectorIndexName").build();

    private static final MongoDbAtlasConfigurationMarshaller instance = new MongoDbAtlasConfigurationMarshaller();

    public static MongoDbAtlasConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MongoDbAtlasConfiguration mongoDbAtlasConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (mongoDbAtlasConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mongoDbAtlasConfiguration.getCollectionName(), COLLECTIONNAME_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasConfiguration.getCredentialsSecretArn(), CREDENTIALSSECRETARN_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasConfiguration.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasConfiguration.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasConfiguration.getEndpointServiceName(), ENDPOINTSERVICENAME_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasConfiguration.getFieldMapping(), FIELDMAPPING_BINDING);
            protocolMarshaller.marshall(mongoDbAtlasConfiguration.getVectorIndexName(), VECTORINDEXNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}