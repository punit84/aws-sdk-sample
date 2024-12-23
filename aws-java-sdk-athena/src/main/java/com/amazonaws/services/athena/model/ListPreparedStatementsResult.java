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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListPreparedStatements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPreparedStatementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of prepared statements for the workgroup.
     * </p>
     */
    private java.util.List<PreparedStatementSummary> preparedStatements;
    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of prepared statements for the workgroup.
     * </p>
     * 
     * @return The list of prepared statements for the workgroup.
     */

    public java.util.List<PreparedStatementSummary> getPreparedStatements() {
        return preparedStatements;
    }

    /**
     * <p>
     * The list of prepared statements for the workgroup.
     * </p>
     * 
     * @param preparedStatements
     *        The list of prepared statements for the workgroup.
     */

    public void setPreparedStatements(java.util.Collection<PreparedStatementSummary> preparedStatements) {
        if (preparedStatements == null) {
            this.preparedStatements = null;
            return;
        }

        this.preparedStatements = new java.util.ArrayList<PreparedStatementSummary>(preparedStatements);
    }

    /**
     * <p>
     * The list of prepared statements for the workgroup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreparedStatements(java.util.Collection)} or {@link #withPreparedStatements(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param preparedStatements
     *        The list of prepared statements for the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreparedStatementsResult withPreparedStatements(PreparedStatementSummary... preparedStatements) {
        if (this.preparedStatements == null) {
            setPreparedStatements(new java.util.ArrayList<PreparedStatementSummary>(preparedStatements.length));
        }
        for (PreparedStatementSummary ele : preparedStatements) {
            this.preparedStatements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of prepared statements for the workgroup.
     * </p>
     * 
     * @param preparedStatements
     *        The list of prepared statements for the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreparedStatementsResult withPreparedStatements(java.util.Collection<PreparedStatementSummary> preparedStatements) {
        setPreparedStatements(preparedStatements);
        return this;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     * 
     * @param nextToken
     *        A token generated by the Athena service that specifies where to continue pagination if a previous request
     *        was truncated. To obtain the next set of pages, pass in the <code>NextToken</code> from the response
     *        object of the previous page call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     * 
     * @return A token generated by the Athena service that specifies where to continue pagination if a previous request
     *         was truncated. To obtain the next set of pages, pass in the <code>NextToken</code> from the response
     *         object of the previous page call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     * 
     * @param nextToken
     *        A token generated by the Athena service that specifies where to continue pagination if a previous request
     *        was truncated. To obtain the next set of pages, pass in the <code>NextToken</code> from the response
     *        object of the previous page call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreparedStatementsResult withNextToken(String nextToken) {
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
        if (getPreparedStatements() != null)
            sb.append("PreparedStatements: ").append(getPreparedStatements()).append(",");
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

        if (obj instanceof ListPreparedStatementsResult == false)
            return false;
        ListPreparedStatementsResult other = (ListPreparedStatementsResult) obj;
        if (other.getPreparedStatements() == null ^ this.getPreparedStatements() == null)
            return false;
        if (other.getPreparedStatements() != null && other.getPreparedStatements().equals(this.getPreparedStatements()) == false)
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

        hashCode = prime * hashCode + ((getPreparedStatements() == null) ? 0 : getPreparedStatements().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPreparedStatementsResult clone() {
        try {
            return (ListPreparedStatementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}