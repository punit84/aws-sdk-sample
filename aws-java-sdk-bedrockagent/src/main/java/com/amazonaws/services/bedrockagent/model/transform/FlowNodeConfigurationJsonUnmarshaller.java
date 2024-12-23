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
 * FlowNodeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowNodeConfigurationJsonUnmarshaller implements Unmarshaller<FlowNodeConfiguration, JsonUnmarshallerContext> {

    public FlowNodeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        FlowNodeConfiguration flowNodeConfiguration = new FlowNodeConfiguration();

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
                if (context.testExpression("agent", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setAgent(AgentFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("collector", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setCollector(CollectorFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("condition", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setCondition(ConditionFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setInput(InputFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iterator", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setIterator(IteratorFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("knowledgeBase", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setKnowledgeBase(KnowledgeBaseFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunction", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setLambdaFunction(LambdaFunctionFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lex", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setLex(LexFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("output", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setOutput(OutputFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("prompt", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setPrompt(PromptFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("retrieval", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setRetrieval(RetrievalFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("storage", targetDepth)) {
                    context.nextToken();
                    flowNodeConfiguration.setStorage(StorageFlowNodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return flowNodeConfiguration;
    }

    private static FlowNodeConfigurationJsonUnmarshaller instance;

    public static FlowNodeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlowNodeConfigurationJsonUnmarshaller();
        return instance;
    }
}
