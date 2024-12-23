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
 * SharePointSourceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SharePointSourceConfigurationMarshaller {

    private static final MarshallingInfo<String> AUTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authType").build();
    private static final MarshallingInfo<String> CREDENTIALSSECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credentialsSecretArn").build();
    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domain").build();
    private static final MarshallingInfo<String> HOSTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostType").build();
    private static final MarshallingInfo<List> SITEURLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("siteUrls").build();
    private static final MarshallingInfo<String> TENANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tenantId").build();

    private static final SharePointSourceConfigurationMarshaller instance = new SharePointSourceConfigurationMarshaller();

    public static SharePointSourceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SharePointSourceConfiguration sharePointSourceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sharePointSourceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sharePointSourceConfiguration.getAuthType(), AUTHTYPE_BINDING);
            protocolMarshaller.marshall(sharePointSourceConfiguration.getCredentialsSecretArn(), CREDENTIALSSECRETARN_BINDING);
            protocolMarshaller.marshall(sharePointSourceConfiguration.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(sharePointSourceConfiguration.getHostType(), HOSTTYPE_BINDING);
            protocolMarshaller.marshall(sharePointSourceConfiguration.getSiteUrls(), SITEURLS_BINDING);
            protocolMarshaller.marshall(sharePointSourceConfiguration.getTenantId(), TENANTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
