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
 * The vector configuration details for the Bedrock embeddings model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/BedrockEmbeddingModelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BedrockEmbeddingModelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimensions details for the vector configuration used on the Bedrock embeddings model.
     * </p>
     */
    private Integer dimensions;

    /**
     * <p>
     * The dimensions details for the vector configuration used on the Bedrock embeddings model.
     * </p>
     * 
     * @param dimensions
     *        The dimensions details for the vector configuration used on the Bedrock embeddings model.
     */

    public void setDimensions(Integer dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimensions details for the vector configuration used on the Bedrock embeddings model.
     * </p>
     * 
     * @return The dimensions details for the vector configuration used on the Bedrock embeddings model.
     */

    public Integer getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The dimensions details for the vector configuration used on the Bedrock embeddings model.
     * </p>
     * 
     * @param dimensions
     *        The dimensions details for the vector configuration used on the Bedrock embeddings model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockEmbeddingModelConfiguration withDimensions(Integer dimensions) {
        setDimensions(dimensions);
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BedrockEmbeddingModelConfiguration == false)
            return false;
        BedrockEmbeddingModelConfiguration other = (BedrockEmbeddingModelConfiguration) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public BedrockEmbeddingModelConfiguration clone() {
        try {
            return (BedrockEmbeddingModelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.BedrockEmbeddingModelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
