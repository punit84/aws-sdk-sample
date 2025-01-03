/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResultConfigurationUpdates JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultConfigurationUpdatesJsonUnmarshaller implements Unmarshaller<ResultConfigurationUpdates, JsonUnmarshallerContext> {

    public ResultConfigurationUpdates unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResultConfigurationUpdates resultConfigurationUpdates = new ResultConfigurationUpdates();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("OutputLocation", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setOutputLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RemoveOutputLocation", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setRemoveOutputLocation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RemoveEncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setRemoveEncryptionConfiguration(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExpectedBucketOwner", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setExpectedBucketOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RemoveExpectedBucketOwner", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setRemoveExpectedBucketOwner(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AclConfiguration", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setAclConfiguration(AclConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RemoveAclConfiguration", targetDepth)) {
                    context.nextToken();
                    resultConfigurationUpdates.setRemoveAclConfiguration(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resultConfigurationUpdates;
    }

    private static ResultConfigurationUpdatesJsonUnmarshaller instance;

    public static ResultConfigurationUpdatesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResultConfigurationUpdatesJsonUnmarshaller();
        return instance;
    }
}
