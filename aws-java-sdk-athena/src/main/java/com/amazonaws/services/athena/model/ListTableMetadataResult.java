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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTableMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of table metadata.
     * </p>
     */
    private java.util.List<TableMetadata> tableMetadataList;
    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the NextToken from the response object of the previous page
     * call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of table metadata.
     * </p>
     * 
     * @return A list of table metadata.
     */

    public java.util.List<TableMetadata> getTableMetadataList() {
        return tableMetadataList;
    }

    /**
     * <p>
     * A list of table metadata.
     * </p>
     * 
     * @param tableMetadataList
     *        A list of table metadata.
     */

    public void setTableMetadataList(java.util.Collection<TableMetadata> tableMetadataList) {
        if (tableMetadataList == null) {
            this.tableMetadataList = null;
            return;
        }

        this.tableMetadataList = new java.util.ArrayList<TableMetadata>(tableMetadataList);
    }

    /**
     * <p>
     * A list of table metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableMetadataList(java.util.Collection)} or {@link #withTableMetadataList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tableMetadataList
     *        A list of table metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableMetadataResult withTableMetadataList(TableMetadata... tableMetadataList) {
        if (this.tableMetadataList == null) {
            setTableMetadataList(new java.util.ArrayList<TableMetadata>(tableMetadataList.length));
        }
        for (TableMetadata ele : tableMetadataList) {
            this.tableMetadataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of table metadata.
     * </p>
     * 
     * @param tableMetadataList
     *        A list of table metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableMetadataResult withTableMetadataList(java.util.Collection<TableMetadata> tableMetadataList) {
        setTableMetadataList(tableMetadataList);
        return this;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the NextToken from the response object of the previous page
     * call.
     * </p>
     * 
     * @param nextToken
     *        A token generated by the Athena service that specifies where to continue pagination if a previous request
     *        was truncated. To obtain the next set of pages, pass in the NextToken from the response object of the
     *        previous page call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the NextToken from the response object of the previous page
     * call.
     * </p>
     * 
     * @return A token generated by the Athena service that specifies where to continue pagination if a previous request
     *         was truncated. To obtain the next set of pages, pass in the NextToken from the response object of the
     *         previous page call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue pagination if a previous request was
     * truncated. To obtain the next set of pages, pass in the NextToken from the response object of the previous page
     * call.
     * </p>
     * 
     * @param nextToken
     *        A token generated by the Athena service that specifies where to continue pagination if a previous request
     *        was truncated. To obtain the next set of pages, pass in the NextToken from the response object of the
     *        previous page call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableMetadataResult withNextToken(String nextToken) {
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
        if (getTableMetadataList() != null)
            sb.append("TableMetadataList: ").append(getTableMetadataList()).append(",");
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

        if (obj instanceof ListTableMetadataResult == false)
            return false;
        ListTableMetadataResult other = (ListTableMetadataResult) obj;
        if (other.getTableMetadataList() == null ^ this.getTableMetadataList() == null)
            return false;
        if (other.getTableMetadataList() != null && other.getTableMetadataList().equals(this.getTableMetadataList()) == false)
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

        hashCode = prime * hashCode + ((getTableMetadataList() == null) ? 0 : getTableMetadataList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTableMetadataResult clone() {
        try {
            return (ListTableMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
