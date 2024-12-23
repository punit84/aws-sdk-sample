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
 * Contains details about how to ingest the documents in a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/VectorIngestionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VectorIngestionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a data
     * source that is returned when the knowledge base that it belongs to is queried.
     * </p>
     */
    private ChunkingConfiguration chunkingConfiguration;
    /**
     * <p>
     * A custom document transformer for parsed data source documents.
     * </p>
     */
    private CustomTransformationConfiguration customTransformationConfiguration;
    /**
     * <p>
     * A custom parser for data source documents.
     * </p>
     */
    private ParsingConfiguration parsingConfiguration;

    /**
     * <p>
     * Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a data
     * source that is returned when the knowledge base that it belongs to is queried.
     * </p>
     * 
     * @param chunkingConfiguration
     *        Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a
     *        data source that is returned when the knowledge base that it belongs to is queried.
     */

    public void setChunkingConfiguration(ChunkingConfiguration chunkingConfiguration) {
        this.chunkingConfiguration = chunkingConfiguration;
    }

    /**
     * <p>
     * Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a data
     * source that is returned when the knowledge base that it belongs to is queried.
     * </p>
     * 
     * @return Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a
     *         data source that is returned when the knowledge base that it belongs to is queried.
     */

    public ChunkingConfiguration getChunkingConfiguration() {
        return this.chunkingConfiguration;
    }

    /**
     * <p>
     * Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a data
     * source that is returned when the knowledge base that it belongs to is queried.
     * </p>
     * 
     * @param chunkingConfiguration
     *        Details about how to chunk the documents in the data source. A <i>chunk</i> refers to an excerpt from a
     *        data source that is returned when the knowledge base that it belongs to is queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorIngestionConfiguration withChunkingConfiguration(ChunkingConfiguration chunkingConfiguration) {
        setChunkingConfiguration(chunkingConfiguration);
        return this;
    }

    /**
     * <p>
     * A custom document transformer for parsed data source documents.
     * </p>
     * 
     * @param customTransformationConfiguration
     *        A custom document transformer for parsed data source documents.
     */

    public void setCustomTransformationConfiguration(CustomTransformationConfiguration customTransformationConfiguration) {
        this.customTransformationConfiguration = customTransformationConfiguration;
    }

    /**
     * <p>
     * A custom document transformer for parsed data source documents.
     * </p>
     * 
     * @return A custom document transformer for parsed data source documents.
     */

    public CustomTransformationConfiguration getCustomTransformationConfiguration() {
        return this.customTransformationConfiguration;
    }

    /**
     * <p>
     * A custom document transformer for parsed data source documents.
     * </p>
     * 
     * @param customTransformationConfiguration
     *        A custom document transformer for parsed data source documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorIngestionConfiguration withCustomTransformationConfiguration(CustomTransformationConfiguration customTransformationConfiguration) {
        setCustomTransformationConfiguration(customTransformationConfiguration);
        return this;
    }

    /**
     * <p>
     * A custom parser for data source documents.
     * </p>
     * 
     * @param parsingConfiguration
     *        A custom parser for data source documents.
     */

    public void setParsingConfiguration(ParsingConfiguration parsingConfiguration) {
        this.parsingConfiguration = parsingConfiguration;
    }

    /**
     * <p>
     * A custom parser for data source documents.
     * </p>
     * 
     * @return A custom parser for data source documents.
     */

    public ParsingConfiguration getParsingConfiguration() {
        return this.parsingConfiguration;
    }

    /**
     * <p>
     * A custom parser for data source documents.
     * </p>
     * 
     * @param parsingConfiguration
     *        A custom parser for data source documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorIngestionConfiguration withParsingConfiguration(ParsingConfiguration parsingConfiguration) {
        setParsingConfiguration(parsingConfiguration);
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
        if (getChunkingConfiguration() != null)
            sb.append("ChunkingConfiguration: ").append(getChunkingConfiguration()).append(",");
        if (getCustomTransformationConfiguration() != null)
            sb.append("CustomTransformationConfiguration: ").append(getCustomTransformationConfiguration()).append(",");
        if (getParsingConfiguration() != null)
            sb.append("ParsingConfiguration: ").append(getParsingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VectorIngestionConfiguration == false)
            return false;
        VectorIngestionConfiguration other = (VectorIngestionConfiguration) obj;
        if (other.getChunkingConfiguration() == null ^ this.getChunkingConfiguration() == null)
            return false;
        if (other.getChunkingConfiguration() != null && other.getChunkingConfiguration().equals(this.getChunkingConfiguration()) == false)
            return false;
        if (other.getCustomTransformationConfiguration() == null ^ this.getCustomTransformationConfiguration() == null)
            return false;
        if (other.getCustomTransformationConfiguration() != null
                && other.getCustomTransformationConfiguration().equals(this.getCustomTransformationConfiguration()) == false)
            return false;
        if (other.getParsingConfiguration() == null ^ this.getParsingConfiguration() == null)
            return false;
        if (other.getParsingConfiguration() != null && other.getParsingConfiguration().equals(this.getParsingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChunkingConfiguration() == null) ? 0 : getChunkingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomTransformationConfiguration() == null) ? 0 : getCustomTransformationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParsingConfiguration() == null) ? 0 : getParsingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public VectorIngestionConfiguration clone() {
        try {
            return (VectorIngestionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.VectorIngestionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
