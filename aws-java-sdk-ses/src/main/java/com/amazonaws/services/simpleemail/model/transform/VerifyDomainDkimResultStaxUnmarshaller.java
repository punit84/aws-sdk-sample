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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * VerifyDomainDkimResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyDomainDkimResultStaxUnmarshaller implements Unmarshaller<VerifyDomainDkimResult, StaxUnmarshallerContext> {

    public VerifyDomainDkimResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        VerifyDomainDkimResult verifyDomainDkimResult = new VerifyDomainDkimResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return verifyDomainDkimResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DkimTokens", targetDepth)) {
                    verifyDomainDkimResult.withDkimTokens(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DkimTokens/member", targetDepth)) {
                    verifyDomainDkimResult.withDkimTokens(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return verifyDomainDkimResult;
                }
            }
        }
    }

    private static VerifyDomainDkimResultStaxUnmarshaller instance;

    public static VerifyDomainDkimResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifyDomainDkimResultStaxUnmarshaller();
        return instance;
    }
}
