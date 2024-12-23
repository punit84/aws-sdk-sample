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
 * UpdateProvisionedModelThroughputRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateProvisionedModelThroughputRequestMarshaller {

    private static final MarshallingInfo<String> PROVISIONEDMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("provisionedModelId").build();
    private static final MarshallingInfo<String> DESIREDPROVISIONEDMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredProvisionedModelName").build();
    private static final MarshallingInfo<String> DESIREDMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredModelId").build();

    private static final UpdateProvisionedModelThroughputRequestMarshaller instance = new UpdateProvisionedModelThroughputRequestMarshaller();

    public static UpdateProvisionedModelThroughputRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateProvisionedModelThroughputRequest updateProvisionedModelThroughputRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateProvisionedModelThroughputRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateProvisionedModelThroughputRequest.getProvisionedModelId(), PROVISIONEDMODELID_BINDING);
            protocolMarshaller.marshall(updateProvisionedModelThroughputRequest.getDesiredProvisionedModelName(), DESIREDPROVISIONEDMODELNAME_BINDING);
            protocolMarshaller.marshall(updateProvisionedModelThroughputRequest.getDesiredModelId(), DESIREDMODELID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
