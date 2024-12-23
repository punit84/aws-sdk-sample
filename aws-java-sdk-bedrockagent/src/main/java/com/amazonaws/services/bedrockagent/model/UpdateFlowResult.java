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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The Amazon Resource Name (ARN) of the KMS key that the flow was encrypted with.
     * </p>
     */
    private String customerEncryptionKeyArn;
    /**
     * <p>
     * A definition of the nodes and the connections between nodes in the flow.
     * </p>
     */
    private FlowDefinition definition;
    /**
     * <p>
     * The description of the flow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create a flow. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role for
     * flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     */
    private String executionRoleArn;
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
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If updating
     * fails, the status becomes <code>Failed</code>.
     * </p>
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
     * The version of the flow. When you update a flow, the version updated is the <code>DRAFT</code> version.
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

    public UpdateFlowResult withArn(String arn) {
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

    public UpdateFlowResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that the flow was encrypted with.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key that the flow was encrypted with.
     */

    public void setCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        this.customerEncryptionKeyArn = customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that the flow was encrypted with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key that the flow was encrypted with.
     */

    public String getCustomerEncryptionKeyArn() {
        return this.customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that the flow was encrypted with.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key that the flow was encrypted with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowResult withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * A definition of the nodes and the connections between nodes in the flow.
     * </p>
     * 
     * @param definition
     *        A definition of the nodes and the connections between nodes in the flow.
     */

    public void setDefinition(FlowDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A definition of the nodes and the connections between nodes in the flow.
     * </p>
     * 
     * @return A definition of the nodes and the connections between nodes in the flow.
     */

    public FlowDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * A definition of the nodes and the connections between nodes in the flow.
     * </p>
     * 
     * @param definition
     *        A definition of the nodes and the connections between nodes in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowResult withDefinition(FlowDefinition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     * 
     * @param description
     *        The description of the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     * 
     * @return The description of the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     * 
     * @param description
     *        The description of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create a flow. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role for
     * flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the service role with permissions to create a flow. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role
     *        for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create a flow. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role for
     * flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service role with permissions to create a flow. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role
     *         for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create a flow. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role for
     * flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the service role with permissions to create a flow. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role
     *        for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowResult withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
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

    public UpdateFlowResult withId(String id) {
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

    public UpdateFlowResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If updating
     * fails, the status becomes <code>Failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *        updating fails, the status becomes <code>Failed</code>.
     * @see FlowStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If updating
     * fails, the status becomes <code>Failed</code>.
     * </p>
     * 
     * @return The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *         updating fails, the status becomes <code>Failed</code>.
     * @see FlowStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If updating
     * fails, the status becomes <code>Failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *        updating fails, the status becomes <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public UpdateFlowResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If updating
     * fails, the status becomes <code>Failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the flow. When you submit this request, the status will be <code>NotPrepared</code>. If
     *        updating fails, the status becomes <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public UpdateFlowResult withStatus(FlowStatus status) {
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

    public UpdateFlowResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The version of the flow. When you update a flow, the version updated is the <code>DRAFT</code> version.
     * </p>
     * 
     * @param version
     *        The version of the flow. When you update a flow, the version updated is the <code>DRAFT</code> version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the flow. When you update a flow, the version updated is the <code>DRAFT</code> version.
     * </p>
     * 
     * @return The version of the flow. When you update a flow, the version updated is the <code>DRAFT</code> version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the flow. When you update a flow, the version updated is the <code>DRAFT</code> version.
     * </p>
     * 
     * @param version
     *        The version of the flow. When you update a flow, the version updated is the <code>DRAFT</code> version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowResult withVersion(String version) {
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
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
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

        if (obj instanceof UpdateFlowResult == false)
            return false;
        UpdateFlowResult other = (UpdateFlowResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCustomerEncryptionKeyArn() == null ^ this.getCustomerEncryptionKeyArn() == null)
            return false;
        if (other.getCustomerEncryptionKeyArn() != null && other.getCustomerEncryptionKeyArn().equals(this.getCustomerEncryptionKeyArn()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowResult clone() {
        try {
            return (UpdateFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
