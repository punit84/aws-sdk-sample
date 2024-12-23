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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ModelCustomizationJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelCustomizationJobSummaryJsonUnmarshaller implements Unmarshaller<ModelCustomizationJobSummary, JsonUnmarshallerContext> {

    public ModelCustomizationJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelCustomizationJobSummary modelCustomizationJobSummary = new ModelCustomizationJobSummary();

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
                if (context.testExpression("jobArn", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("baseModelArn", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setBaseModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("customModelArn", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setCustomModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customModelName", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setCustomModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customizationType", targetDepth)) {
                    context.nextToken();
                    modelCustomizationJobSummary.setCustomizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return modelCustomizationJobSummary;
    }

    private static ModelCustomizationJobSummaryJsonUnmarshaller instance;

    public static ModelCustomizationJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelCustomizationJobSummaryJsonUnmarshaller();
        return instance;
    }
}
