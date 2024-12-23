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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockagent.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RdsFieldMapping JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsFieldMappingJsonUnmarshaller implements Unmarshaller<RdsFieldMapping, JsonUnmarshallerContext> {

    public RdsFieldMapping unmarshall(JsonUnmarshallerContext context) throws Exception {
        RdsFieldMapping rdsFieldMapping = new RdsFieldMapping();

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
                if (context.testExpression("metadataField", targetDepth)) {
                    context.nextToken();
                    rdsFieldMapping.setMetadataField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("primaryKeyField", targetDepth)) {
                    context.nextToken();
                    rdsFieldMapping.setPrimaryKeyField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("textField", targetDepth)) {
                    context.nextToken();
                    rdsFieldMapping.setTextField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vectorField", targetDepth)) {
                    context.nextToken();
                    rdsFieldMapping.setVectorField(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rdsFieldMapping;
    }

    private static RdsFieldMappingJsonUnmarshaller instance;

    public static RdsFieldMappingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RdsFieldMappingJsonUnmarshaller();
        return instance;
    }
}
