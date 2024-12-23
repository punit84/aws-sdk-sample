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
 * The specific filters applied to your data source content. You can filter out or include certain content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PatternObjectFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatternObjectFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     */
    private java.util.List<String> exclusionFilters;
    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     */
    private java.util.List<String> inclusionFilters;
    /**
     * <p>
     * The supported object type or content type of the data source.
     * </p>
     */
    private String objectType;

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * 
     * @return A list of one or more exclusion regular expression patterns to exclude certain object types that adhere
     *         to the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *         exclusion filter takes precedence and the document isn’t crawled.
     */

    public java.util.List<String> getExclusionFilters() {
        return exclusionFilters;
    }

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * 
     * @param exclusionFilters
     *        A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to
     *        the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *        exclusion filter takes precedence and the document isn’t crawled.
     */

    public void setExclusionFilters(java.util.Collection<String> exclusionFilters) {
        if (exclusionFilters == null) {
            this.exclusionFilters = null;
            return;
        }

        this.exclusionFilters = new java.util.ArrayList<String>(exclusionFilters);
    }

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionFilters(java.util.Collection)} or {@link #withExclusionFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exclusionFilters
     *        A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to
     *        the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *        exclusion filter takes precedence and the document isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternObjectFilter withExclusionFilters(String... exclusionFilters) {
        if (this.exclusionFilters == null) {
            setExclusionFilters(new java.util.ArrayList<String>(exclusionFilters.length));
        }
        for (String ele : exclusionFilters) {
            this.exclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * 
     * @param exclusionFilters
     *        A list of one or more exclusion regular expression patterns to exclude certain object types that adhere to
     *        the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *        exclusion filter takes precedence and the document isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternObjectFilter withExclusionFilters(java.util.Collection<String> exclusionFilters) {
        setExclusionFilters(exclusionFilters);
        return this;
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * 
     * @return A list of one or more inclusion regular expression patterns to include certain object types that adhere
     *         to the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *         exclusion filter takes precedence and the document isn’t crawled.
     */

    public java.util.List<String> getInclusionFilters() {
        return inclusionFilters;
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * 
     * @param inclusionFilters
     *        A list of one or more inclusion regular expression patterns to include certain object types that adhere to
     *        the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *        exclusion filter takes precedence and the document isn’t crawled.
     */

    public void setInclusionFilters(java.util.Collection<String> inclusionFilters) {
        if (inclusionFilters == null) {
            this.inclusionFilters = null;
            return;
        }

        this.inclusionFilters = new java.util.ArrayList<String>(inclusionFilters);
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionFilters(java.util.Collection)} or {@link #withInclusionFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inclusionFilters
     *        A list of one or more inclusion regular expression patterns to include certain object types that adhere to
     *        the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *        exclusion filter takes precedence and the document isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternObjectFilter withInclusionFilters(String... inclusionFilters) {
        if (this.inclusionFilters == null) {
            setInclusionFilters(new java.util.ArrayList<String>(inclusionFilters.length));
        }
        for (String ele : inclusionFilters) {
            this.inclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more inclusion regular expression patterns to include certain object types that adhere to the
     * pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the exclusion filter
     * takes precedence and the document isn’t crawled.
     * </p>
     * 
     * @param inclusionFilters
     *        A list of one or more inclusion regular expression patterns to include certain object types that adhere to
     *        the pattern. If you specify an inclusion and exclusion filter/pattern and both match a document, the
     *        exclusion filter takes precedence and the document isn’t crawled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternObjectFilter withInclusionFilters(java.util.Collection<String> inclusionFilters) {
        setInclusionFilters(inclusionFilters);
        return this;
    }

    /**
     * <p>
     * The supported object type or content type of the data source.
     * </p>
     * 
     * @param objectType
     *        The supported object type or content type of the data source.
     */

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * <p>
     * The supported object type or content type of the data source.
     * </p>
     * 
     * @return The supported object type or content type of the data source.
     */

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * <p>
     * The supported object type or content type of the data source.
     * </p>
     * 
     * @param objectType
     *        The supported object type or content type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatternObjectFilter withObjectType(String objectType) {
        setObjectType(objectType);
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
        if (getExclusionFilters() != null)
            sb.append("ExclusionFilters: ").append("***Sensitive Data Redacted***").append(",");
        if (getInclusionFilters() != null)
            sb.append("InclusionFilters: ").append("***Sensitive Data Redacted***").append(",");
        if (getObjectType() != null)
            sb.append("ObjectType: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatternObjectFilter == false)
            return false;
        PatternObjectFilter other = (PatternObjectFilter) obj;
        if (other.getExclusionFilters() == null ^ this.getExclusionFilters() == null)
            return false;
        if (other.getExclusionFilters() != null && other.getExclusionFilters().equals(this.getExclusionFilters()) == false)
            return false;
        if (other.getInclusionFilters() == null ^ this.getInclusionFilters() == null)
            return false;
        if (other.getInclusionFilters() != null && other.getInclusionFilters().equals(this.getInclusionFilters()) == false)
            return false;
        if (other.getObjectType() == null ^ this.getObjectType() == null)
            return false;
        if (other.getObjectType() != null && other.getObjectType().equals(this.getObjectType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExclusionFilters() == null) ? 0 : getExclusionFilters().hashCode());
        hashCode = prime * hashCode + ((getInclusionFilters() == null) ? 0 : getInclusionFilters().hashCode());
        hashCode = prime * hashCode + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        return hashCode;
    }

    @Override
    public PatternObjectFilter clone() {
        try {
            return (PatternObjectFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PatternObjectFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
