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
 * The configuration of a connection originating from a node that isn't a Condition node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FlowDataConnectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowDataConnectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the output in the source node that the connection begins from.
     * </p>
     */
    private String sourceOutput;
    /**
     * <p>
     * The name of the input in the target node that the connection ends at.
     * </p>
     */
    private String targetInput;

    /**
     * <p>
     * The name of the output in the source node that the connection begins from.
     * </p>
     * 
     * @param sourceOutput
     *        The name of the output in the source node that the connection begins from.
     */

    public void setSourceOutput(String sourceOutput) {
        this.sourceOutput = sourceOutput;
    }

    /**
     * <p>
     * The name of the output in the source node that the connection begins from.
     * </p>
     * 
     * @return The name of the output in the source node that the connection begins from.
     */

    public String getSourceOutput() {
        return this.sourceOutput;
    }

    /**
     * <p>
     * The name of the output in the source node that the connection begins from.
     * </p>
     * 
     * @param sourceOutput
     *        The name of the output in the source node that the connection begins from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDataConnectionConfiguration withSourceOutput(String sourceOutput) {
        setSourceOutput(sourceOutput);
        return this;
    }

    /**
     * <p>
     * The name of the input in the target node that the connection ends at.
     * </p>
     * 
     * @param targetInput
     *        The name of the input in the target node that the connection ends at.
     */

    public void setTargetInput(String targetInput) {
        this.targetInput = targetInput;
    }

    /**
     * <p>
     * The name of the input in the target node that the connection ends at.
     * </p>
     * 
     * @return The name of the input in the target node that the connection ends at.
     */

    public String getTargetInput() {
        return this.targetInput;
    }

    /**
     * <p>
     * The name of the input in the target node that the connection ends at.
     * </p>
     * 
     * @param targetInput
     *        The name of the input in the target node that the connection ends at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDataConnectionConfiguration withTargetInput(String targetInput) {
        setTargetInput(targetInput);
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
        if (getSourceOutput() != null)
            sb.append("SourceOutput: ").append(getSourceOutput()).append(",");
        if (getTargetInput() != null)
            sb.append("TargetInput: ").append(getTargetInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowDataConnectionConfiguration == false)
            return false;
        FlowDataConnectionConfiguration other = (FlowDataConnectionConfiguration) obj;
        if (other.getSourceOutput() == null ^ this.getSourceOutput() == null)
            return false;
        if (other.getSourceOutput() != null && other.getSourceOutput().equals(this.getSourceOutput()) == false)
            return false;
        if (other.getTargetInput() == null ^ this.getTargetInput() == null)
            return false;
        if (other.getTargetInput() != null && other.getTargetInput().equals(this.getTargetInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceOutput() == null) ? 0 : getSourceOutput().hashCode());
        hashCode = prime * hashCode + ((getTargetInput() == null) ? 0 : getTargetInput().hashCode());
        return hashCode;
    }

    @Override
    public FlowDataConnectionConfiguration clone() {
        try {
            return (FlowDataConnectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FlowDataConnectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
