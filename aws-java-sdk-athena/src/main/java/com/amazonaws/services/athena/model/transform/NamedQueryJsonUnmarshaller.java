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
 * NamedQuery JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamedQueryJsonUnmarshaller implements Unmarshaller<NamedQuery, JsonUnmarshallerContext> {

    public NamedQuery unmarshall(JsonUnmarshallerContext context) throws Exception {
        NamedQuery namedQuery = new NamedQuery();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    namedQuery.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    namedQuery.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    context.nextToken();
                    namedQuery.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    context.nextToken();
                    namedQuery.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NamedQueryId", targetDepth)) {
                    context.nextToken();
                    namedQuery.setNamedQueryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkGroup", targetDepth)) {
                    context.nextToken();
                    namedQuery.setWorkGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return namedQuery;
    }

    private static NamedQueryJsonUnmarshaller instance;

    public static NamedQueryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NamedQueryJsonUnmarshaller();
        return instance;
    }
}
