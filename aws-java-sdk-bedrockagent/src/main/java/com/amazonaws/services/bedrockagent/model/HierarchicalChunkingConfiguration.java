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
 * Settings for hierarchical document chunking for a data source. Hierarchical chunking splits documents into layers of
 * chunks where the first layer contains large chunks, and the second layer contains smaller chunks derived from the
 * first layer.
 * </p>
 * <p>
 * You configure the number of tokens to overlap, or repeat across adjacent chunks. For example, if you set overlap
 * tokens to 60, the last 60 tokens in the first chunk are also included at the beginning of the second chunk. For each
 * layer, you must also configure the maximum number of tokens in a chunk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/HierarchicalChunkingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchicalChunkingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Token settings for each layer.
     * </p>
     */
    private java.util.List<HierarchicalChunkingLevelConfiguration> levelConfigurations;
    /**
     * <p>
     * The number of tokens to repeat across chunks in the same layer.
     * </p>
     */
    private Integer overlapTokens;

    /**
     * <p>
     * Token settings for each layer.
     * </p>
     * 
     * @return Token settings for each layer.
     */

    public java.util.List<HierarchicalChunkingLevelConfiguration> getLevelConfigurations() {
        return levelConfigurations;
    }

    /**
     * <p>
     * Token settings for each layer.
     * </p>
     * 
     * @param levelConfigurations
     *        Token settings for each layer.
     */

    public void setLevelConfigurations(java.util.Collection<HierarchicalChunkingLevelConfiguration> levelConfigurations) {
        if (levelConfigurations == null) {
            this.levelConfigurations = null;
            return;
        }

        this.levelConfigurations = new java.util.ArrayList<HierarchicalChunkingLevelConfiguration>(levelConfigurations);
    }

    /**
     * <p>
     * Token settings for each layer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLevelConfigurations(java.util.Collection)} or {@link #withLevelConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param levelConfigurations
     *        Token settings for each layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchicalChunkingConfiguration withLevelConfigurations(HierarchicalChunkingLevelConfiguration... levelConfigurations) {
        if (this.levelConfigurations == null) {
            setLevelConfigurations(new java.util.ArrayList<HierarchicalChunkingLevelConfiguration>(levelConfigurations.length));
        }
        for (HierarchicalChunkingLevelConfiguration ele : levelConfigurations) {
            this.levelConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Token settings for each layer.
     * </p>
     * 
     * @param levelConfigurations
     *        Token settings for each layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchicalChunkingConfiguration withLevelConfigurations(java.util.Collection<HierarchicalChunkingLevelConfiguration> levelConfigurations) {
        setLevelConfigurations(levelConfigurations);
        return this;
    }

    /**
     * <p>
     * The number of tokens to repeat across chunks in the same layer.
     * </p>
     * 
     * @param overlapTokens
     *        The number of tokens to repeat across chunks in the same layer.
     */

    public void setOverlapTokens(Integer overlapTokens) {
        this.overlapTokens = overlapTokens;
    }

    /**
     * <p>
     * The number of tokens to repeat across chunks in the same layer.
     * </p>
     * 
     * @return The number of tokens to repeat across chunks in the same layer.
     */

    public Integer getOverlapTokens() {
        return this.overlapTokens;
    }

    /**
     * <p>
     * The number of tokens to repeat across chunks in the same layer.
     * </p>
     * 
     * @param overlapTokens
     *        The number of tokens to repeat across chunks in the same layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchicalChunkingConfiguration withOverlapTokens(Integer overlapTokens) {
        setOverlapTokens(overlapTokens);
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
        if (getLevelConfigurations() != null)
            sb.append("LevelConfigurations: ").append(getLevelConfigurations()).append(",");
        if (getOverlapTokens() != null)
            sb.append("OverlapTokens: ").append(getOverlapTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchicalChunkingConfiguration == false)
            return false;
        HierarchicalChunkingConfiguration other = (HierarchicalChunkingConfiguration) obj;
        if (other.getLevelConfigurations() == null ^ this.getLevelConfigurations() == null)
            return false;
        if (other.getLevelConfigurations() != null && other.getLevelConfigurations().equals(this.getLevelConfigurations()) == false)
            return false;
        if (other.getOverlapTokens() == null ^ this.getOverlapTokens() == null)
            return false;
        if (other.getOverlapTokens() != null && other.getOverlapTokens().equals(this.getOverlapTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevelConfigurations() == null) ? 0 : getLevelConfigurations().hashCode());
        hashCode = prime * hashCode + ((getOverlapTokens() == null) ? 0 : getOverlapTokens().hashCode());
        return hashCode;
    }

    @Override
    public HierarchicalChunkingConfiguration clone() {
        try {
            return (HierarchicalChunkingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.HierarchicalChunkingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
