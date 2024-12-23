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
 * Settings for semantic document chunking for a data source. Semantic chunking splits a document into into smaller
 * documents based on groups of similar content derived from the text with natural language processing.
 * </p>
 * <p>
 * With semantic chunking, each sentence is compared to the next to determine how similar they are. You specify a
 * threshold in the form of a percentile, where adjacent sentences that are less similar than that percentage of
 * sentence pairs are divided into separate chunks. For example, if you set the threshold to 90, then the 10 percent of
 * sentence pairs that are least similar are split. So if you have 101 sentences, 100 sentence pairs are compared, and
 * the 10 with the least similarity are split, creating 11 chunks. These chunks are further split if they exceed the max
 * token size.
 * </p>
 * <p>
 * You must also specify a buffer size, which determines whether sentences are compared in isolation, or within a moving
 * context window that includes the previous and following sentence. For example, if you set the buffer size to
 * <code>1</code>, the embedding for sentence 10 is derived from sentences 9, 10, and 11 combined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/SemanticChunkingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SemanticChunkingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dissimilarity threshold for splitting chunks.
     * </p>
     */
    private Integer breakpointPercentileThreshold;
    /**
     * <p>
     * The buffer size.
     * </p>
     */
    private Integer bufferSize;
    /**
     * <p>
     * The maximum number of tokens that a chunk can contain.
     * </p>
     */
    private Integer maxTokens;

    /**
     * <p>
     * The dissimilarity threshold for splitting chunks.
     * </p>
     * 
     * @param breakpointPercentileThreshold
     *        The dissimilarity threshold for splitting chunks.
     */

    public void setBreakpointPercentileThreshold(Integer breakpointPercentileThreshold) {
        this.breakpointPercentileThreshold = breakpointPercentileThreshold;
    }

    /**
     * <p>
     * The dissimilarity threshold for splitting chunks.
     * </p>
     * 
     * @return The dissimilarity threshold for splitting chunks.
     */

    public Integer getBreakpointPercentileThreshold() {
        return this.breakpointPercentileThreshold;
    }

    /**
     * <p>
     * The dissimilarity threshold for splitting chunks.
     * </p>
     * 
     * @param breakpointPercentileThreshold
     *        The dissimilarity threshold for splitting chunks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticChunkingConfiguration withBreakpointPercentileThreshold(Integer breakpointPercentileThreshold) {
        setBreakpointPercentileThreshold(breakpointPercentileThreshold);
        return this;
    }

    /**
     * <p>
     * The buffer size.
     * </p>
     * 
     * @param bufferSize
     *        The buffer size.
     */

    public void setBufferSize(Integer bufferSize) {
        this.bufferSize = bufferSize;
    }

    /**
     * <p>
     * The buffer size.
     * </p>
     * 
     * @return The buffer size.
     */

    public Integer getBufferSize() {
        return this.bufferSize;
    }

    /**
     * <p>
     * The buffer size.
     * </p>
     * 
     * @param bufferSize
     *        The buffer size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticChunkingConfiguration withBufferSize(Integer bufferSize) {
        setBufferSize(bufferSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of tokens that a chunk can contain.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens that a chunk can contain.
     */

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens that a chunk can contain.
     * </p>
     * 
     * @return The maximum number of tokens that a chunk can contain.
     */

    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens that a chunk can contain.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens that a chunk can contain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticChunkingConfiguration withMaxTokens(Integer maxTokens) {
        setMaxTokens(maxTokens);
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
        if (getBreakpointPercentileThreshold() != null)
            sb.append("BreakpointPercentileThreshold: ").append(getBreakpointPercentileThreshold()).append(",");
        if (getBufferSize() != null)
            sb.append("BufferSize: ").append(getBufferSize()).append(",");
        if (getMaxTokens() != null)
            sb.append("MaxTokens: ").append(getMaxTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SemanticChunkingConfiguration == false)
            return false;
        SemanticChunkingConfiguration other = (SemanticChunkingConfiguration) obj;
        if (other.getBreakpointPercentileThreshold() == null ^ this.getBreakpointPercentileThreshold() == null)
            return false;
        if (other.getBreakpointPercentileThreshold() != null
                && other.getBreakpointPercentileThreshold().equals(this.getBreakpointPercentileThreshold()) == false)
            return false;
        if (other.getBufferSize() == null ^ this.getBufferSize() == null)
            return false;
        if (other.getBufferSize() != null && other.getBufferSize().equals(this.getBufferSize()) == false)
            return false;
        if (other.getMaxTokens() == null ^ this.getMaxTokens() == null)
            return false;
        if (other.getMaxTokens() != null && other.getMaxTokens().equals(this.getMaxTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBreakpointPercentileThreshold() == null) ? 0 : getBreakpointPercentileThreshold().hashCode());
        hashCode = prime * hashCode + ((getBufferSize() == null) ? 0 : getBufferSize().hashCode());
        hashCode = prime * hashCode + ((getMaxTokens() == null) ? 0 : getMaxTokens().hashCode());
        return hashCode;
    }

    @Override
    public SemanticChunkingConfiguration clone() {
        try {
            return (SemanticChunkingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.SemanticChunkingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
