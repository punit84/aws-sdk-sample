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
package com.amazonaws.services.sqs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListQueuesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueuesRequestMarshaller implements Marshaller<Request<ListQueuesRequest>, ListQueuesRequest> {

    public Request<ListQueuesRequest> marshall(ListQueuesRequest listQueuesRequest) {

        if (listQueuesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListQueuesRequest> request = new DefaultRequest<ListQueuesRequest>(listQueuesRequest, "AmazonSQS");
        request.addParameter("Action", "ListQueues");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (listQueuesRequest.getQueueNamePrefix() != null) {
            request.addParameter("QueueNamePrefix", StringUtils.fromString(listQueuesRequest.getQueueNamePrefix()));
        }

        if (listQueuesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listQueuesRequest.getNextToken()));
        }

        if (listQueuesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listQueuesRequest.getMaxResults()));
        }

        return request;
    }

}
