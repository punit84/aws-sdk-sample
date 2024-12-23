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
 * Defines an agent node in your flow. You specify the agent to invoke at this point in the flow. For more information,
 * see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html">Node types in Amazon Bedrock
 * works</a> in the Amazon Bedrock User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentFlowNodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentFlowNodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     * </p>
     */
    private String agentAliasArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     * </p>
     * 
     * @param agentAliasArn
     *        The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     */

    public void setAgentAliasArn(String agentAliasArn) {
        this.agentAliasArn = agentAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     */

    public String getAgentAliasArn() {
        return this.agentAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     * </p>
     * 
     * @param agentAliasArn
     *        The Amazon Resource Name (ARN) of the alias of the agent to invoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentFlowNodeConfiguration withAgentAliasArn(String agentAliasArn) {
        setAgentAliasArn(agentAliasArn);
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
        if (getAgentAliasArn() != null)
            sb.append("AgentAliasArn: ").append(getAgentAliasArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentFlowNodeConfiguration == false)
            return false;
        AgentFlowNodeConfiguration other = (AgentFlowNodeConfiguration) obj;
        if (other.getAgentAliasArn() == null ^ this.getAgentAliasArn() == null)
            return false;
        if (other.getAgentAliasArn() != null && other.getAgentAliasArn().equals(this.getAgentAliasArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentAliasArn() == null) ? 0 : getAgentAliasArn().hashCode());
        return hashCode;
    }

    @Override
    public AgentFlowNodeConfiguration clone() {
        try {
            return (AgentFlowNodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentFlowNodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
