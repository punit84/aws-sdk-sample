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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateFlowVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A description of the version of the flow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the flow that you want to create a version of.
     * </p>
     */
    private String flowIdentifier;

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

    public CreateFlowVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description of the version of the flow.
     * </p>
     * 
     * @param description
     *        A description of the version of the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the version of the flow.
     * </p>
     * 
     * @return A description of the version of the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the version of the flow.
     * </p>
     * 
     * @param description
     *        A description of the version of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the flow that you want to create a version of.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow that you want to create a version of.
     */

    public void setFlowIdentifier(String flowIdentifier) {
        this.flowIdentifier = flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow that you want to create a version of.
     * </p>
     * 
     * @return The unique identifier of the flow that you want to create a version of.
     */

    public String getFlowIdentifier() {
        return this.flowIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the flow that you want to create a version of.
     * </p>
     * 
     * @param flowIdentifier
     *        The unique identifier of the flow that you want to create a version of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowVersionRequest withFlowIdentifier(String flowIdentifier) {
        setFlowIdentifier(flowIdentifier);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFlowIdentifier() != null)
            sb.append("FlowIdentifier: ").append(getFlowIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowVersionRequest == false)
            return false;
        CreateFlowVersionRequest other = (CreateFlowVersionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFlowIdentifier() == null ^ this.getFlowIdentifier() == null)
            return false;
        if (other.getFlowIdentifier() != null && other.getFlowIdentifier().equals(this.getFlowIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFlowIdentifier() == null) ? 0 : getFlowIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowVersionRequest clone() {
        return (CreateFlowVersionRequest) super.clone();
    }

}
