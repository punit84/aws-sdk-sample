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
 * Contains configurations for a prompt and whether it is from Prompt management or defined inline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptFlowNodeSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptFlowNodeSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configurations for a prompt that is defined inline
     * </p>
     */
    private PromptFlowNodeInlineConfiguration inline;
    /**
     * <p>
     * Contains configurations for a prompt from Prompt management.
     * </p>
     */
    private PromptFlowNodeResourceConfiguration resource;

    /**
     * <p>
     * Contains configurations for a prompt that is defined inline
     * </p>
     * 
     * @param inline
     *        Contains configurations for a prompt that is defined inline
     */

    public void setInline(PromptFlowNodeInlineConfiguration inline) {
        this.inline = inline;
    }

    /**
     * <p>
     * Contains configurations for a prompt that is defined inline
     * </p>
     * 
     * @return Contains configurations for a prompt that is defined inline
     */

    public PromptFlowNodeInlineConfiguration getInline() {
        return this.inline;
    }

    /**
     * <p>
     * Contains configurations for a prompt that is defined inline
     * </p>
     * 
     * @param inline
     *        Contains configurations for a prompt that is defined inline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptFlowNodeSourceConfiguration withInline(PromptFlowNodeInlineConfiguration inline) {
        setInline(inline);
        return this;
    }

    /**
     * <p>
     * Contains configurations for a prompt from Prompt management.
     * </p>
     * 
     * @param resource
     *        Contains configurations for a prompt from Prompt management.
     */

    public void setResource(PromptFlowNodeResourceConfiguration resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * Contains configurations for a prompt from Prompt management.
     * </p>
     * 
     * @return Contains configurations for a prompt from Prompt management.
     */

    public PromptFlowNodeResourceConfiguration getResource() {
        return this.resource;
    }

    /**
     * <p>
     * Contains configurations for a prompt from Prompt management.
     * </p>
     * 
     * @param resource
     *        Contains configurations for a prompt from Prompt management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptFlowNodeSourceConfiguration withResource(PromptFlowNodeResourceConfiguration resource) {
        setResource(resource);
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
        if (getInline() != null)
            sb.append("Inline: ").append(getInline()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptFlowNodeSourceConfiguration == false)
            return false;
        PromptFlowNodeSourceConfiguration other = (PromptFlowNodeSourceConfiguration) obj;
        if (other.getInline() == null ^ this.getInline() == null)
            return false;
        if (other.getInline() != null && other.getInline().equals(this.getInline()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInline() == null) ? 0 : getInline().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public PromptFlowNodeSourceConfiguration clone() {
        try {
            return (PromptFlowNodeSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptFlowNodeSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
