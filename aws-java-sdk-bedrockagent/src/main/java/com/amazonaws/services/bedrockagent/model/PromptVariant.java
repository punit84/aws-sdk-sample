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
 * Contains details about a variant of the prompt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptVariant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptVariant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains inference configurations for the prompt variant.
     * </p>
     */
    private PromptInferenceConfiguration inferenceConfiguration;
    /**
     * <p>
     * The unique identifier of the model with which to run inference on the prompt.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The name of the prompt variant.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains configurations for the prompt template.
     * </p>
     */
    private PromptTemplateConfiguration templateConfiguration;
    /**
     * <p>
     * The type of prompt template to use.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * Contains inference configurations for the prompt variant.
     * </p>
     * 
     * @param inferenceConfiguration
     *        Contains inference configurations for the prompt variant.
     */

    public void setInferenceConfiguration(PromptInferenceConfiguration inferenceConfiguration) {
        this.inferenceConfiguration = inferenceConfiguration;
    }

    /**
     * <p>
     * Contains inference configurations for the prompt variant.
     * </p>
     * 
     * @return Contains inference configurations for the prompt variant.
     */

    public PromptInferenceConfiguration getInferenceConfiguration() {
        return this.inferenceConfiguration;
    }

    /**
     * <p>
     * Contains inference configurations for the prompt variant.
     * </p>
     * 
     * @param inferenceConfiguration
     *        Contains inference configurations for the prompt variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptVariant withInferenceConfiguration(PromptInferenceConfiguration inferenceConfiguration) {
        setInferenceConfiguration(inferenceConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the model with which to run inference on the prompt.
     * </p>
     * 
     * @param modelId
     *        The unique identifier of the model with which to run inference on the prompt.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The unique identifier of the model with which to run inference on the prompt.
     * </p>
     * 
     * @return The unique identifier of the model with which to run inference on the prompt.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The unique identifier of the model with which to run inference on the prompt.
     * </p>
     * 
     * @param modelId
     *        The unique identifier of the model with which to run inference on the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptVariant withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The name of the prompt variant.
     * </p>
     * 
     * @param name
     *        The name of the prompt variant.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the prompt variant.
     * </p>
     * 
     * @return The name of the prompt variant.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the prompt variant.
     * </p>
     * 
     * @param name
     *        The name of the prompt variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptVariant withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains configurations for the prompt template.
     * </p>
     * 
     * @param templateConfiguration
     *        Contains configurations for the prompt template.
     */

    public void setTemplateConfiguration(PromptTemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the prompt template.
     * </p>
     * 
     * @return Contains configurations for the prompt template.
     */

    public PromptTemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * <p>
     * Contains configurations for the prompt template.
     * </p>
     * 
     * @param templateConfiguration
     *        Contains configurations for the prompt template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptVariant withTemplateConfiguration(PromptTemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of prompt template to use.
     * </p>
     * 
     * @param templateType
     *        The type of prompt template to use.
     * @see PromptTemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of prompt template to use.
     * </p>
     * 
     * @return The type of prompt template to use.
     * @see PromptTemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of prompt template to use.
     * </p>
     * 
     * @param templateType
     *        The type of prompt template to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptTemplateType
     */

    public PromptVariant withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The type of prompt template to use.
     * </p>
     * 
     * @param templateType
     *        The type of prompt template to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptTemplateType
     */

    public PromptVariant withTemplateType(PromptTemplateType templateType) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof PromptVariant == false)
            return false;
        PromptVariant other = (PromptVariant) obj;
        if (other.getInferenceConfiguration() == null ^ this.getInferenceConfiguration() == null)
            return false;
        if (other.getInferenceConfiguration() != null && other.getInferenceConfiguration().equals(this.getInferenceConfiguration()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public PromptVariant clone() {
        try {
            return (PromptVariant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptVariantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
