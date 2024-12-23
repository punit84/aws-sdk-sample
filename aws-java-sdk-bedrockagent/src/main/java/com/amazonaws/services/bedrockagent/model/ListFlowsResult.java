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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list, each member of which contains information about a flow.
     * </p>
     */
    private java.util.List<FlowSummary> flowSummaries;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list, each member of which contains information about a flow.
     * </p>
     * 
     * @return A list, each member of which contains information about a flow.
     */

    public java.util.List<FlowSummary> getFlowSummaries() {
        return flowSummaries;
    }

    /**
     * <p>
     * A list, each member of which contains information about a flow.
     * </p>
     * 
     * @param flowSummaries
     *        A list, each member of which contains information about a flow.
     */

    public void setFlowSummaries(java.util.Collection<FlowSummary> flowSummaries) {
        if (flowSummaries == null) {
            this.flowSummaries = null;
            return;
        }

        this.flowSummaries = new java.util.ArrayList<FlowSummary>(flowSummaries);
    }

    /**
     * <p>
     * A list, each member of which contains information about a flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlowSummaries(java.util.Collection)} or {@link #withFlowSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param flowSummaries
     *        A list, each member of which contains information about a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withFlowSummaries(FlowSummary... flowSummaries) {
        if (this.flowSummaries == null) {
            setFlowSummaries(new java.util.ArrayList<FlowSummary>(flowSummaries.length));
        }
        for (FlowSummary ele : flowSummaries) {
            this.flowSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list, each member of which contains information about a flow.
     * </p>
     * 
     * @param flowSummaries
     *        A list, each member of which contains information about a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withFlowSummaries(java.util.Collection<FlowSummary> flowSummaries) {
        setFlowSummaries(flowSummaries);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @return If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *         use this token when making another request in the <code>nextToken</code> field to return the next batch
     *         of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        use this token when making another request in the <code>nextToken</code> field to return the next batch of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFlowSummaries() != null)
            sb.append("FlowSummaries: ").append(getFlowSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFlowsResult == false)
            return false;
        ListFlowsResult other = (ListFlowsResult) obj;
        if (other.getFlowSummaries() == null ^ this.getFlowSummaries() == null)
            return false;
        if (other.getFlowSummaries() != null && other.getFlowSummaries().equals(this.getFlowSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowSummaries() == null) ? 0 : getFlowSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFlowsResult clone() {
        try {
            return (ListFlowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
