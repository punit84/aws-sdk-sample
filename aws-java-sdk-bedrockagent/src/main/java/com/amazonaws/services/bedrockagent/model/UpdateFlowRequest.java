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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to encrypt the flow.
     * </p>
     */
    private String customerEncryptionKeyArn;
    /**
     * <p>
     * A definition of the nodes and the connections between the nodes in the flow.
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
     * The unique identifier of the flow.
     * </p>
     */
    private String flowIdentifier;
    /**
     * <p>
     * A name for the flow.
     * </p>
     */
    private String name;

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

    public UpdateFlowRequest withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * A definition of the nodes and the connections between the nodes in the flow.
     * </p>
     * 
     * @param definition
     *        A definition of the nodes and the connections between the nodes in the flow.
     */

    public void setDefinition(FlowDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A definition of the nodes and the connections between the nodes in the flow.
     * </p>
     * 
     * @return A definition of the nodes and the connections between the nodes in the flow.
     */

    public FlowDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * A definition of the nodes and the connections between the nodes in the flow.
     * </p>
     * 
     * @param definition
     *        A definition of the nodes and the connections between the nodes in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowRequest withDefinition(FlowDefinition definition) {
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

    public UpdateFlowRequest withDescription(String description) {
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

    public UpdateFlowRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow.
     */

    public void setFlowIdentifier(String flowIdentifier) {
        this.flowIdentifier = flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @return The unique identifier of the flow.
     */

    public String getFlowIdentifier() {
        return this.flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowRequest withFlowIdentifier(String flowIdentifier) {
        setFlowIdentifier(flowIdentifier);
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

    public UpdateFlowRequest withName(String name) {
        setName(name);
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
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getFlowIdentifier() != null)
            sb.append("FlowIdentifier: ").append(getFlowIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlowRequest == false)
            return false;
        UpdateFlowRequest other = (UpdateFlowRequest) obj;
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
        if (other.getFlowIdentifier() == null ^ this.getFlowIdentifier() == null)
            return false;
        if (other.getFlowIdentifier() != null && other.getFlowIdentifier().equals(this.getFlowIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFlowIdentifier() == null) ? 0 : getFlowIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowRequest clone() {
        return (UpdateFlowRequest) super.clone();
    }

}
