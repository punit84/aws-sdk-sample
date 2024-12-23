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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListPrompts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPromptsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     */
    private String promptIdentifier;

    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. If the total number of results is greater than
     *        this value, use the token returned in the response in the <code>nextToken</code> field when making another
     *        request to return the next batch of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     * 
     * @return The maximum number of results to return in the response. If the total number of results is greater than
     *         this value, use the token returned in the response in the <code>nextToken</code> field when making
     *         another request to return the next batch of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. If the total number of results is greater than
     *        this value, use the token returned in the response in the <code>nextToken</code> field when making another
     *        request to return the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPromptsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        enter the token returned in the <code>nextToken</code> field in the response in this field to return the
     *        next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     * 
     * @return If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *         enter the token returned in the <code>nextToken</code> field in the response in this field to return the
     *         next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        enter the token returned in the <code>nextToken</code> field in the response in this field to return the
     *        next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPromptsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @param promptIdentifier
     *        The unique identifier of the prompt.
     */

    public void setPromptIdentifier(String promptIdentifier) {
        this.promptIdentifier = promptIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @return The unique identifier of the prompt.
     */

    public String getPromptIdentifier() {
        return this.promptIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the prompt.
     * </p>
     * 
     * @param promptIdentifier
     *        The unique identifier of the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPromptsRequest withPromptIdentifier(String promptIdentifier) {
        setPromptIdentifier(promptIdentifier);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPromptIdentifier() != null)
            sb.append("PromptIdentifier: ").append(getPromptIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPromptsRequest == false)
            return false;
        ListPromptsRequest other = (ListPromptsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPromptIdentifier() == null ^ this.getPromptIdentifier() == null)
            return false;
        if (other.getPromptIdentifier() != null && other.getPromptIdentifier().equals(this.getPromptIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPromptIdentifier() == null) ? 0 : getPromptIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListPromptsRequest clone() {
        return (ListPromptsRequest) super.clone();
    }

}
