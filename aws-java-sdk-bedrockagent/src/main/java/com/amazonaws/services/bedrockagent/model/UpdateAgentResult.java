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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about the agent that was updated.
     * </p>
     */
    private Agent agent;

    /**
     * <p>
     * Contains details about the agent that was updated.
     * </p>
     * 
     * @param agent
     *        Contains details about the agent that was updated.
     */

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    /**
     * <p>
     * Contains details about the agent that was updated.
     * </p>
     * 
     * @return Contains details about the agent that was updated.
     */

    public Agent getAgent() {
        return this.agent;
    }

    /**
     * <p>
     * Contains details about the agent that was updated.
     * </p>
     * 
     * @param agent
     *        Contains details about the agent that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentResult withAgent(Agent agent) {
        setAgent(agent);
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
        if (getAgent() != null)
            sb.append("Agent: ").append(getAgent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentResult == false)
            return false;
        UpdateAgentResult other = (UpdateAgentResult) obj;
        if (other.getAgent() == null ^ this.getAgent() == null)
            return false;
        if (other.getAgent() != null && other.getAgent().equals(this.getAgent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgent() == null) ? 0 : getAgent().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentResult clone() {
        try {
            return (UpdateAgentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
