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
 * LoggingConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfigJsonUnmarshaller implements Unmarshaller<LoggingConfig, JsonUnmarshallerContext> {

    public LoggingConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        LoggingConfig loggingConfig = new LoggingConfig();

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
                if (context.testExpression("cloudWatchConfig", targetDepth)) {
                    context.nextToken();
                    loggingConfig.setCloudWatchConfig(CloudWatchConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("s3Config", targetDepth)) {
                    context.nextToken();
                    loggingConfig.setS3Config(S3ConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("textDataDeliveryEnabled", targetDepth)) {
                    context.nextToken();
                    loggingConfig.setTextDataDeliveryEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("imageDataDeliveryEnabled", targetDepth)) {
                    context.nextToken();
                    loggingConfig.setImageDataDeliveryEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("embeddingDataDeliveryEnabled", targetDepth)) {
                    context.nextToken();
                    loggingConfig.setEmbeddingDataDeliveryEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return loggingConfig;
    }

    private static LoggingConfigJsonUnmarshaller instance;

    public static LoggingConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoggingConfigJsonUnmarshaller();
        return instance;
    }
}
