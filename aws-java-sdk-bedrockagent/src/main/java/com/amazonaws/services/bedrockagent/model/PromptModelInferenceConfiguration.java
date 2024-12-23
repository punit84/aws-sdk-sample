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
 * Contains inference configurations related to model inference for a prompt. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/inference-parameters.html">Inference parameters</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptModelInferenceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptModelInferenceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of tokens to return in the response.
     * </p>
     */
    private Integer maxTokens;
    /**
     * <p>
     * A list of strings that define sequences after which the model will stop generating.
     * </p>
     */
    private java.util.List<String> stopSequences;
    /**
     * <p>
     * Controls the randomness of the response. Choose a lower value for more predictable outputs and a higher value for
     * more surprising outputs.
     * </p>
     */
    private Float temperature;
    /**
     * <p>
     * The number of most-likely candidates that the model considers for the next token during generation.
     * </p>
     */
    private Integer topK;
    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token.
     * </p>
     */
    private Float topP;

    /**
     * <p>
     * The maximum number of tokens to return in the response.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens to return in the response.
     */

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens to return in the response.
     * </p>
     * 
     * @return The maximum number of tokens to return in the response.
     */

    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens to return in the response.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptModelInferenceConfiguration withMaxTokens(Integer maxTokens) {
        setMaxTokens(maxTokens);
        return this;
    }

    /**
     * <p>
     * A list of strings that define sequences after which the model will stop generating.
     * </p>
     * 
     * @return A list of strings that define sequences after which the model will stop generating.
     */

    public java.util.List<String> getStopSequences() {
        return stopSequences;
    }

    /**
     * <p>
     * A list of strings that define sequences after which the model will stop generating.
     * </p>
     * 
     * @param stopSequences
     *        A list of strings that define sequences after which the model will stop generating.
     */

    public void setStopSequences(java.util.Collection<String> stopSequences) {
        if (stopSequences == null) {
            this.stopSequences = null;
            return;
        }

        this.stopSequences = new java.util.ArrayList<String>(stopSequences);
    }

    /**
     * <p>
     * A list of strings that define sequences after which the model will stop generating.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStopSequences(java.util.Collection)} or {@link #withStopSequences(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stopSequences
     *        A list of strings that define sequences after which the model will stop generating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptModelInferenceConfiguration withStopSequences(String... stopSequences) {
        if (this.stopSequences == null) {
            setStopSequences(new java.util.ArrayList<String>(stopSequences.length));
        }
        for (String ele : stopSequences) {
            this.stopSequences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings that define sequences after which the model will stop generating.
     * </p>
     * 
     * @param stopSequences
     *        A list of strings that define sequences after which the model will stop generating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptModelInferenceConfiguration withStopSequences(java.util.Collection<String> stopSequences) {
        setStopSequences(stopSequences);
        return this;
    }

    /**
     * <p>
     * Controls the randomness of the response. Choose a lower value for more predictable outputs and a higher value for
     * more surprising outputs.
     * </p>
     * 
     * @param temperature
     *        Controls the randomness of the response. Choose a lower value for more predictable outputs and a higher
     *        value for more surprising outputs.
     */

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    /**
     * <p>
     * Controls the randomness of the response. Choose a lower value for more predictable outputs and a higher value for
     * more surprising outputs.
     * </p>
     * 
     * @return Controls the randomness of the response. Choose a lower value for more predictable outputs and a higher
     *         value for more surprising outputs.
     */

    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * <p>
     * Controls the randomness of the response. Choose a lower value for more predictable outputs and a higher value for
     * more surprising outputs.
     * </p>
     * 
     * @param temperature
     *        Controls the randomness of the response. Choose a lower value for more predictable outputs and a higher
     *        value for more surprising outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptModelInferenceConfiguration withTemperature(Float temperature) {
        setTemperature(temperature);
        return this;
    }

    /**
     * <p>
     * The number of most-likely candidates that the model considers for the next token during generation.
     * </p>
     * 
     * @param topK
     *        The number of most-likely candidates that the model considers for the next token during generation.
     */

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    /**
     * <p>
     * The number of most-likely candidates that the model considers for the next token during generation.
     * </p>
     * 
     * @return The number of most-likely candidates that the model considers for the next token during generation.
     */

    public Integer getTopK() {
        return this.topK;
    }

    /**
     * <p>
     * The number of most-likely candidates that the model considers for the next token during generation.
     * </p>
     * 
     * @param topK
     *        The number of most-likely candidates that the model considers for the next token during generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptModelInferenceConfiguration withTopK(Integer topK) {
        setTopK(topK);
        return this;
    }

    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token.
     * </p>
     * 
     * @param topP
     *        The percentage of most-likely candidates that the model considers for the next token.
     */

    public void setTopP(Float topP) {
        this.topP = topP;
    }

    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token.
     * </p>
     * 
     * @return The percentage of most-likely candidates that the model considers for the next token.
     */

    public Float getTopP() {
        return this.topP;
    }

    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token.
     * </p>
     * 
     * @param topP
     *        The percentage of most-likely candidates that the model considers for the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptModelInferenceConfiguration withTopP(Float topP) {
        setTopP(topP);
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
        if (getMaxTokens() != null)
            sb.append("MaxTokens: ").append(getMaxTokens()).append(",");
        if (getStopSequences() != null)
            sb.append("StopSequences: ").append(getStopSequences()).append(",");
        if (getTemperature() != null)
            sb.append("Temperature: ").append(getTemperature()).append(",");
        if (getTopK() != null)
            sb.append("TopK: ").append(getTopK()).append(",");
        if (getTopP() != null)
            sb.append("TopP: ").append(getTopP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptModelInferenceConfiguration == false)
            return false;
        PromptModelInferenceConfiguration other = (PromptModelInferenceConfiguration) obj;
        if (other.getMaxTokens() == null ^ this.getMaxTokens() == null)
            return false;
        if (other.getMaxTokens() != null && other.getMaxTokens().equals(this.getMaxTokens()) == false)
            return false;
        if (other.getStopSequences() == null ^ this.getStopSequences() == null)
            return false;
        if (other.getStopSequences() != null && other.getStopSequences().equals(this.getStopSequences()) == false)
            return false;
        if (other.getTemperature() == null ^ this.getTemperature() == null)
            return false;
        if (other.getTemperature() != null && other.getTemperature().equals(this.getTemperature()) == false)
            return false;
        if (other.getTopK() == null ^ this.getTopK() == null)
            return false;
        if (other.getTopK() != null && other.getTopK().equals(this.getTopK()) == false)
            return false;
        if (other.getTopP() == null ^ this.getTopP() == null)
            return false;
        if (other.getTopP() != null && other.getTopP().equals(this.getTopP()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxTokens() == null) ? 0 : getMaxTokens().hashCode());
        hashCode = prime * hashCode + ((getStopSequences() == null) ? 0 : getStopSequences().hashCode());
        hashCode = prime * hashCode + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        hashCode = prime * hashCode + ((getTopK() == null) ? 0 : getTopK().hashCode());
        hashCode = prime * hashCode + ((getTopP() == null) ? 0 : getTopP().hashCode());
        return hashCode;
    }

    @Override
    public PromptModelInferenceConfiguration clone() {
        try {
            return (PromptModelInferenceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptModelInferenceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
