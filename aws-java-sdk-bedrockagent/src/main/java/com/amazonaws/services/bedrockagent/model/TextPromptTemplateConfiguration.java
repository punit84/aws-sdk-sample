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
 * Contains configurations for a text prompt template. To include a variable, enclose a word in double curly braces as
 * in <code>{{variable}}</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TextPromptTemplateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextPromptTemplateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of the variables in the prompt template.
     * </p>
     */
    private java.util.List<PromptInputVariable> inputVariables;
    /**
     * <p>
     * The message for the prompt.
     * </p>
     */
    private String text;

    /**
     * <p>
     * An array of the variables in the prompt template.
     * </p>
     * 
     * @return An array of the variables in the prompt template.
     */

    public java.util.List<PromptInputVariable> getInputVariables() {
        return inputVariables;
    }

    /**
     * <p>
     * An array of the variables in the prompt template.
     * </p>
     * 
     * @param inputVariables
     *        An array of the variables in the prompt template.
     */

    public void setInputVariables(java.util.Collection<PromptInputVariable> inputVariables) {
        if (inputVariables == null) {
            this.inputVariables = null;
            return;
        }

        this.inputVariables = new java.util.ArrayList<PromptInputVariable>(inputVariables);
    }

    /**
     * <p>
     * An array of the variables in the prompt template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputVariables(java.util.Collection)} or {@link #withInputVariables(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputVariables
     *        An array of the variables in the prompt template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextPromptTemplateConfiguration withInputVariables(PromptInputVariable... inputVariables) {
        if (this.inputVariables == null) {
            setInputVariables(new java.util.ArrayList<PromptInputVariable>(inputVariables.length));
        }
        for (PromptInputVariable ele : inputVariables) {
            this.inputVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the variables in the prompt template.
     * </p>
     * 
     * @param inputVariables
     *        An array of the variables in the prompt template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextPromptTemplateConfiguration withInputVariables(java.util.Collection<PromptInputVariable> inputVariables) {
        setInputVariables(inputVariables);
        return this;
    }

    /**
     * <p>
     * The message for the prompt.
     * </p>
     * 
     * @param text
     *        The message for the prompt.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The message for the prompt.
     * </p>
     * 
     * @return The message for the prompt.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The message for the prompt.
     * </p>
     * 
     * @param text
     *        The message for the prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextPromptTemplateConfiguration withText(String text) {
        setText(text);
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
        if (getInputVariables() != null)
            sb.append("InputVariables: ").append("***Sensitive Data Redacted***").append(",");
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextPromptTemplateConfiguration == false)
            return false;
        TextPromptTemplateConfiguration other = (TextPromptTemplateConfiguration) obj;
        if (other.getInputVariables() == null ^ this.getInputVariables() == null)
            return false;
        if (other.getInputVariables() != null && other.getInputVariables().equals(this.getInputVariables()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputVariables() == null) ? 0 : getInputVariables().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public TextPromptTemplateConfiguration clone() {
        try {
            return (TextPromptTemplateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.TextPromptTemplateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
