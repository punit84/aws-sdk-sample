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
 * Defines a condition node in your flow. You can specify conditions that determine which node comes next in the flow.
 * For more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/flows-nodes.html">Node types
 * in Amazon Bedrock works</a> in the Amazon Bedrock User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ConditionFlowNodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionFlowNodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of conditions. Each member contains the name of a condition and an expression that defines the
     * condition.
     * </p>
     */
    private java.util.List<FlowCondition> conditions;

    /**
     * <p>
     * An array of conditions. Each member contains the name of a condition and an expression that defines the
     * condition.
     * </p>
     * 
     * @return An array of conditions. Each member contains the name of a condition and an expression that defines the
     *         condition.
     */

    public java.util.List<FlowCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * An array of conditions. Each member contains the name of a condition and an expression that defines the
     * condition.
     * </p>
     * 
     * @param conditions
     *        An array of conditions. Each member contains the name of a condition and an expression that defines the
     *        condition.
     */

    public void setConditions(java.util.Collection<FlowCondition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<FlowCondition>(conditions);
    }

    /**
     * <p>
     * An array of conditions. Each member contains the name of a condition and an expression that defines the
     * condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        An array of conditions. Each member contains the name of a condition and an expression that defines the
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionFlowNodeConfiguration withConditions(FlowCondition... conditions) {
        if (this.conditions == null) {
            setConditions(new java.util.ArrayList<FlowCondition>(conditions.length));
        }
        for (FlowCondition ele : conditions) {
            this.conditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of conditions. Each member contains the name of a condition and an expression that defines the
     * condition.
     * </p>
     * 
     * @param conditions
     *        An array of conditions. Each member contains the name of a condition and an expression that defines the
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionFlowNodeConfiguration withConditions(java.util.Collection<FlowCondition> conditions) {
        setConditions(conditions);
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
        if (getConditions() != null)
            sb.append("Conditions: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionFlowNodeConfiguration == false)
            return false;
        ConditionFlowNodeConfiguration other = (ConditionFlowNodeConfiguration) obj;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public ConditionFlowNodeConfiguration clone() {
        try {
            return (ConditionFlowNodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ConditionFlowNodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
