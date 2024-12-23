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
 * The configuration details for the embeddings model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/EmbeddingModelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmbeddingModelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The vector configuration details on the Bedrock embeddings model.
     * </p>
     */
    private BedrockEmbeddingModelConfiguration bedrockEmbeddingModelConfiguration;

    /**
     * <p>
     * The vector configuration details on the Bedrock embeddings model.
     * </p>
     * 
     * @param bedrockEmbeddingModelConfiguration
     *        The vector configuration details on the Bedrock embeddings model.
     */

    public void setBedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfiguration bedrockEmbeddingModelConfiguration) {
        this.bedrockEmbeddingModelConfiguration = bedrockEmbeddingModelConfiguration;
    }

    /**
     * <p>
     * The vector configuration details on the Bedrock embeddings model.
     * </p>
     * 
     * @return The vector configuration details on the Bedrock embeddings model.
     */

    public BedrockEmbeddingModelConfiguration getBedrockEmbeddingModelConfiguration() {
        return this.bedrockEmbeddingModelConfiguration;
    }

    /**
     * <p>
     * The vector configuration details on the Bedrock embeddings model.
     * </p>
     * 
     * @param bedrockEmbeddingModelConfiguration
     *        The vector configuration details on the Bedrock embeddings model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmbeddingModelConfiguration withBedrockEmbeddingModelConfiguration(BedrockEmbeddingModelConfiguration bedrockEmbeddingModelConfiguration) {
        setBedrockEmbeddingModelConfiguration(bedrockEmbeddingModelConfiguration);
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
        if (getBedrockEmbeddingModelConfiguration() != null)
            sb.append("BedrockEmbeddingModelConfiguration: ").append(getBedrockEmbeddingModelConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmbeddingModelConfiguration == false)
            return false;
        EmbeddingModelConfiguration other = (EmbeddingModelConfiguration) obj;
        if (other.getBedrockEmbeddingModelConfiguration() == null ^ this.getBedrockEmbeddingModelConfiguration() == null)
            return false;
        if (other.getBedrockEmbeddingModelConfiguration() != null
                && other.getBedrockEmbeddingModelConfiguration().equals(this.getBedrockEmbeddingModelConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBedrockEmbeddingModelConfiguration() == null) ? 0 : getBedrockEmbeddingModelConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public EmbeddingModelConfiguration clone() {
        try {
            return (EmbeddingModelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.EmbeddingModelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
