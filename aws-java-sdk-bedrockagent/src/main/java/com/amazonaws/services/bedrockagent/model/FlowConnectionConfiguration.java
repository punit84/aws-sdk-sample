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
 * The configuration of the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowConnectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowConnectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of a connection originating from a Condition node.
     * </p>
     */
    private FlowConditionalConnectionConfiguration conditional;
    /**
     * <p>
     * The configuration of a connection originating from a node that isn't a Condition node.
     * </p>
     */
    private FlowDataConnectionConfiguration data;

    /**
     * <p>
     * The configuration of a connection originating from a Condition node.
     * </p>
     * 
     * @param conditional
     *        The configuration of a connection originating from a Condition node.
     */

    public void setConditional(FlowConditionalConnectionConfiguration conditional) {
        this.conditional = conditional;
    }

    /**
     * <p>
     * The configuration of a connection originating from a Condition node.
     * </p>
     * 
     * @return The configuration of a connection originating from a Condition node.
     */

    public FlowConditionalConnectionConfiguration getConditional() {
        return this.conditional;
    }

    /**
     * <p>
     * The configuration of a connection originating from a Condition node.
     * </p>
     * 
     * @param conditional
     *        The configuration of a connection originating from a Condition node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowConnectionConfiguration withConditional(FlowConditionalConnectionConfiguration conditional) {
        setConditional(conditional);
        return this;
    }

    /**
     * <p>
     * The configuration of a connection originating from a node that isn't a Condition node.
     * </p>
     * 
     * @param data
     *        The configuration of a connection originating from a node that isn't a Condition node.
     */

    public void setData(FlowDataConnectionConfiguration data) {
        this.data = data;
    }

    /**
     * <p>
     * The configuration of a connection originating from a node that isn't a Condition node.
     * </p>
     * 
     * @return The configuration of a connection originating from a node that isn't a Condition node.
     */

    public FlowDataConnectionConfiguration getData() {
        return this.data;
    }

    /**
     * <p>
     * The configuration of a connection originating from a node that isn't a Condition node.
     * </p>
     * 
     * @param data
     *        The configuration of a connection originating from a node that isn't a Condition node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowConnectionConfiguration withData(FlowDataConnectionConfiguration data) {
        setData(data);
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
        if (getConditional() != null)
            sb.append("Conditional: ").append(getConditional()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowConnectionConfiguration == false)
            return false;
        FlowConnectionConfiguration other = (FlowConnectionConfiguration) obj;
        if (other.getConditional() == null ^ this.getConditional() == null)
            return false;
        if (other.getConditional() != null && other.getConditional().equals(this.getConditional()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditional() == null) ? 0 : getConditional().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public FlowConnectionConfiguration clone() {
        try {
            return (FlowConnectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowConnectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
