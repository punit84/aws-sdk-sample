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
 * The configuration of a connection between a condition node and another node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowConditionalConnectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowConditionalConnectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The condition that triggers this connection. For more information about how to write conditions, see the
     * <b>Condition</b> node type in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html">Node types</a> topic in the Amazon
     * Bedrock User Guide.
     * </p>
     */
    private String condition;

    /**
     * <p>
     * The condition that triggers this connection. For more information about how to write conditions, see the
     * <b>Condition</b> node type in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html">Node types</a> topic in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param condition
     *        The condition that triggers this connection. For more information about how to write conditions, see the
     *        <b>Condition</b> node type in the <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html">Node types</a> topic in the
     *        Amazon Bedrock User Guide.
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition that triggers this connection. For more information about how to write conditions, see the
     * <b>Condition</b> node type in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html">Node types</a> topic in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @return The condition that triggers this connection. For more information about how to write conditions, see the
     *         <b>Condition</b> node type in the <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html">Node types</a> topic in the
     *         Amazon Bedrock User Guide.
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition that triggers this connection. For more information about how to write conditions, see the
     * <b>Condition</b> node type in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html">Node types</a> topic in the Amazon
     * Bedrock User Guide.
     * </p>
     * 
     * @param condition
     *        The condition that triggers this connection. For more information about how to write conditions, see the
     *        <b>Condition</b> node type in the <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/node-types.html">Node types</a> topic in the
     *        Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowConditionalConnectionConfiguration withCondition(String condition) {
        setCondition(condition);
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowConditionalConnectionConfiguration == false)
            return false;
        FlowConditionalConnectionConfiguration other = (FlowConditionalConnectionConfiguration) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public FlowConditionalConnectionConfiguration clone() {
        try {
            return (FlowConditionalConnectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowConditionalConnectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
