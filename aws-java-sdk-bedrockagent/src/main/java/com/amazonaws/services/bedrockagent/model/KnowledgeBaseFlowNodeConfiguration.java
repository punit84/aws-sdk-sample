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
 * Contains configurations for a knowledge base node in a flow. This node takes a query as the input and returns, as the
 * output, the retrieved responses directly (as an array) or a response generated based on the retrieved responses. For
 * more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html">Node types in
 * Amazon Bedrock works</a> in the Amazon Bedrock User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/KnowledgeBaseFlowNodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseFlowNodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The unique identifier of the model to use to generate a response from the query results. Omit this field if you
     * want to return the retrieved results as an array.
     * </p>
     */
    private String modelId;

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to query.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to query.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to query.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseFlowNodeConfiguration withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the model to use to generate a response from the query results. Omit this field if you
     * want to return the retrieved results as an array.
     * </p>
     * 
     * @param modelId
     *        The unique identifier of the model to use to generate a response from the query results. Omit this field
     *        if you want to return the retrieved results as an array.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The unique identifier of the model to use to generate a response from the query results. Omit this field if you
     * want to return the retrieved results as an array.
     * </p>
     * 
     * @return The unique identifier of the model to use to generate a response from the query results. Omit this field
     *         if you want to return the retrieved results as an array.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The unique identifier of the model to use to generate a response from the query results. Omit this field if you
     * want to return the retrieved results as an array.
     * </p>
     * 
     * @param modelId
     *        The unique identifier of the model to use to generate a response from the query results. Omit this field
     *        if you want to return the retrieved results as an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseFlowNodeConfiguration withModelId(String modelId) {
        setModelId(modelId);
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
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseFlowNodeConfiguration == false)
            return false;
        KnowledgeBaseFlowNodeConfiguration other = (KnowledgeBaseFlowNodeConfiguration) obj;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseFlowNodeConfiguration clone() {
        try {
            return (KnowledgeBaseFlowNodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.KnowledgeBaseFlowNodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
