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
 * Contains inference configurations for the prompt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptInferenceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptInferenceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains inference configurations for a text prompt.
     * </p>
     */
    private PromptModelInferenceConfiguration text;

    /**
     * <p>
     * Contains inference configurations for a text prompt.
     * </p>
     * 
     * @param text
     *        Contains inference configurations for a text prompt.
     */

    public void setText(PromptModelInferenceConfiguration text) {
        this.text = text;
    }

    /**
     * <p>
     * Contains inference configurations for a text prompt.
     * </p>
     * 
     * @return Contains inference configurations for a text prompt.
     */

    public PromptModelInferenceConfiguration getText() {
        return this.text;
    }

    /**
     * <p>
     * Contains inference configurations for a text prompt.
     * </p>
     * 
     * @param text
     *        Contains inference configurations for a text prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptInferenceConfiguration withText(PromptModelInferenceConfiguration text) {
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
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptInferenceConfiguration == false)
            return false;
        PromptInferenceConfiguration other = (PromptInferenceConfiguration) obj;
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

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public PromptInferenceConfiguration clone() {
        try {
            return (PromptInferenceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptInferenceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
