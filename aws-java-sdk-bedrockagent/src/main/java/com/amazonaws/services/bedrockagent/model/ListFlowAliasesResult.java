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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListFlowAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlowAliasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list, each member of which contains information about a flow alias.
     * </p>
     */
    private java.util.List<FlowAliasSummary> flowAliasSummaries;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list, each member of which contains information about a flow alias.
     * </p>
     * 
     * @return A list, each member of which contains information about a flow alias.
     */

    public java.util.List<FlowAliasSummary> getFlowAliasSummaries() {
        return flowAliasSummaries;
    }

    /**
     * <p>
     * A list, each member of which contains information about a flow alias.
     * </p>
     * 
     * @param flowAliasSummaries
     *        A list, each member of which contains information about a flow alias.
     */

    public void setFlowAliasSummaries(java.util.Collection<FlowAliasSummary> flowAliasSummaries) {
        if (flowAliasSummaries == null) {
            this.flowAliasSummaries = null;
            return;
        }

        this.flowAliasSummaries = new java.util.ArrayList<FlowAliasSummary>(flowAliasSummaries);
    }

    /**
     * <p>
     * A list, each member of which contains information about a flow alias.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlowAliasSummaries(java.util.Collection)} or {@link #withFlowAliasSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param flowAliasSummaries
     *        A list, each member of which contains information about a flow alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowAliasesResult withFlowAliasSummaries(FlowAliasSummary... flowAliasSummaries) {
        if (this.flowAliasSummaries == null) {
            setFlowAliasSummaries(new java.util.ArrayList<FlowAliasSummary>(flowAliasSummaries.length));
        }
        for (FlowAliasSummary ele : flowAliasSummaries) {
            this.flowAliasSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list, each member of which contains information about a flow alias.
     * </p>
     * 
     * @param flowAliasSummaries
     *        A list, each member of which contains information about a flow alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowAliasesResult withFlowAliasSummaries(java.util.Collection<FlowAliasSummary> flowAliasSummaries) {
        setFlowAliasSummaries(flowAliasSummaries);
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

    public ListFlowAliasesResult withNextToken(String nextToken) {
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
        if (getFlowAliasSummaries() != null)
            sb.append("FlowAliasSummaries: ").append(getFlowAliasSummaries()).append(",");
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

        if (obj instanceof ListFlowAliasesResult == false)
            return false;
        ListFlowAliasesResult other = (ListFlowAliasesResult) obj;
        if (other.getFlowAliasSummaries() == null ^ this.getFlowAliasSummaries() == null)
            return false;
        if (other.getFlowAliasSummaries() != null && other.getFlowAliasSummaries().equals(this.getFlowAliasSummaries()) == false)
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

        hashCode = prime * hashCode + ((getFlowAliasSummaries() == null) ? 0 : getFlowAliasSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFlowAliasesResult clone() {
        try {
            return (ListFlowAliasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
