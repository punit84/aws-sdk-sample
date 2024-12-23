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
 * Contains information about validation of the flow.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlow.html#API_agent_GetFlow_ResponseSyntax"
 * >GetFlow response</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetFlowVersion.html#API_agent_GetFlowVersion_ResponseSyntax"
 * >GetFlowVersion response</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowValidation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowValidation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A message describing the validation error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The severity of the issue described in the message.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * A message describing the validation error.
     * </p>
     * 
     * @param message
     *        A message describing the validation error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing the validation error.
     * </p>
     * 
     * @return A message describing the validation error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message describing the validation error.
     * </p>
     * 
     * @param message
     *        A message describing the validation error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowValidation withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The severity of the issue described in the message.
     * </p>
     * 
     * @param severity
     *        The severity of the issue described in the message.
     * @see FlowValidationSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the issue described in the message.
     * </p>
     * 
     * @return The severity of the issue described in the message.
     * @see FlowValidationSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the issue described in the message.
     * </p>
     * 
     * @param severity
     *        The severity of the issue described in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowValidationSeverity
     */

    public FlowValidation withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the issue described in the message.
     * </p>
     * 
     * @param severity
     *        The severity of the issue described in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowValidationSeverity
     */

    public FlowValidation withSeverity(FlowValidationSeverity severity) {
        this.severity = severity.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowValidation == false)
            return false;
        FlowValidation other = (FlowValidation) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public FlowValidation clone() {
        try {
            return (FlowValidation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowValidationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
