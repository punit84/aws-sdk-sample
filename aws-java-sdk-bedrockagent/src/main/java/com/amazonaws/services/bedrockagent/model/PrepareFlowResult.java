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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrepareFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If preparation
     * succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes <code>FAILED</code>.
     * </p>
     */
    private String status;

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

    public PrepareFlowResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If preparation
     * succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *        preparation succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes
     *        <code>FAILED</code>.
     * @see FlowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If preparation
     * succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes <code>FAILED</code>.
     * </p>
     * 
     * @return The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *         preparation succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes
     *         <code>FAILED</code>.
     * @see FlowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If preparation
     * succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *        preparation succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public PrepareFlowResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If preparation
     * succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *        preparation succeeds, the status becomes <code>Prepared</code>. If it fails, the status becomes
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public PrepareFlowResult withStatus(FlowStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrepareFlowResult == false)
            return false;
        PrepareFlowResult other = (PrepareFlowResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PrepareFlowResult clone() {
        try {
            return (PrepareFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
