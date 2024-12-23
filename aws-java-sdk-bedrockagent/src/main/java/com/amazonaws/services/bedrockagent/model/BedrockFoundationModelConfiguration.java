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
 * Settings for a foundation model used to parse documents for a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/BedrockFoundationModelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BedrockFoundationModelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model's ARN.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * Instructions for interpreting the contents of a document.
     * </p>
     */
    private ParsingPrompt parsingPrompt;

    /**
     * <p>
     * The model's ARN.
     * </p>
     * 
     * @param modelArn
     *        The model's ARN.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The model's ARN.
     * </p>
     * 
     * @return The model's ARN.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The model's ARN.
     * </p>
     * 
     * @param modelArn
     *        The model's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockFoundationModelConfiguration withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * Instructions for interpreting the contents of a document.
     * </p>
     * 
     * @param parsingPrompt
     *        Instructions for interpreting the contents of a document.
     */

    public void setParsingPrompt(ParsingPrompt parsingPrompt) {
        this.parsingPrompt = parsingPrompt;
    }

    /**
     * <p>
     * Instructions for interpreting the contents of a document.
     * </p>
     * 
     * @return Instructions for interpreting the contents of a document.
     */

    public ParsingPrompt getParsingPrompt() {
        return this.parsingPrompt;
    }

    /**
     * <p>
     * Instructions for interpreting the contents of a document.
     * </p>
     * 
     * @param parsingPrompt
     *        Instructions for interpreting the contents of a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockFoundationModelConfiguration withParsingPrompt(ParsingPrompt parsingPrompt) {
        setParsingPrompt(parsingPrompt);
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getParsingPrompt() != null)
            sb.append("ParsingPrompt: ").append(getParsingPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BedrockFoundationModelConfiguration == false)
            return false;
        BedrockFoundationModelConfiguration other = (BedrockFoundationModelConfiguration) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getParsingPrompt() == null ^ this.getParsingPrompt() == null)
            return false;
        if (other.getParsingPrompt() != null && other.getParsingPrompt().equals(this.getParsingPrompt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getParsingPrompt() == null) ? 0 : getParsingPrompt().hashCode());
        return hashCode;
    }

    @Override
    public BedrockFoundationModelConfiguration clone() {
        try {
            return (BedrockFoundationModelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.BedrockFoundationModelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
