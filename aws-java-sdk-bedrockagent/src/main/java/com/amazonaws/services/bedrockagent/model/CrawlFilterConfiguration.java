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
 * The configuration of filtering the data source content. For example, configuring regular expression patterns to
 * include or exclude certain content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CrawlFilterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlFilterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of filtering certain objects or content types of the data source.
     * </p>
     */
    private PatternObjectFilterConfiguration patternObjectFilter;
    /**
     * <p>
     * The type of filtering that you want to apply to certain objects or content of the data source. For example, the
     * <code>PATTERN</code> type is regular expression patterns you can apply to filter your content.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The configuration of filtering certain objects or content types of the data source.
     * </p>
     * 
     * @param patternObjectFilter
     *        The configuration of filtering certain objects or content types of the data source.
     */

    public void setPatternObjectFilter(PatternObjectFilterConfiguration patternObjectFilter) {
        this.patternObjectFilter = patternObjectFilter;
    }

    /**
     * <p>
     * The configuration of filtering certain objects or content types of the data source.
     * </p>
     * 
     * @return The configuration of filtering certain objects or content types of the data source.
     */

    public PatternObjectFilterConfiguration getPatternObjectFilter() {
        return this.patternObjectFilter;
    }

    /**
     * <p>
     * The configuration of filtering certain objects or content types of the data source.
     * </p>
     * 
     * @param patternObjectFilter
     *        The configuration of filtering certain objects or content types of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlFilterConfiguration withPatternObjectFilter(PatternObjectFilterConfiguration patternObjectFilter) {
        setPatternObjectFilter(patternObjectFilter);
        return this;
    }

    /**
     * <p>
     * The type of filtering that you want to apply to certain objects or content of the data source. For example, the
     * <code>PATTERN</code> type is regular expression patterns you can apply to filter your content.
     * </p>
     * 
     * @param type
     *        The type of filtering that you want to apply to certain objects or content of the data source. For
     *        example, the <code>PATTERN</code> type is regular expression patterns you can apply to filter your
     *        content.
     * @see CrawlFilterConfigurationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of filtering that you want to apply to certain objects or content of the data source. For example, the
     * <code>PATTERN</code> type is regular expression patterns you can apply to filter your content.
     * </p>
     * 
     * @return The type of filtering that you want to apply to certain objects or content of the data source. For
     *         example, the <code>PATTERN</code> type is regular expression patterns you can apply to filter your
     *         content.
     * @see CrawlFilterConfigurationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of filtering that you want to apply to certain objects or content of the data source. For example, the
     * <code>PATTERN</code> type is regular expression patterns you can apply to filter your content.
     * </p>
     * 
     * @param type
     *        The type of filtering that you want to apply to certain objects or content of the data source. For
     *        example, the <code>PATTERN</code> type is regular expression patterns you can apply to filter your
     *        content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlFilterConfigurationType
     */

    public CrawlFilterConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of filtering that you want to apply to certain objects or content of the data source. For example, the
     * <code>PATTERN</code> type is regular expression patterns you can apply to filter your content.
     * </p>
     * 
     * @param type
     *        The type of filtering that you want to apply to certain objects or content of the data source. For
     *        example, the <code>PATTERN</code> type is regular expression patterns you can apply to filter your
     *        content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlFilterConfigurationType
     */

    public CrawlFilterConfiguration withType(CrawlFilterConfigurationType type) {
        this.type = type.toString();
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
        if (getPatternObjectFilter() != null)
            sb.append("PatternObjectFilter: ").append(getPatternObjectFilter()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlFilterConfiguration == false)
            return false;
        CrawlFilterConfiguration other = (CrawlFilterConfiguration) obj;
        if (other.getPatternObjectFilter() == null ^ this.getPatternObjectFilter() == null)
            return false;
        if (other.getPatternObjectFilter() != null && other.getPatternObjectFilter().equals(this.getPatternObjectFilter()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatternObjectFilter() == null) ? 0 : getPatternObjectFilter().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CrawlFilterConfiguration clone() {
        try {
            return (CrawlFilterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.CrawlFilterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
