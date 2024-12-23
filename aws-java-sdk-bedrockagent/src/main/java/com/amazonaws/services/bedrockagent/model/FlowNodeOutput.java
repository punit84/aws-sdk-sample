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
 * Contains configurations for an output from a node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowNodeOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowNodeOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A name for the output that you can reference.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the output. If the output doesn't match this type at runtime, a validation error will be thrown.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A name for the output that you can reference.
     * </p>
     * 
     * @param name
     *        A name for the output that you can reference.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the output that you can reference.
     * </p>
     * 
     * @return A name for the output that you can reference.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the output that you can reference.
     * </p>
     * 
     * @param name
     *        A name for the output that you can reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNodeOutput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the output. If the output doesn't match this type at runtime, a validation error will be thrown.
     * </p>
     * 
     * @param type
     *        The data type of the output. If the output doesn't match this type at runtime, a validation error will be
     *        thrown.
     * @see FlowNodeIODataType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the output. If the output doesn't match this type at runtime, a validation error will be thrown.
     * </p>
     * 
     * @return The data type of the output. If the output doesn't match this type at runtime, a validation error will be
     *         thrown.
     * @see FlowNodeIODataType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the output. If the output doesn't match this type at runtime, a validation error will be thrown.
     * </p>
     * 
     * @param type
     *        The data type of the output. If the output doesn't match this type at runtime, a validation error will be
     *        thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowNodeIODataType
     */

    public FlowNodeOutput withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data type of the output. If the output doesn't match this type at runtime, a validation error will be thrown.
     * </p>
     * 
     * @param type
     *        The data type of the output. If the output doesn't match this type at runtime, a validation error will be
     *        thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowNodeIODataType
     */

    public FlowNodeOutput withType(FlowNodeIODataType type) {
        this.type = type.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowNodeOutput == false)
            return false;
        FlowNodeOutput other = (FlowNodeOutput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FlowNodeOutput clone() {
        try {
            return (FlowNodeOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowNodeOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
