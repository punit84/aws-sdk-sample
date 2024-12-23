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
 * Contains configurations about a node in the flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains configurations for the node.
     * </p>
     */
    private FlowNodeConfiguration configuration;
    /**
     * <p>
     * An array of objects, each of which contains information about an input into the node.
     * </p>
     */
    private java.util.List<FlowNodeInput> inputs;
    /**
     * <p>
     * A name for the node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of objects, each of which contains information about an output from the node.
     * </p>
     */
    private java.util.List<FlowNodeOutput> outputs;
    /**
     * <p>
     * The type of node. This value must match the name of the key that you provide in the configuration you provide in
     * the <code>FlowNodeConfiguration</code> field.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Contains configurations for the node.
     * </p>
     * 
     * @param configuration
     *        Contains configurations for the node.
     */

    public void setConfiguration(FlowNodeConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Contains configurations for the node.
     * </p>
     * 
     * @return Contains configurations for the node.
     */

    public FlowNodeConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Contains configurations for the node.
     * </p>
     * 
     * @param configuration
     *        Contains configurations for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNode withConfiguration(FlowNodeConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * An array of objects, each of which contains information about an input into the node.
     * </p>
     * 
     * @return An array of objects, each of which contains information about an input into the node.
     */

    public java.util.List<FlowNodeInput> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * An array of objects, each of which contains information about an input into the node.
     * </p>
     * 
     * @param inputs
     *        An array of objects, each of which contains information about an input into the node.
     */

    public void setInputs(java.util.Collection<FlowNodeInput> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<FlowNodeInput>(inputs);
    }

    /**
     * <p>
     * An array of objects, each of which contains information about an input into the node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        An array of objects, each of which contains information about an input into the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNode withInputs(FlowNodeInput... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<FlowNodeInput>(inputs.length));
        }
        for (FlowNodeInput ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, each of which contains information about an input into the node.
     * </p>
     * 
     * @param inputs
     *        An array of objects, each of which contains information about an input into the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNode withInputs(java.util.Collection<FlowNodeInput> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A name for the node.
     * </p>
     * 
     * @param name
     *        A name for the node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the node.
     * </p>
     * 
     * @return A name for the node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the node.
     * </p>
     * 
     * @param name
     *        A name for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNode withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an output from the node.
     * </p>
     * 
     * @return A list of objects, each of which contains information about an output from the node.
     */

    public java.util.List<FlowNodeOutput> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an output from the node.
     * </p>
     * 
     * @param outputs
     *        A list of objects, each of which contains information about an output from the node.
     */

    public void setOutputs(java.util.Collection<FlowNodeOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<FlowNodeOutput>(outputs);
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an output from the node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        A list of objects, each of which contains information about an output from the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNode withOutputs(FlowNodeOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<FlowNodeOutput>(outputs.length));
        }
        for (FlowNodeOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains information about an output from the node.
     * </p>
     * 
     * @param outputs
     *        A list of objects, each of which contains information about an output from the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowNode withOutputs(java.util.Collection<FlowNodeOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The type of node. This value must match the name of the key that you provide in the configuration you provide in
     * the <code>FlowNodeConfiguration</code> field.
     * </p>
     * 
     * @param type
     *        The type of node. This value must match the name of the key that you provide in the configuration you
     *        provide in the <code>FlowNodeConfiguration</code> field.
     * @see FlowNodeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of node. This value must match the name of the key that you provide in the configuration you provide in
     * the <code>FlowNodeConfiguration</code> field.
     * </p>
     * 
     * @return The type of node. This value must match the name of the key that you provide in the configuration you
     *         provide in the <code>FlowNodeConfiguration</code> field.
     * @see FlowNodeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of node. This value must match the name of the key that you provide in the configuration you provide in
     * the <code>FlowNodeConfiguration</code> field.
     * </p>
     * 
     * @param type
     *        The type of node. This value must match the name of the key that you provide in the configuration you
     *        provide in the <code>FlowNodeConfiguration</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowNodeType
     */

    public FlowNode withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of node. This value must match the name of the key that you provide in the configuration you provide in
     * the <code>FlowNodeConfiguration</code> field.
     * </p>
     * 
     * @param type
     *        The type of node. This value must match the name of the key that you provide in the configuration you
     *        provide in the <code>FlowNodeConfiguration</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowNodeType
     */

    public FlowNode withType(FlowNodeType type) {
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
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

        if (obj instanceof FlowNode == false)
            return false;
        FlowNode other = (FlowNode) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
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
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FlowNode clone() {
        try {
            return (FlowNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
