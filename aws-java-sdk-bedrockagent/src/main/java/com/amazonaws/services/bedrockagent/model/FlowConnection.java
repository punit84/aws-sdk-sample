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
 * Contains information about a connection between two nodes in the flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of the connection.
     * </p>
     */
    private FlowConnectionConfiguration configuration;
    /**
     * <p>
     * A name for the connection that you can reference.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The node that the connection starts at.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The node that the connection ends at.
     * </p>
     */
    private String target;
    /**
     * <p>
     * Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or not (
     * <code>Data</code>).
     * </p>
     */
    private String type;

    /**
     * <p>
     * The configuration of the connection.
     * </p>
     * 
     * @param configuration
     *        The configuration of the connection.
     */

    public void setConfiguration(FlowConnectionConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the connection.
     * </p>
     * 
     * @return The configuration of the connection.
     */

    public FlowConnectionConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the connection.
     * </p>
     * 
     * @param configuration
     *        The configuration of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowConnection withConfiguration(FlowConnectionConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A name for the connection that you can reference.
     * </p>
     * 
     * @param name
     *        A name for the connection that you can reference.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the connection that you can reference.
     * </p>
     * 
     * @return A name for the connection that you can reference.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the connection that you can reference.
     * </p>
     * 
     * @param name
     *        A name for the connection that you can reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowConnection withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The node that the connection starts at.
     * </p>
     * 
     * @param source
     *        The node that the connection starts at.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The node that the connection starts at.
     * </p>
     * 
     * @return The node that the connection starts at.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The node that the connection starts at.
     * </p>
     * 
     * @param source
     *        The node that the connection starts at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowConnection withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The node that the connection ends at.
     * </p>
     * 
     * @param target
     *        The node that the connection ends at.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The node that the connection ends at.
     * </p>
     * 
     * @return The node that the connection ends at.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The node that the connection ends at.
     * </p>
     * 
     * @param target
     *        The node that the connection ends at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowConnection withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or not (
     * <code>Data</code>).
     * </p>
     * 
     * @param type
     *        Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or
     *        not (<code>Data</code>).
     * @see FlowConnectionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or not (
     * <code>Data</code>).
     * </p>
     * 
     * @return Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or
     *         not (<code>Data</code>).
     * @see FlowConnectionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or not (
     * <code>Data</code>).
     * </p>
     * 
     * @param type
     *        Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or
     *        not (<code>Data</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowConnectionType
     */

    public FlowConnection withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or not (
     * <code>Data</code>).
     * </p>
     * 
     * @param type
     *        Whether the source node that the connection begins from is a condition node (<code>Conditional</code>) or
     *        not (<code>Data</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowConnectionType
     */

    public FlowConnection withType(FlowConnectionType type) {
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
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

        if (obj instanceof FlowConnection == false)
            return false;
        FlowConnection other = (FlowConnection) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
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

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FlowConnection clone() {
        try {
            return (FlowConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
