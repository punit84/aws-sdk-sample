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
 * Contains configurations for a prompt defined inline in the node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptFlowNodeInlineConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptFlowNodeInlineConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains inference configurations for the prompt.
     * </p>
     */
    private PromptInferenceConfiguration inferenceConfiguration;
    /**
     * <p>
     * The unique identifier of the model to run inference with.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     * </p>
     */
    private PromptTemplateConfiguration templateConfiguration;
    /**
     * <p>
     * The type of prompt template.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * Contains inference configurations for the prompt.
     * </p>
     * 
     * @param inferenceConfiguration
     *        Contains inference configurations for the prompt.
     */

    public void setInferenceConfiguration(PromptInferenceConfiguration inferenceConfiguration) {
        this.inferenceConfiguration = inferenceConfiguration;
    }

    /**
     * <p>
     * Contains inference configurations for the prompt.
     * </p>
     * 
     * @return Contains inference configurations for the prompt.
     */

    public PromptInferenceConfiguration getInferenceConfiguration() {
        return this.inferenceConfiguration;
    }

    /**
     * <p>
     * Contains inference configurations for the prompt.
     * </p>
     * 
     * @param inferenceConfiguration
     *        Contains inference configurations for the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptFlowNodeInlineConfiguration withInferenceConfiguration(PromptInferenceConfiguration inferenceConfiguration) {
        setInferenceConfiguration(inferenceConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the model to run inference with.
     * </p>
     * 
     * @param modelId
     *        The unique identifier of the model to run inference with.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The unique identifier of the model to run inference with.
     * </p>
     * 
     * @return The unique identifier of the model to run inference with.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The unique identifier of the model to run inference with.
     * </p>
     * 
     * @param modelId
     *        The unique identifier of the model to run inference with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptFlowNodeInlineConfiguration withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     * </p>
     * 
     * @param templateConfiguration
     *        Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     */

    public void setTemplateConfiguration(PromptTemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     * </p>
     * 
     * @return Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     */

    public PromptTemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * <p>
     * Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     * </p>
     * 
     * @param templateConfiguration
     *        Contains a prompt and variables in the prompt that can be replaced with values at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptFlowNodeInlineConfiguration withTemplateConfiguration(PromptTemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of prompt template.
     * </p>
     * 
     * @param templateType
     *        The type of prompt template.
     * @see PromptTemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of prompt template.
     * </p>
     * 
     * @return The type of prompt template.
     * @see PromptTemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of prompt template.
     * </p>
     * 
     * @param templateType
     *        The type of prompt template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptTemplateType
     */

    public PromptFlowNodeInlineConfiguration withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The type of prompt template.
     * </p>
     * 
     * @param templateType
     *        The type of prompt template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptTemplateType
     */

    public PromptFlowNodeInlineConfiguration withTemplateType(PromptTemplateType templateType) {
        this.templateType = templateType.toString();
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
        if (getInferenceConfiguration() != null)
            sb.append("InferenceConfiguration: ").append(getInferenceConfiguration()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: ").append(getTemplateConfiguration()).append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptFlowNodeInlineConfiguration == false)
            return false;
        PromptFlowNodeInlineConfiguration other = (PromptFlowNodeInlineConfiguration) obj;
        if (other.getInferenceConfiguration() == null ^ this.getInferenceConfiguration() == null)
            return false;
        if (other.getInferenceConfiguration() != null && other.getInferenceConfiguration().equals(this.getInferenceConfiguration()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceConfiguration() == null) ? 0 : getInferenceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public PromptFlowNodeInlineConfiguration clone() {
        try {
            return (PromptFlowNodeInlineConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptFlowNodeInlineConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
