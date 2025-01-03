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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentKnowledgeBaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about the knowledge base that has been associated with an agent.
     * </p>
     */
    private AgentKnowledgeBase agentKnowledgeBase;

    /**
     * <p>
     * Contains details about the knowledge base that has been associated with an agent.
     * </p>
     * 
     * @param agentKnowledgeBase
     *        Contains details about the knowledge base that has been associated with an agent.
     */

    public void setAgentKnowledgeBase(AgentKnowledgeBase agentKnowledgeBase) {
        this.agentKnowledgeBase = agentKnowledgeBase;
    }

    /**
     * <p>
     * Contains details about the knowledge base that has been associated with an agent.
     * </p>
     * 
     * @return Contains details about the knowledge base that has been associated with an agent.
     */

    public AgentKnowledgeBase getAgentKnowledgeBase() {
        return this.agentKnowledgeBase;
    }

    /**
     * <p>
     * Contains details about the knowledge base that has been associated with an agent.
     * </p>
     * 
     * @param agentKnowledgeBase
     *        Contains details about the knowledge base that has been associated with an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentKnowledgeBaseResult withAgentKnowledgeBase(AgentKnowledgeBase agentKnowledgeBase) {
        setAgentKnowledgeBase(agentKnowledgeBase);
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
        if (getAgentKnowledgeBase() != null)
            sb.append("AgentKnowledgeBase: ").append(getAgentKnowledgeBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentKnowledgeBaseResult == false)
            return false;
        UpdateAgentKnowledgeBaseResult other = (UpdateAgentKnowledgeBaseResult) obj;
        if (other.getAgentKnowledgeBase() == null ^ this.getAgentKnowledgeBase() == null)
            return false;
        if (other.getAgentKnowledgeBase() != null && other.getAgentKnowledgeBase().equals(this.getAgentKnowledgeBase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentKnowledgeBase() == null) ? 0 : getAgentKnowledgeBase().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentKnowledgeBaseResult clone() {
        try {
            return (UpdateAgentKnowledgeBaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
