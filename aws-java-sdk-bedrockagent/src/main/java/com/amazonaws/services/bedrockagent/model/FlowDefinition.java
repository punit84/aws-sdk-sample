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
 * The definition of the nodes and connections between nodes in the flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of connection definitions in the flow.
     * </p>
     */
    private java.util.List<FlowConnection> connections;
    /**
     * <p>
     * An array of node definitions in the flow.
     * </p>
     */
    private java.util.List<FlowNode> nodes;

    /**
     * <p>
     * An array of connection definitions in the flow.
     * </p>
     * 
     * @return An array of connection definitions in the flow.
     */

    public java.util.List<FlowConnection> getConnections() {
        return connections;
    }

    /**
     * <p>
     * An array of connection definitions in the flow.
     * </p>
     * 
     * @param connections
     *        An array of connection definitions in the flow.
     */

    public void setConnections(java.util.Collection<FlowConnection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new java.util.ArrayList<FlowConnection>(connections);
    }

    /**
     * <p>
     * An array of connection definitions in the flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        An array of connection definitions in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withConnections(FlowConnection... connections) {
        if (this.connections == null) {
            setConnections(new java.util.ArrayList<FlowConnection>(connections.length));
        }
        for (FlowConnection ele : connections) {
            this.connections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of connection definitions in the flow.
     * </p>
     * 
     * @param connections
     *        An array of connection definitions in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withConnections(java.util.Collection<FlowConnection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * An array of node definitions in the flow.
     * </p>
     * 
     * @return An array of node definitions in the flow.
     */

    public java.util.List<FlowNode> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * An array of node definitions in the flow.
     * </p>
     * 
     * @param nodes
     *        An array of node definitions in the flow.
     */

    public void setNodes(java.util.Collection<FlowNode> nodes) {
        if (nodes == null) {
            this.nodes = null;
            return;
        }

        this.nodes = new java.util.ArrayList<FlowNode>(nodes);
    }

    /**
     * <p>
     * An array of node definitions in the flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodes(java.util.Collection)} or {@link #withNodes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodes
     *        An array of node definitions in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withNodes(FlowNode... nodes) {
        if (this.nodes == null) {
            setNodes(new java.util.ArrayList<FlowNode>(nodes.length));
        }
        for (FlowNode ele : nodes) {
            this.nodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of node definitions in the flow.
     * </p>
     * 
     * @param nodes
     *        An array of node definitions in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withNodes(java.util.Collection<FlowNode> nodes) {
        setNodes(nodes);
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
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getNodes() != null)
            sb.append("Nodes: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowDefinition == false)
            return false;
        FlowDefinition other = (FlowDefinition) obj;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        return hashCode;
    }

    @Override
    public FlowDefinition clone() {
        try {
            return (FlowDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
