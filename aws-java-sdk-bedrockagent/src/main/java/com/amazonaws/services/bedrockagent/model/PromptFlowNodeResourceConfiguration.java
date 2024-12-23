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
 * Contains configurations for a prompt from Prompt management to use in a node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptFlowNodeResourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptFlowNodeResourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt from Prompt management.
     * </p>
     */
    private String promptArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt from Prompt management.
     * </p>
     * 
     * @param promptArn
     *        The Amazon Resource Name (ARN) of the prompt from Prompt management.
     */

    public void setPromptArn(String promptArn) {
        this.promptArn = promptArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt from Prompt management.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the prompt from Prompt management.
     */

    public String getPromptArn() {
        return this.promptArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt from Prompt management.
     * </p>
     * 
     * @param promptArn
     *        The Amazon Resource Name (ARN) of the prompt from Prompt management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptFlowNodeResourceConfiguration withPromptArn(String promptArn) {
        setPromptArn(promptArn);
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
        if (getPromptArn() != null)
            sb.append("PromptArn: ").append(getPromptArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptFlowNodeResourceConfiguration == false)
            return false;
        PromptFlowNodeResourceConfiguration other = (PromptFlowNodeResourceConfiguration) obj;
        if (other.getPromptArn() == null ^ this.getPromptArn() == null)
            return false;
        if (other.getPromptArn() != null && other.getPromptArn().equals(this.getPromptArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptArn() == null) ? 0 : getPromptArn().hashCode());
        return hashCode;
    }

    @Override
    public PromptFlowNodeResourceConfiguration clone() {
        try {
            return (PromptFlowNodeResourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptFlowNodeResourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
