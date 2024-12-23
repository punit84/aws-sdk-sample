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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     * </p>
     */
    private String customerEncryptionKeyArn;
    /**
     * <p>
     * A definition of the nodes and connections between nodes in the flow.
     * </p>
     */
    private FlowDefinition definition;
    /**
     * <p>
     * A description for the flow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create and manage a flow. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a
     * service role for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * A name for the flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Any tags that you want to attach to the flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     */

    public void setCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        this.customerEncryptionKeyArn = customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     */

    public String getCustomerEncryptionKeyArn() {
        return this.customerEncryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     * </p>
     * 
     * @param customerEncryptionKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * A definition of the nodes and connections between nodes in the flow.
     * </p>
     * 
     * @param definition
     *        A definition of the nodes and connections between nodes in the flow.
     */

    public void setDefinition(FlowDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A definition of the nodes and connections between nodes in the flow.
     * </p>
     * 
     * @return A definition of the nodes and connections between nodes in the flow.
     */

    public FlowDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * A definition of the nodes and connections between nodes in the flow.
     * </p>
     * 
     * @param definition
     *        A definition of the nodes and connections between nodes in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withDefinition(FlowDefinition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * A description for the flow.
     * </p>
     * 
     * @param description
     *        A description for the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the flow.
     * </p>
     * 
     * @return A description for the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the flow.
     * </p>
     * 
     * @param description
     *        A description for the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create and manage a flow. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a
     * service role for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the service role with permissions to create and manage a flow. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role
     *        for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create and manage a flow. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a
     * service role for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service role with permissions to create and manage a flow. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role
     *         for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role with permissions to create and manage a flow. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a
     * service role for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the service role with permissions to create and manage a flow. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-permissions.html">Create a service role
     *        for flows in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * A name for the flow.
     * </p>
     * 
     * @param name
     *        A name for the flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the flow.
     * </p>
     * 
     * @return A name for the flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the flow.
     * </p>
     * 
     * @param name
     *        A name for the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Any tags that you want to attach to the flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     * 
     * @return Any tags that you want to attach to the flow. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon
     *         Bedrock</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags that you want to attach to the flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     * 
     * @param tags
     *        Any tags that you want to attach to the flow. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon
     *        Bedrock</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Any tags that you want to attach to the flow. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon Bedrock</a>.
     * </p>
     * 
     * @param tags
     *        Any tags that you want to attach to the flow. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/tagging.html">Tagging resources in Amazon
     *        Bedrock</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFlowRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowRequest == false)
            return false;
        CreateFlowRequest other = (CreateFlowRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowRequest clone() {
        return (CreateFlowRequest) super.clone();
    }

}
