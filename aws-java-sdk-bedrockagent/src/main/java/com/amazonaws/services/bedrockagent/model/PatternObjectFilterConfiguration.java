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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of filtering certain objects or content types of the data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PatternObjectFilterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatternObjectFilterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of specific filters applied to your data source content. You can filter out or include certain
     * content.
     * </p>
     */
    private java.util.List<PatternObjectFilter> filters;

    /**
     * <p>
     * The configuration of specific filters applied to your data source content. You can filter out or include certain
     * content.
     * </p>
     * 
     * @return The configuration of specific filters applied to your data source content. You can filter out or include
     *         certain content.
     */

    public java.util.List<PatternObjectFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The configuration of specific filters applied to your data source content. You can filter out or include certain
     * content.
     * </p>
     * 
     * @param filters
     *        The configuration of specific filters applied to your data source content. You can filter out or include
     *        certain content.
     */

    public void setFilters(java.util.Collection<PatternObjectFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<PatternObjectFilter>(filters);
    }

    /**
     * <p>
     * The configuration of specific filters applied to your data source content. You can filter out or include certain
     * content.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The configuration of specific filters applied to your data source content. You can filter out or include
     *        certain content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternObjectFilterConfiguration withFilters(PatternObjectFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<PatternObjectFilter>(filters.length));
        }
        for (PatternObjectFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of specific filters applied to your data source content. You can filter out or include certain
     * content.
     * </p>
     * 
     * @param filters
     *        The configuration of specific filters applied to your data source content. You can filter out or include
     *        certain content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternObjectFilterConfiguration withFilters(java.util.Collection<PatternObjectFilter> filters) {
        setFilters(filters);
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
        if (getFilters() != null)
            sb.append("Filters: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatternObjectFilterConfiguration == false)
            return false;
        PatternObjectFilterConfiguration other = (PatternObjectFilterConfiguration) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public PatternObjectFilterConfiguration clone() {
        try {
            return (PatternObjectFilterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PatternObjectFilterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
