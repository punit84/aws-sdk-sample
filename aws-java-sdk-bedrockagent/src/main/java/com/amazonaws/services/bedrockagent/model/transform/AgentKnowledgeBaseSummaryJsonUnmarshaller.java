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
 * AgentKnowledgeBaseSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentKnowledgeBaseSummaryJsonUnmarshaller implements Unmarshaller<AgentKnowledgeBaseSummary, JsonUnmarshallerContext> {

    public AgentKnowledgeBaseSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentKnowledgeBaseSummary agentKnowledgeBaseSummary = new AgentKnowledgeBaseSummary();

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
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    agentKnowledgeBaseSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseId", targetDepth)) {
                    context.nextToken();
                    agentKnowledgeBaseSummary.setKnowledgeBaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseState", targetDepth)) {
                    context.nextToken();
                    agentKnowledgeBaseSummary.setKnowledgeBaseState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    agentKnowledgeBaseSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return agentKnowledgeBaseSummary;
    }

    private static AgentKnowledgeBaseSummaryJsonUnmarshaller instance;

    public static AgentKnowledgeBaseSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentKnowledgeBaseSummaryJsonUnmarshaller();
        return instance;
    }
}