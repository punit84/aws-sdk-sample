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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteFlowAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFlowAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     */
    private String flowId;
    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     * 
     * @param flowId
     *        The unique identifier of the flow that the alias belongs to.
     */

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     * 
     * @return The unique identifier of the flow that the alias belongs to.
     */

    public String getFlowId() {
        return this.flowId;
    }

    /**
     * <p>
     * The unique identifier of the flow that the alias belongs to.
     * </p>
     * 
     * @param flowId
     *        The unique identifier of the flow that the alias belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowAliasResult withFlowId(String flowId) {
        setFlowId(flowId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param id
     *        The unique identifier of the flow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @return The unique identifier of the flow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param id
     *        The unique identifier of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowAliasResult withId(String id) {
        setId(id);
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
        if (getFlowId() != null)
            sb.append("FlowId: ").append(getFlowId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlowAliasResult == false)
            return false;
        DeleteFlowAliasResult other = (DeleteFlowAliasResult) obj;
        if (other.getFlowId() == null ^ this.getFlowId() == null)
            return false;
        if (other.getFlowId() != null && other.getFlowId().equals(this.getFlowId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFlowAliasResult clone() {
        try {
            return (DeleteFlowAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
