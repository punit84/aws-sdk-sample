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
 * Defines a condition in the condition node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the condition. You must refer to at least one of the inputs in the condition. For more information,
     * expand the Condition node section in <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes">Node types in
     * prompt flows</a>.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * A name for the condition that you can reference.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Defines the condition. You must refer to at least one of the inputs in the condition. For more information,
     * expand the Condition node section in <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes">Node types in
     * prompt flows</a>.
     * </p>
     * 
     * @param expression
     *        Defines the condition. You must refer to at least one of the inputs in the condition. For more
     *        information, expand the Condition node section in <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes">Node types
     *        in prompt flows</a>.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * Defines the condition. You must refer to at least one of the inputs in the condition. For more information,
     * expand the Condition node section in <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes">Node types in
     * prompt flows</a>.
     * </p>
     * 
     * @return Defines the condition. You must refer to at least one of the inputs in the condition. For more
     *         information, expand the Condition node section in <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes">Node
     *         types in prompt flows</a>.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * Defines the condition. You must refer to at least one of the inputs in the condition. For more information,
     * expand the Condition node section in <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes">Node types in
     * prompt flows</a>.
     * </p>
     * 
     * @param expression
     *        Defines the condition. You must refer to at least one of the inputs in the condition. For more
     *        information, expand the Condition node section in <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-how-it-works.html#flows-nodes">Node types
     *        in prompt flows</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowCondition withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * A name for the condition that you can reference.
     * </p>
     * 
     * @param name
     *        A name for the condition that you can reference.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the condition that you can reference.
     * </p>
     * 
     * @return A name for the condition that you can reference.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the condition that you can reference.
     * </p>
     * 
     * @param name
     *        A name for the condition that you can reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowCondition withName(String name) {
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
        if (getExpression() != null)
            sb.append("Expression: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof FlowCondition == false)
            return false;
        FlowCondition other = (FlowCondition) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
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

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public FlowCondition clone() {
        try {
            return (FlowCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
