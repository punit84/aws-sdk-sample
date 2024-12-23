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
 * Contains the definition of a flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of the flow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the flow. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the flow, you
     * can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest changes for
     * testing. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a> request
     * to package the latest changes into the <code>DRAFT</code> version.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes for
     * testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – The last API operation that you invoked on the flow failed. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request and
     * check the error message in the <code>validations</code> field.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time at which the flow was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The latest version of the flow.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the flow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the flow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the flow was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     * 
     * @return The time at which the flow was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the flow was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the flow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of the flow.
     * </p>
     * 
     * @param description
     *        A description of the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the flow.
     * </p>
     * 
     * @return A description of the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the flow.
     * </p>
     * 
     * @param description
     *        A description of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowSummary withDescription(String description) {
        setDescription(description);
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

    public FlowSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * 
     * @param name
     *        The name of the flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * 
     * @return The name of the flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * 
     * @param name
     *        The name of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the flow. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the flow, you
     * can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest changes for
     * testing. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a> request
     * to package the latest changes into the <code>DRAFT</code> version.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes for
     * testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – The last API operation that you invoked on the flow failed. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request and
     * check the error message in the <code>validations</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the flow. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the
     *        flow, you can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest
     *        changes for testing. Send a <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a>
     *        request to package the latest changes into the <code>DRAFT</code> version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes
     *        for testing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for
     *        testing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed – The last API operation that you invoked on the flow failed. Send a <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request
     *        and check the error message in the <code>validations</code> field.
     *        </p>
     *        </li>
     * @see FlowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flow. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the flow, you
     * can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest changes for
     * testing. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a> request
     * to package the latest changes into the <code>DRAFT</code> version.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes for
     * testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – The last API operation that you invoked on the flow failed. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request and
     * check the error message in the <code>validations</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the flow. The following statuses are possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the
     *         flow, you can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest
     *         changes for testing. Send a <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a>
     *         request to package the latest changes into the <code>DRAFT</code> version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes
     *         for testing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for
     *         testing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed – The last API operation that you invoked on the flow failed. Send a <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request
     *         and check the error message in the <code>validations</code> field.
     *         </p>
     *         </li>
     * @see FlowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the flow. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the flow, you
     * can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest changes for
     * testing. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a> request
     * to package the latest changes into the <code>DRAFT</code> version.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes for
     * testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – The last API operation that you invoked on the flow failed. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request and
     * check the error message in the <code>validations</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the flow. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the
     *        flow, you can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest
     *        changes for testing. Send a <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a>
     *        request to package the latest changes into the <code>DRAFT</code> version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes
     *        for testing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for
     *        testing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed – The last API operation that you invoked on the flow failed. Send a <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request
     *        and check the error message in the <code>validations</code> field.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public FlowSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the flow. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the flow, you
     * can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest changes for
     * testing. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a> request
     * to package the latest changes into the <code>DRAFT</code> version.
     * </p>
     * </li>
     * <li>
     * <p>
     * Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes for
     * testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for testing.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – The last API operation that you invoked on the flow failed. Send a <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request and
     * check the error message in the <code>validations</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the flow. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        NotPrepared – The flow has been created or updated, but hasn't been prepared. If you just created the
     *        flow, you can't test it. If you updated the flow, the <code>DRAFT</code> version won't contain the latest
     *        changes for testing. Send a <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PrepareFlow.html">PrepareFlow</a>
     *        request to package the latest changes into the <code>DRAFT</code> version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Preparing – The flow is being prepared so that the <code>DRAFT</code> version contains the latest changes
     *        for testing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Prepared – The flow is prepared and the <code>DRAFT</code> version contains the latest changes for
     *        testing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed – The last API operation that you invoked on the flow failed. Send a <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html">GetFlow</a> request
     *        and check the error message in the <code>validations</code> field.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public FlowSummary withStatus(FlowStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the flow was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the flow was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the flow was last updated.
     * </p>
     * 
     * @return The time at which the flow was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the flow was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the flow was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The latest version of the flow.
     * </p>
     * 
     * @param version
     *        The latest version of the flow.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The latest version of the flow.
     * </p>
     * 
     * @return The latest version of the flow.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The latest version of the flow.
     * </p>
     * 
     * @param version
     *        The latest version of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowSummary withVersion(String version) {
        setVersion(version);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowSummary == false)
            return false;
        FlowSummary other = (FlowSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public FlowSummary clone() {
        try {
            return (FlowSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
