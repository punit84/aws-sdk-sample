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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNamedQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNamedQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (UUID) of the query.
     * </p>
     */
    private String namedQueryId;
    /**
     * <p>
     * The name of the query.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The query description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     */
    private String queryString;

    /**
     * <p>
     * The unique identifier (UUID) of the query.
     * </p>
     * 
     * @param namedQueryId
     *        The unique identifier (UUID) of the query.
     */

    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    /**
     * <p>
     * The unique identifier (UUID) of the query.
     * </p>
     * 
     * @return The unique identifier (UUID) of the query.
     */

    public String getNamedQueryId() {
        return this.namedQueryId;
    }

    /**
     * <p>
     * The unique identifier (UUID) of the query.
     * </p>
     * 
     * @param namedQueryId
     *        The unique identifier (UUID) of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamedQueryRequest withNamedQueryId(String namedQueryId) {
        setNamedQueryId(namedQueryId);
        return this;
    }

    /**
     * <p>
     * The name of the query.
     * </p>
     * 
     * @param name
     *        The name of the query.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the query.
     * </p>
     * 
     * @return The name of the query.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the query.
     * </p>
     * 
     * @param name
     *        The name of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamedQueryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * 
     * @param description
     *        The query description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * 
     * @return The query description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The query description.
     * </p>
     * 
     * @param description
     *        The query description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamedQueryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * 
     * @param queryString
     *        The contents of the query with all query statements.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * 
     * @return The contents of the query with all query statements.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The contents of the query with all query statements.
     * </p>
     * 
     * @param queryString
     *        The contents of the query with all query statements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNamedQueryRequest withQueryString(String queryString) {
        setQueryString(queryString);
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
        if (getNamedQueryId() != null)
            sb.append("NamedQueryId: ").append(getNamedQueryId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNamedQueryRequest == false)
            return false;
        UpdateNamedQueryRequest other = (UpdateNamedQueryRequest) obj;
        if (other.getNamedQueryId() == null ^ this.getNamedQueryId() == null)
            return false;
        if (other.getNamedQueryId() != null && other.getNamedQueryId().equals(this.getNamedQueryId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamedQueryId() == null) ? 0 : getNamedQueryId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNamedQueryRequest clone() {
        return (UpdateNamedQueryRequest) super.clone();
    }

}
