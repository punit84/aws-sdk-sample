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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListPrompts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPromptsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, use
     * this token when making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list, each member of which contains information about a prompt using Prompt management.
     * </p>
     */
    private java.util.List<PromptSummary> promptSummaries;

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

    public ListPromptsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list, each member of which contains information about a prompt using Prompt management.
     * </p>
     * 
     * @return A list, each member of which contains information about a prompt using Prompt management.
     */

    public java.util.List<PromptSummary> getPromptSummaries() {
        return promptSummaries;
    }

    /**
     * <p>
     * A list, each member of which contains information about a prompt using Prompt management.
     * </p>
     * 
     * @param promptSummaries
     *        A list, each member of which contains information about a prompt using Prompt management.
     */

    public void setPromptSummaries(java.util.Collection<PromptSummary> promptSummaries) {
        if (promptSummaries == null) {
            this.promptSummaries = null;
            return;
        }

        this.promptSummaries = new java.util.ArrayList<PromptSummary>(promptSummaries);
    }

    /**
     * <p>
     * A list, each member of which contains information about a prompt using Prompt management.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPromptSummaries(java.util.Collection)} or {@link #withPromptSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param promptSummaries
     *        A list, each member of which contains information about a prompt using Prompt management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPromptsResult withPromptSummaries(PromptSummary... promptSummaries) {
        if (this.promptSummaries == null) {
            setPromptSummaries(new java.util.ArrayList<PromptSummary>(promptSummaries.length));
        }
        for (PromptSummary ele : promptSummaries) {
            this.promptSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list, each member of which contains information about a prompt using Prompt management.
     * </p>
     * 
     * @param promptSummaries
     *        A list, each member of which contains information about a prompt using Prompt management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPromptsResult withPromptSummaries(java.util.Collection<PromptSummary> promptSummaries) {
        setPromptSummaries(promptSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPromptSummaries() != null)
            sb.append("PromptSummaries: ").append(getPromptSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPromptsResult == false)
            return false;
        ListPromptsResult other = (ListPromptsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPromptSummaries() == null ^ this.getPromptSummaries() == null)
            return false;
        if (other.getPromptSummaries() != null && other.getPromptSummaries().equals(this.getPromptSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPromptSummaries() == null) ? 0 : getPromptSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListPromptsResult clone() {
        try {
            return (ListPromptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
