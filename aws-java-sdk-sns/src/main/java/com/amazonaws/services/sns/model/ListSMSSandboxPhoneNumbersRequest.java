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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListSMSSandboxPhoneNumbers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSMSSandboxPhoneNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     * </p>
     * 
     * @param nextToken
     *        Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     * </p>
     * 
     * @return Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     * </p>
     * 
     * @param nextToken
     *        Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSMSSandboxPhoneNumbersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of phone numbers to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     * 
     * @return The maximum number of phone numbers to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of phone numbers to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSMSSandboxPhoneNumbersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSMSSandboxPhoneNumbersRequest == false)
            return false;
        ListSMSSandboxPhoneNumbersRequest other = (ListSMSSandboxPhoneNumbersRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSMSSandboxPhoneNumbersRequest clone() {
        return (ListSMSSandboxPhoneNumbersRequest) super.clone();
    }

}
